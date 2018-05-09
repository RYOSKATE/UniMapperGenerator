/**
 * generated by Xtext 2.13.0
 */
package net.unicoen.uniMapperGenerator.impl;

import java.util.Collection;

import net.unicoen.uniMapperGenerator.AltList;
import net.unicoen.uniMapperGenerator.Block;
import net.unicoen.uniMapperGenerator.Options;
import net.unicoen.uniMapperGenerator.RuleAction;
import net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.BlockImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.BlockImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.BlockImpl#getColon <em>Colon</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.BlockImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block
{
  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected Options options;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<RuleAction> actions;

  /**
   * The default value of the '{@link #getColon() <em>Colon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColon()
   * @generated
   * @ordered
   */
  protected static final String COLON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColon() <em>Colon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColon()
   * @generated
   * @ordered
   */
  protected String colon = COLON_EDEFAULT;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected AltList body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockImpl()
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
    return UniMapperGeneratorPackage.Literals.BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Options getOptions()
  {
    return options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptions(Options newOptions, NotificationChain msgs)
  {
    Options oldOptions = options;
    options = newOptions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.BLOCK__OPTIONS, oldOptions, newOptions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptions(Options newOptions)
  {
    if (newOptions != options)
    {
      NotificationChain msgs = null;
      if (options != null)
        msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.BLOCK__OPTIONS, null, msgs);
      if (newOptions != null)
        msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.BLOCK__OPTIONS, null, msgs);
      msgs = basicSetOptions(newOptions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.BLOCK__OPTIONS, newOptions, newOptions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RuleAction> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<RuleAction>(RuleAction.class, this, UniMapperGeneratorPackage.BLOCK__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColon()
  {
    return colon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColon(String newColon)
  {
    String oldColon = colon;
    colon = newColon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.BLOCK__COLON, oldColon, colon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AltList getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(AltList newBody, NotificationChain msgs)
  {
    AltList oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.BLOCK__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(AltList newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.BLOCK__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.BLOCK__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.BLOCK__BODY, newBody, newBody));
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
      case UniMapperGeneratorPackage.BLOCK__OPTIONS:
        return basicSetOptions(null, msgs);
      case UniMapperGeneratorPackage.BLOCK__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case UniMapperGeneratorPackage.BLOCK__BODY:
        return basicSetBody(null, msgs);
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
      case UniMapperGeneratorPackage.BLOCK__OPTIONS:
        return getOptions();
      case UniMapperGeneratorPackage.BLOCK__ACTIONS:
        return getActions();
      case UniMapperGeneratorPackage.BLOCK__COLON:
        return getColon();
      case UniMapperGeneratorPackage.BLOCK__BODY:
        return getBody();
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
      case UniMapperGeneratorPackage.BLOCK__OPTIONS:
        setOptions((Options)newValue);
        return;
      case UniMapperGeneratorPackage.BLOCK__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends RuleAction>)newValue);
        return;
      case UniMapperGeneratorPackage.BLOCK__COLON:
        setColon((String)newValue);
        return;
      case UniMapperGeneratorPackage.BLOCK__BODY:
        setBody((AltList)newValue);
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
      case UniMapperGeneratorPackage.BLOCK__OPTIONS:
        setOptions((Options)null);
        return;
      case UniMapperGeneratorPackage.BLOCK__ACTIONS:
        getActions().clear();
        return;
      case UniMapperGeneratorPackage.BLOCK__COLON:
        setColon(COLON_EDEFAULT);
        return;
      case UniMapperGeneratorPackage.BLOCK__BODY:
        setBody((AltList)null);
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
      case UniMapperGeneratorPackage.BLOCK__OPTIONS:
        return options != null;
      case UniMapperGeneratorPackage.BLOCK__ACTIONS:
        return actions != null && !actions.isEmpty();
      case UniMapperGeneratorPackage.BLOCK__COLON:
        return COLON_EDEFAULT == null ? colon != null : !COLON_EDEFAULT.equals(colon);
      case UniMapperGeneratorPackage.BLOCK__BODY:
        return body != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (colon: ");
    result.append(colon);
    result.append(')');
    return result.toString();
  }

} //BlockImpl
