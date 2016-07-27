/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed CE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.ComposedCE#getBinaryOperator <em>Binary Operator</em>}</li>
 *   <li>{@link SAR.ComposedCE#getRhs <em>Rhs</em>}</li>
 *   <li>{@link SAR.ComposedCE#getLhs <em>Lhs</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getComposedCE()
 * @model
 * @generated
 */
public interface ComposedCE extends ConditionExpression {
	/**
	 * Returns the value of the '<em><b>Binary Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SAR.BinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Operator</em>' attribute.
	 * @see SAR.BinaryOperator
	 * @see #setBinaryOperator(BinaryOperator)
	 * @see SAR.SARPackage#getComposedCE_BinaryOperator()
	 * @model required="true"
	 * @generated
	 */
	BinaryOperator getBinaryOperator();

	/**
	 * Sets the value of the '{@link SAR.ComposedCE#getBinaryOperator <em>Binary Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Operator</em>' attribute.
	 * @see SAR.BinaryOperator
	 * @see #getBinaryOperator()
	 * @generated
	 */
	void setBinaryOperator(BinaryOperator value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(ConditionExpression)
	 * @see SAR.SARPackage#getComposedCE_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionExpression getRhs();

	/**
	 * Sets the value of the '{@link SAR.ComposedCE#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(ConditionExpression value);

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(ConditionExpression)
	 * @see SAR.SARPackage#getComposedCE_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionExpression getLhs();

	/**
	 * Sets the value of the '{@link SAR.ComposedCE#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(ConditionExpression value);

} // ComposedCE
