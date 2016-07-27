/**
 */
package SAR;

import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Condition Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see SAR.SARPackage#getPropertyConditionExpression()
 * @model abstract="true"
 * @generated
 */
public interface PropertyConditionExpression extends EObject {

	Object toProlog(String string);

	void getVariables(HashSet<String> variables);
} // PropertyConditionExpression
