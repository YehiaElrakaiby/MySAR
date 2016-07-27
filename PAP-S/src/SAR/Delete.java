/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.Delete#getObject_reference <em>Object reference</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getDelete()
 * @model
 * @generated
 */
public interface Delete extends UpdateObject {

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
	 * @see SAR.SARPackage#getDelete_Object_reference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EntitytReference getObject_reference();

	/**
	 * Sets the value of the '{@link SAR.Delete#getObject_reference <em>Object reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object reference</em>' containment reference.
	 * @see #getObject_reference()
	 * @generated
	 */
	void setObject_reference(EntitytReference value);
} // Delete
