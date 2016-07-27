/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.ArithmeticComparison#getLhs <em>Lhs</em>}</li>
 *   <li>{@link SAR.ArithmeticComparison#getRhs <em>Rhs</em>}</li>
 *   <li>{@link SAR.ArithmeticComparison#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getArithmeticComparison()
 * @model
 * @generated
 */
public interface ArithmeticComparison extends ConditionExpression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(ArithmeticExpression)
	 * @see SAR.SARPackage#getArithmeticComparison_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArithmeticExpression getLhs();

	/**
	 * Sets the value of the '{@link SAR.ArithmeticComparison#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(ArithmeticExpression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(ArithmeticExpression)
	 * @see SAR.SARPackage#getArithmeticComparison_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArithmeticExpression getRhs();

	/**
	 * Sets the value of the '{@link SAR.ArithmeticComparison#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(ArithmeticExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SAR.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see SAR.ComparisonOperator
	 * @see #setOperator(ComparisonOperator)
	 * @see SAR.SARPackage#getArithmeticComparison_Operator()
	 * @model required="true"
	 * @generated
	 */
	ComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link SAR.ArithmeticComparison#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see SAR.ComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparisonOperator value);

} // ArithmeticComparison
