/**
 */
package SAR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.EventDeclaration#getEvent_attributes <em>Event attributes</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getEventDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface EventDeclaration extends ObjectDeclaration {
	/**
	 * Returns the value of the '<em><b>Event attributes</b></em>' containment reference list.
	 * The list contents are of type {@link SAR.EventAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event attributes</em>' containment reference list.
	 * @see SAR.SARPackage#getEventDeclaration_Event_attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventAttribute> getEvent_attributes();

} // EventDeclaration
