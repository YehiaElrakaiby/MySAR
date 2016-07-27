/**
 */
package SAR.impl;

import SAR.ConditionExpression;
import SAR.PredicateDefinition;
import SAR.Rule;
import SAR.SARPackage;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.RuleImpl#getId <em>Id</em>}</li>
 *   <li>{@link SAR.impl.RuleImpl#getActivation_condition <em>Activation condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivation_condition() <em>Activation condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation_condition()
	 * @generated
	 * @ordered
	 */
	protected ConditionExpression activation_condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.RULE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionExpression getActivation_condition() {
		return activation_condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivation_condition(ConditionExpression newActivation_condition, NotificationChain msgs) {
		ConditionExpression oldActivation_condition = activation_condition;
		activation_condition = newActivation_condition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.RULE__ACTIVATION_CONDITION, oldActivation_condition, newActivation_condition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivation_condition(ConditionExpression newActivation_condition) {
		if (newActivation_condition != activation_condition) {
			NotificationChain msgs = null;
			if (activation_condition != null)
				msgs = ((InternalEObject)activation_condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.RULE__ACTIVATION_CONDITION, null, msgs);
			if (newActivation_condition != null)
				msgs = ((InternalEObject)newActivation_condition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.RULE__ACTIVATION_CONDITION, null, msgs);
			msgs = basicSetActivation_condition(newActivation_condition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.RULE__ACTIVATION_CONDITION, newActivation_condition, newActivation_condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.RULE__ACTIVATION_CONDITION:
				return basicSetActivation_condition(null, msgs);
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
			case SARPackage.RULE__ID:
				return getId();
			case SARPackage.RULE__ACTIVATION_CONDITION:
				return getActivation_condition();
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
			case SARPackage.RULE__ID:
				setId((String)newValue);
				return;
			case SARPackage.RULE__ACTIVATION_CONDITION:
				setActivation_condition((ConditionExpression)newValue);
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
			case SARPackage.RULE__ID:
				setId(ID_EDEFAULT);
				return;
			case SARPackage.RULE__ACTIVATION_CONDITION:
				setActivation_condition((ConditionExpression)null);
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
			case SARPackage.RULE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SARPackage.RULE__ACTIVATION_CONDITION:
				return activation_condition != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public String getTrigger(EList<PredicateDefinition> predicate_definitions) {
//		ArrayList<AbstractConditionImpl> abstract_conditions = new ArrayList<AbstractConditionImpl>();
		StringBuilder str = new StringBuilder();
		ArrayList<String> triggers = new ArrayList<String>();
		HashMap<String, String> map = new HashMap<String, String>();
		activation_condition.getTrigger(triggers , predicate_definitions, map );
		str.append("[");

		if(!triggers.isEmpty()) {
			boolean first = true;
			for(String trigger : triggers) {
				if(!first) {
					str.append(",");
				} else {
					first = false;
				}
				str.append(trigger);
			}
		} else {
			str.append(true);
		}
		
		str.append("]");

		
		return str.toString();
	}

	@Override
	public String getDependencies(EList<PredicateDefinition> predicate_definitions) {
//		ArrayList<AbstractConditionImpl> abstract_conditions = new ArrayList<AbstractConditionImpl>();
		StringBuilder str = new StringBuilder();
		ArrayList<String> dependencies = new ArrayList<String>();
		HashMap<String, String> map = new HashMap<String, String>();
		activation_condition.getDependencies(dependencies , predicate_definitions, map );
		str.append("[");

		if(!dependencies.isEmpty()) {
			boolean first = true;
			for(String dependency : dependencies) {
				if(!first) {
					str.append(",");
				} else {
					first = false;
				}
				str.append(dependency);
			}
		} else {
			str.append(true);
		}
		
		str.append("]");

		
		return str.toString();
	}

} //RuleImpl
