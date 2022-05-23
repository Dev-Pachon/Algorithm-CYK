/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.gfnc.cYK;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.gfnc.cYK.CYKPackage
 * @generated
 */
public interface CYKFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CYKFactory eINSTANCE = org.xtext.example.gfnc.cYK.impl.CYKFactoryImpl.init();

  /**
   * Returns a new object of class '<em>GFNC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GFNC</em>'.
   * @generated
   */
  GFNC createGFNC();

  /**
   * Returns a new object of class '<em>Initial</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initial</em>'.
   * @generated
   */
  Initial createInitial();

  /**
   * Returns a new object of class '<em>Lambda</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lambda</em>'.
   * @generated
   */
  Lambda createLambda();

  /**
   * Returns a new object of class '<em>Production</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Production</em>'.
   * @generated
   */
  Production createProduction();

  /**
   * Returns a new object of class '<em>Right</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Right</em>'.
   * @generated
   */
  Right createRight();

  /**
   * Returns a new object of class '<em>Simple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple</em>'.
   * @generated
   */
  Simple createSimple();

  /**
   * Returns a new object of class '<em>Non Terminal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Terminal</em>'.
   * @generated
   */
  NonTerminal createNonTerminal();

  /**
   * Returns a new object of class '<em>Binary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binary</em>'.
   * @generated
   */
  Binary createBinary();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CYKPackage getCYKPackage();

} //CYKFactory
