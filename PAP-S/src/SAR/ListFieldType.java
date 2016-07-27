/**
 */
package SAR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.ListFieldType#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getListFieldType()
 * @model
 * @generated
 */
public interface ListFieldType extends FieldType {
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
	 * @see SAR.SARPackage#getListFieldType_Types()
	 * @model required="true"
	 * @generated
	 */
	EList<SupportedType> getTypes();

} // ListFieldType
