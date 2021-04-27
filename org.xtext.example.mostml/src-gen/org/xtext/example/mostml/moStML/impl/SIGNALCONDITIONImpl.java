/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mostml.moStML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mostml.moStML.MoStMLPackage;
import org.xtext.example.mostml.moStML.SIGNALCONDITION;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SIGNALCONDITION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mostml.moStML.impl.SIGNALCONDITIONImpl#getSignalName <em>Signal Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SIGNALCONDITIONImpl extends MinimalEObjectImpl.Container implements SIGNALCONDITION
{
  /**
   * The default value of the '{@link #getSignalName() <em>Signal Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignalName()
   * @generated
   * @ordered
   */
  protected static final String SIGNAL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSignalName() <em>Signal Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignalName()
   * @generated
   * @ordered
   */
  protected String signalName = SIGNAL_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SIGNALCONDITIONImpl()
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
    return MoStMLPackage.Literals.SIGNALCONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSignalName()
  {
    return signalName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSignalName(String newSignalName)
  {
    String oldSignalName = signalName;
    signalName = newSignalName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoStMLPackage.SIGNALCONDITION__SIGNAL_NAME, oldSignalName, signalName));
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
      case MoStMLPackage.SIGNALCONDITION__SIGNAL_NAME:
        return getSignalName();
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
      case MoStMLPackage.SIGNALCONDITION__SIGNAL_NAME:
        setSignalName((String)newValue);
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
      case MoStMLPackage.SIGNALCONDITION__SIGNAL_NAME:
        setSignalName(SIGNAL_NAME_EDEFAULT);
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
      case MoStMLPackage.SIGNALCONDITION__SIGNAL_NAME:
        return SIGNAL_NAME_EDEFAULT == null ? signalName != null : !SIGNAL_NAME_EDEFAULT.equals(signalName);
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
    result.append(" (signalName: ");
    result.append(signalName);
    result.append(')');
    return result.toString();
  }

} //SIGNALCONDITIONImpl
