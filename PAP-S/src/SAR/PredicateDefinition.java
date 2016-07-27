/**
 */
package SAR;

import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.PredicateDefinition#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link SAR.PredicateDefinition#getActivation_conditions <em>Activation conditions</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getPredicateDefinition()
 * @model
 * @generated
 */
public interface PredicateDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(Predicate)
	 * @see SAR.SARPackage#getPredicateDefinition_Predicate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Predicate getPredicate();

	/**
	 * Sets the value of the '{@link SAR.PredicateDefinition#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Predicate value);

	/**
	 * Returns the value of the '<em><b>Activation conditions</b></em>' containment reference list.
	 * The list contents are of type {@link SAR.ConditionExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation conditions</em>' containment reference list.
	 * @see SAR.SARPackage#getPredicateDefinition_Activation_conditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConditionExpression> getActivation_conditions();

	String toProlog();

	HashSet<String> getVariables();

} // PredicateDefinition
