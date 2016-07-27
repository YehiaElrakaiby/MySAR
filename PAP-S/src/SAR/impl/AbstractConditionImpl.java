/**
 */
package SAR.impl;

import SAR.AbstractCondition;
import SAR.ConditionExpression;
import SAR.ParenthesizedValue;
import SAR.Predicate;
import SAR.PredicateDefinition;
import SAR.SARPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.AbstractConditionImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link SAR.impl.AbstractConditionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractConditionImpl extends ConditionExpressionImpl implements AbstractCondition {
	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected Predicate predicate;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected ParenthesizedValue parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.ABSTRACT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate getPredicate() {
		if (predicate != null && predicate.eIsProxy()) {
			InternalEObject oldPredicate = (InternalEObject)predicate;
			predicate = (Predicate)eResolveProxy(oldPredicate);
			if (predicate != oldPredicate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SARPackage.ABSTRACT_CONDITION__PREDICATE, oldPredicate, predicate));
			}
		}
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate basicGetPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(Predicate newPredicate) {
		Predicate oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ABSTRACT_CONDITION__PREDICATE, oldPredicate, predicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParenthesizedValue getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(ParenthesizedValue newParameters, NotificationChain msgs) {
		ParenthesizedValue oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.ABSTRACT_CONDITION__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(ParenthesizedValue newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.ABSTRACT_CONDITION__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.ABSTRACT_CONDITION__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ABSTRACT_CONDITION__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.ABSTRACT_CONDITION__PARAMETERS:
				return basicSetParameters(null, msgs);
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
			case SARPackage.ABSTRACT_CONDITION__PREDICATE:
				if (resolve) return getPredicate();
				return basicGetPredicate();
			case SARPackage.ABSTRACT_CONDITION__PARAMETERS:
				return getParameters();
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
			case SARPackage.ABSTRACT_CONDITION__PREDICATE:
				setPredicate((Predicate)newValue);
				return;
			case SARPackage.ABSTRACT_CONDITION__PARAMETERS:
				setParameters((ParenthesizedValue)newValue);
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
			case SARPackage.ABSTRACT_CONDITION__PREDICATE:
				setPredicate((Predicate)null);
				return;
			case SARPackage.ABSTRACT_CONDITION__PARAMETERS:
				setParameters((ParenthesizedValue)null);
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
			case SARPackage.ABSTRACT_CONDITION__PREDICATE:
				return predicate != null;
			case SARPackage.ABSTRACT_CONDITION__PARAMETERS:
				return parameters != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Object toProlog() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		str.append("'predicate'");
		str.append(",");

		str.append(predicate.getName());
		//		str.append("(");
		str.append(parameters.toProlog());
		//		boolean first = true;
		//		for(Value par : parameters) {
		//			if(!first) {
		//				str.append(",");
		//			}
		//			first = false;
		//			str.append(par.toProlog());
		//		}
		//		str.append(")");
		str.append("]");
		return str.toString();
	}

	@Override
	public void getVariables(HashSet<String> variables) {
		parameters.getVariables(variables);
		//		for(Value par : parameters) {
		//		
		//			par.getVariables(variables);
		//		}
	}

	@Override
	public void getTrigger(ArrayList<String> triggers, EList<PredicateDefinition> predicate_definitions, HashMap<String, String> old_map) {
		for(PredicateDefinition predicate_definition : predicate_definitions) {
			if(predicate_definition.getPredicate().equals(predicate)) {
				EList<ConditionExpression> activation_conditions = predicate_definition.getActivation_conditions();
				ParenthesizedValue definition_params = predicate_definition.getPredicate().getParameters();
				HashMap<String, String> map = map(definition_params,parameters);
				for(ConditionExpression activation_condition : activation_conditions){
					ArrayList<String> abstract_condition_triggers = new ArrayList<String>();
//					ArrayList<String> abstract_condition_triggers_renamed = new ArrayList<String>();

					activation_condition.getTrigger(abstract_condition_triggers, predicate_definitions, map);
//					for(String abstract_condition_trigger : abstract_condition_triggers) {
//						abstract_condition_triggers_renamed.add(rename(abstract_condition_trigger,map));
//					}
					triggers.addAll(abstract_condition_triggers);
				}
			}
		}

	}

//	private String rename(String abstract_condition_trigger, HashMap<String, String> map) {
//		Set<String> key_set = map.keySet();
//		for(String key : key_set) {
//			String value = map.get(key);
//			abstract_condition_trigger = abstract_condition_trigger.replaceAll(","+key+"]",","+value+"]");
//		}
//		return abstract_condition_trigger;
//	}

	private HashMap<String, String> map(ParenthesizedValue definition_params, ParenthesizedValue parameters) {
		HashMap<String,String> map = new HashMap<String,String>();
		HashSet<String> variables = new HashSet<String>();
		definition_params.getVariables(variables);
		HashSet<String> variables2 = new HashSet<String>();
		parameters.getVariables(variables2);
		Iterator<String> it = variables.iterator();
		Iterator<String> it2 = variables2.iterator();

		while(it.hasNext() && it2.hasNext()) {
			map.put(it.next(),it2.next());
		}
		return map;

	}

	@Override
	public void getDependencies(ArrayList<String> dependencies, EList<PredicateDefinition> predicate_definitions,
			HashMap<String, String> old_map) {
		for(PredicateDefinition predicate_definition : predicate_definitions) {
			if(predicate_definition.getPredicate().equals(predicate)) {
				EList<ConditionExpression> activation_conditions = predicate_definition.getActivation_conditions();
				ParenthesizedValue definition_params = predicate_definition.getPredicate().getParameters();
				HashMap<String, String> map = map(definition_params,parameters);
				for(ConditionExpression activation_condition : activation_conditions){
					ArrayList<String> abstract_condition_dependencies = new ArrayList<String>();
//					ArrayList<String> abstract_condition_triggers_renamed = new ArrayList<String>();

					activation_condition.getDependencies(abstract_condition_dependencies, predicate_definitions, map);
//					for(String abstract_condition_trigger : abstract_condition_triggers) {
//						abstract_condition_triggers_renamed.add(rename(abstract_condition_trigger,map));
//					}
					dependencies.addAll(abstract_condition_dependencies);
				}
			}
		}
		
	}

} //AbstractConditionImpl
