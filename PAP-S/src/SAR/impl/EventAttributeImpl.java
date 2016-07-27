/**
 */
package SAR.impl;

import SAR.EventAttribute;
import SAR.FieldType;
import SAR.SARPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.EventAttributeImpl#getField_type <em>Field type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventAttributeImpl extends AttributeDeclarationImpl implements EventAttribute {
	/**
	 * The cached value of the '{@link #getField_type() <em>Field type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField_type()
	 * @generated
	 * @ordered
	 */
	protected FieldType field_type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.EVENT_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldType getField_type() {
		return field_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetField_type(FieldType newField_type, NotificationChain msgs) {
		FieldType oldField_type = field_type;
		field_type = newField_type;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.EVENT_ATTRIBUTE__FIELD_TYPE, oldField_type, newField_type);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField_type(FieldType newField_type) {
		if (newField_type != field_type) {
			NotificationChain msgs = null;
			if (field_type != null)
				msgs = ((InternalEObject)field_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.EVENT_ATTRIBUTE__FIELD_TYPE, null, msgs);
			if (newField_type != null)
				msgs = ((InternalEObject)newField_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.EVENT_ATTRIBUTE__FIELD_TYPE, null, msgs);
			msgs = basicSetField_type(newField_type, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.EVENT_ATTRIBUTE__FIELD_TYPE, newField_type, newField_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.EVENT_ATTRIBUTE__FIELD_TYPE:
				return basicSetField_type(null, msgs);
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
			case SARPackage.EVENT_ATTRIBUTE__FIELD_TYPE:
				return getField_type();
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
			case SARPackage.EVENT_ATTRIBUTE__FIELD_TYPE:
				setField_type((FieldType)newValue);
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
			case SARPackage.EVENT_ATTRIBUTE__FIELD_TYPE:
				setField_type((FieldType)null);
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
			case SARPackage.EVENT_ATTRIBUTE__FIELD_TYPE:
				return field_type != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String toProlog() {
		// TODO Auto-generated method stub
		return null;
	}

} //EventAttributeImpl
