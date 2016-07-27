/**
 */
package SAR.impl;

import SAR.AttributeConditionExpression;
import SAR.Condition;
import SAR.SARPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.ConditionImpl#getAttribute_condition_expression <em>Attribute condition expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConditionImpl extends ConditionExpressionImpl implements Condition {
	/**
	 * The cached value of the '{@link #getAttribute_condition_expression() <em>Attribute condition expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute_condition_expression()
	 * @generated
	 * @ordered
	 */
	protected AttributeConditionExpression attribute_condition_expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConditionExpression getAttribute_condition_expression() {
		return attribute_condition_expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute_condition_expression(AttributeConditionExpression newAttribute_condition_expression, NotificationChain msgs) {
		AttributeConditionExpression oldAttribute_condition_expression = attribute_condition_expression;
		attribute_condition_expression = newAttribute_condition_expression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.CONDITION__ATTRIBUTE_CONDITION_EXPRESSION, oldAttribute_condition_expression, newAttribute_condition_expression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute_condition_expression(AttributeConditionExpression newAttribute_condition_expression) {
		if (newAttribute_condition_expression != attribute_condition_expression) {
			NotificationChain msgs = null;
			if (attribute_condition_expression != null)
				msgs = ((InternalEObject)attribute_condition_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.CONDITION__ATTRIBUTE_CONDITION_EXPRESSION, null, msgs);
			if (newAttribute_condition_expression != null)
				msgs = ((InternalEObject)newAttribute_condition_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.CONDITION__ATTRIBUTE_CONDITION_EXPRESSION, null, msgs);
			msgs = basicSetAttribute_condition_expression(newAttribute_condition_expression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.CONDITION__ATTRIBUTE_CONDITION_EXPRESSION, newAttribute_condition_expression, newAttribute_condition_expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.CONDITION__ATTRIBUTE_CONDITION_EXPRESSION:
				return basicSetAttribute_condition_expression(null, msgs);
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
			case SARPackage.CONDITION__ATTRIBUTE_CONDITION_EXPRESSION:
				return getAttribute_condition_expression();
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
			case SARPackage.CONDITION__ATTRIBUTE_CONDITION_EXPRESSION:
				setAttribute_condition_expression((AttributeConditionExpression)newValue);
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
			case SARPackage.CONDITION__ATTRIBUTE_CONDITION_EXPRESSION:
				setAttribute_condition_expression((AttributeConditionExpression)null);
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
			case SARPackage.CONDITION__ATTRIBUTE_CONDITION_EXPRESSION:
				return attribute_condition_expression != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
