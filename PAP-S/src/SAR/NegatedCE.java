/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negated CE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.NegatedCE#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getNegatedCE()
 * @model
 * @generated
 */
public interface NegatedCE extends ConditionExpression {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(ConditionExpression)
	 * @see SAR.SARPackage#getNegatedCE_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionExpression getOp();

	/**
	 * Sets the value of the '{@link SAR.NegatedCE#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ConditionExpression value);

} // NegatedCE
