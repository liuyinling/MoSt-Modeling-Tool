/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mostml.moStML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mostml.moStML.ATTRIBUTEVALUE;
import org.xtext.example.mostml.moStML.Environment;
import org.xtext.example.mostml.moStML.MoStMLPackage;
import org.xtext.example.mostml.moStML.RANG;
import org.xtext.example.mostml.moStML.ReqID;
import org.xtext.example.mostml.moStML.UNIT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mostml.moStML.impl.EnvironmentImpl#getEnvirReqID <em>Envir Req ID</em>}</li>
 *   <li>{@link org.xtext.example.mostml.moStML.impl.EnvironmentImpl#getEnvirVariable <em>Envir Variable</em>}</li>
 *   <li>{@link org.xtext.example.mostml.moStML.impl.EnvironmentImpl#getEnvirAttributeValue <em>Envir Attribute Value</em>}</li>
 *   <li>{@link org.xtext.example.mostml.moStML.impl.EnvironmentImpl#getEnvirUnit <em>Envir Unit</em>}</li>
 *   <li>{@link org.xtext.example.mostml.moStML.impl.EnvironmentImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends RequirementImpl implements Environment
{
  /**
   * The cached value of the '{@link #getEnvirReqID() <em>Envir Req ID</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvirReqID()
   * @generated
   * @ordered
   */
  protected ReqID envirReqID;

  /**
   * The default value of the '{@link #getEnvirVariable() <em>Envir Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvirVariable()
   * @generated
   * @ordered
   */
  protected static final String ENVIR_VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnvirVariable() <em>Envir Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvirVariable()
   * @generated
   * @ordered
   */
  protected String envirVariable = ENVIR_VARIABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnvirAttributeValue() <em>Envir Attribute Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvirAttributeValue()
   * @generated
   * @ordered
   */
  protected ATTRIBUTEVALUE envirAttributeValue;

  /**
   * The cached value of the '{@link #getEnvirUnit() <em>Envir Unit</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvirUnit()
   * @generated
   * @ordered
   */
  protected EList<UNIT> envirUnit;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected RANG range;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnvironmentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MoStMLPackage.Literals.ENVIRONMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReqID getEnvirReqID()
  {
    return envirReqID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnvirReqID(ReqID newEnvirReqID, NotificationChain msgs)
  {
    ReqID oldEnvirReqID = envirReqID;
    envirReqID = newEnvirReqID;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MoStMLPackage.ENVIRONMENT__ENVIR_REQ_ID, oldEnvirReqID, newEnvirReqID);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEnvirReqID(ReqID newEnvirReqID)
  {
    if (newEnvirReqID != envirReqID)
    {
      NotificationChain msgs = null;
      if (envirReqID != null)
        msgs = ((InternalEObject)envirReqID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MoStMLPackage.ENVIRONMENT__ENVIR_REQ_ID, null, msgs);
      if (newEnvirReqID != null)
        msgs = ((InternalEObject)newEnvirReqID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MoStMLPackage.ENVIRONMENT__ENVIR_REQ_ID, null, msgs);
      msgs = basicSetEnvirReqID(newEnvirReqID, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoStMLPackage.ENVIRONMENT__ENVIR_REQ_ID, newEnvirReqID, newEnvirReqID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEnvirVariable()
  {
    return envirVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEnvirVariable(String newEnvirVariable)
  {
    String oldEnvirVariable = envirVariable;
    envirVariable = newEnvirVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoStMLPackage.ENVIRONMENT__ENVIR_VARIABLE, oldEnvirVariable, envirVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ATTRIBUTEVALUE getEnvirAttributeValue()
  {
    return envirAttributeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnvirAttributeValue(ATTRIBUTEVALUE newEnvirAttributeValue, NotificationChain msgs)
  {
    ATTRIBUTEVALUE oldEnvirAttributeValue = envirAttributeValue;
    envirAttributeValue = newEnvirAttributeValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MoStMLPackage.ENVIRONMENT__ENVIR_ATTRIBUTE_VALUE, oldEnvirAttributeValue, newEnvirAttributeValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEnvirAttributeValue(ATTRIBUTEVALUE newEnvirAttributeValue)
  {
    if (newEnvirAttributeValue != envirAttributeValue)
    {
      NotificationChain msgs = null;
      if (envirAttributeValue != null)
        msgs = ((InternalEObject)envirAttributeValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MoStMLPackage.ENVIRONMENT__ENVIR_ATTRIBUTE_VALUE, null, msgs);
      if (newEnvirAttributeValue != null)
        msgs = ((InternalEObject)newEnvirAttributeValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MoStMLPackage.ENVIRONMENT__ENVIR_ATTRIBUTE_VALUE, null, msgs);
      msgs = basicSetEnvirAttributeValue(newEnvirAttributeValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoStMLPackage.ENVIRONMENT__ENVIR_ATTRIBUTE_VALUE, newEnvirAttributeValue, newEnvirAttributeValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<UNIT> getEnvirUnit()
  {
    if (envirUnit == null)
    {
      envirUnit = new EObjectContainmentEList<UNIT>(UNIT.class, this, MoStMLPackage.ENVIRONMENT__ENVIR_UNIT);
    }
    return envirUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RANG getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(RANG newRange, NotificationChain msgs)
  {
    RANG oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MoStMLPackage.ENVIRONMENT__RANGE, oldRange, newRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRange(RANG newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MoStMLPackage.ENVIRONMENT__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MoStMLPackage.ENVIRONMENT__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoStMLPackage.ENVIRONMENT__RANGE, newRange, newRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MoStMLPackage.ENVIRONMENT__ENVIR_REQ_ID:
        return basicSetEnvirReqID(null, msgs);
      case MoStMLPackage.ENVIRONMENT__ENVIR_ATTRIBUTE_VALUE:
        return basicSetEnvirAttributeValue(null, msgs);
      case MoStMLPackage.ENVIRONMENT__ENVIR_UNIT:
        return ((InternalEList<?>)getEnvirUnit()).basicRemove(otherEnd, msgs);
      case MoStMLPackage.ENVIRONMENT__RANGE:
        return basicSetRange(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MoStMLPackage.ENVIRONMENT__ENVIR_REQ_ID:
        return getEnvirReqID();
      case MoStMLPackage.ENVIRONMENT__ENVIR_VARIABLE:
        return getEnvirVariable();
      case MoStMLPackage.ENVIRONMENT__ENVIR_ATTRIBUTE_VALUE:
        return getEnvirAttributeValue();
      case MoStMLPackage.ENVIRONMENT__ENVIR_UNIT:
        return getEnvirUnit();
      case MoStMLPackage.ENVIRONMENT__RANGE:
        return getRange();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MoStMLPackage.ENVIRONMENT__ENVIR_REQ_ID:
        setEnvirReqID((ReqID)newValue);
        return;
      case MoStMLPackage.ENVIRONMENT__ENVIR_VARIABLE:
        setEnvirVariable((String)newValue);
        return;
      case MoStMLPackage.ENVIRONMENT__ENVIR_ATTRIBUTE_VALUE:
        setEnvirAttributeValue((ATTRIBUTEVALUE)newValue);
        return;
      case MoStMLPackage.ENVIRONMENT__ENVIR_UNIT:
        getEnvirUnit().clear();
        getEnvirUnit().addAll((Collection<? extends UNIT>)newValue);
        return;
      case MoStMLPackage.ENVIRONMENT__RANGE:
        setRange((RANG)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MoStMLPackage.ENVIRONMENT__ENVIR_REQ_ID:
        setEnvirReqID((ReqID)null);
        return;
      case MoStMLPackage.ENVIRONMENT__ENVIR_VARIABLE:
        setEnvirVariable(ENVIR_VARIABLE_EDEFAULT);
        return;
      case MoStMLPackage.ENVIRONMENT__ENVIR_ATTRIBUTE_VALUE:
        setEnvirAttributeValue((ATTRIBUTEVALUE)null);
        return;
      case MoStMLPackage.ENVIRONMENT__ENVIR_UNIT:
        getEnvirUnit().clear();
        return;
      case MoStMLPackage.ENVIRONMENT__RANGE:
        setRange((RANG)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MoStMLPackage.ENVIRONMENT__ENVIR_REQ_ID:
        return envirReqID != null;
      case MoStMLPackage.ENVIRONMENT__ENVIR_VARIABLE:
        return ENVIR_VARIABLE_EDEFAULT == null ? envirVariable != null : !ENVIR_VARIABLE_EDEFAULT.equals(envirVariable);
      case MoStMLPackage.ENVIRONMENT__ENVIR_ATTRIBUTE_VALUE:
        return envirAttributeValue != null;
      case MoStMLPackage.ENVIRONMENT__ENVIR_UNIT:
        return envirUnit != null && !envirUnit.isEmpty();
      case MoStMLPackage.ENVIRONMENT__RANGE:
        return range != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (envirVariable: ");
    result.append(envirVariable);
    result.append(')');
    return result.toString();
  }

} //EnvironmentImpl
