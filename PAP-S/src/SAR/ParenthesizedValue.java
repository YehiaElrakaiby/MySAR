/**
 */
package SAR;

import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesized Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.ParenthesizedValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getParenthesizedValue()
 * @model
 * @generated
 */
public interface ParenthesizedValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueExpression)
	 * @see SAR.SARPackage#getParenthesizedValue_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueExpression getValue();

	/**
	 * Sets the value of the '{@link SAR.ParenthesizedValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueExpression value);

	String toProlog();

	void getVariables(HashSet<String> variables);

	String toProlog1();

} // ParenthesizedValue
