/**
 */
package SAR.impl;

import SAR.AttributeConditionExpression;
import SAR.ComposedAttributeCondition;
import SAR.SARPackage;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composed Attribute Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.ComposedAttributeConditionImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link SAR.impl.ComposedAttributeConditionImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposedAttributeConditionImpl extends AttributeConditionExpressionImpl implements ComposedAttributeCondition {
	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected AttributeConditionExpression lhs;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected AttributeConditionExpression rhs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAttributeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.COMPOSED_ATTRIBUTE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConditionExpression getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(AttributeConditionExpression newLhs, NotificationChain msgs) {
		AttributeConditionExpression oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.COMPOSED_ATTRIBUTE_CONDITION__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(AttributeConditionExpression newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.COMPOSED_ATTRIBUTE_CONDITION__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.COMPOSED_ATTRIBUTE_CONDITION__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.COMPOSED_ATTRIBUTE_CONDITION__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConditionExpression getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(AttributeConditionExpression newRhs, NotificationChain msgs) {
		AttributeConditionExpression oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.COMPOSED_ATTRIBUTE_CONDITION__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(AttributeConditionExpression newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.COMPOSED_ATTRIBUTE_CONDITION__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.COMPOSED_ATTRIBUTE_CONDITION__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.COMPOSED_ATTRIBUTE_CONDITION__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.COMPOSED_ATTRIBUTE_CONDITION__LHS:
				return basicSetLhs(null, msgs);
			case SARPackage.COMPOSED_ATTRIBUTE_CONDITION__RHS:
				return basicSetRhs(null, msgs);
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
			case SARPackage.COMPOSED_ATTRIBUTE_CONDITION__LHS:
				return getLhs();
			case SARPackage.COMPOSED_ATTRIBUTE_CONDITION__RHS:
				return getRhs();
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
			case SARPackage.COMPOSED_ATTRIBUTE_CONDITION__LHS:
				setLhs((AttributeConditionExpression)newValue);
				return;
			case SARPackage.COMPOSED_ATTRIBUTE_CONDITION__RHS:
				setRhs((AttributeConditionExpression)newValue);
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
			case SARPackage.COMPOSED_ATTRIBUTE_CONDITION__LHS:
				setLhs((AttributeConditionExpression)null);
				return;
			case SARPackage.COMPOSED_ATTRIBUTE_CONDITION__RHS:
				setRhs((AttributeConditionExpression)null);
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
			case SARPackage.COMPOSED_ATTRIBUTE_CONDITION__LHS:
				return lhs != null;
			case SARPackage.COMPOSED_ATTRIBUTE_CONDITION__RHS:
				return rhs != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toProlog(String string, String entityName) {
		StringBuilder str = new StringBuilder();
		str.append("[");
		str.append("'&'");
		str.append(",");
		str.append(lhs.toProlog(string,entityName));
		str.append(",");
		str.append(rhs.toProlog(string,entityName));
		str.append("]");
		
		
		
		return str.toString();
	}

	@Override
	public void getVariables(HashSet<String> variables) {
		lhs.getVariables(variables);
		rhs.getVariables(variables);
		
	}

	@Override
	public Object getTrigger(String object_id, String entity_name, HashMap<String, String> map) {
		StringBuilder str = new StringBuilder();
		str.append(lhs.getTrigger(object_id,entity_name,map));
		str.append(",");
		str.append(rhs.getTrigger(object_id,entity_name,map));
		
		return str.toString();
	}

} //ComposedAttributeConditionImpl
