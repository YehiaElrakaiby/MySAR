/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.Delay#getUnit <em>Unit</em>}</li>
 *   <li>{@link SAR.Delay#getCalendar <em>Calendar</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getDelay()
 * @model
 * @generated
 */
public interface Delay extends ConditionExpression {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(int)
	 * @see SAR.SARPackage#getDelay_Unit()
	 * @model required="true"
	 * @generated
	 */
	int getUnit();

	/**
	 * Sets the value of the '{@link SAR.Delay#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(int value);

	/**
	 * Returns the value of the '<em><b>Calendar</b></em>' attribute.
	 * The literals are from the enumeration {@link SAR.Calendar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calendar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar</em>' attribute.
	 * @see SAR.Calendar
	 * @see #setCalendar(Calendar)
	 * @see SAR.SARPackage#getDelay_Calendar()
	 * @model required="true"
	 * @generated
	 */
	Calendar getCalendar();

	/**
	 * Sets the value of the '{@link SAR.Delay#getCalendar <em>Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar</em>' attribute.
	 * @see SAR.Calendar
	 * @see #getCalendar()
	 * @generated
	 */
	void setCalendar(Calendar value);

} // Delay
