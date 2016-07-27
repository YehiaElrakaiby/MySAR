/**
 */
package SAR;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Condition Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see SAR.SARPackage#getAttributeConditionExpression()
 * @model abstract="true"
 * @generated
 */
public interface AttributeConditionExpression extends EObject {

	String toProlog(String string, String entity_name);

	void getVariables(HashSet<String> variables);

	Object getTrigger(String object_id, String entity_name, HashMap<String, String> map);
} // AttributeConditionExpression
