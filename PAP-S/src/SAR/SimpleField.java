/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.SimpleField#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getSimpleField()
 * @model
 * @generated
 */
public interface SimpleField extends FieldType {
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
	 * @see SAR.SARPackage#getSimpleField_Type()
	 * @model required="true"
	 * @generated
	 */
	SupportedType getType();

	/**
	 * Sets the value of the '{@link SAR.SimpleField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see SAR.SupportedType
	 * @see #getType()
	 * @generated
	 */
	void setType(SupportedType value);

} // SimpleField
