/**
 */
package SAR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.ListAttributeType#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getListAttributeType()
 * @model
 * @generated
 */
public interface ListAttributeType extends FieldType {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute list.
	 * The list contents are of type {@link SAR.SupportedType}.
	 * The literals are from the enumeration {@link SAR.SupportedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' attribute list.
	 * @see SAR.SupportedType
	 * @see SAR.SARPackage#getListAttributeType_Types()
	 * @model required="true"
	 * @generated
	 */
	EList<SupportedType> getTypes();

} // ListAttributeType
