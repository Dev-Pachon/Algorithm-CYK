/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.gfnc.cYK.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.gfnc.cYK.CYKPackage;
import org.xtext.example.gfnc.cYK.NonTerminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.gfnc.cYK.impl.NonTerminalImpl#getNoTerminals <em>No Terminals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonTerminalImpl extends MinimalEObjectImpl.Container implements NonTerminal
{
  /**
   * The default value of the '{@link #getNoTerminals() <em>No Terminals</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNoTerminals()
   * @generated
   * @ordered
   */
  protected static final String NO_TERMINALS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNoTerminals() <em>No Terminals</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNoTerminals()
   * @generated
   * @ordered
   */
  protected String noTerminals = NO_TERMINALS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonTerminalImpl()
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
    return CYKPackage.Literals.NON_TERMINAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNoTerminals()
  {
    return noTerminals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNoTerminals(String newNoTerminals)
  {
    String oldNoTerminals = noTerminals;
    noTerminals = newNoTerminals;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CYKPackage.NON_TERMINAL__NO_TERMINALS, oldNoTerminals, noTerminals));
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
      case CYKPackage.NON_TERMINAL__NO_TERMINALS:
        return getNoTerminals();
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
      case CYKPackage.NON_TERMINAL__NO_TERMINALS:
        setNoTerminals((String)newValue);
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
      case CYKPackage.NON_TERMINAL__NO_TERMINALS:
        setNoTerminals(NO_TERMINALS_EDEFAULT);
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
      case CYKPackage.NON_TERMINAL__NO_TERMINALS:
        return NO_TERMINALS_EDEFAULT == null ? noTerminals != null : !NO_TERMINALS_EDEFAULT.equals(noTerminals);
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
    result.append(" (noTerminals: ");
    result.append(noTerminals);
    result.append(')');
    return result.toString();
  }

} //NonTerminalImpl
