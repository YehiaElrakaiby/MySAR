/**
 */
package SAR;

import java.util.HashSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see SAR.SARPackage#getValue()
 * @model abstract="true"
 * @generated
 */
public interface Value extends AttributeValue {

	String toProlog();

	void getVariables(HashSet<String> variables);

	String toProlog1();

} // Value
