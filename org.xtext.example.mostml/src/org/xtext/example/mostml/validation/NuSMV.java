package org.xtext.example.mostml.validation;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;


/**
 * This class is the engine for calling NuSMV model checker from Java code.
 * It deals with text files as well.
 * we used HashMap programErrors and propertyErrors to stored error information which will be used by the Validator.
 * For analysing the simulation results, the difficulties lie in the program errors. Because the format of the simulation results
 * are different. We do have to design a specific method for each kind of errors.
 * We leave an interface printing a self-explainable message when an error of new type arise.
 * Note we use "space" to trigger the call of NuSMV. Since NuSMV propose non-parser analysis one by one, so
 * we need to press "space" very often to see the proposed errors (all the other errors) or warnings (specification is false).
 * @author Yinling LIU
 * @date 21/11/2021
 */
public class NuSMV{

	public HashMap<String,String> programErrors = new HashMap<String, String> ();
	public HashMap<String,String> propertyErrors = new HashMap<String, String> ();
	public String GENERATED_SMV_FILE_PATH = "/Users/liu/runtime-EclipseXtext/Example/src-gen/Car1.smv";
	public String NUSMV_EXECUTE_PATH =  "/Users/liu/Documents/Logiciel/NuSMV-2.6.0-Darwin/bin/NuSMV";
	public String RESULT_FILE_PATH ="/Users/liu/runtime-EclipseXtext/Example/src-gen/result.txt";
	public void executeNuSMV() {

		/*****************************call nusmv****************************************/
		List<String> cmdLine = new ArrayList<String>();
		cmdLine.add(NUSMV_EXECUTE_PATH);
		cmdLine.add(GENERATED_SMV_FILE_PATH);
		Process p = null;
		try {
			System.out.println("Now, you are calling NuSMV, cmdLine:"+cmdLine);
			ProcessBuilder processBuilder = new ProcessBuilder(cmdLine);
			p = processBuilder.start();//The restored information comes from Process p!!!
			StringBuilder result = new StringBuilder();
			StringBuilder sb = new StringBuilder();	
			InputStream inputStream = p.getInputStream();
			InputStream errorStream = p.getErrorStream();
			InputStreamReader inputStreamR = new InputStreamReader(inputStream);
			InputStreamReader errorStreamR = new InputStreamReader(errorStream);
			BufferedReader brInput = new BufferedReader(inputStreamR);
			BufferedReader brError = new BufferedReader(errorStreamR);
		/*****************************call nusmv****************************************/
			
		/*****************************read data from nusmv******************************/
			String str = brInput.readLine();
			while (str != null) {
				sb.append(str + "\n");
				str = brInput.readLine();
			}
			System.err.println("******************************************************");
			System.out.println("Input stream : "+sb); //sb stores all the output of NuSMV.
			System.err.println("******************************************************");
			str = brError.readLine();
			while (str != null) {
				result.append(str + "\n");
				sb.append(str + "\n");
				str = brError.readLine();
			}
			System.err.println("******************************************************");
			System.out.println("Input + Error streams:"+sb); //sb stores all the output of NuSMV.
			System.err.println("******************************************************");
		/*****************************read data from nusmv******************************/
		
		/*****************************write data to result.txt**************************/
			writeFile(sb.toString()); // write all the information!
		/*****************************write data to result.txt**************************/
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * This method is one of the most important methods for analyzing the text.
	 * Errors are divided into program errors and specification errors.
	 * The first errors include type errors, divided by zero, errors pop up after running the NuSMV
	 * The second errors indicate specifications are false. The warning will be showed in the editor.
	 * we used HashMap programErrors and propertyErrors to stored error information which will be used by the Validator.
	 * Note we use "space" to trigger the call of NuSMV.
	 * @author Yinling LIU
	 * @date 21/11/2021
	 */
	@SuppressWarnings("null")
	public void analyseResult() {	
		//This is one error in programs "file /Users/liu/runtime-EclipseXtext/Example/src-gen/Car1.smv: line 77: Division by zero"
		//errorLocation = 77; errorInfo = Division by zero
		File smvFile = new File(GENERATED_SMV_FILE_PATH);
		File result = new File(RESULT_FILE_PATH);
		if(smvFile != null && result != null) {
			// we have to clear all the elements of programErrors and propertyErrors maps.
			// Or, the error information won't be updated
			programErrors.clear();
			propertyErrors.clear();
			String[] errorArray = null;
			String[] errorArrayRight = null;
			String[] errorLocationArray = null;
			String errorLocation = null;
			String errorInfo = null;
			String data = null;
			int counter = 0;
			try {
				  
			      File myObj = new File(RESULT_FILE_PATH);
			      Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			    	  	data = myReader.nextLine();
			    	  	if(data.contains("line")) {// if one line includes "line", we are sure it tells the location of the error.
			    	  		errorArray = data.split("smv:");
			    	  		errorArrayRight = errorArray[1].split(":"); //errorArray[1]: line 77(location): Division by zero(info)
			    	  		errorLocationArray = errorArrayRight[0].trim().split(" ");
			    	  		if(errorLocationArray!=null) {
			    	  			errorLocation = errorLocationArray[1];//77
			    	  			errorInfo = errorArrayRight[1];
			    	  			counter = 2;//line 76 : illegal operand types of "+" : integer and boolean, there are more than one colons.
			    	  			while(counter < errorArrayRight.length) {
			    	  				errorInfo += errorArrayRight[counter++];	
			    	  			}
			    	  		}
			    	  	}
			      }
			      myReader.close();
			} catch (FileNotFoundException e) {
			      e.printStackTrace();
			}
			//why errorLocation and errorInfo are not arrays?
			//because only syntax errors info contains many file-prefixed error info in NuSMV.
			//other errors are pop up just up one by one.
			System.err.println("An error occurred: "+errorLocation+":"+errorInfo);
			// look for ReqID
			String[] reqOfProgramError = null;
			String ID = null;
			String [] program = new String[100];
			try {
				counter = 0; //This is an example about requirements: state = accelerate & accSpeed=5:speed/0;--[2, 1, 3]
				             //The aim is to show how we can get requirement ID [2, 1, 3].
				File myObj = new File(GENERATED_SMV_FILE_PATH);
				try {
					myObj.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Scanner myReader = new Scanner(myObj);
			    while (myReader.hasNextLine()&& errorLocation!=null) {
			    	data = myReader.nextLine();
			    	program[counter] = data;
			    	counter++;	  
			    	if(counter == Integer.parseInt(errorLocation)) { //just count the lines of code, which is rather easy!!
			    		if(data.contains("--")) {
				    		reqOfProgramError = data.split("--");
				    		ID = reqOfProgramError[1]; //[2, 1, 3]
			    		}
			    		else{ // no special symbol can be used
			    			  // when error info is like line 79: cannot assign value 105 to variable speed
				    		  // but line 79 doesn't relate to one of requirements in the MoSt model
			    			if(errorInfo.contains("variable")) {
			    				reqOfProgramError = errorInfo.split("variable");
				    			if(reqOfProgramError.length>=2) {
				    				ID = reqOfProgramError[1].trim(); //"speed"
				    			}
			    			}
			    			else if(errorInfo.contains("case")) {
			    				// line 44 : illegal types of "case" list elements : integer and boolean
			    				// TRUE: displaySpeed;
			    				// esac;
			    				// search the last line
			    				if(counter>=2) {
			    					reqOfProgramError = program[counter-2].split(":");
					    			if(reqOfProgramError.length>=2) {
					    				ID = reqOfProgramError[1].substring(0,reqOfProgramError[1].length()-2).trim(); // remove ";" to get displaySpeed
					    			}
			    				}
			    			}
			    			else {
			    				
				    			System.err.println("This type of program errors we hasn't considered, please report it to the developer: "+ errorInfo);
				    			ID = "not considered, please update the error type!";
				    		}		    			
			    		}	
			    		
			    	}
			      }
			      myReader.close();
			    } catch (FileNotFoundException e) {
			      e.printStackTrace();
			}
			System.out.println("Error of NuSMV Program -- Req ID: "+ID);
			programErrors.put(ID, errorInfo);
			
			//specifications are false
			
			//counterexample: start with "--" and ends with "sequence"
			//specification: start with "--" and ends with "false" (we just consider the error part!, the passed specification we don't care)
			//-- specification AG ((state = autonomy & mode = economic) -> AX state != autonomy)  is false
			//get "AG ((state = autonomy & mode = economic) -> AX state != autonomy)" and add "SPEC" at the beginning
			String[][] counterexample = new String[1000][1000];
			String [] specificationsArray = null;
			String [] specifications = null;
			int numOfFasleSpecifications = 0;
			int flag = 0;
			try {
				counter = 0; //state = accelerate & accSpeed=5:speed/0;--[2, 1, 3]
			    File myObj = new File(RESULT_FILE_PATH);
			    Scanner myReader = new Scanner(myObj);
			    while (myReader.hasNextLine()) {
			    	if(flag == 0)
			    		data = myReader.nextLine();
			    	flag = 0;
			    	if(data.startsWith("--")) {
			    		//if it ends with "sequence"
			    		if(data.endsWith("false")){ //-- specification AG ((state = autonomy & mode = economic) -> AX state != autonomy)  is false
			    		
			    			specificationsArray = data.split("specification");
			    			specifications = specificationsArray[1].split("is");
			    			counterexample[numOfFasleSpecifications][1] = "SPEC "+specifications[0].trim()+ "\n"; 	//the counterexample specification
	
			    	    }
			    		if(data.endsWith("sequence")) {
			    			do {
			    				if(counterexample[numOfFasleSpecifications][0] == null)
			    					counterexample[numOfFasleSpecifications][0] = data + "\n";
			    				else
			    				    counterexample[numOfFasleSpecifications][0] += data + "\n";//the counterexample content
			    				data = myReader.nextLine();
			    				
			    			}while(!data.startsWith("--"));// to avoid
			    			numOfFasleSpecifications++;
			    		    flag = 1;
			    		}
			    	}
			    }
			    myReader.close();
			    } catch (FileNotFoundException e) {
			      e.printStackTrace();
			    }
			
			System.out.println("counterexample info:");
			for(int i=0;i<numOfFasleSpecifications;i++) {
				System.out.println(counterexample[i][1]+counterexample[i][0]);
				//the counterexample specification; the counterexample content 
			}
			
			// look for ReqID
			String[] reqOfSpecificationError = null;
			String[] reqID = new String [100];
			try {
				//This is an example of NuSMV property specifications. It helps understand how to deal with text information.
			    //AG ((state = autonomy & mode = economic) -> AX state != autonomy) -- [2,1]
				File myObj = new File(GENERATED_SMV_FILE_PATH);
			    Scanner myReader = new Scanner(myObj);
			    
			    for(int i=0; i<numOfFasleSpecifications; i++) {
			    	while (myReader.hasNextLine()) {
			    		data = myReader.nextLine();
			    		reqOfSpecificationError= data.split("--");
			    		//System.out.println(reqOfSpecificationError[0]+";"+counterexample[i][1]);
			    		if(reqOfSpecificationError[0].trim().equals(counterexample[i][1].trim())){
			    			reqID[i] = reqOfSpecificationError[1];
					    	break;
					    }
					 }
			    	//if we cannot find the relevant requirement IDs, it means they are automatically generated specifications, 
			    	//like "SPEC EF state = accelerate", so we need to just store the state conditions.
			    	//We need to store "state = accelerate".
			    	String[] autoSpecs = null;
			    	String right = null;
			    	if(reqID[i]==null) {//the automated properties don't have requirements ID.
			    		autoSpecs = counterexample[i][1].trim().split("EF");
			    		if(autoSpecs.length > 0) {
			    			right = autoSpecs[1].trim();
			    			reqID[i] = right;
			    		}
			    	}
			    	
			    } 
			    myReader.close();
			} catch (FileNotFoundException e) {
			      e.printStackTrace();
			}
			System.out.println("Error of Property Specification: ");
			for(int i = 0; i < numOfFasleSpecifications; i++) {
				propertyErrors.put(reqID[i], counterexample[i][0]);
			}
			for(Entry<String, String> propError:propertyErrors.entrySet()) {
				System.out.println("Key: "+propError.getKey()+"\n Value:"+propError.getValue());
			}
		}
		else
		{
			System.err.print("file incomplete: .smv or .txt file is empty!");
		}
	}
	
	public void writeFile(String result) {
		String verificationResult = "verificationResult";
		File tempFile = new File(RESULT_FILE_PATH);
		try {
			tempFile.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		verificationResult = tempFile.getAbsolutePath(); 
		System.out.println("path="+verificationResult);
	
		PrintWriter resultWriter = null;
		try {
			resultWriter  = new PrintWriter(tempFile);
			resultWriter.append(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new Error(e);
		}
		resultWriter.close();
	}

	public void readFile() {
		try {
			  int counter = 0;
			  String [] errorLocation = null;
		      File myObj = new File(RESULT_FILE_PATH);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		    	counter++;
		    	String data = myReader.nextLine();
		    	if(counter==2) {
		    		errorLocation = data.split("smv:");
			        System.out.println("read from the output of NuSMV ==="+errorLocation[1]);
			        break;
		    	}
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	public static void main(String args[]) {
		NuSMV nusmv = new NuSMV();
		nusmv.executeNuSMV();
		nusmv.analyseResult();
	}
}

