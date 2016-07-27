/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Attribute Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.ComposedAttributeCondition#getLhs <em>Lhs</em>}</li>
 *   <li>{@link SAR.ComposedAttributeCondition#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getComposedAttributeCondition()
 * @model
 * @generated
 */
public interface ComposedAttributeCondition extends AttributeConditionExpression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(AttributeConditionExpression)
	 * @see SAR.SARPackage#getComposedAttributeCondition_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeConditionExpression getLhs();

	/**
	 * Sets the value of the '{@link SAR.ComposedAttributeCondition#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(AttributeConditionExpression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(AttributeConditionExpression)
	 * @see SAR.SARPackage#getComposedAttributeCondition_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeConditionExpression getRhs();

	/**
	 * Sets the value of the '{@link SAR.ComposedAttributeCondition#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(AttributeConditionExpression value);

} // ComposedAttributeCondition
