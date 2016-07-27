/**
 */
package SAR;

import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entityt Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.EntitytReference#getHandle_id <em>Handle id</em>}</li>
 *   <li>{@link SAR.EntitytReference#getEntity_id <em>Entity id</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getEntitytReference()
 * @model
 * @generated
 */
public interface EntitytReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Handle id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle id</em>' attribute.
	 * @see #setHandle_id(int)
	 * @see SAR.SARPackage#getEntitytReference_Handle_id()
	 * @model id="true"
	 * @generated
	 */
	int getHandle_id();

	/**
	 * Sets the value of the '{@link SAR.EntitytReference#getHandle_id <em>Handle id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle id</em>' attribute.
	 * @see #getHandle_id()
	 * @generated
	 */
	void setHandle_id(int value);

	/**
	 * Returns the value of the '<em><b>Entity id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity id</em>' reference.
	 * @see #setEntity_id(ObjectDeclaration)
	 * @see SAR.SARPackage#getEntitytReference_Entity_id()
	 * @model required="true"
	 * @generated
	 */
	ObjectDeclaration getEntity_id();

	/**
	 * Sets the value of the '{@link SAR.EntitytReference#getEntity_id <em>Entity id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity id</em>' reference.
	 * @see #getEntity_id()
	 * @generated
	 */
	void setEntity_id(ObjectDeclaration value);

	String toProlog();

	void getVariables(HashSet<String> variables);

} // EntitytReference
