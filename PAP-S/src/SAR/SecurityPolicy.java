/**
 */
package SAR;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.SecurityPolicy#getType <em>Type</em>}</li>
 *   <li>{@link SAR.SecurityPolicy#getPolicy_rules <em>Policy rules</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getSecurityPolicy()
 * @model
 * @generated
 */
public interface SecurityPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link SAR.PolicyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see SAR.PolicyType
	 * @see #setType(PolicyType)
	 * @see SAR.SARPackage#getSecurityPolicy_Type()
	 * @model required="true"
	 * @generated
	 */
	PolicyType getType();

	/**
	 * Sets the value of the '{@link SAR.SecurityPolicy#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see SAR.PolicyType
	 * @see #getType()
	 * @generated
	 */
	void setType(PolicyType value);

	/**
	 * Returns the value of the '<em><b>Policy rules</b></em>' containment reference list.
	 * The list contents are of type {@link SAR.PolicyRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy rules</em>' containment reference list.
	 * @see SAR.SARPackage#getSecurityPolicy_Policy_rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<PolicyRule> getPolicy_rules();

	Object toProlog();

} // SecurityPolicy
