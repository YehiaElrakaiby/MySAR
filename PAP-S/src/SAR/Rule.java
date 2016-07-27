/**
 */
package SAR;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.Rule#getId <em>Id</em>}</li>
 *   <li>{@link SAR.Rule#getActivation_condition <em>Activation condition</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getRule()
 * @model abstract="true"
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see SAR.SARPackage#getRule_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link SAR.Rule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Activation condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation condition</em>' containment reference.
	 * @see #setActivation_condition(ConditionExpression)
	 * @see SAR.SARPackage#getRule_Activation_condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionExpression getActivation_condition();

	/**
	 * Sets the value of the '{@link SAR.Rule#getActivation_condition <em>Activation condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation condition</em>' containment reference.
	 * @see #getActivation_condition()
	 * @generated
	 */
	void setActivation_condition(ConditionExpression value);
	
	
	Object getIdentifier();
	
	String getTrigger(EList<PredicateDefinition> predicate_definitions);
	
	String getDependencies(EList<PredicateDefinition> predicate_definitions);


} // Rule
