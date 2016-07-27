/**
 */
package SAR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.EntityDeclaration#getEntity_attributes <em>Entity attributes</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getEntityDeclaration()
 * @model
 * @generated
 */
public interface EntityDeclaration extends ObjectDeclaration {
	/**
	 * Returns the value of the '<em><b>Entity attributes</b></em>' containment reference list.
	 * The list contents are of type {@link SAR.EntityAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity attributes</em>' containment reference list.
	 * @see SAR.SARPackage#getEntityDeclaration_Entity_attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityAttribute> getEntity_attributes();

	String toProlog();

} // EntityDeclaration
