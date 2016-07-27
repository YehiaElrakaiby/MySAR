/**
 */
package SAR.impl;

import SAR.SARPackage;
import SAR.Update;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UpdateImpl extends UpdateAttributeImpl implements Update {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.UPDATE;
	}

	@Override
	public Object toProlog() {
		StringBuilder str = new StringBuilder();
//		str.append("update");
//		str.append("(");
//		str.append(this.object_name.toProlog());
//		str.append(",");
//		str.append(this.attribute_assignment.toProlog(object_name.toProlog().toString()));
//		str.append(")");
		str.append(this.attribute_assignment.toProlog("update",object_reference.toProlog(),object_reference.getEntity_id().getId()));
		return str.toString();
	}
	

} //UpdateImpl
