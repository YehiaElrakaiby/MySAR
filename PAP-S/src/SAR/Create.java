/**
 */
package SAR;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.Create#getAttributes_assignment <em>Attributes assignment</em>}</li>
 *   <li>{@link SAR.Create#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getCreate()
 * @model
 * @generated
 */
public interface Create extends UpdateObject {
	/**
	 * Returns the value of the '<em><b>Attributes assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes assignment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes assignment</em>' containment reference.
	 * @see #setAttributes_assignment(AttributeAssignmentExpression)
	 * @see SAR.SARPackage#getCreate_Attributes_assignment()
	 * @model containment="true"
	 * @generated
	 */
	AttributeAssignmentExpression getAttributes_assignment();

	/**
	 * Sets the value of the '{@link SAR.Create#getAttributes_assignment <em>Attributes assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes assignment</em>' containment reference.
	 * @see #getAttributes_assignment()
	 * @generated
	 */
	void setAttributes_assignment(AttributeAssignmentExpression value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(EntityDeclaration)
	 * @see SAR.SARPackage#getCreate_Entity()
	 * @model required="true"
	 * @generated
	 */
	EntityDeclaration getEntity();

	/**
	 * Sets the value of the '{@link SAR.Create#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(EntityDeclaration value);

} // Create
