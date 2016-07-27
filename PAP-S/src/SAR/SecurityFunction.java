/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.SecurityFunction#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getSecurityFunction()
 * @model
 * @generated
 */
public interface SecurityFunction extends Modify {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link SAR.ModificationOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see SAR.ModificationOperation
	 * @see #setOperation(ModificationOperation)
	 * @see SAR.SARPackage#getSecurityFunction_Operation()
	 * @model required="true"
	 * @generated
	 */
	ModificationOperation getOperation();

	/**
	 * Sets the value of the '{@link SAR.SecurityFunction#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see SAR.ModificationOperation
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ModificationOperation value);

} // SecurityFunction
