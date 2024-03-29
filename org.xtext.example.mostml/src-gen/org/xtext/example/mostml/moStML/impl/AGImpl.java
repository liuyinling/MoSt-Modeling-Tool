/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mostml.moStML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mostml.moStML.AG;
import org.xtext.example.mostml.moStML.MoStMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mostml.moStML.impl.AGImpl#getAg <em>Ag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AGImpl extends CTLOperatorImpl implements AG
{
  /**
   * The default value of the '{@link #getAg() <em>Ag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAg()
   * @generated
   * @ordered
   */
  protected static final String AG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAg() <em>Ag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAg()
   * @generated
   * @ordered
   */
  protected String ag = AG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AGImpl()
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
    return MoStMLPackage.Literals.AG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAg()
  {
    return ag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAg(String newAg)
  {
    String oldAg = ag;
    ag = newAg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoStMLPackage.AG__AG, oldAg, ag));
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
      case MoStMLPackage.AG__AG:
        return getAg();
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
      case MoStMLPackage.AG__AG:
        setAg((String)newValue);
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
      case MoStMLPackage.AG__AG:
        setAg(AG_EDEFAULT);
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
      case MoStMLPackage.AG__AG:
        return AG_EDEFAULT == null ? ag != null : !AG_EDEFAULT.equals(ag);
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
    result.append(" (ag: ");
    result.append(ag);
    result.append(')');
    return result.toString();
  }

} //AGImpl
