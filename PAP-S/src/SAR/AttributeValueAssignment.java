/**
 */
package SAR;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.AttributeValueAssignment#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link SAR.AttributeValueAssignment#getValue <em>Value</em>}</li>
 *   <li>{@link SAR.AttributeValueAssignment#getNew_value <em>New value</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getAttributeValueAssignment()
 * @model
 * @generated
 */
public interface AttributeValueAssignment extends AttributeAssignmentExpression {
	

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(AttributeDeclaration)
	 * @see SAR.SARPackage#getAttributeValueAssignment_Attribute()
	 * @model required="true"
	 * @generated
	 */
	AttributeDeclaration getAttribute();

	/**
	 * Sets the value of the '{@link SAR.AttributeValueAssignment#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(AttributeDeclaration value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(AttributeValue)
	 * @see SAR.SARPackage#getAttributeValueAssignment_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeValue getValue();

	/**
	 * Sets the value of the '{@link SAR.AttributeValueAssignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AttributeValue value);

	/**
	 * Returns the value of the '<em><b>New value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New value</em>' containment reference.
	 * @see #setNew_value(AttributeValue)
	 * @see SAR.SARPackage#getAttributeValueAssignment_New_value()
	 * @model containment="true"
	 * @generated
	 */
	AttributeValue getNew_value();

	/**
	 * Sets the value of the '{@link SAR.AttributeValueAssignment#getNew_value <em>New value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New value</em>' containment reference.
	 * @see #getNew_value()
	 * @generated
	 */
	void setNew_value(AttributeValue value);

	Object toProlog(String type, String str, String entityName);

} // AttributeValueAssignment
