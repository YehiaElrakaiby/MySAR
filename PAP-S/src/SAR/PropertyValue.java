/**
 */
package SAR;

import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see SAR.SARPackage#getPropertyValue()
 * @model abstract="true"
 * @generated
 */
public interface PropertyValue extends EObject {

	Object toProlog();

	void getVariables(HashSet<String> variables);

	Object toProlog1();

} // PropertyValue
