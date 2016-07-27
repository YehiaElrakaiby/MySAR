/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bracketed Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.BracketedValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getBracketedValue()
 * @model
 * @generated
 */
public interface BracketedValue extends AttributeValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueExpression)
	 * @see SAR.SARPackage#getBracketedValue_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueExpression getValue();

	/**
	 * Sets the value of the '{@link SAR.BracketedValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueExpression value);

} // BracketedValue
