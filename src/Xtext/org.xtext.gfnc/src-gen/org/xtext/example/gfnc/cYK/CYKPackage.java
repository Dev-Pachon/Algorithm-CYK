/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.gfnc.cYK;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.gfnc.cYK.CYKFactory
 * @model kind="package"
 * @generated
 */
public interface CYKPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cYK";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/gfnc/CYK";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cYK";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CYKPackage eINSTANCE = org.xtext.example.gfnc.cYK.impl.CYKPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.gfnc.cYK.impl.GFNCImpl <em>GFNC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.gfnc.cYK.impl.GFNCImpl
   * @see org.xtext.example.gfnc.cYK.impl.CYKPackageImpl#getGFNC()
   * @generated
   */
  int GFNC = 0;

  /**
   * The feature id for the '<em><b>W</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GFNC__W = 0;

  /**
   * The feature id for the '<em><b>Productions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GFNC__PRODUCTIONS = 1;

  /**
   * The number of structural features of the '<em>GFNC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GFNC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.gfnc.cYK.impl.WImpl <em>W</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.gfnc.cYK.impl.WImpl
   * @see org.xtext.example.gfnc.cYK.impl.CYKPackageImpl#getW()
   * @generated
   */
  int W = 1;

  /**
   * The feature id for the '<em><b>Lambda</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int W__LAMBDA = 0;

  /**
   * The feature id for the '<em><b>W</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int W__W = 1;

  /**
   * The number of structural features of the '<em>W</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int W_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.gfnc.cYK.impl.ProductionImpl <em>Production</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.gfnc.cYK.impl.ProductionImpl
   * @see org.xtext.example.gfnc.cYK.impl.CYKPackageImpl#getProduction()
   * @generated
   */
  int PRODUCTION = 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCTION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCTION__RIGHT = 1;

  /**
   * The number of structural features of the '<em>Production</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.gfnc.cYK.impl.RightImpl <em>Right</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.gfnc.cYK.impl.RightImpl
   * @see org.xtext.example.gfnc.cYK.impl.CYKPackageImpl#getRight()
   * @generated
   */
  int RIGHT = 3;

  /**
   * The feature id for the '<em><b>Simple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT__SIMPLE = 0;

  /**
   * The feature id for the '<em><b>Binary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT__BINARY = 1;

  /**
   * The feature id for the '<em><b>Lambda</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT__LAMBDA = 2;

  /**
   * The number of structural features of the '<em>Right</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.gfnc.cYK.impl.TerminalImpl <em>Terminal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.gfnc.cYK.impl.TerminalImpl
   * @see org.xtext.example.gfnc.cYK.impl.CYKPackageImpl#getTerminal()
   * @generated
   */
  int TERMINAL = 4;

  /**
   * The feature id for the '<em><b>Terminals</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL__TERMINALS = 0;

  /**
   * The number of structural features of the '<em>Terminal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.gfnc.cYK.impl.NonTerminalImpl <em>Non Terminal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.gfnc.cYK.impl.NonTerminalImpl
   * @see org.xtext.example.gfnc.cYK.impl.CYKPackageImpl#getNonTerminal()
   * @generated
   */
  int NON_TERMINAL = 5;

  /**
   * The feature id for the '<em><b>Non Terminals</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_TERMINAL__NON_TERMINALS = 0;

  /**
   * The number of structural features of the '<em>Non Terminal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_TERMINAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.gfnc.cYK.impl.BinaryImpl <em>Binary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.gfnc.cYK.impl.BinaryImpl
   * @see org.xtext.example.gfnc.cYK.impl.CYKPackageImpl#getBinary()
   * @generated
   */
  int BINARY = 6;

  /**
   * The feature id for the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY__FIRST = 0;

  /**
   * The feature id for the '<em><b>Second</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY__SECOND = 1;

  /**
   * The number of structural features of the '<em>Binary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.gfnc.cYK.GFNC <em>GFNC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GFNC</em>'.
   * @see org.xtext.example.gfnc.cYK.GFNC
   * @generated
   */
  EClass getGFNC();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.gfnc.cYK.GFNC#getW <em>W</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>W</em>'.
   * @see org.xtext.example.gfnc.cYK.GFNC#getW()
   * @see #getGFNC()
   * @generated
   */
  EReference getGFNC_W();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.gfnc.cYK.GFNC#getProductions <em>Productions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Productions</em>'.
   * @see org.xtext.example.gfnc.cYK.GFNC#getProductions()
   * @see #getGFNC()
   * @generated
   */
  EReference getGFNC_Productions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.gfnc.cYK.W <em>W</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>W</em>'.
   * @see org.xtext.example.gfnc.cYK.W
   * @generated
   */
  EClass getW();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.gfnc.cYK.W#getLambda <em>Lambda</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lambda</em>'.
   * @see org.xtext.example.gfnc.cYK.W#getLambda()
   * @see #getW()
   * @generated
   */
  EAttribute getW_Lambda();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.gfnc.cYK.W#getW <em>W</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>W</em>'.
   * @see org.xtext.example.gfnc.cYK.W#getW()
   * @see #getW()
   * @generated
   */
  EReference getW_W();

  /**
   * Returns the meta object for class '{@link org.xtext.example.gfnc.cYK.Production <em>Production</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Production</em>'.
   * @see org.xtext.example.gfnc.cYK.Production
   * @generated
   */
  EClass getProduction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.gfnc.cYK.Production#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.gfnc.cYK.Production#getLeft()
   * @see #getProduction()
   * @generated
   */
  EReference getProduction_Left();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.gfnc.cYK.Production#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Right</em>'.
   * @see org.xtext.example.gfnc.cYK.Production#getRight()
   * @see #getProduction()
   * @generated
   */
  EReference getProduction_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.gfnc.cYK.Right <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right</em>'.
   * @see org.xtext.example.gfnc.cYK.Right
   * @generated
   */
  EClass getRight();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.gfnc.cYK.Right#getSimple <em>Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Simple</em>'.
   * @see org.xtext.example.gfnc.cYK.Right#getSimple()
   * @see #getRight()
   * @generated
   */
  EReference getRight_Simple();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.gfnc.cYK.Right#getBinary <em>Binary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary</em>'.
   * @see org.xtext.example.gfnc.cYK.Right#getBinary()
   * @see #getRight()
   * @generated
   */
  EReference getRight_Binary();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.gfnc.cYK.Right#getLambda <em>Lambda</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lambda</em>'.
   * @see org.xtext.example.gfnc.cYK.Right#getLambda()
   * @see #getRight()
   * @generated
   */
  EAttribute getRight_Lambda();

  /**
   * Returns the meta object for class '{@link org.xtext.example.gfnc.cYK.Terminal <em>Terminal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminal</em>'.
   * @see org.xtext.example.gfnc.cYK.Terminal
   * @generated
   */
  EClass getTerminal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.gfnc.cYK.Terminal#getTerminals <em>Terminals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Terminals</em>'.
   * @see org.xtext.example.gfnc.cYK.Terminal#getTerminals()
   * @see #getTerminal()
   * @generated
   */
  EAttribute getTerminal_Terminals();

  /**
   * Returns the meta object for class '{@link org.xtext.example.gfnc.cYK.NonTerminal <em>Non Terminal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Terminal</em>'.
   * @see org.xtext.example.gfnc.cYK.NonTerminal
   * @generated
   */
  EClass getNonTerminal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.gfnc.cYK.NonTerminal#getNonTerminals <em>Non Terminals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Non Terminals</em>'.
   * @see org.xtext.example.gfnc.cYK.NonTerminal#getNonTerminals()
   * @see #getNonTerminal()
   * @generated
   */
  EAttribute getNonTerminal_NonTerminals();

  /**
   * Returns the meta object for class '{@link org.xtext.example.gfnc.cYK.Binary <em>Binary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary</em>'.
   * @see org.xtext.example.gfnc.cYK.Binary
   * @generated
   */
  EClass getBinary();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.gfnc.cYK.Binary#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First</em>'.
   * @see org.xtext.example.gfnc.cYK.Binary#getFirst()
   * @see #getBinary()
   * @generated
   */
  EReference getBinary_First();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.gfnc.cYK.Binary#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second</em>'.
   * @see org.xtext.example.gfnc.cYK.Binary#getSecond()
   * @see #getBinary()
   * @generated
   */
  EReference getBinary_Second();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CYKFactory getCYKFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.gfnc.cYK.impl.GFNCImpl <em>GFNC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.gfnc.cYK.impl.GFNCImpl
     * @see org.xtext.example.gfnc.cYK.impl.CYKPackageImpl#getGFNC()
     * @generated
     */
    EClass GFNC = eINSTANCE.getGFNC();

    /**
     * The meta object literal for the '<em><b>W</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GFNC__W = eINSTANCE.getGFNC_W();

    /**
     * The meta object literal for the '<em><b>Productions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GFNC__PRODUCTIONS = eINSTANCE.getGFNC_Productions();

    /**
     * The meta object literal for the '{@link org.xtext.example.gfnc.cYK.impl.WImpl <em>W</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.gfnc.cYK.impl.WImpl
     * @see org.xtext.example.gfnc.cYK.impl.CYKPackageImpl#getW()
     * @generated
     */
    EClass W = eINSTANCE.getW();

    /**
     * The meta object literal for the '<em><b>Lambda</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute W__LAMBDA = eINSTANCE.getW_Lambda();

    /**
     * The meta object literal for the '<em><b>W</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference W__W = eINSTANCE.getW_W();

    /**
     * The meta object literal for the '{@link org.xtext.example.gfnc.cYK.impl.ProductionImpl <em>Production</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.gfnc.cYK.impl.ProductionImpl
     * @see org.xtext.example.gfnc.cYK.impl.CYKPackageImpl#getProduction()
     * @generated
     */
    EClass PRODUCTION = eINSTANCE.getProduction();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCTION__LEFT = eINSTANCE.getProduction_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCTION__RIGHT = eINSTANCE.getProduction_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.gfnc.cYK.impl.RightImpl <em>Right</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.gfnc.cYK.impl.RightImpl
     * @see org.xtext.example.gfnc.cYK.impl.CYKPackageImpl#getRight()
     * @generated
     */
    EClass RIGHT = eINSTANCE.getRight();

    /**
     * The meta object literal for the '<em><b>Simple</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT__SIMPLE = eINSTANCE.getRight_Simple();

    /**
     * The meta object literal for the '<em><b>Binary</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT__BINARY = eINSTANCE.getRight_Binary();

    /**
     * The meta object literal for the '<em><b>Lambda</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RIGHT__LAMBDA = eINSTANCE.getRight_Lambda();

    /**
     * The meta object literal for the '{@link org.xtext.example.gfnc.cYK.impl.TerminalImpl <em>Terminal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.gfnc.cYK.impl.TerminalImpl
     * @see org.xtext.example.gfnc.cYK.impl.CYKPackageImpl#getTerminal()
     * @generated
     */
    EClass TERMINAL = eINSTANCE.getTerminal();

    /**
     * The meta object literal for the '<em><b>Terminals</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERMINAL__TERMINALS = eINSTANCE.getTerminal_Terminals();

    /**
     * The meta object literal for the '{@link org.xtext.example.gfnc.cYK.impl.NonTerminalImpl <em>Non Terminal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.gfnc.cYK.impl.NonTerminalImpl
     * @see org.xtext.example.gfnc.cYK.impl.CYKPackageImpl#getNonTerminal()
     * @generated
     */
    EClass NON_TERMINAL = eINSTANCE.getNonTerminal();

    /**
     * The meta object literal for the '<em><b>Non Terminals</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NON_TERMINAL__NON_TERMINALS = eINSTANCE.getNonTerminal_NonTerminals();

    /**
     * The meta object literal for the '{@link org.xtext.example.gfnc.cYK.impl.BinaryImpl <em>Binary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.gfnc.cYK.impl.BinaryImpl
     * @see org.xtext.example.gfnc.cYK.impl.CYKPackageImpl#getBinary()
     * @generated
     */
    EClass BINARY = eINSTANCE.getBinary();

    /**
     * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY__FIRST = eINSTANCE.getBinary_First();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY__SECOND = eINSTANCE.getBinary_Second();

  }

} //CYKPackage
