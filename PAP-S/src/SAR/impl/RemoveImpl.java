/**
 */
package SAR.impl;

import SAR.Remove;
import SAR.SARPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RemoveImpl extends UpdateAttributeImpl implements Remove {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.REMOVE;
	}

	@Override
	public Object toProlog() {
		StringBuilder str = new StringBuilder();
//		str.append("remove");
//		str.append("(");
//		str.append(this.object_name.toProlog());
//		str.append(",");
//		str.append(this.attribute_assignment.toProlog());
//		if(value!=null) {
//			str.append(",");
//			str.append(this.value.toProlog1());
//		}
//		str.append(")");
		str.append(this.attribute_assignment.toProlog("remove",object_reference.toProlog().toString(),object_reference.getEntity_id().getId()));
		return str.toString();
	}

	
} //RemoveImpl
