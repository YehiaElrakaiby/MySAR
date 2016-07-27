/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.ArithmeticOperation#getOperation <em>Operation</em>}</li>
 *   <li>{@link SAR.ArithmeticOperation#getLhs <em>Lhs</em>}</li>
 *   <li>{@link SAR.ArithmeticOperation#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getArithmeticOperation()
 * @model
 * @generated
 */
public interface ArithmeticOperation extends ArithmeticExpression {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link SAR.ArithmeticOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see SAR.ArithmeticOperator
	 * @see #setOperation(ArithmeticOperator)
	 * @see SAR.SARPackage#getArithmeticOperation_Operation()
	 * @model required="true"
	 * @generated
	 */
	ArithmeticOperator getOperation();

	/**
	 * Sets the value of the '{@link SAR.ArithmeticOperation#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see SAR.ArithmeticOperator
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ArithmeticOperator value);

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
	 * @see SAR.SARPackage#getArithmeticOperation_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArithmeticExpression getLhs();

	/**
	 * Sets the value of the '{@link SAR.ArithmeticOperation#getLhs <em>Lhs</em>}' containment reference.
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
	 * @see SAR.SARPackage#getArithmeticOperation_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArithmeticExpression getRhs();

	/**
	 * Sets the value of the '{@link SAR.ArithmeticOperation#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(ArithmeticExpression value);

} // ArithmeticOperation
