/**
 */
package SAR;

import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.ObjectName#getHandle <em>Handle</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getObjectName()
 * @model
 * @generated
 */
public interface ObjectName extends EObject {
	/**
	 * Returns the value of the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle</em>' attribute.
	 * @see #setHandle(String)
	 * @see SAR.SARPackage#getObjectName_Handle()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getHandle();

	/**
	 * Sets the value of the '{@link SAR.ObjectName#getHandle <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle</em>' attribute.
	 * @see #getHandle()
	 * @generated
	 */
	void setHandle(String value);

	Object toProlog();

	void getVariables(HashSet<String> variables);

} // ObjectName
