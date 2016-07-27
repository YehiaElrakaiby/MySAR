/**
 */
package SAR.impl;

import SAR.AttributeDeclaration;
import SAR.AttributeValue;
import SAR.AttributeValueAssignment;
import SAR.SARPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.AttributeValueAssignmentImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link SAR.impl.AttributeValueAssignmentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link SAR.impl.AttributeValueAssignmentImpl#getNew_value <em>New value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeValueAssignmentImpl extends AttributeAssignmentExpressionImpl implements AttributeValueAssignment {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected AttributeDeclaration attribute;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected AttributeValue value;

	/**
	 * The cached value of the '{@link #getNew_value() <em>New value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_value()
	 * @generated
	 * @ordered
	 */
	protected AttributeValue new_value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.ATTRIBUTE_VALUE_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDeclaration getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (AttributeDeclaration)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDeclaration basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(AttributeDeclaration newAttribute) {
		AttributeDeclaration oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(AttributeValue newValue, NotificationChain msgs) {
		AttributeValue oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(AttributeValue newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue getNew_value() {
		return new_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNew_value(AttributeValue newNew_value, NotificationChain msgs) {
		AttributeValue oldNew_value = new_value;
		new_value = newNew_value;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__NEW_VALUE, oldNew_value, newNew_value);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_value(AttributeValue newNew_value) {
		if (newNew_value != new_value) {
			NotificationChain msgs = null;
			if (new_value != null)
				msgs = ((InternalEObject)new_value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__NEW_VALUE, null, msgs);
			if (newNew_value != null)
				msgs = ((InternalEObject)newNew_value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__NEW_VALUE, null, msgs);
			msgs = basicSetNew_value(newNew_value, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__NEW_VALUE, newNew_value, newNew_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__VALUE:
				return basicSetValue(null, msgs);
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__NEW_VALUE:
				return basicSetNew_value(null, msgs);
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
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__VALUE:
				return getValue();
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__NEW_VALUE:
				return getNew_value();
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
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__ATTRIBUTE:
				setAttribute((AttributeDeclaration)newValue);
				return;
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__VALUE:
				setValue((AttributeValue)newValue);
				return;
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__NEW_VALUE:
				setNew_value((AttributeValue)newValue);
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
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__ATTRIBUTE:
				setAttribute((AttributeDeclaration)null);
				return;
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__VALUE:
				setValue((AttributeValue)null);
				return;
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__NEW_VALUE:
				setNew_value((AttributeValue)null);
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
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__ATTRIBUTE:
				return attribute != null;
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__VALUE:
				return value != null;
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT__NEW_VALUE:
				return new_value != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Object toProlog(String type,String variableName, String entityName) {
		StringBuilder str = new StringBuilder();
		str.append(type);
		str.append("(");
		str.append("HAN_"+variableName);
		str.append(",'");
		str.append(entityName);
		str.append("','");
		str.append(attribute.getId());
		str.append("',");
		str.append(value.toProlog1());
		if(new_value!=null){
			str.append(",");
			str.append(new_value.toProlog1());
		}
		 str.append(")");
		 return str.toString();
	}

	@Override
	public String toPrologExecution() {
		StringBuilder str = new StringBuilder();
		str.append("['");
		str.append(attribute.getId());
		str.append("',");
		str.append(value.toProlog1());
		str.append("]");
		return str.toString();
	}

} //AttributeValueAssignmentImpl
