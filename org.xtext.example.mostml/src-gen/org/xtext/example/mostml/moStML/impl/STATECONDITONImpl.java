/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mostml.moStML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mostml.moStML.COMPARISONOPERATOR;
import org.xtext.example.mostml.moStML.MoStMLPackage;
import org.xtext.example.mostml.moStML.STATECONDITON;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STATECONDITON</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mostml.moStML.impl.STATECONDITONImpl#getStateName <em>State Name</em>}</li>
 *   <li>{@link org.xtext.example.mostml.moStML.impl.STATECONDITONImpl#getCompOperator <em>Comp Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class STATECONDITONImpl extends MinimalEObjectImpl.Container implements STATECONDITON
{
  /**
   * The default value of the '{@link #getStateName() <em>State Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateName()
   * @generated
   * @ordered
   */
  protected static final String STATE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStateName() <em>State Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateName()
   * @generated
   * @ordered
   */
  protected String stateName = STATE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getCompOperator() <em>Comp Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompOperator()
   * @generated
   * @ordered
   */
  protected COMPARISONOPERATOR compOperator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected STATECONDITONImpl()
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
    return MoStMLPackage.Literals.STATECONDITON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStateName()
  {
    return stateName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStateName(String newStateName)
  {
    String oldStateName = stateName;
    stateName = newStateName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoStMLPackage.STATECONDITON__STATE_NAME, oldStateName, stateName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public COMPARISONOPERATOR getCompOperator()
  {
    return compOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompOperator(COMPARISONOPERATOR newCompOperator, NotificationChain msgs)
  {
    COMPARISONOPERATOR oldCompOperator = compOperator;
    compOperator = newCompOperator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MoStMLPackage.STATECONDITON__COMP_OPERATOR, oldCompOperator, newCompOperator);
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
  public void setCompOperator(COMPARISONOPERATOR newCompOperator)
  {
    if (newCompOperator != compOperator)
    {
      NotificationChain msgs = null;
      if (compOperator != null)
        msgs = ((InternalEObject)compOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MoStMLPackage.STATECONDITON__COMP_OPERATOR, null, msgs);
      if (newCompOperator != null)
        msgs = ((InternalEObject)newCompOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MoStMLPackage.STATECONDITON__COMP_OPERATOR, null, msgs);
      msgs = basicSetCompOperator(newCompOperator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoStMLPackage.STATECONDITON__COMP_OPERATOR, newCompOperator, newCompOperator));
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
      case MoStMLPackage.STATECONDITON__COMP_OPERATOR:
        return basicSetCompOperator(null, msgs);
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
      case MoStMLPackage.STATECONDITON__STATE_NAME:
        return getStateName();
      case MoStMLPackage.STATECONDITON__COMP_OPERATOR:
        return getCompOperator();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MoStMLPackage.STATECONDITON__STATE_NAME:
        setStateName((String)newValue);
        return;
      case MoStMLPackage.STATECONDITON__COMP_OPERATOR:
        setCompOperator((COMPARISONOPERATOR)newValue);
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
      case MoStMLPackage.STATECONDITON__STATE_NAME:
        setStateName(STATE_NAME_EDEFAULT);
        return;
      case MoStMLPackage.STATECONDITON__COMP_OPERATOR:
        setCompOperator((COMPARISONOPERATOR)null);
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
      case MoStMLPackage.STATECONDITON__STATE_NAME:
        return STATE_NAME_EDEFAULT == null ? stateName != null : !STATE_NAME_EDEFAULT.equals(stateName);
      case MoStMLPackage.STATECONDITON__COMP_OPERATOR:
        return compOperator != null;
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
    result.append(" (stateName: ");
    result.append(stateName);
    result.append(')');
    return result.toString();
  }

} //STATECONDITONImpl
