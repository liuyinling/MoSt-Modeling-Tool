/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mostml.moStML.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mostml.moStML.GREATEQUAL;
import org.xtext.example.mostml.moStML.MoStMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GREATEQUAL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mostml.moStML.impl.GREATEQUALImpl#getGreateEqual <em>Greate Equal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GREATEQUALImpl extends COMPARISONOPERATORImpl implements GREATEQUAL
{
  /**
   * The cached value of the '{@link #getGreateEqual() <em>Greate Equal</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreateEqual()
   * @generated
   * @ordered
   */
  protected EList<String> greateEqual;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GREATEQUALImpl()
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
    return MoStMLPackage.Literals.GREATEQUAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getGreateEqual()
  {
    if (greateEqual == null)
    {
      greateEqual = new EDataTypeEList<String>(String.class, this, MoStMLPackage.GREATEQUAL__GREATE_EQUAL);
    }
    return greateEqual;
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
      case MoStMLPackage.GREATEQUAL__GREATE_EQUAL:
        return getGreateEqual();
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
      case MoStMLPackage.GREATEQUAL__GREATE_EQUAL:
        getGreateEqual().clear();
        getGreateEqual().addAll((Collection<? extends String>)newValue);
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
      case MoStMLPackage.GREATEQUAL__GREATE_EQUAL:
        getGreateEqual().clear();
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
      case MoStMLPackage.GREATEQUAL__GREATE_EQUAL:
        return greateEqual != null && !greateEqual.isEmpty();
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
    result.append(" (greateEqual: ");
    result.append(greateEqual);
    result.append(')');
    return result.toString();
  }

} //GREATEQUALImpl
