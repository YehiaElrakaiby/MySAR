/**
 */
package SAR.impl;

import SAR.ExecutionExpression;
import SAR.ExecutionRule;
import SAR.SARPackage;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Obligation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.ExecutionRuleImpl#getExecution_expression <em>Execution expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionRuleImpl extends PolicyRuleImpl implements ExecutionRule {
	/**
	 * The cached value of the '{@link #getExecution_expression() <em>Execution expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution_expression()
	 * @generated
	 * @ordered
	 */
	protected ExecutionExpression execution_expression;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.EXECUTION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionExpression getExecution_expression() {
		return execution_expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecution_expression(ExecutionExpression newExecution_expression, NotificationChain msgs) {
		ExecutionExpression oldExecution_expression = execution_expression;
		execution_expression = newExecution_expression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.EXECUTION_RULE__EXECUTION_EXPRESSION, oldExecution_expression, newExecution_expression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecution_expression(ExecutionExpression newExecution_expression) {
		if (newExecution_expression != execution_expression) {
			NotificationChain msgs = null;
			if (execution_expression != null)
				msgs = ((InternalEObject)execution_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.EXECUTION_RULE__EXECUTION_EXPRESSION, null, msgs);
			if (newExecution_expression != null)
				msgs = ((InternalEObject)newExecution_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.EXECUTION_RULE__EXECUTION_EXPRESSION, null, msgs);
			msgs = basicSetExecution_expression(newExecution_expression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.EXECUTION_RULE__EXECUTION_EXPRESSION, newExecution_expression, newExecution_expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.EXECUTION_RULE__EXECUTION_EXPRESSION:
				return basicSetExecution_expression(null, msgs);
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
			case SARPackage.EXECUTION_RULE__EXECUTION_EXPRESSION:
				return getExecution_expression();
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
			case SARPackage.EXECUTION_RULE__EXECUTION_EXPRESSION:
				setExecution_expression((ExecutionExpression)newValue);
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
			case SARPackage.EXECUTION_RULE__EXECUTION_EXPRESSION:
				setExecution_expression((ExecutionExpression)null);
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
			case SARPackage.EXECUTION_RULE__EXECUTION_EXPRESSION:
				return execution_expression != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Object toProlog() {
		StringBuilder str = new StringBuilder();
//		HashSet<String> variables = new HashSet<String>();
//		this.activation_condition.getVariables(variables);
		String identifier = this.getIdentifier().toString();
//		SecurityConfigurationImpl.ruleIdentifiersMap.put(id, identifier);
		str.append(fact("execution_rule", identifier, "'activation_condition'", activation_condition.toProlog()));
		str.append(fact("execution_rule", identifier, "'execution_expression'", execution_expression.toProlog()));

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

} //SystemObligationRuleImpl
