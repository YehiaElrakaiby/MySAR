/**
 */
package SAR.impl;

import SAR.PolicyRule;
import SAR.PolicyType;
import SAR.SARPackage;
import SAR.SecurityPolicy;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Security Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.SecurityPolicyImpl#getType <em>Type</em>}</li>
 *   <li>{@link SAR.impl.SecurityPolicyImpl#getPolicy_rules <em>Policy rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityPolicyImpl extends MinimalEObjectImpl.Container implements SecurityPolicy {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PolicyType TYPE_EDEFAULT = PolicyType.OPEN;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PolicyType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPolicy_rules() <em>Policy rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy_rules()
	 * @generated
	 * @ordered
	 */
	protected EList<PolicyRule> policy_rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.SECURITY_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PolicyType newType) {
		PolicyType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.SECURITY_POLICY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolicyRule> getPolicy_rules() {
		if (policy_rules == null) {
			policy_rules = new EObjectContainmentEList<PolicyRule>(PolicyRule.class, this, SARPackage.SECURITY_POLICY__POLICY_RULES);
		}
		return policy_rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.SECURITY_POLICY__POLICY_RULES:
				return ((InternalEList<?>)getPolicy_rules()).basicRemove(otherEnd, msgs);
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
			case SARPackage.SECURITY_POLICY__TYPE:
				return getType();
			case SARPackage.SECURITY_POLICY__POLICY_RULES:
				return getPolicy_rules();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SARPackage.SECURITY_POLICY__TYPE:
				setType((PolicyType)newValue);
				return;
			case SARPackage.SECURITY_POLICY__POLICY_RULES:
				getPolicy_rules().clear();
				getPolicy_rules().addAll((Collection<? extends PolicyRule>)newValue);
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
			case SARPackage.SECURITY_POLICY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SARPackage.SECURITY_POLICY__POLICY_RULES:
				getPolicy_rules().clear();
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
			case SARPackage.SECURITY_POLICY__TYPE:
				return type != TYPE_EDEFAULT;
			case SARPackage.SECURITY_POLICY__POLICY_RULES:
				return policy_rules != null && !policy_rules.isEmpty();
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
		str.append(fact("security_policy","'access_control'","'policy_type'",type.toProlog()));
		str.append("\n");
		if(policy_rules!=null){
			for(PolicyRule rule : policy_rules) {
				str.append(rule.toProlog());
				str.append("\n");
			}
		}
		return str.toString();
	}

	private Object fact(String predicate_name, String entity, String attribute,
			Object value) {
		String str = predicate_name + "(" + entity + "," + attribute + "," + value + ").\n";
		return str;
	}


} //SecurityPolicyImpl
