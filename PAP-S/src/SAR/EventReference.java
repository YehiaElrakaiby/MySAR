/**
 */
package SAR;

import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.EventReference#getEvent_id <em>Event id</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getEventReference()
 * @model
 * @generated
 */
public interface EventReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Event id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event id</em>' reference.
	 * @see #setEvent_id(EventDeclaration)
	 * @see SAR.SARPackage#getEventReference_Event_id()
	 * @model required="true"
	 * @generated
	 */
	EventDeclaration getEvent_id();

	/**
	 * Sets the value of the '{@link SAR.EventReference#getEvent_id <em>Event id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event id</em>' reference.
	 * @see #getEvent_id()
	 * @generated
	 */
	void setEvent_id(EventDeclaration value);

	String toProlog();

	void getVariables(HashSet<String> variables);

} // EventReference
