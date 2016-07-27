/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.UpdateAttribute#getAttribute_assignment <em>Attribute assignment</em>}</li>
 *   <li>{@link SAR.UpdateAttribute#getObject_reference <em>Object reference</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getUpdateAttribute()
 * @model abstract="true"
 * @generated
 */
public interface UpdateAttribute extends UpdateExpression {
	/**
	 * Returns the value of the '<em><b>Attribute assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute assignment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute assignment</em>' containment reference.
	 * @see #setAttribute_assignment(AttributeValueAssignment)
	 * @see SAR.SARPackage#getUpdateAttribute_Attribute_assignment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeValueAssignment getAttribute_assignment();

	/**
	 * Sets the value of the '{@link SAR.UpdateAttribute#getAttribute_assignment <em>Attribute assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute assignment</em>' containment reference.
	 * @see #getAttribute_assignment()
	 * @generated
	 */
	void setAttribute_assignment(AttributeValueAssignment value);

	/**
	 * Returns the value of the '<em><b>Object reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object reference</em>' containment reference.
	 * @see #setObject_reference(EntitytReference)
	 * @see SAR.SARPackage#getUpdateAttribute_Object_reference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EntitytReference getObject_reference();

	/**
	 * Sets the value of the '{@link SAR.UpdateAttribute#getObject_reference <em>Object reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object reference</em>' containment reference.
	 * @see #getObject_reference()
	 * @generated
	 */
	void setObject_reference(EntitytReference value);

} // UpdateAttribute
