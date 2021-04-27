/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mostml.moStML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mostml.moStML.MODECONDITION;
import org.xtext.example.mostml.moStML.MoStMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MODECONDITION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mostml.moStML.impl.MODECONDITIONImpl#getModeName <em>Mode Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MODECONDITIONImpl extends MinimalEObjectImpl.Container implements MODECONDITION
{
  /**
   * The default value of the '{@link #getModeName() <em>Mode Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModeName()
   * @generated
   * @ordered
   */
  protected static final String MODE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModeName() <em>Mode Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModeName()
   * @generated
   * @ordered
   */
  protected String modeName = MODE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MODECONDITIONImpl()
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
    return MoStMLPackage.Literals.MODECONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getModeName()
  {
    return modeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModeName(String newModeName)
  {
    String oldModeName = modeName;
    modeName = newModeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoStMLPackage.MODECONDITION__MODE_NAME, oldModeName, modeName));
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
      case MoStMLPackage.MODECONDITION__MODE_NAME:
        return getModeName();
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
      case MoStMLPackage.MODECONDITION__MODE_NAME:
        setModeName((String)newValue);
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
      case MoStMLPackage.MODECONDITION__MODE_NAME:
        setModeName(MODE_NAME_EDEFAULT);
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
      case MoStMLPackage.MODECONDITION__MODE_NAME:
        return MODE_NAME_EDEFAULT == null ? modeName != null : !MODE_NAME_EDEFAULT.equals(modeName);
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
    result.append(" (modeName: ");
    result.append(modeName);
    result.append(')');
    return result.toString();
  }

} //MODECONDITIONImpl
