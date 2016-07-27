/**
 */
package SAR.impl;

import SAR.Add;
import SAR.SARPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AddImpl extends UpdateAttributeImpl implements Add {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.ADD;
	}

	@Override
	public Object toProlog() {
		StringBuilder str = new StringBuilder();
		//str.append("add");
		//str.append("(");
		//str.append(this.object_name.toProlog());
		//str.append(",");
		str.append(this.attribute_assignment.toProlog("add",this.object_reference.toProlog(),object_reference.getEntity_id().getId()));
		//str.append(")");
		return str.toString();
	}

} //AddImpl
