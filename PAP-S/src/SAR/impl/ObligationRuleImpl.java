/**
 */
package SAR.impl;

import java.util.HashSet;

import SAR.ConditionExpression;
import SAR.ObligationRule;
import SAR.ObligationRuleType;
import SAR.SARPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obligation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.ObligationRuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link SAR.impl.ObligationRuleImpl#getFulfillment_condition <em>Fulfillment condition</em>}</li>
 *   <li>{@link SAR.impl.ObligationRuleImpl#getDeadline_condition <em>Deadline condition</em>}</li>
 *   <li>{@link SAR.impl.ObligationRuleImpl#getCancellation_condition <em>Cancellation condition</em>}</li>
 *   <li>{@link SAR.impl.ObligationRuleImpl#getReparation_condition <em>Reparation condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObligationRuleImpl extends PolicyRuleImpl implements ObligationRule {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ObligationRuleType TYPE_EDEFAULT = ObligationRuleType.MAINTENANCE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ObligationRuleType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFulfillment_condition() <em>Fulfillment condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillment_condition()
	 * @generated
	 * @ordered
	 */
	protected ConditionExpression fulfillment_condition;

	/**
	 * The cached value of the '{@link #getDeadline_condition() <em>Deadline condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline_condition()
	 * @generated
	 * @ordered
	 */
	protected ConditionExpression deadline_condition;

	/**
	 * The cached value of the '{@link #getCancellation_condition() <em>Cancellation condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancellation_condition()
	 * @generated
	 * @ordered
	 */
	protected ConditionExpression cancellation_condition;

	/**
	 * The cached value of the '{@link #getReparation_condition() <em>Reparation condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReparation_condition()
	 * @generated
	 * @ordered
	 */
	protected ConditionExpression reparation_condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObligationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.OBLIGATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObligationRuleType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ObligationRuleType newType) {
		ObligationRuleType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.OBLIGATION_RULE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionExpression getFulfillment_condition() {
		return fulfillment_condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFulfillment_condition(ConditionExpression newFulfillment_condition, NotificationChain msgs) {
		ConditionExpression oldFulfillment_condition = fulfillment_condition;
		fulfillment_condition = newFulfillment_condition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.OBLIGATION_RULE__FULFILLMENT_CONDITION, oldFulfillment_condition, newFulfillment_condition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFulfillment_condition(ConditionExpression newFulfillment_condition) {
		if (newFulfillment_condition != fulfillment_condition) {
			NotificationChain msgs = null;
			if (fulfillment_condition != null)
				msgs = ((InternalEObject)fulfillment_condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.OBLIGATION_RULE__FULFILLMENT_CONDITION, null, msgs);
			if (newFulfillment_condition != null)
				msgs = ((InternalEObject)newFulfillment_condition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.OBLIGATION_RULE__FULFILLMENT_CONDITION, null, msgs);
			msgs = basicSetFulfillment_condition(newFulfillment_condition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.OBLIGATION_RULE__FULFILLMENT_CONDITION, newFulfillment_condition, newFulfillment_condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionExpression getDeadline_condition() {
		return deadline_condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeadline_condition(ConditionExpression newDeadline_condition, NotificationChain msgs) {
		ConditionExpression oldDeadline_condition = deadline_condition;
		deadline_condition = newDeadline_condition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.OBLIGATION_RULE__DEADLINE_CONDITION, oldDeadline_condition, newDeadline_condition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline_condition(ConditionExpression newDeadline_condition) {
		if (newDeadline_condition != deadline_condition) {
			NotificationChain msgs = null;
			if (deadline_condition != null)
				msgs = ((InternalEObject)deadline_condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.OBLIGATION_RULE__DEADLINE_CONDITION, null, msgs);
			if (newDeadline_condition != null)
				msgs = ((InternalEObject)newDeadline_condition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.OBLIGATION_RULE__DEADLINE_CONDITION, null, msgs);
			msgs = basicSetDeadline_condition(newDeadline_condition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.OBLIGATION_RULE__DEADLINE_CONDITION, newDeadline_condition, newDeadline_condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionExpression getCancellation_condition() {
		return cancellation_condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancellation_condition(ConditionExpression newCancellation_condition, NotificationChain msgs) {
		ConditionExpression oldCancellation_condition = cancellation_condition;
		cancellation_condition = newCancellation_condition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.OBLIGATION_RULE__CANCELLATION_CONDITION, oldCancellation_condition, newCancellation_condition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancellation_condition(ConditionExpression newCancellation_condition) {
		if (newCancellation_condition != cancellation_condition) {
			NotificationChain msgs = null;
			if (cancellation_condition != null)
				msgs = ((InternalEObject)cancellation_condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.OBLIGATION_RULE__CANCELLATION_CONDITION, null, msgs);
			if (newCancellation_condition != null)
				msgs = ((InternalEObject)newCancellation_condition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.OBLIGATION_RULE__CANCELLATION_CONDITION, null, msgs);
			msgs = basicSetCancellation_condition(newCancellation_condition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.OBLIGATION_RULE__CANCELLATION_CONDITION, newCancellation_condition, newCancellation_condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionExpression getReparation_condition() {
		return reparation_condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReparation_condition(ConditionExpression newReparation_condition, NotificationChain msgs) {
		ConditionExpression oldReparation_condition = reparation_condition;
		reparation_condition = newReparation_condition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.OBLIGATION_RULE__REPARATION_CONDITION, oldReparation_condition, newReparation_condition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReparation_condition(ConditionExpression newReparation_condition) {
		if (newReparation_condition != reparation_condition) {
			NotificationChain msgs = null;
			if (reparation_condition != null)
				msgs = ((InternalEObject)reparation_condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.OBLIGATION_RULE__REPARATION_CONDITION, null, msgs);
			if (newReparation_condition != null)
				msgs = ((InternalEObject)newReparation_condition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.OBLIGATION_RULE__REPARATION_CONDITION, null, msgs);
			msgs = basicSetReparation_condition(newReparation_condition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.OBLIGATION_RULE__REPARATION_CONDITION, newReparation_condition, newReparation_condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.OBLIGATION_RULE__FULFILLMENT_CONDITION:
				return basicSetFulfillment_condition(null, msgs);
			case SARPackage.OBLIGATION_RULE__DEADLINE_CONDITION:
				return basicSetDeadline_condition(null, msgs);
			case SARPackage.OBLIGATION_RULE__CANCELLATION_CONDITION:
				return basicSetCancellation_condition(null, msgs);
			case SARPackage.OBLIGATION_RULE__REPARATION_CONDITION:
				return basicSetReparation_condition(null, msgs);
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
			case SARPackage.OBLIGATION_RULE__TYPE:
				return getType();
			case SARPackage.OBLIGATION_RULE__FULFILLMENT_CONDITION:
				return getFulfillment_condition();
			case SARPackage.OBLIGATION_RULE__DEADLINE_CONDITION:
				return getDeadline_condition();
			case SARPackage.OBLIGATION_RULE__CANCELLATION_CONDITION:
				return getCancellation_condition();
			case SARPackage.OBLIGATION_RULE__REPARATION_CONDITION:
				return getReparation_condition();
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
			case SARPackage.OBLIGATION_RULE__TYPE:
				setType((ObligationRuleType)newValue);
				return;
			case SARPackage.OBLIGATION_RULE__FULFILLMENT_CONDITION:
				setFulfillment_condition((ConditionExpression)newValue);
				return;
			case SARPackage.OBLIGATION_RULE__DEADLINE_CONDITION:
				setDeadline_condition((ConditionExpression)newValue);
				return;
			case SARPackage.OBLIGATION_RULE__CANCELLATION_CONDITION:
				setCancellation_condition((ConditionExpression)newValue);
				return;
			case SARPackage.OBLIGATION_RULE__REPARATION_CONDITION:
				setReparation_condition((ConditionExpression)newValue);
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
			case SARPackage.OBLIGATION_RULE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SARPackage.OBLIGATION_RULE__FULFILLMENT_CONDITION:
				setFulfillment_condition((ConditionExpression)null);
				return;
			case SARPackage.OBLIGATION_RULE__DEADLINE_CONDITION:
				setDeadline_condition((ConditionExpression)null);
				return;
			case SARPackage.OBLIGATION_RULE__CANCELLATION_CONDITION:
				setCancellation_condition((ConditionExpression)null);
				return;
			case SARPackage.OBLIGATION_RULE__REPARATION_CONDITION:
				setReparation_condition((ConditionExpression)null);
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
			case SARPackage.OBLIGATION_RULE__TYPE:
				return type != TYPE_EDEFAULT;
			case SARPackage.OBLIGATION_RULE__FULFILLMENT_CONDITION:
				return fulfillment_condition != null;
			case SARPackage.OBLIGATION_RULE__DEADLINE_CONDITION:
				return deadline_condition != null;
			case SARPackage.OBLIGATION_RULE__CANCELLATION_CONDITION:
				return cancellation_condition != null;
			case SARPackage.OBLIGATION_RULE__REPARATION_CONDITION:
				return reparation_condition != null;
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
//		
//		this.activation_condition.getVariables(variables);
//	
//		String identifier = createIdentifier(id,variables);
//		SecurityConfigurationImpl.ruleIdentifiersMap.put(id, identifier);
		String identifier = this.getIdentifier().toString();

		str.append(fact(this.type.getName().toLowerCase(),identifier,"['activation_condition']",activation_condition.toProlog()));
		str.append(fact(this.type.getName().toLowerCase(),identifier,"['fulfillment_condition']",fulfillment_condition.toProlog()));
		str.append(fact(this.type.getName().toLowerCase(),identifier,"['deadline_condition']",deadline_condition.toProlog()));
		str.append(fact(this.type.getName().toLowerCase(),identifier,"['cancellation_condition']",cancellation_condition.toProlog()));
		str.append(fact(this.type.getName().toLowerCase(),identifier,"['reparation_condition']",reparation_condition.toProlog()));

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
			identifier.append(",");
			identifier.append(var.toLowerCase());
			identifier.append(",");
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


} //ObligationRuleImpl
