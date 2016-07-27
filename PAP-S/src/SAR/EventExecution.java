/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.EventExecution#getExecution <em>Execution</em>}</li>
 *   <li>{@link SAR.EventExecution#getAttributes_assignment <em>Attributes assignment</em>}</li>
 *   <li>{@link SAR.EventExecution#getExecution_type <em>Execution type</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getEventExecution()
 * @model
 * @generated
 */
public interface EventExecution extends ExecutionExpression {
	/**
	 * Returns the value of the '<em><b>Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' reference.
	 * @see #setExecution(Execution)
	 * @see SAR.SARPackage#getEventExecution_Execution()
	 * @model required="true"
	 * @generated
	 */
	Execution getExecution();

	/**
	 * Sets the value of the '{@link SAR.EventExecution#getExecution <em>Execution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' reference.
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(Execution value);

	/**
	 * Returns the value of the '<em><b>Attributes assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes assignment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes assignment</em>' containment reference.
	 * @see #setAttributes_assignment(AttributeAssignmentExpression)
	 * @see SAR.SARPackage#getEventExecution_Attributes_assignment()
	 * @model containment="true"
	 * @generated
	 */
	AttributeAssignmentExpression getAttributes_assignment();

	/**
	 * Sets the value of the '{@link SAR.EventExecution#getAttributes_assignment <em>Attributes assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes assignment</em>' containment reference.
	 * @see #getAttributes_assignment()
	 * @generated
	 */
	void setAttributes_assignment(AttributeAssignmentExpression value);

	/**
	 * Returns the value of the '<em><b>Execution type</b></em>' attribute.
	 * The literals are from the enumeration {@link SAR.ExecutionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution type</em>' attribute.
	 * @see SAR.ExecutionType
	 * @see #setExecution_type(ExecutionType)
	 * @see SAR.SARPackage#getEventExecution_Execution_type()
	 * @model required="true"
	 * @generated
	 */
	ExecutionType getExecution_type();

	/**
	 * Sets the value of the '{@link SAR.EventExecution#getExecution_type <em>Execution type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution type</em>' attribute.
	 * @see SAR.ExecutionType
	 * @see #getExecution_type()
	 * @generated
	 */
	void setExecution_type(ExecutionType value);

} // EventExecution
