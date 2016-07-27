/**
 */
package SAR.impl;

import SAR.ConditionExpression;
import SAR.Predicate;
import SAR.PredicateDefinition;
import SAR.SARPackage;

import java.util.Collection;
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
 * An implementation of the model object '<em><b>Predicate Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.PredicateDefinitionImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link SAR.impl.PredicateDefinitionImpl#getActivation_conditions <em>Activation conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicateDefinitionImpl extends MinimalEObjectImpl.Container implements PredicateDefinition {
	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected Predicate predicate;

	/**
	 * The cached value of the '{@link #getActivation_conditions() <em>Activation conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation_conditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionExpression> activation_conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.PREDICATE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicate(Predicate newPredicate, NotificationChain msgs) {
		Predicate oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.PREDICATE_DEFINITION__PREDICATE, oldPredicate, newPredicate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(Predicate newPredicate) {
		if (newPredicate != predicate) {
			NotificationChain msgs = null;
			if (predicate != null)
				msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.PREDICATE_DEFINITION__PREDICATE, null, msgs);
			if (newPredicate != null)
				msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.PREDICATE_DEFINITION__PREDICATE, null, msgs);
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.PREDICATE_DEFINITION__PREDICATE, newPredicate, newPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionExpression> getActivation_conditions() {
		if (activation_conditions == null) {
			activation_conditions = new EObjectContainmentEList<ConditionExpression>(ConditionExpression.class, this, SARPackage.PREDICATE_DEFINITION__ACTIVATION_CONDITIONS);
		}
		return activation_conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.PREDICATE_DEFINITION__PREDICATE:
				return basicSetPredicate(null, msgs);
			case SARPackage.PREDICATE_DEFINITION__ACTIVATION_CONDITIONS:
				return ((InternalEList<?>)getActivation_conditions()).basicRemove(otherEnd, msgs);
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
			case SARPackage.PREDICATE_DEFINITION__PREDICATE:
				return getPredicate();
			case SARPackage.PREDICATE_DEFINITION__ACTIVATION_CONDITIONS:
				return getActivation_conditions();
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
			case SARPackage.PREDICATE_DEFINITION__PREDICATE:
				setPredicate((Predicate)newValue);
				return;
			case SARPackage.PREDICATE_DEFINITION__ACTIVATION_CONDITIONS:
				getActivation_conditions().clear();
				getActivation_conditions().addAll((Collection<? extends ConditionExpression>)newValue);
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
			case SARPackage.PREDICATE_DEFINITION__PREDICATE:
				setPredicate((Predicate)null);
				return;
			case SARPackage.PREDICATE_DEFINITION__ACTIVATION_CONDITIONS:
				getActivation_conditions().clear();
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
			case SARPackage.PREDICATE_DEFINITION__PREDICATE:
				return predicate != null;
			case SARPackage.PREDICATE_DEFINITION__ACTIVATION_CONDITIONS:
				return activation_conditions != null && !activation_conditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toProlog() {
		StringBuffer result = new StringBuffer();
		
		
		result.append(predicate.toProlog());
		result.append(":-\n\t");
		boolean first = true;
		for(ConditionExpression act_cond :activation_conditions){
			if(!first) {
				result.append(";\n\t");
			}
			first = false;
			result.append("evaluate(");
			result.append(act_cond.toProlog());
			result.append(").\n\t");
		}
		result.append("\n");
		return result.toString();
	}

	@Override
	public HashSet<String> getVariables() {
		HashSet<String> variables = new HashSet<String>();
		for(ConditionExpression act_cond : activation_conditions) {
			act_cond.getVariables(variables);
		}
		return variables;
		
	}

} //PredicateDefinitionImpl
