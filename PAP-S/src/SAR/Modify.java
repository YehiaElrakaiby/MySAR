/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.Modify#getEvent_attribute <em>Event attribute</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getModify()
 * @model abstract="true"
 * @generated
 */
public interface Modify extends UpdateExpression {
	/**
	 * Returns the value of the '<em><b>Event attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event attribute</em>' reference.
	 * @see #setEvent_attribute(EventAttribute)
	 * @see SAR.SARPackage#getModify_Event_attribute()
	 * @model required="true"
	 * @generated
	 */
	EventAttribute getEvent_attribute();

	/**
	 * Sets the value of the '{@link SAR.Modify#getEvent_attribute <em>Event attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event attribute</em>' reference.
	 * @see #getEvent_attribute()
	 * @generated
	 */
	void setEvent_attribute(EventAttribute value);

} // Modify
