/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.UpdateRule#getUpdate_expression <em>Update expression</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getUpdateRule()
 * @model abstract="true"
 * @generated
 */
public interface UpdateRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Update expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update expression</em>' containment reference.
	 * @see #setUpdate_expression(UpdateExpression)
	 * @see SAR.SARPackage#getUpdateRule_Update_expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UpdateExpression getUpdate_expression();

	/**
	 * Sets the value of the '{@link SAR.UpdateRule#getUpdate_expression <em>Update expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update expression</em>' containment reference.
	 * @see #getUpdate_expression()
	 * @generated
	 */
	void setUpdate_expression(UpdateExpression value);
	
} // UpdateRule
