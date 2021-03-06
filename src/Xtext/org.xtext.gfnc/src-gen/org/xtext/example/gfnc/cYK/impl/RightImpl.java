/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.gfnc.cYK.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.gfnc.cYK.Binary;
import org.xtext.example.gfnc.cYK.CYKPackage;
import org.xtext.example.gfnc.cYK.Right;
import org.xtext.example.gfnc.cYK.Terminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.gfnc.cYK.impl.RightImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.xtext.example.gfnc.cYK.impl.RightImpl#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.xtext.example.gfnc.cYK.impl.RightImpl#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RightImpl extends MinimalEObjectImpl.Container implements Right
{
  /**
   * The cached value of the '{@link #getSimple() <em>Simple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimple()
   * @generated
   * @ordered
   */
  protected Terminal simple;

  /**
   * The cached value of the '{@link #getBinary() <em>Binary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinary()
   * @generated
   * @ordered
   */
  protected Binary binary;

  /**
   * The default value of the '{@link #getLambda() <em>Lambda</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLambda()
   * @generated
   * @ordered
   */
  protected static final String LAMBDA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLambda() <em>Lambda</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLambda()
   * @generated
   * @ordered
   */
  protected String lambda = LAMBDA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RightImpl()
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
    return CYKPackage.Literals.RIGHT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Terminal getSimple()
  {
    return simple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimple(Terminal newSimple, NotificationChain msgs)
  {
    Terminal oldSimple = simple;
    simple = newSimple;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CYKPackage.RIGHT__SIMPLE, oldSimple, newSimple);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSimple(Terminal newSimple)
  {
    if (newSimple != simple)
    {
      NotificationChain msgs = null;
      if (simple != null)
        msgs = ((InternalEObject)simple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CYKPackage.RIGHT__SIMPLE, null, msgs);
      if (newSimple != null)
        msgs = ((InternalEObject)newSimple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CYKPackage.RIGHT__SIMPLE, null, msgs);
      msgs = basicSetSimple(newSimple, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CYKPackage.RIGHT__SIMPLE, newSimple, newSimple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Binary getBinary()
  {
    return binary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinary(Binary newBinary, NotificationChain msgs)
  {
    Binary oldBinary = binary;
    binary = newBinary;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CYKPackage.RIGHT__BINARY, oldBinary, newBinary);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBinary(Binary newBinary)
  {
    if (newBinary != binary)
    {
      NotificationChain msgs = null;
      if (binary != null)
        msgs = ((InternalEObject)binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CYKPackage.RIGHT__BINARY, null, msgs);
      if (newBinary != null)
        msgs = ((InternalEObject)newBinary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CYKPackage.RIGHT__BINARY, null, msgs);
      msgs = basicSetBinary(newBinary, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CYKPackage.RIGHT__BINARY, newBinary, newBinary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLambda()
  {
    return lambda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLambda(String newLambda)
  {
    String oldLambda = lambda;
    lambda = newLambda;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CYKPackage.RIGHT__LAMBDA, oldLambda, lambda));
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
      case CYKPackage.RIGHT__SIMPLE:
        return basicSetSimple(null, msgs);
      case CYKPackage.RIGHT__BINARY:
        return basicSetBinary(null, msgs);
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
      case CYKPackage.RIGHT__SIMPLE:
        return getSimple();
      case CYKPackage.RIGHT__BINARY:
        return getBinary();
      case CYKPackage.RIGHT__LAMBDA:
        return getLambda();
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
      case CYKPackage.RIGHT__SIMPLE:
        setSimple((Terminal)newValue);
        return;
      case CYKPackage.RIGHT__BINARY:
        setBinary((Binary)newValue);
        return;
      case CYKPackage.RIGHT__LAMBDA:
        setLambda((String)newValue);
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
      case CYKPackage.RIGHT__SIMPLE:
        setSimple((Terminal)null);
        return;
      case CYKPackage.RIGHT__BINARY:
        setBinary((Binary)null);
        return;
      case CYKPackage.RIGHT__LAMBDA:
        setLambda(LAMBDA_EDEFAULT);
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
      case CYKPackage.RIGHT__SIMPLE:
        return simple != null;
      case CYKPackage.RIGHT__BINARY:
        return binary != null;
      case CYKPackage.RIGHT__LAMBDA:
        return LAMBDA_EDEFAULT == null ? lambda != null : !LAMBDA_EDEFAULT.equals(lambda);
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
    result.append(" (lambda: ");
    result.append(lambda);
    result.append(')');
    return result.toString();
  }

} //RightImpl
