/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Attribute Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.ComposedAttributeAssignment#getLhs <em>Lhs</em>}</li>
 *   <li>{@link SAR.ComposedAttributeAssignment#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getComposedAttributeAssignment()
 * @model
 * @generated
 */
public interface ComposedAttributeAssignment extends AttributeAssignmentExpression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(AttributeAssignmentExpression)
	 * @see SAR.SARPackage#getComposedAttributeAssignment_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeAssignmentExpression getLhs();

	/**
	 * Sets the value of the '{@link SAR.ComposedAttributeAssignment#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(AttributeAssignmentExpression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(AttributeAssignmentExpression)
	 * @see SAR.SARPackage#getComposedAttributeAssignment_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeAssignmentExpression getRhs();

	/**
	 * Sets the value of the '{@link SAR.ComposedAttributeAssignment#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(AttributeAssignmentExpression value);

} // ComposedAttributeAssignment
