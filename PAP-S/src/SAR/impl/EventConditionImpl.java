/**
 */
package SAR.impl;

import SAR.EventCondition;
import SAR.EventReference;
import SAR.PredicateDefinition;
import SAR.SARPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.EventConditionImpl#getEvent_reference <em>Event reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventConditionImpl extends ConditionImpl implements EventCondition {
	/**
	 * The cached value of the '{@link #getEvent_reference() <em>Event reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent_reference()
	 * @generated
	 * @ordered
	 */
	protected EventReference event_reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.EVENT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventReference getEvent_reference() {
		return event_reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent_reference(EventReference newEvent_reference, NotificationChain msgs) {
		EventReference oldEvent_reference = event_reference;
		event_reference = newEvent_reference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.EVENT_CONDITION__EVENT_REFERENCE, oldEvent_reference, newEvent_reference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent_reference(EventReference newEvent_reference) {
		if (newEvent_reference != event_reference) {
			NotificationChain msgs = null;
			if (event_reference != null)
				msgs = ((InternalEObject)event_reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.EVENT_CONDITION__EVENT_REFERENCE, null, msgs);
			if (newEvent_reference != null)
				msgs = ((InternalEObject)newEvent_reference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.EVENT_CONDITION__EVENT_REFERENCE, null, msgs);
			msgs = basicSetEvent_reference(newEvent_reference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.EVENT_CONDITION__EVENT_REFERENCE, newEvent_reference, newEvent_reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.EVENT_CONDITION__EVENT_REFERENCE:
				return basicSetEvent_reference(null, msgs);
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
			case SARPackage.EVENT_CONDITION__EVENT_REFERENCE:
				return getEvent_reference();
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
			case SARPackage.EVENT_CONDITION__EVENT_REFERENCE:
				setEvent_reference((EventReference)newValue);
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
			case SARPackage.EVENT_CONDITION__EVENT_REFERENCE:
				setEvent_reference((EventReference)null);
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
			case SARPackage.EVENT_CONDITION__EVENT_REFERENCE:
				return event_reference != null;
		}
		return super.eIsSet(featureID);
	}

	public String toProlog(){
		StringBuffer result = new StringBuffer();
		String object_id;
		String entity_name = this.event_reference.getEvent_id().getId();
		
//		if(fact_handle==null) {
//			fact_id++;
//			object_id = "Obj_ID_" + fact_id;
//		} else {
//			object_id = "HAN_" + fact_handle.getHandle();
//		}
//		
		object_id = "HAN_" + event_reference.toProlog();

		//String lhs = "att(" + fact_id + ",sar_id," + getObject_id().getId() +")";
		
		StringBuffer str = new StringBuffer();

		str.append("['predicate',");
		str.append("condition("+object_id+","+"'system'"+","+"'sar_id'"+",'=:=','"+entity_name+ "')");
		str.append("]");
		
		
		if(attribute_condition_expression!=null) 
		{
			result.append("['&',"+ str.toString() +",");

			result.append(attribute_condition_expression.toProlog(object_id,entity_name));
			result.append("]");
			return result.toString();


		} else return str.toString();
	}

	@Override
	public void getVariables(HashSet<String> variables) {
		if(this.event_reference!=null)event_reference.getVariables(variables);
		attribute_condition_expression.getVariables(variables);

	}

	@Override
	public void getTrigger(ArrayList<String> triggers, EList<PredicateDefinition> predicate_definitions, HashMap<String, String> map) {
		StringBuffer result = new StringBuffer();
		String object_id;
		String entity_name = this.event_reference.getEvent_id().getId();
				
		object_id = "HAN_" + event_reference.toProlog();
		
		String class_name = event_reference.getEvent_id().getClass().getName();
		
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
		String entity_name = this.event_reference.getEvent_id().getId();
				
		object_id = "HAN_" + event_reference.toProlog();
		
		String class_name = event_reference.getEvent_id().getClass().getName();
		
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

} //EventConditionImpl
