/**
 */
package SAR.impl;

import SAR.PredicateDefinition;
import SAR.SARPackage;
import SAR.True;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>True</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TrueImpl extends ConditionExpressionImpl implements True {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.TRUE;
	}

	@Override
	public Object toProlog() {
		StringBuilder str = new StringBuilder();
		str.append("['predicate',");
		str.append("true_condition");
		str.append("]");
		return str.toString();
	}

	@Override
	public void getVariables(HashSet<String> variables) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTrigger(ArrayList<String> triggers, EList<PredicateDefinition> predicate_definitions,
			HashMap<String, String> map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDependencies(ArrayList<String> dependencies, EList<PredicateDefinition> predicate_definitions,
			HashMap<String, String> map) {
		// TODO Auto-generated method stub
		
	}

} //TrueImpl
