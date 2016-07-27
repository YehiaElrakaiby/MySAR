/**
 */
package SAR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see SAR.SARPackage#getAttributeAssignmentExpression()
 * @model abstract="true"
 * @generated
 */
public interface AttributeAssignmentExpression extends EObject {

	Object toProlog(String type, String variableName, String entityName);

	String toPrologExecution();
} // AttributeAssignmentExpression
