/**
 */
package SAR;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see SAR.SARPackage#getValueExpression()
 * @model abstract="true"
 * @generated
 */
public interface ValueExpression extends EObject {

	String toProlog();

	void getVariables(HashSet<String> variables);

	String toProlog1();

	String toProlog(HashMap<String, String> map);
} // ValueExpression
