/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mostml.moStML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ARITHMETICCONDITION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mostml.moStML.ARITHMETICCONDITION#getResult <em>Result</em>}</li>
 *   <li>{@link org.xtext.example.mostml.moStML.ARITHMETICCONDITION#getCompcondition <em>Compcondition</em>}</li>
 *   <li>{@link org.xtext.example.mostml.moStML.ARITHMETICCONDITION#getVar1 <em>Var1</em>}</li>
 *   <li>{@link org.xtext.example.mostml.moStML.ARITHMETICCONDITION#getArithmeticOperator <em>Arithmetic Operator</em>}</li>
 *   <li>{@link org.xtext.example.mostml.moStML.ARITHMETICCONDITION#getVar2 <em>Var2</em>}</li>
 *   <li>{@link org.xtext.example.mostml.moStML.ARITHMETICCONDITION#getVar3 <em>Var3</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mostml.moStML.MoStMLPackage#getARITHMETICCONDITION()
 * @model
 * @generated
 */
public interface ARITHMETICCONDITION extends EObject
{
  /**
   * Returns the value of the '<em><b>Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' attribute.
   * @see #setResult(String)
   * @see org.xtext.example.mostml.moStML.MoStMLPackage#getARITHMETICCONDITION_Result()
   * @model
   * @generated
   */
  String getResult();

  /**
   * Sets the value of the '{@link org.xtext.example.mostml.moStML.ARITHMETICCONDITION#getResult <em>Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' attribute.
   * @see #getResult()
   * @generated
   */
  void setResult(String value);

  /**
   * Returns the value of the '<em><b>Compcondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compcondition</em>' containment reference.
   * @see #setCompcondition(COMPARISONOPERATOR)
   * @see org.xtext.example.mostml.moStML.MoStMLPackage#getARITHMETICCONDITION_Compcondition()
   * @model containment="true"
   * @generated
   */
  COMPARISONOPERATOR getCompcondition();

  /**
   * Sets the value of the '{@link org.xtext.example.mostml.moStML.ARITHMETICCONDITION#getCompcondition <em>Compcondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compcondition</em>' containment reference.
   * @see #getCompcondition()
   * @generated
   */
  void setCompcondition(COMPARISONOPERATOR value);

  /**
   * Returns the value of the '<em><b>Var1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var1</em>' attribute.
   * @see #setVar1(String)
   * @see org.xtext.example.mostml.moStML.MoStMLPackage#getARITHMETICCONDITION_Var1()
   * @model
   * @generated
   */
  String getVar1();

  /**
   * Sets the value of the '{@link org.xtext.example.mostml.moStML.ARITHMETICCONDITION#getVar1 <em>Var1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var1</em>' attribute.
   * @see #getVar1()
   * @generated
   */
  void setVar1(String value);

  /**
   * Returns the value of the '<em><b>Arithmetic Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arithmetic Operator</em>' containment reference.
   * @see #setArithmeticOperator(ARITHMETICOPERATOR)
   * @see org.xtext.example.mostml.moStML.MoStMLPackage#getARITHMETICCONDITION_ArithmeticOperator()
   * @model containment="true"
   * @generated
   */
  ARITHMETICOPERATOR getArithmeticOperator();

  /**
   * Sets the value of the '{@link org.xtext.example.mostml.moStML.ARITHMETICCONDITION#getArithmeticOperator <em>Arithmetic Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arithmetic Operator</em>' containment reference.
   * @see #getArithmeticOperator()
   * @generated
   */
  void setArithmeticOperator(ARITHMETICOPERATOR value);

  /**
   * Returns the value of the '<em><b>Var2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var2</em>' attribute.
   * @see #setVar2(String)
   * @see org.xtext.example.mostml.moStML.MoStMLPackage#getARITHMETICCONDITION_Var2()
   * @model
   * @generated
   */
  String getVar2();

  /**
   * Sets the value of the '{@link org.xtext.example.mostml.moStML.ARITHMETICCONDITION#getVar2 <em>Var2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var2</em>' attribute.
   * @see #getVar2()
   * @generated
   */
  void setVar2(String value);

  /**
   * Returns the value of the '<em><b>Var3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var3</em>' attribute.
   * @see #setVar3(int)
   * @see org.xtext.example.mostml.moStML.MoStMLPackage#getARITHMETICCONDITION_Var3()
   * @model
   * @generated
   */
  int getVar3();

  /**
   * Sets the value of the '{@link org.xtext.example.mostml.moStML.ARITHMETICCONDITION#getVar3 <em>Var3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var3</em>' attribute.
   * @see #getVar3()
   * @generated
   */
  void setVar3(int value);

} // ARITHMETICCONDITION
