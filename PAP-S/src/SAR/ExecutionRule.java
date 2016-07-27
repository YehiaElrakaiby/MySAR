/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.ExecutionRule#getExecution_expression <em>Execution expression</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getExecutionRule()
 * @model
 * @generated
 */
public interface ExecutionRule extends PolicyRule {
	/**
	 * Returns the value of the '<em><b>Execution expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution expression</em>' containment reference.
	 * @see #setExecution_expression(ExecutionExpression)
	 * @see SAR.SARPackage#getExecutionRule_Execution_expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExecutionExpression getExecution_expression();

	/**
	 * Sets the value of the '{@link SAR.ExecutionRule#getExecution_expression <em>Execution expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution expression</em>' containment reference.
	 * @see #getExecution_expression()
	 * @generated
	 */
	void setExecution_expression(ExecutionExpression value);

} // ExecutionRule
