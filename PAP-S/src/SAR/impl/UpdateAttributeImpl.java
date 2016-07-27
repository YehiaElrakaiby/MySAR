/**
 */
package SAR.impl;

import SAR.AttributeValueAssignment;
import SAR.EntitytReference;
import SAR.SARPackage;
import SAR.UpdateAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.UpdateAttributeImpl#getAttribute_assignment <em>Attribute assignment</em>}</li>
 *   <li>{@link SAR.impl.UpdateAttributeImpl#getObject_reference <em>Object reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UpdateAttributeImpl extends UpdateExpressionImpl implements UpdateAttribute {
	/**
	 * The cached value of the '{@link #getAttribute_assignment() <em>Attribute assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute_assignment()
	 * @generated
	 * @ordered
	 */
	protected AttributeValueAssignment attribute_assignment;

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
	protected UpdateAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.UPDATE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueAssignment getAttribute_assignment() {
		return attribute_assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute_assignment(AttributeValueAssignment newAttribute_assignment, NotificationChain msgs) {
		AttributeValueAssignment oldAttribute_assignment = attribute_assignment;
		attribute_assignment = newAttribute_assignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.UPDATE_ATTRIBUTE__ATTRIBUTE_ASSIGNMENT, oldAttribute_assignment, newAttribute_assignment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute_assignment(AttributeValueAssignment newAttribute_assignment) {
		if (newAttribute_assignment != attribute_assignment) {
			NotificationChain msgs = null;
			if (attribute_assignment != null)
				msgs = ((InternalEObject)attribute_assignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.UPDATE_ATTRIBUTE__ATTRIBUTE_ASSIGNMENT, null, msgs);
			if (newAttribute_assignment != null)
				msgs = ((InternalEObject)newAttribute_assignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.UPDATE_ATTRIBUTE__ATTRIBUTE_ASSIGNMENT, null, msgs);
			msgs = basicSetAttribute_assignment(newAttribute_assignment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.UPDATE_ATTRIBUTE__ATTRIBUTE_ASSIGNMENT, newAttribute_assignment, newAttribute_assignment));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.UPDATE_ATTRIBUTE__OBJECT_REFERENCE, oldObject_reference, newObject_reference);
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
				msgs = ((InternalEObject)object_reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.UPDATE_ATTRIBUTE__OBJECT_REFERENCE, null, msgs);
			if (newObject_reference != null)
				msgs = ((InternalEObject)newObject_reference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.UPDATE_ATTRIBUTE__OBJECT_REFERENCE, null, msgs);
			msgs = basicSetObject_reference(newObject_reference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.UPDATE_ATTRIBUTE__OBJECT_REFERENCE, newObject_reference, newObject_reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.UPDATE_ATTRIBUTE__ATTRIBUTE_ASSIGNMENT:
				return basicSetAttribute_assignment(null, msgs);
			case SARPackage.UPDATE_ATTRIBUTE__OBJECT_REFERENCE:
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
			case SARPackage.UPDATE_ATTRIBUTE__ATTRIBUTE_ASSIGNMENT:
				return getAttribute_assignment();
			case SARPackage.UPDATE_ATTRIBUTE__OBJECT_REFERENCE:
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
			case SARPackage.UPDATE_ATTRIBUTE__ATTRIBUTE_ASSIGNMENT:
				setAttribute_assignment((AttributeValueAssignment)newValue);
				return;
			case SARPackage.UPDATE_ATTRIBUTE__OBJECT_REFERENCE:
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
			case SARPackage.UPDATE_ATTRIBUTE__ATTRIBUTE_ASSIGNMENT:
				setAttribute_assignment((AttributeValueAssignment)null);
				return;
			case SARPackage.UPDATE_ATTRIBUTE__OBJECT_REFERENCE:
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
			case SARPackage.UPDATE_ATTRIBUTE__ATTRIBUTE_ASSIGNMENT:
				return attribute_assignment != null;
			case SARPackage.UPDATE_ATTRIBUTE__OBJECT_REFERENCE:
				return object_reference != null;
		}
		return super.eIsSet(featureID);
	}

} //UpdateAttributeImpl
