/**
 */
package SAR.impl;

import java.util.HashSet;

import SAR.AccessControlRule;
import SAR.AccessControlRuleType;
import SAR.EventCondition;
import SAR.ExecutionExpression;
import SAR.SARPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Control Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.AccessControlRuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link SAR.impl.AccessControlRuleImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link SAR.impl.AccessControlRuleImpl#getProvisions_expression <em>Provisions expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessControlRuleImpl extends PolicyRuleImpl implements AccessControlRule {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AccessControlRuleType TYPE_EDEFAULT = AccessControlRuleType.PERMISSION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AccessControlRuleType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EventCondition event;

	/**
	 * The cached value of the '{@link #getProvisions_expression() <em>Provisions expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisions_expression()
	 * @generated
	 * @ordered
	 */
	protected ExecutionExpression provisions_expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessControlRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.ACCESS_CONTROL_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlRuleType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AccessControlRuleType newType) {
		AccessControlRuleType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ACCESS_CONTROL_RULE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCondition getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(EventCondition newEvent, NotificationChain msgs) {
		EventCondition oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.ACCESS_CONTROL_RULE__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(EventCondition newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.ACCESS_CONTROL_RULE__EVENT, null, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.ACCESS_CONTROL_RULE__EVENT, null, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ACCESS_CONTROL_RULE__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionExpression getProvisions_expression() {
		return provisions_expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvisions_expression(ExecutionExpression newProvisions_expression, NotificationChain msgs) {
		ExecutionExpression oldProvisions_expression = provisions_expression;
		provisions_expression = newProvisions_expression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.ACCESS_CONTROL_RULE__PROVISIONS_EXPRESSION, oldProvisions_expression, newProvisions_expression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvisions_expression(ExecutionExpression newProvisions_expression) {
		if (newProvisions_expression != provisions_expression) {
			NotificationChain msgs = null;
			if (provisions_expression != null)
				msgs = ((InternalEObject)provisions_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.ACCESS_CONTROL_RULE__PROVISIONS_EXPRESSION, null, msgs);
			if (newProvisions_expression != null)
				msgs = ((InternalEObject)newProvisions_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.ACCESS_CONTROL_RULE__PROVISIONS_EXPRESSION, null, msgs);
			msgs = basicSetProvisions_expression(newProvisions_expression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ACCESS_CONTROL_RULE__PROVISIONS_EXPRESSION, newProvisions_expression, newProvisions_expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.ACCESS_CONTROL_RULE__EVENT:
				return basicSetEvent(null, msgs);
			case SARPackage.ACCESS_CONTROL_RULE__PROVISIONS_EXPRESSION:
				return basicSetProvisions_expression(null, msgs);
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
			case SARPackage.ACCESS_CONTROL_RULE__TYPE:
				return getType();
			case SARPackage.ACCESS_CONTROL_RULE__EVENT:
				return getEvent();
			case SARPackage.ACCESS_CONTROL_RULE__PROVISIONS_EXPRESSION:
				return getProvisions_expression();
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
			case SARPackage.ACCESS_CONTROL_RULE__TYPE:
				setType((AccessControlRuleType)newValue);
				return;
			case SARPackage.ACCESS_CONTROL_RULE__EVENT:
				setEvent((EventCondition)newValue);
				return;
			case SARPackage.ACCESS_CONTROL_RULE__PROVISIONS_EXPRESSION:
				setProvisions_expression((ExecutionExpression)newValue);
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
			case SARPackage.ACCESS_CONTROL_RULE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SARPackage.ACCESS_CONTROL_RULE__EVENT:
				setEvent((EventCondition)null);
				return;
			case SARPackage.ACCESS_CONTROL_RULE__PROVISIONS_EXPRESSION:
				setProvisions_expression((ExecutionExpression)null);
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
			case SARPackage.ACCESS_CONTROL_RULE__TYPE:
				return type != TYPE_EDEFAULT;
			case SARPackage.ACCESS_CONTROL_RULE__EVENT:
				return event != null;
			case SARPackage.ACCESS_CONTROL_RULE__PROVISIONS_EXPRESSION:
				return provisions_expression != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	@Override
	public Object toProlog() {
		StringBuilder str = new StringBuilder();
		//		HashSet<String> variables = new HashSet<String>();
		//		this.activation_condition.getVariables(variables);
		String identifier = this.getIdentifier().toString();
		//		SecurityConfigurationImpl.ruleIdentifiersMap.put(id, identifier);
		str.append(fact(this.type.getName().toLowerCase(), identifier, "'event_condition'", event.toProlog()));
		str.append(fact(this.type.getName().toLowerCase(), identifier, "'activation_condition'", activation_condition.toProlog()));
		if(provisions_expression!=null){
			str.append(fact(this.type.getName().toLowerCase(), identifier, "'provisions'", provisions_expression.toProlog()));
		}
		return str.toString();
	}

	private Object fact(String predicate_name, String entity, String attribute,
			Object value) {
		String str = predicate_name + "(" + entity + "," + attribute + "," + value + ").\n";
		return str;
	}

	private String createIdentifier(String id, HashSet<String> variables) {
		StringBuilder identifier = new StringBuilder();
		identifier.append("[");
		identifier.append(id);
		for(String var : variables) {
			identifier.append(",'");
			identifier.append("?" + var.substring(4));
			identifier.append("',");
			identifier.append(var);
		}
		identifier.append("]");
		return identifier.toString();
	}

	@Override
	public Object getIdentifier() {
		HashSet<String> variables = new HashSet<String>();

		this.activation_condition.getVariables(variables);

		String identifier = createIdentifier(id,variables);

		return identifier;
	}

} //AccessControlRuleImpl
