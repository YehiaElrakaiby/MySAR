/**
 */
package SAR.impl;

import SAR.SARPackage;
import SAR.Value;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ValueImpl extends AttributeValueImpl implements Value {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.VALUE;
	}

//	protected String rename(String value2, HashMap<String, String> map) {
//		Set<String> keyset = map.keySet();
//		for(String key:keyset) {
//			if(value2.equals(key)) return map.get(key);
//			else return value2;
//		}
//		return value2;
//	}
} //ValueImpl
