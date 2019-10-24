/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl1.mSat.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl1.mSat.CryptoMiniSAT;
import org.xtext.example.mydsl1.mSat.MSatPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crypto Mini SAT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.mSat.impl.CryptoMiniSATImpl#getVariant <em>Variant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CryptoMiniSATImpl extends MinimalEObjectImpl.Container implements CryptoMiniSAT
{
  /**
   * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariant()
   * @generated
   * @ordered
   */
  protected static final String VARIANT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariant() <em>Variant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariant()
   * @generated
   * @ordered
   */
  protected String variant = VARIANT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CryptoMiniSATImpl()
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
    return MSatPackage.Literals.CRYPTO_MINI_SAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVariant()
  {
    return variant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariant(String newVariant)
  {
    String oldVariant = variant;
    variant = newVariant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MSatPackage.CRYPTO_MINI_SAT__VARIANT, oldVariant, variant));
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
      case MSatPackage.CRYPTO_MINI_SAT__VARIANT:
        return getVariant();
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
      case MSatPackage.CRYPTO_MINI_SAT__VARIANT:
        setVariant((String)newValue);
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
      case MSatPackage.CRYPTO_MINI_SAT__VARIANT:
        setVariant(VARIANT_EDEFAULT);
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
      case MSatPackage.CRYPTO_MINI_SAT__VARIANT:
        return VARIANT_EDEFAULT == null ? variant != null : !VARIANT_EDEFAULT.equals(variant);
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
    result.append(" (variant: ");
    result.append(variant);
    result.append(')');
    return result.toString();
  }

} //CryptoMiniSATImpl