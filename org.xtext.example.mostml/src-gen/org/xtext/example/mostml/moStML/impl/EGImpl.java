/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mostml.moStML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mostml.moStML.EG;
import org.xtext.example.mostml.moStML.MoStMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mostml.moStML.impl.EGImpl#getEg <em>Eg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EGImpl extends CTLOperatorImpl implements EG
{
  /**
   * The default value of the '{@link #getEg() <em>Eg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEg()
   * @generated
   * @ordered
   */
  protected static final String EG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEg() <em>Eg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEg()
   * @generated
   * @ordered
   */
  protected String eg = EG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EGImpl()
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
    return MoStMLPackage.Literals.EG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEg()
  {
    return eg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEg(String newEg)
  {
    String oldEg = eg;
    eg = newEg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoStMLPackage.EG__EG, oldEg, eg));
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
      case MoStMLPackage.EG__EG:
        return getEg();
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
      case MoStMLPackage.EG__EG:
        setEg((String)newValue);
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
      case MoStMLPackage.EG__EG:
        setEg(EG_EDEFAULT);
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
      case MoStMLPackage.EG__EG:
        return EG_EDEFAULT == null ? eg != null : !EG_EDEFAULT.equals(eg);
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
    result.append(" (eg: ");
    result.append(eg);
    result.append(')');
    return result.toString();
  }

} //EGImpl
