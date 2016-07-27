/**
 */
package SAR.impl;

import SAR.PIPAttributeType;
import SAR.PIPOption;
import SAR.SARPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PIP Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.PIPAttributeTypeImpl#getPip_options <em>Pip options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PIPAttributeTypeImpl extends EntityAttributeImpl implements PIPAttributeType {
	/**
	 * The cached value of the '{@link #getPip_options() <em>Pip options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPip_options()
	 * @generated
	 * @ordered
	 */
	protected EList<PIPOption> pip_options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PIPAttributeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.PIP_ATTRIBUTE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PIPOption> getPip_options() {
		if (pip_options == null) {
			pip_options = new EObjectContainmentEList<PIPOption>(PIPOption.class, this, SARPackage.PIP_ATTRIBUTE_TYPE__PIP_OPTIONS);
		}
		return pip_options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.PIP_ATTRIBUTE_TYPE__PIP_OPTIONS:
				return ((InternalEList<?>)getPip_options()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SARPackage.PIP_ATTRIBUTE_TYPE__PIP_OPTIONS:
				return getPip_options();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SARPackage.PIP_ATTRIBUTE_TYPE__PIP_OPTIONS:
				getPip_options().clear();
				getPip_options().addAll((Collection<? extends PIPOption>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SARPackage.PIP_ATTRIBUTE_TYPE__PIP_OPTIONS:
				getPip_options().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SARPackage.PIP_ATTRIBUTE_TYPE__PIP_OPTIONS:
				return pip_options != null && !pip_options.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toPrologMeta(String id) {
		StringBuilder str = new StringBuilder();
		str.append("pip_attribute('");
		str.append(id);
		str.append("','");
		str.append(this.id);
		str.append("').\n\n");
		return str.toString();
	}
	@Override
	public boolean isPIPAttribute() {
		return true;
	}

} //PIPAttributeTypeImpl
