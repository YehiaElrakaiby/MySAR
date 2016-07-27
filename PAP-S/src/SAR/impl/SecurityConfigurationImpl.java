/**
 */
package SAR.impl;

import SAR.EntityAttribute;
import SAR.EntityDeclaration;
import SAR.EventDeclaration;
import SAR.PolicyRule;
import SAR.PostUpdateRule;
import SAR.PreUpdateRule;
import SAR.PredicateDefinition;
import SAR.SARPackage;
import SAR.SecurityConfiguration;
import SAR.SecurityPolicy;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

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
 * An implementation of the model object '<em><b>Security Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.SecurityConfigurationImpl#getId <em>Id</em>}</li>
 *   <li>{@link SAR.impl.SecurityConfigurationImpl#getEvent_declarations <em>Event declarations</em>}</li>
 *   <li>{@link SAR.impl.SecurityConfigurationImpl#getEntity_declarations <em>Entity declarations</em>}</li>
 *   <li>{@link SAR.impl.SecurityConfigurationImpl#getPredicate_definitions <em>Predicate definitions</em>}</li>
 *   <li>{@link SAR.impl.SecurityConfigurationImpl#getPre_updates <em>Pre updates</em>}</li>
 *   <li>{@link SAR.impl.SecurityConfigurationImpl#getPost_updates <em>Post updates</em>}</li>
 *   <li>{@link SAR.impl.SecurityConfigurationImpl#getSecurity_policy <em>Security policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityConfigurationImpl extends MinimalEObjectImpl.Container implements SecurityConfiguration {

	//	static HashMap<String,String> ruleIdentifiersMap = new HashMap<String,String>();

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
	 * The cached value of the '{@link #getEvent_declarations() <em>Event declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent_declarations()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDeclaration> event_declarations;

	/**
	 * The cached value of the '{@link #getEntity_declarations() <em>Entity declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity_declarations()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityDeclaration> entity_declarations;

	/**
	 * The cached value of the '{@link #getPredicate_definitions() <em>Predicate definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate_definitions()
	 * @generated
	 * @ordered
	 */
	protected EList<PredicateDefinition> predicate_definitions;

	/**
	 * The cached value of the '{@link #getPre_updates() <em>Pre updates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre_updates()
	 * @generated
	 * @ordered
	 */
	protected EList<PreUpdateRule> pre_updates;

	/**
	 * The cached value of the '{@link #getPost_updates() <em>Post updates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost_updates()
	 * @generated
	 * @ordered
	 */
	protected EList<PostUpdateRule> post_updates;

	/**
	 * The cached value of the '{@link #getSecurity_policy() <em>Security policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_policy()
	 * @generated
	 * @ordered
	 */
	protected SecurityPolicy security_policy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.SECURITY_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.SECURITY_CONFIGURATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventDeclaration> getEvent_declarations() {
		if (event_declarations == null) {
			event_declarations = new EObjectContainmentEList<EventDeclaration>(EventDeclaration.class, this, SARPackage.SECURITY_CONFIGURATION__EVENT_DECLARATIONS);
		}
		return event_declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityDeclaration> getEntity_declarations() {
		if (entity_declarations == null) {
			entity_declarations = new EObjectContainmentEList<EntityDeclaration>(EntityDeclaration.class, this, SARPackage.SECURITY_CONFIGURATION__ENTITY_DECLARATIONS);
		}
		return entity_declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PredicateDefinition> getPredicate_definitions() {
		if (predicate_definitions == null) {
			predicate_definitions = new EObjectContainmentEList<PredicateDefinition>(PredicateDefinition.class, this, SARPackage.SECURITY_CONFIGURATION__PREDICATE_DEFINITIONS);
		}
		return predicate_definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreUpdateRule> getPre_updates() {
		if (pre_updates == null) {
			pre_updates = new EObjectContainmentEList<PreUpdateRule>(PreUpdateRule.class, this, SARPackage.SECURITY_CONFIGURATION__PRE_UPDATES);
		}
		return pre_updates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PostUpdateRule> getPost_updates() {
		if (post_updates == null) {
			post_updates = new EObjectContainmentEList<PostUpdateRule>(PostUpdateRule.class, this, SARPackage.SECURITY_CONFIGURATION__POST_UPDATES);
		}
		return post_updates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPolicy getSecurity_policy() {
		return security_policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity_policy(SecurityPolicy newSecurity_policy, NotificationChain msgs) {
		SecurityPolicy oldSecurity_policy = security_policy;
		security_policy = newSecurity_policy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.SECURITY_CONFIGURATION__SECURITY_POLICY, oldSecurity_policy, newSecurity_policy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity_policy(SecurityPolicy newSecurity_policy) {
		if (newSecurity_policy != security_policy) {
			NotificationChain msgs = null;
			if (security_policy != null)
				msgs = ((InternalEObject)security_policy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.SECURITY_CONFIGURATION__SECURITY_POLICY, null, msgs);
			if (newSecurity_policy != null)
				msgs = ((InternalEObject)newSecurity_policy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.SECURITY_CONFIGURATION__SECURITY_POLICY, null, msgs);
			msgs = basicSetSecurity_policy(newSecurity_policy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.SECURITY_CONFIGURATION__SECURITY_POLICY, newSecurity_policy, newSecurity_policy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.SECURITY_CONFIGURATION__EVENT_DECLARATIONS:
				return ((InternalEList<?>)getEvent_declarations()).basicRemove(otherEnd, msgs);
			case SARPackage.SECURITY_CONFIGURATION__ENTITY_DECLARATIONS:
				return ((InternalEList<?>)getEntity_declarations()).basicRemove(otherEnd, msgs);
			case SARPackage.SECURITY_CONFIGURATION__PREDICATE_DEFINITIONS:
				return ((InternalEList<?>)getPredicate_definitions()).basicRemove(otherEnd, msgs);
			case SARPackage.SECURITY_CONFIGURATION__PRE_UPDATES:
				return ((InternalEList<?>)getPre_updates()).basicRemove(otherEnd, msgs);
			case SARPackage.SECURITY_CONFIGURATION__POST_UPDATES:
				return ((InternalEList<?>)getPost_updates()).basicRemove(otherEnd, msgs);
			case SARPackage.SECURITY_CONFIGURATION__SECURITY_POLICY:
				return basicSetSecurity_policy(null, msgs);
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
			case SARPackage.SECURITY_CONFIGURATION__ID:
				return getId();
			case SARPackage.SECURITY_CONFIGURATION__EVENT_DECLARATIONS:
				return getEvent_declarations();
			case SARPackage.SECURITY_CONFIGURATION__ENTITY_DECLARATIONS:
				return getEntity_declarations();
			case SARPackage.SECURITY_CONFIGURATION__PREDICATE_DEFINITIONS:
				return getPredicate_definitions();
			case SARPackage.SECURITY_CONFIGURATION__PRE_UPDATES:
				return getPre_updates();
			case SARPackage.SECURITY_CONFIGURATION__POST_UPDATES:
				return getPost_updates();
			case SARPackage.SECURITY_CONFIGURATION__SECURITY_POLICY:
				return getSecurity_policy();
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
			case SARPackage.SECURITY_CONFIGURATION__ID:
				setId((String)newValue);
				return;
			case SARPackage.SECURITY_CONFIGURATION__EVENT_DECLARATIONS:
				getEvent_declarations().clear();
				getEvent_declarations().addAll((Collection<? extends EventDeclaration>)newValue);
				return;
			case SARPackage.SECURITY_CONFIGURATION__ENTITY_DECLARATIONS:
				getEntity_declarations().clear();
				getEntity_declarations().addAll((Collection<? extends EntityDeclaration>)newValue);
				return;
			case SARPackage.SECURITY_CONFIGURATION__PREDICATE_DEFINITIONS:
				getPredicate_definitions().clear();
				getPredicate_definitions().addAll((Collection<? extends PredicateDefinition>)newValue);
				return;
			case SARPackage.SECURITY_CONFIGURATION__PRE_UPDATES:
				getPre_updates().clear();
				getPre_updates().addAll((Collection<? extends PreUpdateRule>)newValue);
				return;
			case SARPackage.SECURITY_CONFIGURATION__POST_UPDATES:
				getPost_updates().clear();
				getPost_updates().addAll((Collection<? extends PostUpdateRule>)newValue);
				return;
			case SARPackage.SECURITY_CONFIGURATION__SECURITY_POLICY:
				setSecurity_policy((SecurityPolicy)newValue);
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
			case SARPackage.SECURITY_CONFIGURATION__ID:
				setId(ID_EDEFAULT);
				return;
			case SARPackage.SECURITY_CONFIGURATION__EVENT_DECLARATIONS:
				getEvent_declarations().clear();
				return;
			case SARPackage.SECURITY_CONFIGURATION__ENTITY_DECLARATIONS:
				getEntity_declarations().clear();
				return;
			case SARPackage.SECURITY_CONFIGURATION__PREDICATE_DEFINITIONS:
				getPredicate_definitions().clear();
				return;
			case SARPackage.SECURITY_CONFIGURATION__PRE_UPDATES:
				getPre_updates().clear();
				return;
			case SARPackage.SECURITY_CONFIGURATION__POST_UPDATES:
				getPost_updates().clear();
				return;
			case SARPackage.SECURITY_CONFIGURATION__SECURITY_POLICY:
				setSecurity_policy((SecurityPolicy)null);
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
			case SARPackage.SECURITY_CONFIGURATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SARPackage.SECURITY_CONFIGURATION__EVENT_DECLARATIONS:
				return event_declarations != null && !event_declarations.isEmpty();
			case SARPackage.SECURITY_CONFIGURATION__ENTITY_DECLARATIONS:
				return entity_declarations != null && !entity_declarations.isEmpty();
			case SARPackage.SECURITY_CONFIGURATION__PREDICATE_DEFINITIONS:
				return predicate_definitions != null && !predicate_definitions.isEmpty();
			case SARPackage.SECURITY_CONFIGURATION__PRE_UPDATES:
				return pre_updates != null && !pre_updates.isEmpty();
			case SARPackage.SECURITY_CONFIGURATION__POST_UPDATES:
				return post_updates != null && !post_updates.isEmpty();
			case SARPackage.SECURITY_CONFIGURATION__SECURITY_POLICY:
				return security_policy != null;
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
	public String getPreUpdatesAsProlog() {
		StringBuilder str = new StringBuilder();
		if(pre_updates != null) {
			for(PreUpdateRule pre_update : pre_updates) {
				str.append(pre_update.toProlog());
			}
		}
		return str.toString();
	}

	@Override
	public String getPostUpdatesAsProlog() {
		StringBuilder str = new StringBuilder();
		if(post_updates != null) {
			for(PostUpdateRule post_update : post_updates) {
				str.append(post_update.toProlog());
			}
		}
		return str.toString();
	}

	@Override
	public String toProlog() {
		StringBuilder str = new StringBuilder();
		str.append("\n\n");

		/*
		for(EventDeclaration evt :event_declarations) {
			str.append(evt.toProlog());

		}*/
		for( EntityDeclaration ent :entity_declarations) {
			str.append(ent.toProlog());
		}

		if(security_policy != null) {
			str.append(security_policy.toProlog());
		}

		if(pre_updates != null) {
			for(PreUpdateRule pre_update : pre_updates) {
				str.append(pre_update.toProlog());
			}
		}

		if(post_updates != null) {
			for(PostUpdateRule post_update : post_updates) {
				str.append(post_update.toProlog());
			}
		}

		if(predicate_definitions != null) {
			for(PredicateDefinition def :predicate_definitions) {
				str.append(def.toProlog());
			}
		}
		return str.toString();



	}

	@Override
	public String getPredicateDefinitionsAsProlog() {
		StringBuilder str = new StringBuilder();
		if(predicate_definitions != null) {
			for(PredicateDefinition def :predicate_definitions) {
				str.append(def.toProlog());
			}
		}
		return str.toString();
	}

	@Override
	public Object getSecurityPolicyAsProlog() {
		StringBuilder str = new StringBuilder();


		if(security_policy != null) {
			str.append(security_policy.toProlog());
		}
		return str.toString();
	}

	@Override
	public HashMap<String, String> getRuleIdentifiersMap() {
		//		StringBuilder str = new StringBuilder();

		HashMap<String, String> map = new  HashMap<String, String>();

		if(security_policy != null) {
			EList<PolicyRule> policy_rules = security_policy.getPolicy_rules();
			for(PolicyRule rule : policy_rules) {
				//				Object identifier = rule.getIdentifier();
				map.put(rule.getId(), rule.getIdentifier().toString());
			}
		}

		if(pre_updates != null) {
			for(PreUpdateRule rule :pre_updates) {
				map.put(rule.getId(), rule.getIdentifier().toString());
			}

		}

		if(post_updates != null) {
			for(PostUpdateRule rule : post_updates) {
				map.put(rule.getId(), rule.getIdentifier().toString());
			}
		}
		return map;
	}

	@Override
	public String getTriggerPolicy() {
		StringBuilder str = new StringBuilder();


		//		HashMap<String, String> map = new  HashMap<String, String>();

		if(security_policy != null) {
			EList<PolicyRule> policy_rules = security_policy.getPolicy_rules();
			for(PolicyRule rule : policy_rules) {

				String trigger = rule.getTrigger(predicate_definitions);
				str.append("trigger(" + rule.getIdentifier() + "," + trigger + ").\n\n");

			}
		}

		if(pre_updates != null) {
			for(PreUpdateRule rule :pre_updates) {
				String trigger = rule.getTrigger(predicate_definitions);
				str.append("trigger(" + rule.getIdentifier() + "," + trigger + ").\n\n");
			}

		}

		if(post_updates != null) {
			for(PostUpdateRule rule : post_updates) {
				String trigger = rule.getTrigger(predicate_definitions);
				str.append("trigger(" + rule.getIdentifier() + "," + trigger + ").\n\n");
			}
		}
		return str.toString();
	}

	@Override
	public String getDependenciesPolicy() {
		StringBuilder str = new StringBuilder();


		//		HashMap<String, String> map = new  HashMap<String, String>();

		if(security_policy != null) {
			EList<PolicyRule> policy_rules = security_policy.getPolicy_rules();
			for(PolicyRule rule : policy_rules) {

				String dependencies = rule.getDependencies(predicate_definitions);
				str.append("dependencies(" + rule.getIdentifier() + "," + dependencies + ").\n\n");

			}
		}

		if(pre_updates != null) {
			for(PreUpdateRule rule :pre_updates) {
				String dependencies = rule.getDependencies(predicate_definitions);
				str.append("dependencies(" + rule.getIdentifier() + "," + dependencies + ").\n\n");
			}

		}

		if(post_updates != null) {
			for(PostUpdateRule rule : post_updates) {
				String dependencies = rule.getDependencies(predicate_definitions);
				str.append("dependencies(" + rule.getIdentifier() + "," + dependencies + ").\n\n");
			}
		}
		return str.toString();
	}

	@Override
	public HashMap<String, Integer> getEntityAttributeArity() {
		HashMap<String, Integer> map  = new HashMap<String, Integer>();
		for(EntityDeclaration entity_declaration : entity_declarations) {
			EList<EntityAttribute> attributes = entity_declaration.getEntity_attributes();
			for(EntityAttribute attribute : attributes){
				map.put(entity_declaration.getId()+"_"+attribute.getId(), attribute.getArity());
			}
		}
		return map;
	}

	@Override
	public HashSet<String> getEntities() {
		HashSet<String> entities = new HashSet<String>();
		for(EntityDeclaration entity_declaration : entity_declarations) {
			entities.add(entity_declaration.getId());
		}
		return entities;
	}

	@Override
	public EList<EntityDeclaration> entityDeclarations() {
		
		return this.entityDeclarations();
	}

	


} //SecurityConfigurationImpl
