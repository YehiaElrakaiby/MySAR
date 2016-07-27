/**
 */
package SAR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.ValueSet#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getValueSet()
 * @model
 * @generated
 */
public interface ValueSet extends PropertyValue {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link SAR.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see SAR.SARPackage#getValueSet_Values()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Value> getValues();

} // ValueSet
