/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mostml.moStML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mostml.moStML.Environment#getEnvirReqID <em>Envir Req ID</em>}</li>
 *   <li>{@link org.xtext.example.mostml.moStML.Environment#getEnvirVariable <em>Envir Variable</em>}</li>
 *   <li>{@link org.xtext.example.mostml.moStML.Environment#getEnvirAttributeValue <em>Envir Attribute Value</em>}</li>
 *   <li>{@link org.xtext.example.mostml.moStML.Environment#getEnvirUnit <em>Envir Unit</em>}</li>
 *   <li>{@link org.xtext.example.mostml.moStML.Environment#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mostml.moStML.MoStMLPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends Requirement
{
  /**
   * Returns the value of the '<em><b>Envir Req ID</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Envir Req ID</em>' containment reference.
   * @see #setEnvirReqID(ReqID)
   * @see org.xtext.example.mostml.moStML.MoStMLPackage#getEnvironment_EnvirReqID()
   * @model containment="true"
   * @generated
   */
  ReqID getEnvirReqID();

  /**
   * Sets the value of the '{@link org.xtext.example.mostml.moStML.Environment#getEnvirReqID <em>Envir Req ID</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Envir Req ID</em>' containment reference.
   * @see #getEnvirReqID()
   * @generated
   */
  void setEnvirReqID(ReqID value);

  /**
   * Returns the value of the '<em><b>Envir Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Envir Variable</em>' attribute.
   * @see #setEnvirVariable(String)
   * @see org.xtext.example.mostml.moStML.MoStMLPackage#getEnvironment_EnvirVariable()
   * @model
   * @generated
   */
  String getEnvirVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.mostml.moStML.Environment#getEnvirVariable <em>Envir Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Envir Variable</em>' attribute.
   * @see #getEnvirVariable()
   * @generated
   */
  void setEnvirVariable(String value);

  /**
   * Returns the value of the '<em><b>Envir Attribute Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Envir Attribute Value</em>' containment reference.
   * @see #setEnvirAttributeValue(ATTRIBUTEVALUE)
   * @see org.xtext.example.mostml.moStML.MoStMLPackage#getEnvironment_EnvirAttributeValue()
   * @model containment="true"
   * @generated
   */
  ATTRIBUTEVALUE getEnvirAttributeValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mostml.moStML.Environment#getEnvirAttributeValue <em>Envir Attribute Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Envir Attribute Value</em>' containment reference.
   * @see #getEnvirAttributeValue()
   * @generated
   */
  void setEnvirAttributeValue(ATTRIBUTEVALUE value);

  /**
   * Returns the value of the '<em><b>Envir Unit</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mostml.moStML.UNIT}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Envir Unit</em>' containment reference list.
   * @see org.xtext.example.mostml.moStML.MoStMLPackage#getEnvironment_EnvirUnit()
   * @model containment="true"
   * @generated
   */
  EList<UNIT> getEnvirUnit();

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(RANG)
   * @see org.xtext.example.mostml.moStML.MoStMLPackage#getEnvironment_Range()
   * @model containment="true"
   * @generated
   */
  RANG getRange();

  /**
   * Sets the value of the '{@link org.xtext.example.mostml.moStML.Environment#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(RANG value);

} // Environment
