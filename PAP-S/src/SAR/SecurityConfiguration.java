/**
 */
package SAR;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.SecurityConfiguration#getId <em>Id</em>}</li>
 *   <li>{@link SAR.SecurityConfiguration#getEvent_declarations <em>Event declarations</em>}</li>
 *   <li>{@link SAR.SecurityConfiguration#getEntity_declarations <em>Entity declarations</em>}</li>
 *   <li>{@link SAR.SecurityConfiguration#getPredicate_definitions <em>Predicate definitions</em>}</li>
 *   <li>{@link SAR.SecurityConfiguration#getPre_updates <em>Pre updates</em>}</li>
 *   <li>{@link SAR.SecurityConfiguration#getPost_updates <em>Post updates</em>}</li>
 *   <li>{@link SAR.SecurityConfiguration#getSecurity_policy <em>Security policy</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getSecurityConfiguration()
 * @model
 * @generated
 */
public interface SecurityConfiguration extends EObject {
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
	 * @see SAR.SARPackage#getSecurityConfiguration_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link SAR.SecurityConfiguration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Event declarations</b></em>' containment reference list.
	 * The list contents are of type {@link SAR.EventDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event declarations</em>' containment reference list.
	 * @see SAR.SARPackage#getSecurityConfiguration_Event_declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventDeclaration> getEvent_declarations();

	/**
	 * Returns the value of the '<em><b>Entity declarations</b></em>' containment reference list.
	 * The list contents are of type {@link SAR.EntityDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity declarations</em>' containment reference list.
	 * @see SAR.SARPackage#getSecurityConfiguration_Entity_declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityDeclaration> getEntity_declarations();

	/**
	 * Returns the value of the '<em><b>Predicate definitions</b></em>' containment reference list.
	 * The list contents are of type {@link SAR.PredicateDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate definitions</em>' containment reference list.
	 * @see SAR.SARPackage#getSecurityConfiguration_Predicate_definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PredicateDefinition> getPredicate_definitions();

	/**
	 * Returns the value of the '<em><b>Pre updates</b></em>' containment reference list.
	 * The list contents are of type {@link SAR.PreUpdateRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre updates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre updates</em>' containment reference list.
	 * @see SAR.SARPackage#getSecurityConfiguration_Pre_updates()
	 * @model containment="true"
	 * @generated
	 */
	EList<PreUpdateRule> getPre_updates();

	/**
	 * Returns the value of the '<em><b>Post updates</b></em>' containment reference list.
	 * The list contents are of type {@link SAR.PostUpdateRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post updates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post updates</em>' containment reference list.
	 * @see SAR.SARPackage#getSecurityConfiguration_Post_updates()
	 * @model containment="true"
	 * @generated
	 */
	EList<PostUpdateRule> getPost_updates();

	/**
	 * Returns the value of the '<em><b>Security policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security policy</em>' containment reference.
	 * @see #setSecurity_policy(SecurityPolicy)
	 * @see SAR.SARPackage#getSecurityConfiguration_Security_policy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityPolicy getSecurity_policy();

	/**
	 * Sets the value of the '{@link SAR.SecurityConfiguration#getSecurity_policy <em>Security policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security policy</em>' containment reference.
	 * @see #getSecurity_policy()
	 * @generated
	 */
	void setSecurity_policy(SecurityPolicy value);

	String toProlog();

	String getPreUpdatesAsProlog();
	
	String getPostUpdatesAsProlog();

	String getPredicateDefinitionsAsProlog();

	Object getSecurityPolicyAsProlog();

	HashMap<String, String> getRuleIdentifiersMap();

	String getTriggerPolicy();
	
	String getDependenciesPolicy();
	
	HashMap<String,Integer> getEntityAttributeArity();

	HashSet<String> getEntities();
	
	EList<EntityDeclaration> entityDeclarations();


} // SecurityConfiguration
