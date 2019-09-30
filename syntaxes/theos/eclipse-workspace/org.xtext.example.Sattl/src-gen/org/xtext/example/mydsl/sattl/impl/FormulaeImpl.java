/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.sattl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.sattl.Atom;
import org.xtext.example.mydsl.sattl.Formulae;
import org.xtext.example.mydsl.sattl.SattlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formulae</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.sattl.impl.FormulaeImpl#getForm_left <em>Form left</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sattl.impl.FormulaeImpl#getBinop <em>Binop</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sattl.impl.FormulaeImpl#getForm_right <em>Form right</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sattl.impl.FormulaeImpl#getUnop <em>Unop</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sattl.impl.FormulaeImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sattl.impl.FormulaeImpl#getAtom <em>Atom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormulaeImpl extends MinimalEObjectImpl.Container implements Formulae
{
  /**
   * The cached value of the '{@link #getForm_left() <em>Form left</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForm_left()
   * @generated
   * @ordered
   */
  protected EList<Formulae> form_left;

  /**
   * The cached value of the '{@link #getBinop() <em>Binop</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinop()
   * @generated
   * @ordered
   */
  protected EList<String> binop;

  /**
   * The cached value of the '{@link #getForm_right() <em>Form right</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForm_right()
   * @generated
   * @ordered
   */
  protected EList<Formulae> form_right;

  /**
   * The cached value of the '{@link #getUnop() <em>Unop</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnop()
   * @generated
   * @ordered
   */
  protected EList<String> unop;

  /**
   * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForm()
   * @generated
   * @ordered
   */
  protected EList<Formulae> form;

  /**
   * The cached value of the '{@link #getAtom() <em>Atom</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtom()
   * @generated
   * @ordered
   */
  protected EList<Atom> atom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormulaeImpl()
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
    return SattlPackage.Literals.FORMULAE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Formulae> getForm_left()
  {
    if (form_left == null)
    {
      form_left = new EObjectContainmentEList<Formulae>(Formulae.class, this, SattlPackage.FORMULAE__FORM_LEFT);
    }
    return form_left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getBinop()
  {
    if (binop == null)
    {
      binop = new EDataTypeEList<String>(String.class, this, SattlPackage.FORMULAE__BINOP);
    }
    return binop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Formulae> getForm_right()
  {
    if (form_right == null)
    {
      form_right = new EObjectContainmentEList<Formulae>(Formulae.class, this, SattlPackage.FORMULAE__FORM_RIGHT);
    }
    return form_right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getUnop()
  {
    if (unop == null)
    {
      unop = new EDataTypeEList<String>(String.class, this, SattlPackage.FORMULAE__UNOP);
    }
    return unop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Formulae> getForm()
  {
    if (form == null)
    {
      form = new EObjectContainmentEList<Formulae>(Formulae.class, this, SattlPackage.FORMULAE__FORM);
    }
    return form;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Atom> getAtom()
  {
    if (atom == null)
    {
      atom = new EObjectContainmentEList<Atom>(Atom.class, this, SattlPackage.FORMULAE__ATOM);
    }
    return atom;
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
      case SattlPackage.FORMULAE__FORM_LEFT:
        return ((InternalEList<?>)getForm_left()).basicRemove(otherEnd, msgs);
      case SattlPackage.FORMULAE__FORM_RIGHT:
        return ((InternalEList<?>)getForm_right()).basicRemove(otherEnd, msgs);
      case SattlPackage.FORMULAE__FORM:
        return ((InternalEList<?>)getForm()).basicRemove(otherEnd, msgs);
      case SattlPackage.FORMULAE__ATOM:
        return ((InternalEList<?>)getAtom()).basicRemove(otherEnd, msgs);
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
      case SattlPackage.FORMULAE__FORM_LEFT:
        return getForm_left();
      case SattlPackage.FORMULAE__BINOP:
        return getBinop();
      case SattlPackage.FORMULAE__FORM_RIGHT:
        return getForm_right();
      case SattlPackage.FORMULAE__UNOP:
        return getUnop();
      case SattlPackage.FORMULAE__FORM:
        return getForm();
      case SattlPackage.FORMULAE__ATOM:
        return getAtom();
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
      case SattlPackage.FORMULAE__FORM_LEFT:
        getForm_left().clear();
        getForm_left().addAll((Collection<? extends Formulae>)newValue);
        return;
      case SattlPackage.FORMULAE__BINOP:
        getBinop().clear();
        getBinop().addAll((Collection<? extends String>)newValue);
        return;
      case SattlPackage.FORMULAE__FORM_RIGHT:
        getForm_right().clear();
        getForm_right().addAll((Collection<? extends Formulae>)newValue);
        return;
      case SattlPackage.FORMULAE__UNOP:
        getUnop().clear();
        getUnop().addAll((Collection<? extends String>)newValue);
        return;
      case SattlPackage.FORMULAE__FORM:
        getForm().clear();
        getForm().addAll((Collection<? extends Formulae>)newValue);
        return;
      case SattlPackage.FORMULAE__ATOM:
        getAtom().clear();
        getAtom().addAll((Collection<? extends Atom>)newValue);
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
      case SattlPackage.FORMULAE__FORM_LEFT:
        getForm_left().clear();
        return;
      case SattlPackage.FORMULAE__BINOP:
        getBinop().clear();
        return;
      case SattlPackage.FORMULAE__FORM_RIGHT:
        getForm_right().clear();
        return;
      case SattlPackage.FORMULAE__UNOP:
        getUnop().clear();
        return;
      case SattlPackage.FORMULAE__FORM:
        getForm().clear();
        return;
      case SattlPackage.FORMULAE__ATOM:
        getAtom().clear();
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
      case SattlPackage.FORMULAE__FORM_LEFT:
        return form_left != null && !form_left.isEmpty();
      case SattlPackage.FORMULAE__BINOP:
        return binop != null && !binop.isEmpty();
      case SattlPackage.FORMULAE__FORM_RIGHT:
        return form_right != null && !form_right.isEmpty();
      case SattlPackage.FORMULAE__UNOP:
        return unop != null && !unop.isEmpty();
      case SattlPackage.FORMULAE__FORM:
        return form != null && !form.isEmpty();
      case SattlPackage.FORMULAE__ATOM:
        return atom != null && !atom.isEmpty();
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
    result.append(" (binop: ");
    result.append(binop);
    result.append(", unop: ");
    result.append(unop);
    result.append(')');
    return result.toString();
  }

} //FormulaeImpl
