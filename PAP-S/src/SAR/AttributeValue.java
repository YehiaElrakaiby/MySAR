/**
 */
package SAR;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see SAR.SARPackage#getAttributeValue()
 * @model abstract="true"
 * @generated
 */
public interface AttributeValue extends EObject {

	void getVariables(HashSet<String> variables);

	String toProlog();

	String toProlog1();

	String toProlog(HashMap<String, String> map);
} // AttributeValue
