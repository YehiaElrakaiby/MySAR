/**
 */
package SAR.impl;

import SAR.AttributeCondition;
import SAR.AttributeDeclaration;
import SAR.AttributeValue;
import SAR.ComparisonOperator;
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
 * An implementation of the model object '<em><b>Attribute Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.AttributeConditionImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link SAR.impl.AttributeConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link SAR.impl.AttributeConditionImpl#getAttribute_value <em>Attribute value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeConditionImpl extends AttributeConditionExpressionImpl implements AttributeCondition {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected AttributeDeclaration attribute;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator OPERATOR_EDEFAULT = ComparisonOperator.LESS_THAN;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute_value() <em>Attribute value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute_value()
	 * @generated
	 * @ordered
	 */
	protected AttributeValue attribute_value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.ATTRIBUTE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDeclaration getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (AttributeDeclaration)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SARPackage.ATTRIBUTE_CONDITION__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDeclaration basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(AttributeDeclaration newAttribute) {
		AttributeDeclaration oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ATTRIBUTE_CONDITION__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ComparisonOperator newOperator) {
		ComparisonOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ATTRIBUTE_CONDITION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue getAttribute_value() {
		return attribute_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute_value(AttributeValue newAttribute_value, NotificationChain msgs) {
		AttributeValue oldAttribute_value = attribute_value;
		attribute_value = newAttribute_value;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE, oldAttribute_value, newAttribute_value);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute_value(AttributeValue newAttribute_value) {
		if (newAttribute_value != attribute_value) {
			NotificationChain msgs = null;
			if (attribute_value != null)
				msgs = ((InternalEObject)attribute_value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE, null, msgs);
			if (newAttribute_value != null)
				msgs = ((InternalEObject)newAttribute_value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE, null, msgs);
			msgs = basicSetAttribute_value(newAttribute_value, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE, newAttribute_value, newAttribute_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE:
				return basicSetAttribute_value(null, msgs);
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
			case SARPackage.ATTRIBUTE_CONDITION__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case SARPackage.ATTRIBUTE_CONDITION__OPERATOR:
				return getOperator();
			case SARPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE:
				return getAttribute_value();
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
			case SARPackage.ATTRIBUTE_CONDITION__ATTRIBUTE:
				setAttribute((AttributeDeclaration)newValue);
				return;
			case SARPackage.ATTRIBUTE_CONDITION__OPERATOR:
				setOperator((ComparisonOperator)newValue);
				return;
			case SARPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE:
				setAttribute_value((AttributeValue)newValue);
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
			case SARPackage.ATTRIBUTE_CONDITION__ATTRIBUTE:
				setAttribute((AttributeDeclaration)null);
				return;
			case SARPackage.ATTRIBUTE_CONDITION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case SARPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE:
				setAttribute_value((AttributeValue)null);
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
			case SARPackage.ATTRIBUTE_CONDITION__ATTRIBUTE:
				return attribute != null;
			case SARPackage.ATTRIBUTE_CONDITION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case SARPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE:
				return attribute_value != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

	@Override
	public void getVariables(HashSet<String> variables) {
		attribute_value.getVariables(variables);


	}

	@Override
	public String toProlog(String object_id, String entityName) {
		StringBuilder str = new StringBuilder();
		str.append("['predicate',");
		str.append("condition("+object_id+",'"+entityName+"','"+attribute.getId()+"',"+ getOperator().toProlog() +","+attribute_value.toProlog()+ ")");
		str.append("]");
		return str.toString();
	}

	@Override
	public Object getTrigger(String object_id, String entity_name, HashMap<String, String> map) {
		StringBuilder str = new StringBuilder();
		str.append("[");
		str.append(object_id+",'"+attribute.getId()+"',"+ getOperator().toProlog() +","+attribute_value.toProlog(map));
		str.append("]");
		return str.toString();
	}

} //AttributeConditionImpl
