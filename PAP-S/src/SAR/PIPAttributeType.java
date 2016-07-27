/**
 */
package SAR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PIP Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.PIPAttributeType#getPip_options <em>Pip options</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getPIPAttributeType()
 * @model
 * @generated
 */
public interface PIPAttributeType extends EntityAttribute {
	/**
	 * Returns the value of the '<em><b>Pip options</b></em>' containment reference list.
	 * The list contents are of type {@link SAR.PIPOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pip options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pip options</em>' containment reference list.
	 * @see SAR.SARPackage#getPIPAttributeType_Pip_options()
	 * @model containment="true"
	 * @generated
	 */
	EList<PIPOption> getPip_options();

} // PIPAttributeType
