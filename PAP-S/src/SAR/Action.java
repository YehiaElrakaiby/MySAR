/**
 */
package SAR;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.Action#getExecution <em>Execution</em>}</li>
 *   <li>{@link SAR.Action#getAttributes_assignment <em>Attributes assignment</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends UpdateExpression {
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
	 * @see SAR.SARPackage#getAction_Execution()
	 * @model required="true"
	 * @generated
	 */
	Execution getExecution();

	/**
	 * Sets the value of the '{@link SAR.Action#getExecution <em>Execution</em>}' reference.
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
	 * @see SAR.SARPackage#getAction_Attributes_assignment()
	 * @model containment="true"
	 * @generated
	 */
	AttributeAssignmentExpression getAttributes_assignment();

	/**
	 * Sets the value of the '{@link SAR.Action#getAttributes_assignment <em>Attributes assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes assignment</em>' containment reference.
	 * @see #getAttributes_assignment()
	 * @generated
	 */
	void setAttributes_assignment(AttributeAssignmentExpression value);

} // Action
