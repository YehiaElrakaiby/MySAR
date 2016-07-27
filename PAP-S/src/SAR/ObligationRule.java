/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obligation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.ObligationRule#getType <em>Type</em>}</li>
 *   <li>{@link SAR.ObligationRule#getFulfillment_condition <em>Fulfillment condition</em>}</li>
 *   <li>{@link SAR.ObligationRule#getDeadline_condition <em>Deadline condition</em>}</li>
 *   <li>{@link SAR.ObligationRule#getCancellation_condition <em>Cancellation condition</em>}</li>
 *   <li>{@link SAR.ObligationRule#getReparation_condition <em>Reparation condition</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getObligationRule()
 * @model
 * @generated
 */
public interface ObligationRule extends PolicyRule {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link SAR.ObligationRuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see SAR.ObligationRuleType
	 * @see #setType(ObligationRuleType)
	 * @see SAR.SARPackage#getObligationRule_Type()
	 * @model required="true"
	 * @generated
	 */
	ObligationRuleType getType();

	/**
	 * Sets the value of the '{@link SAR.ObligationRule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see SAR.ObligationRuleType
	 * @see #getType()
	 * @generated
	 */
	void setType(ObligationRuleType value);

	/**
	 * Returns the value of the '<em><b>Fulfillment condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfillment condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillment condition</em>' containment reference.
	 * @see #setFulfillment_condition(ConditionExpression)
	 * @see SAR.SARPackage#getObligationRule_Fulfillment_condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionExpression getFulfillment_condition();

	/**
	 * Sets the value of the '{@link SAR.ObligationRule#getFulfillment_condition <em>Fulfillment condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulfillment condition</em>' containment reference.
	 * @see #getFulfillment_condition()
	 * @generated
	 */
	void setFulfillment_condition(ConditionExpression value);

	/**
	 * Returns the value of the '<em><b>Deadline condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline condition</em>' containment reference.
	 * @see #setDeadline_condition(ConditionExpression)
	 * @see SAR.SARPackage#getObligationRule_Deadline_condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionExpression getDeadline_condition();

	/**
	 * Sets the value of the '{@link SAR.ObligationRule#getDeadline_condition <em>Deadline condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline condition</em>' containment reference.
	 * @see #getDeadline_condition()
	 * @generated
	 */
	void setDeadline_condition(ConditionExpression value);

	/**
	 * Returns the value of the '<em><b>Cancellation condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancellation condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancellation condition</em>' containment reference.
	 * @see #setCancellation_condition(ConditionExpression)
	 * @see SAR.SARPackage#getObligationRule_Cancellation_condition()
	 * @model containment="true"
	 * @generated
	 */
	ConditionExpression getCancellation_condition();

	/**
	 * Sets the value of the '{@link SAR.ObligationRule#getCancellation_condition <em>Cancellation condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancellation condition</em>' containment reference.
	 * @see #getCancellation_condition()
	 * @generated
	 */
	void setCancellation_condition(ConditionExpression value);

	/**
	 * Returns the value of the '<em><b>Reparation condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reparation condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reparation condition</em>' containment reference.
	 * @see #setReparation_condition(ConditionExpression)
	 * @see SAR.SARPackage#getObligationRule_Reparation_condition()
	 * @model containment="true"
	 * @generated
	 */
	ConditionExpression getReparation_condition();

	/**
	 * Sets the value of the '{@link SAR.ObligationRule#getReparation_condition <em>Reparation condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reparation condition</em>' containment reference.
	 * @see #getReparation_condition()
	 * @generated
	 */
	void setReparation_condition(ConditionExpression value);

} // ObligationRule
