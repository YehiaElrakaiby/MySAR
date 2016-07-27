/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.SimpleAttributeType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getSimpleAttributeType()
 * @model
 * @generated
 */
public interface SimpleAttributeType extends FieldType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link SAR.SupportedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see SAR.SupportedType
	 * @see #setType(SupportedType)
	 * @see SAR.SARPackage#getSimpleAttributeType_Type()
	 * @model required="true"
	 * @generated
	 */
	SupportedType getType();

	/**
	 * Sets the value of the '{@link SAR.SimpleAttributeType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see SAR.SupportedType
	 * @see #getType()
	 * @generated
	 */
	void setType(SupportedType value);

} // SimpleAttributeType
