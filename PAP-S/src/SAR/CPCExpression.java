/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPC Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.CPCExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link SAR.CPCExpression#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getCPCExpression()
 * @model
 * @generated
 */
public interface CPCExpression extends PropertyConditionExpression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(PropertyConditionExpression)
	 * @see SAR.SARPackage#getCPCExpression_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PropertyConditionExpression getLhs();

	/**
	 * Sets the value of the '{@link SAR.CPCExpression#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(PropertyConditionExpression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(PropertyConditionExpression)
	 * @see SAR.SARPackage#getCPCExpression_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PropertyConditionExpression getRhs();

	/**
	 * Sets the value of the '{@link SAR.CPCExpression#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(PropertyConditionExpression value);

} // CPCExpression
