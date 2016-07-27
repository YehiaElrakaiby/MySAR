/**
 */
package SAR;

import java.util.HashSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.PropertyCondition#getProperty <em>Property</em>}</li>
 *   <li>{@link SAR.PropertyCondition#getOperator <em>Operator</em>}</li>
 *   <li>{@link SAR.PropertyCondition#getProperty_value <em>Property value</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getPropertyCondition()
 * @model
 * @generated
 */
public interface PropertyCondition extends PropertyConditionExpression {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(AttributeId)
	 * @see SAR.SARPackage#getPropertyCondition_Property()
	 * @model required="true"
	 * @generated
	 */
	AttributeId getProperty();

	/**
	 * Sets the value of the '{@link SAR.PropertyCondition#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(AttributeId value);

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
	 * @see SAR.SARPackage#getPropertyCondition_Operator()
	 * @model required="true"
	 * @generated
	 */
	ComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link SAR.PropertyCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see SAR.ComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Property value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property value</em>' containment reference.
	 * @see #setProperty_value(PropertyValue)
	 * @see SAR.SARPackage#getPropertyCondition_Property_value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PropertyValue getProperty_value();

	/**
	 * Sets the value of the '{@link SAR.PropertyCondition#getProperty_value <em>Property value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property value</em>' containment reference.
	 * @see #getProperty_value()
	 * @generated
	 */
	void setProperty_value(PropertyValue value);

	Object toProlog();

	void getVariables(HashSet<String> variables);

} // PropertyCondition
