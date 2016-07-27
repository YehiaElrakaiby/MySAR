/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.EventCondition#getEvent_reference <em>Event reference</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getEventCondition()
 * @model
 * @generated
 */
public interface EventCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Event reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event reference</em>' containment reference.
	 * @see #setEvent_reference(EventReference)
	 * @see SAR.SARPackage#getEventCondition_Event_reference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EventReference getEvent_reference();

	/**
	 * Sets the value of the '{@link SAR.EventCondition#getEvent_reference <em>Event reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event reference</em>' containment reference.
	 * @see #getEvent_reference()
	 * @generated
	 */
	void setEvent_reference(EventReference value);

} // EventCondition
