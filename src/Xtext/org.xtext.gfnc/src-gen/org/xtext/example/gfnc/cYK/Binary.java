/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.gfnc.cYK;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.gfnc.cYK.Binary#getFirst <em>First</em>}</li>
 *   <li>{@link org.xtext.example.gfnc.cYK.Binary#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.gfnc.cYK.CYKPackage#getBinary()
 * @model
 * @generated
 */
public interface Binary extends EObject
{
  /**
   * Returns the value of the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' containment reference.
   * @see #setFirst(NonTerminal)
   * @see org.xtext.example.gfnc.cYK.CYKPackage#getBinary_First()
   * @model containment="true"
   * @generated
   */
  NonTerminal getFirst();

  /**
   * Sets the value of the '{@link org.xtext.example.gfnc.cYK.Binary#getFirst <em>First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' containment reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(NonTerminal value);

  /**
   * Returns the value of the '<em><b>Second</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second</em>' containment reference.
   * @see #setSecond(NonTerminal)
   * @see org.xtext.example.gfnc.cYK.CYKPackage#getBinary_Second()
   * @model containment="true"
   * @generated
   */
  NonTerminal getSecond();

  /**
   * Sets the value of the '{@link org.xtext.example.gfnc.cYK.Binary#getSecond <em>Second</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second</em>' containment reference.
   * @see #getSecond()
   * @generated
   */
  void setSecond(NonTerminal value);

} // Binary
