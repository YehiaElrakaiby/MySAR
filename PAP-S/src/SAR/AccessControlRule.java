/**
 */
package SAR;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Control Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.AccessControlRule#getType <em>Type</em>}</li>
 *   <li>{@link SAR.AccessControlRule#getEvent <em>Event</em>}</li>
 *   <li>{@link SAR.AccessControlRule#getProvisions_expression <em>Provisions expression</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getAccessControlRule()
 * @model
 * @generated
 */
public interface AccessControlRule extends PolicyRule {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link SAR.AccessControlRuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see SAR.AccessControlRuleType
	 * @see #setType(AccessControlRuleType)
	 * @see SAR.SARPackage#getAccessControlRule_Type()
	 * @model required="true"
	 * @generated
	 */
	AccessControlRuleType getType();

	/**
	 * Sets the value of the '{@link SAR.AccessControlRule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see SAR.AccessControlRuleType
	 * @see #getType()
	 * @generated
	 */
	void setType(AccessControlRuleType value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(EventCondition)
	 * @see SAR.SARPackage#getAccessControlRule_Event()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EventCondition getEvent();

	/**
	 * Sets the value of the '{@link SAR.AccessControlRule#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EventCondition value);

	/**
	 * Returns the value of the '<em><b>Provisions expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provisions expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provisions expression</em>' containment reference.
	 * @see #setProvisions_expression(ExecutionExpression)
	 * @see SAR.SARPackage#getAccessControlRule_Provisions_expression()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionExpression getProvisions_expression();

	/**
	 * Sets the value of the '{@link SAR.AccessControlRule#getProvisions_expression <em>Provisions expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provisions expression</em>' containment reference.
	 * @see #getProvisions_expression()
	 * @generated
	 */
	void setProvisions_expression(ExecutionExpression value);

} // AccessControlRule
