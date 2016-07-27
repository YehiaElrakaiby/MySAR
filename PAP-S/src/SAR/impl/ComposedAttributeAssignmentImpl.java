/**
 */
package SAR.impl;

import SAR.AttributeAssignmentExpression;
import SAR.ComposedAttributeAssignment;
import SAR.SARPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composed Attribute Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.ComposedAttributeAssignmentImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link SAR.impl.ComposedAttributeAssignmentImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposedAttributeAssignmentImpl extends AttributeAssignmentExpressionImpl implements ComposedAttributeAssignment {
	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected AttributeAssignmentExpression lhs;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected AttributeAssignmentExpression rhs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAttributeAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.COMPOSED_ATTRIBUTE_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignmentExpression getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(AttributeAssignmentExpression newLhs, NotificationChain msgs) {
		AttributeAssignmentExpression oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(AttributeAssignmentExpression newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignmentExpression getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(AttributeAssignmentExpression newRhs, NotificationChain msgs) {
		AttributeAssignmentExpression oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(AttributeAssignmentExpression newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__LHS:
				return basicSetLhs(null, msgs);
			case SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__RHS:
				return basicSetRhs(null, msgs);
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
			case SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__LHS:
				return getLhs();
			case SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__RHS:
				return getRhs();
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
			case SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__LHS:
				setLhs((AttributeAssignmentExpression)newValue);
				return;
			case SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__RHS:
				setRhs((AttributeAssignmentExpression)newValue);
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
			case SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__LHS:
				setLhs((AttributeAssignmentExpression)null);
				return;
			case SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__RHS:
				setRhs((AttributeAssignmentExpression)null);
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
			case SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__LHS:
				return lhs != null;
			case SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT__RHS:
				return rhs != null;
		}
		return super.eIsSet(featureID);
	}


	@Override
	public Object toProlog(String type, String variableName, String entityName) {
		StringBuilder str = new StringBuilder();
		str.append("[");
		str.append("'followedBy'");
		str.append(",");
		str.append(lhs.toProlog(type,variableName, entityName));
		str.append(",");
		str.append(rhs.toProlog(type,variableName, entityName));
		str.append("]");



		return str.toString();
	}


	@Override
	public String toPrologExecution() {
		StringBuilder str = new StringBuilder();
		str.append(lhs.toPrologExecution());
		str.append(",");
		str.append(rhs.toPrologExecution());
		return str.toString();
	}

} //ComposedAttributeAssignmentImpl
