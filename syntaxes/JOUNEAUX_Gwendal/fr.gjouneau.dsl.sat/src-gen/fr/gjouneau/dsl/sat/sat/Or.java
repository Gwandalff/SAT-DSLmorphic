/**
 * generated by Xtext 2.19.0
 */
package fr.gjouneau.dsl.sat.sat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.gjouneau.dsl.sat.sat.Or#getLhs <em>Lhs</em>}</li>
 *   <li>{@link fr.gjouneau.dsl.sat.sat.Or#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see fr.gjouneau.dsl.sat.sat.SatPackage#getOr()
 * @model
 * @generated
 */
public interface Or extends Expression
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(Expression)
   * @see fr.gjouneau.dsl.sat.sat.SatPackage#getOr_Lhs()
   * @model containment="true"
   * @generated
   */
  Expression getLhs();

  /**
   * Sets the value of the '{@link fr.gjouneau.dsl.sat.sat.Or#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Expression value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(Expression)
   * @see fr.gjouneau.dsl.sat.sat.SatPackage#getOr_Rhs()
   * @model containment="true"
   * @generated
   */
  Expression getRhs();

  /**
   * Sets the value of the '{@link fr.gjouneau.dsl.sat.sat.Or#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Expression value);

} // Or