/**
 */
package SAR;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.EventAttribute#getField_type <em>Field type</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getEventAttribute()
 * @model
 * @generated
 */
public interface EventAttribute extends AttributeDeclaration {

	/**
	 * Returns the value of the '<em><b>Field type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field type</em>' containment reference.
	 * @see #setField_type(FieldType)
	 * @see SAR.SARPackage#getEventAttribute_Field_type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FieldType getField_type();

	/**
	 * Sets the value of the '{@link SAR.EventAttribute#getField_type <em>Field type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field type</em>' containment reference.
	 * @see #getField_type()
	 * @generated
	 */
	void setField_type(FieldType value);

} // EventAttribute
