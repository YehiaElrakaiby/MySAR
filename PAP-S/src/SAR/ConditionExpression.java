/**
 */
package SAR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see SAR.SARPackage#getConditionExpression()
 * @model abstract="true"
 * @generated
 */
public interface ConditionExpression extends EObject {

	Object toProlog();

	void getVariables(HashSet<String> variables);

	void getTrigger(ArrayList<String> triggers, EList<PredicateDefinition> predicate_definitions, HashMap<String, String> map);

	void getDependencies(ArrayList<String> dependencies, EList<PredicateDefinition> predicate_definitions, HashMap<String, String> map);
} // ConditionExpression
