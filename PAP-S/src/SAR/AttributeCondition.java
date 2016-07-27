/**
 */
package SAR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.AttributeCondition#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link SAR.AttributeCondition#getOperator <em>Operator</em>}</li>
 *   <li>{@link SAR.AttributeCondition#getAttribute_value <em>Attribute value</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getAttributeCondition()
 * @model
 * @generated
 */
public interface AttributeCondition extends AttributeConditionExpression {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(AttributeDeclaration)
	 * @see SAR.SARPackage#getAttributeCondition_Attribute()
	 * @model required="true"
	 * @generated
	 */
	AttributeDeclaration getAttribute();

	/**
	 * Sets the value of the '{@link SAR.AttributeCondition#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(AttributeDeclaration value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SAR.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see SAR.ComparisonOperator
	 * @see #setOperator(ComparisonOperator)
	 * @see SAR.SARPackage#getAttributeCondition_Operator()
	 * @model required="true"
	 * @generated
	 */
	ComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link SAR.AttributeCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see SAR.ComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Attribute value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute value</em>' containment reference.
	 * @see #setAttribute_value(AttributeValue)
	 * @see SAR.SARPackage#getAttributeCondition_Attribute_value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeValue getAttribute_value();

	/**
	 * Sets the value of the '{@link SAR.AttributeCondition#getAttribute_value <em>Attribute value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute value</em>' containment reference.
	 * @see #getAttribute_value()
	 * @generated
	 */
	void setAttribute_value(AttributeValue value);

} // AttributeCondition
