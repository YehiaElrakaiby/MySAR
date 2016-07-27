/**
 */
package SAR;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.StateCondition#getEntity_reference <em>Entity reference</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getStateCondition()
 * @model
 * @generated
 */
public interface StateCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Entity reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity reference</em>' containment reference.
	 * @see #setEntity_reference(EntitytReference)
	 * @see SAR.SARPackage#getStateCondition_Entity_reference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EntitytReference getEntity_reference();

	/**
	 * Sets the value of the '{@link SAR.StateCondition#getEntity_reference <em>Entity reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity reference</em>' containment reference.
	 * @see #getEntity_reference()
	 * @generated
	 */
	void setEntity_reference(EntitytReference value);

} // StateCondition
