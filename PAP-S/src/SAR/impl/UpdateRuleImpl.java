/**
 */
package SAR.impl;

import SAR.SARPackage;
import SAR.UpdateExpression;
import SAR.UpdateRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.UpdateRuleImpl#getUpdate_expression <em>Update expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UpdateRuleImpl extends RuleImpl implements UpdateRule {
	/**
	 * The cached value of the '{@link #getUpdate_expression() <em>Update expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate_expression()
	 * @generated
	 * @ordered
	 */
	protected UpdateExpression update_expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.UPDATE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateExpression getUpdate_expression() {
		return update_expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdate_expression(UpdateExpression newUpdate_expression, NotificationChain msgs) {
		UpdateExpression oldUpdate_expression = update_expression;
		update_expression = newUpdate_expression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.UPDATE_RULE__UPDATE_EXPRESSION, oldUpdate_expression, newUpdate_expression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdate_expression(UpdateExpression newUpdate_expression) {
		if (newUpdate_expression != update_expression) {
			NotificationChain msgs = null;
			if (update_expression != null)
				msgs = ((InternalEObject)update_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.UPDATE_RULE__UPDATE_EXPRESSION, null, msgs);
			if (newUpdate_expression != null)
				msgs = ((InternalEObject)newUpdate_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.UPDATE_RULE__UPDATE_EXPRESSION, null, msgs);
			msgs = basicSetUpdate_expression(newUpdate_expression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.UPDATE_RULE__UPDATE_EXPRESSION, newUpdate_expression, newUpdate_expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.UPDATE_RULE__UPDATE_EXPRESSION:
				return basicSetUpdate_expression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SARPackage.UPDATE_RULE__UPDATE_EXPRESSION:
				return getUpdate_expression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SARPackage.UPDATE_RULE__UPDATE_EXPRESSION:
				setUpdate_expression((UpdateExpression)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SARPackage.UPDATE_RULE__UPDATE_EXPRESSION:
				setUpdate_expression((UpdateExpression)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SARPackage.UPDATE_RULE__UPDATE_EXPRESSION:
				return update_expression != null;
		}
		return super.eIsSet(featureID);
	}

} //UpdateRuleImpl
