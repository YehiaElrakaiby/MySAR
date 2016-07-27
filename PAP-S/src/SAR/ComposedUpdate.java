/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.ComposedUpdate#getOperator <em>Operator</em>}</li>
 *   <li>{@link SAR.ComposedUpdate#getLhs <em>Lhs</em>}</li>
 *   <li>{@link SAR.ComposedUpdate#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getComposedUpdate()
 * @model
 * @generated
 */
public interface ComposedUpdate extends UpdateExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SAR.UpdateOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see SAR.UpdateOperator
	 * @see #setOperator(UpdateOperator)
	 * @see SAR.SARPackage#getComposedUpdate_Operator()
	 * @model required="true"
	 * @generated
	 */
	UpdateOperator getOperator();

	/**
	 * Sets the value of the '{@link SAR.ComposedUpdate#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see SAR.UpdateOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UpdateOperator value);

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(UpdateExpression)
	 * @see SAR.SARPackage#getComposedUpdate_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UpdateExpression getLhs();

	/**
	 * Sets the value of the '{@link SAR.ComposedUpdate#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(UpdateExpression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(UpdateExpression)
	 * @see SAR.SARPackage#getComposedUpdate_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UpdateExpression getRhs();

	/**
	 * Sets the value of the '{@link SAR.ComposedUpdate#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(UpdateExpression value);

} // ComposedUpdate
