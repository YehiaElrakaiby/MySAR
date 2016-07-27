/**
 */
package SAR;

import java.util.HashSet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.ComposedValue#getLhs <em>Lhs</em>}</li>
 *   <li>{@link SAR.ComposedValue#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getComposedValue()
 * @model
 * @generated
 */
public interface ComposedValue extends ValueExpression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(ValueExpression)
	 * @see SAR.SARPackage#getComposedValue_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueExpression getLhs();

	/**
	 * Sets the value of the '{@link SAR.ComposedValue#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(ValueExpression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(ValueExpression)
	 * @see SAR.SARPackage#getComposedValue_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueExpression getRhs();

	/**
	 * Sets the value of the '{@link SAR.ComposedValue#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(ValueExpression value);

	String toProlog();
	
	String toProlog1();

	void getVariables(HashSet<String> variables);

	

} // ComposedValue
