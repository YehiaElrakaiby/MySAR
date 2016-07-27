/**
 */
package SAR.impl;

import SAR.EntitytReference;
import SAR.ObjectDeclaration;
import SAR.SARPackage;

import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entityt Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.EntitytReferenceImpl#getHandle_id <em>Handle id</em>}</li>
 *   <li>{@link SAR.impl.EntitytReferenceImpl#getEntity_id <em>Entity id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntitytReferenceImpl extends MinimalEObjectImpl.Container implements EntitytReference {
	/**
	 * The default value of the '{@link #getHandle_id() <em>Handle id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle_id()
	 * @generated
	 * @ordered
	 */
	protected static final int HANDLE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHandle_id() <em>Handle id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle_id()
	 * @generated
	 * @ordered
	 */
	protected int handle_id = HANDLE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntity_id() <em>Entity id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity_id()
	 * @generated
	 * @ordered
	 */
	protected ObjectDeclaration entity_id;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntitytReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.ENTITYT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHandle_id() {
		return handle_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandle_id(int newHandle_id) {
		int oldHandle_id = handle_id;
		handle_id = newHandle_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ENTITYT_REFERENCE__HANDLE_ID, oldHandle_id, handle_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDeclaration getEntity_id() {
		if (entity_id != null && entity_id.eIsProxy()) {
			InternalEObject oldEntity_id = (InternalEObject)entity_id;
			entity_id = (ObjectDeclaration)eResolveProxy(oldEntity_id);
			if (entity_id != oldEntity_id) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SARPackage.ENTITYT_REFERENCE__ENTITY_ID, oldEntity_id, entity_id));
			}
		}
		return entity_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDeclaration basicGetEntity_id() {
		return entity_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity_id(ObjectDeclaration newEntity_id) {
		ObjectDeclaration oldEntity_id = entity_id;
		entity_id = newEntity_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ENTITYT_REFERENCE__ENTITY_ID, oldEntity_id, entity_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SARPackage.ENTITYT_REFERENCE__HANDLE_ID:
				return getHandle_id();
			case SARPackage.ENTITYT_REFERENCE__ENTITY_ID:
				if (resolve) return getEntity_id();
				return basicGetEntity_id();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SARPackage.ENTITYT_REFERENCE__HANDLE_ID:
				setHandle_id((Integer)newValue);
				return;
			case SARPackage.ENTITYT_REFERENCE__ENTITY_ID:
				setEntity_id((ObjectDeclaration)newValue);
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
			case SARPackage.ENTITYT_REFERENCE__HANDLE_ID:
				setHandle_id(HANDLE_ID_EDEFAULT);
				return;
			case SARPackage.ENTITYT_REFERENCE__ENTITY_ID:
				setEntity_id((ObjectDeclaration)null);
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
			case SARPackage.ENTITYT_REFERENCE__HANDLE_ID:
				return handle_id != HANDLE_ID_EDEFAULT;
			case SARPackage.ENTITYT_REFERENCE__ENTITY_ID:
				return entity_id != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (handle_id: ");
		result.append(handle_id);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public String toProlog() {
		StringBuilder str = new StringBuilder();
		str.append(this.entity_id.getId());
		str.append("_");
		str.append(this.handle_id);
		return str.toString();
	}

	@Override
	public void getVariables(HashSet<String> variables) {
		variables.add("HAN_"+this.toProlog());		
	}


} //EntitytReferenceImpl
