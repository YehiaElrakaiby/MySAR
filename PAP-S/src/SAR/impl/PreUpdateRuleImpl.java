/**
 */
package SAR.impl;

import java.util.HashSet;

import SAR.PreUpdateRule;
import SAR.SARPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Update Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PreUpdateRuleImpl extends UpdateRuleImpl implements PreUpdateRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreUpdateRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.PRE_UPDATE_RULE;
	}

	@Override
	public String toProlog() {
		StringBuilder str = new StringBuilder();
		HashSet<String> variables = new HashSet<String>();
		
		activation_condition.getVariables(variables);

		String identifier = createIdentifier("'"+id+"'",variables);

		str.append(fact("pre_update",identifier,"'activation_condition'",activation_condition.toProlog()));
		str.append(fact("pre_update",identifier,"'update_expression'",update_expression.toProlog()));
		str.append("\n");
		//str.append(this.activation_condition.toProlog());
		//str.append(this.update_expression.toProlog());
		return str.toString();
	}

	private Object fact(String predicate_name, String entity, String attribute,
			Object value) {
		String str = predicate_name + "(" + entity + "," + attribute + "," + value + ").\n";
		return str;
	}

	private String createIdentifier(String id, HashSet<String> variables) {
		StringBuilder identifier = new StringBuilder();
		identifier.append("[");
		identifier.append(this.id);
		for(String var : variables) {
			identifier.append(",");
			identifier.append(var);
		}
		identifier.append("]");
		return identifier.toString();
	}

	@Override
	public Object getIdentifier() {
		HashSet<String> variables = new HashSet<String>();

		this.activation_condition.getVariables(variables);
		
		String identifier = createIdentifier(id,variables);
	
		return identifier;
	}


} //PreUpdateRuleImpl
