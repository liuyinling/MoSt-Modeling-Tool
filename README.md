# MoSt-Modeling-Tool
This tool is used to formalize and verify natural language requirements based on states and modes. This tool was implemented by the Xtext framework.

## Intallation instructions: 
- Download and install Xtext plugin from Eclipse, see [here](https://www.eclipse.org/Xtext/download.html);
- Clone this tool from Github to Eclipse, see this [video](https://www.youtube.com/watch?v=LPT7v69guVY).
- Download a binary NuSMV, add PATH environment variable, and set the NUSMV_LIBRARY_PATH environment. (Here are the examples: `export PATH=${PATH}:/Users/liu/Documents/Logiciel/NuSMV-2.6.0-Darwin/bin` and `export NUSMV_LIBRARY_PATH=/Users/liu/Documents/Logiciel/NuSMV-2.6.0-Darwin/share/nusmv`). 

## How to run this project?
If you successfully clone this project, you will see 5 Xtext projects in your Package Explorer. 

### Running instructions:
- Go to file NuSMV.java (org.xtext.example.mostml->src->org.xtext.example.mostml.validator) and change `GENERATED_SMV_FILE_PATH`, `NUSMV_EXECUTE_PATH`, and `RESULT_FILE_PATH` to your local paths. Here are the examples:
1. public String GENERATED_SMV_FILE_PATH = "/Users/liu/runtime-EclipseXtext/Example/src-gen/Car1.smv";
2. public String NUSMV_EXECUTE_PATH =  "/Users/liu/Documents/Logiciel/NuSMV-2.6.0-Darwin/bin/NuSMV";
3. public String RESULT_FILE_PATH ="/Users/liu/runtime-EclipseXtext/Example/src-gen/result.txt";
- Go to file MoStML.xtext (org.xtext.example.mostml->src->org.xtext.example.mostml->MoStML.xtext);
- Right click on this file, then choose "Run as" -> "Generate Xtext Artifacts";
- Delete file MoStMLValidator.java (it is in package org.xtext.example.mostml.validation);
- Back to the previous package, right click on GenerateMoStML.mwe2, choose "Run as" -> "MWE2 Workflow";
- Repeat the third step;
- Right click on project org.xtext.example.mostml, choose "Run as" -> "Eclipse Application" (you will see a new eclipse opening up);
- New a project;
- New a file with extension name ".mostml".
- Copy the code from Requirements.rtf (from GitHub).
- The corresponding NuSMV file will be automatically generated in folder src-gen with a file named Car1.smv.
### Using instructions:
- Write requirements in the editor;
- Correct the prompted errors;
- Save the file, press the space key (if the `.smv` file exists, dynamic checking results will appear), and save the file again.
- Repeat the last step to use dynamic checks. (sometime, there may be some strange errors, just repeat the mentioned step, errors should go away.)
