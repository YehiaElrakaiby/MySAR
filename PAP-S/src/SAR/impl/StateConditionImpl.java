/**
 */
package SAR.impl;

import SAR.EntitytReference;
import SAR.PredicateDefinition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import SAR.SARPackage;
import SAR.StateCondition;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.StateConditionImpl#getEntity_reference <em>Entity reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateConditionImpl extends ConditionImpl implements StateCondition {
	/**
	 * The cached value of the '{@link #getEntity_reference() <em>Entity reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity_reference()
	 * @generated
	 * @ordered
	 */
	protected EntitytReference entity_reference;

	static Integer fact_id = 0;

	protected StateConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.STATE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitytReference getEntity_reference() {
		return entity_reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity_reference(EntitytReference newEntity_reference, NotificationChain msgs) {
		EntitytReference oldEntity_reference = entity_reference;
		entity_reference = newEntity_reference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.STATE_CONDITION__ENTITY_REFERENCE, oldEntity_reference, newEntity_reference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity_reference(EntitytReference newEntity_reference) {
		if (newEntity_reference != entity_reference) {
			NotificationChain msgs = null;
			if (entity_reference != null)
				msgs = ((InternalEObject)entity_reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.STATE_CONDITION__ENTITY_REFERENCE, null, msgs);
			if (newEntity_reference != null)
				msgs = ((InternalEObject)newEntity_reference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.STATE_CONDITION__ENTITY_REFERENCE, null, msgs);
			msgs = basicSetEntity_reference(newEntity_reference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.STATE_CONDITION__ENTITY_REFERENCE, newEntity_reference, newEntity_reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.STATE_CONDITION__ENTITY_REFERENCE:
				return basicSetEntity_reference(null, msgs);
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
			case SARPackage.STATE_CONDITION__ENTITY_REFERENCE:
				return getEntity_reference();
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
			case SARPackage.STATE_CONDITION__ENTITY_REFERENCE:
				setEntity_reference((EntitytReference)newValue);
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
			case SARPackage.STATE_CONDITION__ENTITY_REFERENCE:
				setEntity_reference((EntitytReference)null);
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
			case SARPackage.STATE_CONDITION__ENTITY_REFERENCE:
				return entity_reference != null;
		}
		return super.eIsSet(featureID);
	}

	public String toProlog(){
		StringBuffer result = new StringBuffer();
		String object_id;
		String entity_name = this.entity_reference.getEntity_id().getId();
		
//		if(fact_handle==null) {
//			fact_id++;
//			object_id = "Obj_ID_" + fact_id;
//		} else {
//			object_id = "HAN_" + fact_handle.getHandle();
//		}
//		
		object_id = "HAN_" + entity_reference.toProlog();

		//String lhs = "att(" + fact_id + ",sar_id," + getObject_id().getId() +")";
		
		StringBuffer str = new StringBuffer();

		str.append("['predicate',");
		str.append("condition("+object_id+","+"'"+entity_name+"'"+","+"'sar_id'"+",'=:=','"+entity_name+ "')");
		str.append("]");
		
		if(attribute_condition_expression!=null) 
		{
			result.append("['()',");
			result.append("['&',"+ str.toString() +",");

			result.append(attribute_condition_expression.toProlog(object_id,entity_name));
			result.append("]");
			result.append("]");

			return result.toString();


		} else return str.toString();
	}

	@Override
	public void getVariables(HashSet<String> variables) {
		if(this.entity_reference!=null)entity_reference.getVariables(variables);
		if(attribute_condition_expression!=null)attribute_condition_expression.getVariables(variables);

	}

	@Override
	public void getTrigger(ArrayList<String> triggers, EList<PredicateDefinition> predicate_definitions, HashMap<String, String> map) {
		StringBuffer result = new StringBuffer();
		String object_id;
		String entity_name = this.entity_reference.getEntity_id().getId();
				
		object_id = "HAN_" + entity_reference.toProlog();
		
		String class_name = entity_reference.getEntity_id().getClass().getName();
		
		if(class_name.equals("SAR.impl.InterceptionImpl") || class_name.equals("SAR.impl.MonitoringImpl")) {
			StringBuffer str = new StringBuffer();

			str.append("[");
			str.append(object_id+","+"'sar_id'"+",'=:=','"+entity_name+ "'");
			str.append("]");
			
			
			if(attribute_condition_expression!=null) 
			{
				result.append("[" + str.toString() +",");

				result.append(attribute_condition_expression.getTrigger(object_id,entity_name,map));
				result.append("]");
				triggers.add( result.toString());


			} else triggers.add( str.toString());
		}
	}

	@Override
	public void getDependencies(ArrayList<String> dependencies, EList<PredicateDefinition> predicate_definitions,
			HashMap<String, String> map) {
		StringBuffer result = new StringBuffer();
		String object_id;
		String entity_name = this.entity_reference.getEntity_id().getId();
				
		object_id = "HAN_" + entity_reference.toProlog();
		
		String class_name = entity_reference.getEntity_id().getClass().getName();
		
		if(class_name.equals("SAR.impl.EntityDeclarationImpl") ) {
			StringBuffer str = new StringBuffer();

			str.append("[");
			str.append(object_id+","+"'sar_id'"+",'=:=','"+entity_name+ "'");
			str.append("]");
			
			if(attribute_condition_expression!=null) 
			{
				result.append("[" + str.toString() +",");

				result.append(attribute_condition_expression.getTrigger(object_id,entity_name,map));
				result.append("]");
				dependencies.add( result.toString());


			} else dependencies.add( str.toString());
		}
		
	}

} //StateConditionImpl
