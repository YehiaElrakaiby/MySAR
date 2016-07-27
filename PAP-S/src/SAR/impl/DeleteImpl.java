/**
 */
package SAR.impl;

import SAR.Delete;
import SAR.EntitytReference;
import SAR.SARPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.DeleteImpl#getObject_reference <em>Object reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteImpl extends UpdateObjectImpl implements Delete {
	/**
	 * The cached value of the '{@link #getObject_reference() <em>Object reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject_reference()
	 * @generated
	 * @ordered
	 */
	protected EntitytReference object_reference;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.DELETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitytReference getObject_reference() {
		return object_reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject_reference(EntitytReference newObject_reference, NotificationChain msgs) {
		EntitytReference oldObject_reference = object_reference;
		object_reference = newObject_reference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.DELETE__OBJECT_REFERENCE, oldObject_reference, newObject_reference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject_reference(EntitytReference newObject_reference) {
		if (newObject_reference != object_reference) {
			NotificationChain msgs = null;
			if (object_reference != null)
				msgs = ((InternalEObject)object_reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.DELETE__OBJECT_REFERENCE, null, msgs);
			if (newObject_reference != null)
				msgs = ((InternalEObject)newObject_reference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.DELETE__OBJECT_REFERENCE, null, msgs);
			msgs = basicSetObject_reference(newObject_reference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.DELETE__OBJECT_REFERENCE, newObject_reference, newObject_reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.DELETE__OBJECT_REFERENCE:
				return basicSetObject_reference(null, msgs);
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
			case SARPackage.DELETE__OBJECT_REFERENCE:
				return getObject_reference();
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
			case SARPackage.DELETE__OBJECT_REFERENCE:
				setObject_reference((EntitytReference)newValue);
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
			case SARPackage.DELETE__OBJECT_REFERENCE:
				setObject_reference((EntitytReference)null);
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
			case SARPackage.DELETE__OBJECT_REFERENCE:
				return object_reference != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Object toProlog() {
		StringBuilder str = new StringBuilder();
		str.append("delete");
		str.append("(");
		str.append(object_reference.toProlog() +","+object_reference.getEntity_id().getId());
		str.append(")");
		return str.toString();
	}
} //DeleteImpl
