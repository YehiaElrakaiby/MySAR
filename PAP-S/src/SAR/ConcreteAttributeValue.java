/**
 */
package SAR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.ConcreteAttributeValue#getAttribute_value <em>Attribute value</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getConcreteAttributeValue()
 * @model
 * @generated
 */
public interface ConcreteAttributeValue extends EObject {
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
	 * @see SAR.SARPackage#getConcreteAttributeValue_Attribute_value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeValue getAttribute_value();

	/**
	 * Sets the value of the '{@link SAR.ConcreteAttributeValue#getAttribute_value <em>Attribute value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute value</em>' containment reference.
	 * @see #getAttribute_value()
	 * @generated
	 */
	void setAttribute_value(AttributeValue value);

} // ConcreteAttributeValue
