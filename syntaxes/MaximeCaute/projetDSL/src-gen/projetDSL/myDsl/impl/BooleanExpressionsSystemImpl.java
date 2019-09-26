/**
 * generated by Xtext 2.19.0
 */
package projetDSL.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projetDSL.myDsl.BooleanExpression;
import projetDSL.myDsl.BooleanExpressionsSystem;
import projetDSL.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Expressions System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetDSL.myDsl.impl.BooleanExpressionsSystemImpl#getBooleanExpressions <em>Boolean Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanExpressionsSystemImpl extends MinimalEObjectImpl.Container implements BooleanExpressionsSystem
{
  /**
   * The cached value of the '{@link #getBooleanExpressions() <em>Boolean Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanExpressions()
   * @generated
   * @ordered
   */
  protected EList<BooleanExpression> booleanExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanExpressionsSystemImpl()
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
    return MyDslPackage.Literals.BOOLEAN_EXPRESSIONS_SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<BooleanExpression> getBooleanExpressions()
  {
    if (booleanExpressions == null)
    {
      booleanExpressions = new EObjectContainmentEList<BooleanExpression>(BooleanExpression.class, this, MyDslPackage.BOOLEAN_EXPRESSIONS_SYSTEM__BOOLEAN_EXPRESSIONS);
    }
    return booleanExpressions;
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
      case MyDslPackage.BOOLEAN_EXPRESSIONS_SYSTEM__BOOLEAN_EXPRESSIONS:
        return ((InternalEList<?>)getBooleanExpressions()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.BOOLEAN_EXPRESSIONS_SYSTEM__BOOLEAN_EXPRESSIONS:
        return getBooleanExpressions();
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
      case MyDslPackage.BOOLEAN_EXPRESSIONS_SYSTEM__BOOLEAN_EXPRESSIONS:
        getBooleanExpressions().clear();
        getBooleanExpressions().addAll((Collection<? extends BooleanExpression>)newValue);
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
      case MyDslPackage.BOOLEAN_EXPRESSIONS_SYSTEM__BOOLEAN_EXPRESSIONS:
        getBooleanExpressions().clear();
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
      case MyDslPackage.BOOLEAN_EXPRESSIONS_SYSTEM__BOOLEAN_EXPRESSIONS:
        return booleanExpressions != null && !booleanExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BooleanExpressionsSystemImpl
