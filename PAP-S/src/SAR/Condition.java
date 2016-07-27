/**
 */
package SAR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.Condition#getAttribute_condition_expression <em>Attribute condition expression</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends ConditionExpression {
	/**
	 * Returns the value of the '<em><b>Attribute condition expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute condition expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute condition expression</em>' containment reference.
	 * @see #setAttribute_condition_expression(AttributeConditionExpression)
	 * @see SAR.SARPackage#getCondition_Attribute_condition_expression()
	 * @model containment="true"
	 * @generated
	 */
	AttributeConditionExpression getAttribute_condition_expression();

	/**
	 * Sets the value of the '{@link SAR.Condition#getAttribute_condition_expression <em>Attribute condition expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute condition expression</em>' containment reference.
	 * @see #getAttribute_condition_expression()
	 * @generated
	 */
	void setAttribute_condition_expression(AttributeConditionExpression value);

	void getVariables(HashSet<String> variables);

	void getTrigger(ArrayList<String> triggers, EList<PredicateDefinition> predicate_definitions,
			HashMap<String, String> map);

	void getDependencies(ArrayList<String> dependencies, EList<PredicateDefinition> predicate_definitions,
			HashMap<String, String> map);

} // Condition
