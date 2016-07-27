/**
 */
package SAR.impl;

import java.util.HashMap;
import java.util.HashSet;

import SAR.ArithmeticExpression;
import SAR.ArithmeticOperation;
import SAR.ArithmeticOperator;
import SAR.SARPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arithmetic Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.ArithmeticOperationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link SAR.impl.ArithmeticOperationImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link SAR.impl.ArithmeticOperationImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArithmeticOperationImpl extends ArithmeticExpressionImpl implements ArithmeticOperation {
	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final ArithmeticOperator OPERATION_EDEFAULT = ArithmeticOperator.ADDITION;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected ArithmeticOperator operation = OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected ArithmeticExpression lhs;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected ArithmeticExpression rhs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.ARITHMETIC_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperator getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(ArithmeticOperator newOperation) {
		ArithmeticOperator oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ARITHMETIC_OPERATION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticExpression getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(ArithmeticExpression newLhs, NotificationChain msgs) {
		ArithmeticExpression oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.ARITHMETIC_OPERATION__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(ArithmeticExpression newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.ARITHMETIC_OPERATION__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.ARITHMETIC_OPERATION__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ARITHMETIC_OPERATION__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticExpression getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(ArithmeticExpression newRhs, NotificationChain msgs) {
		ArithmeticExpression oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.ARITHMETIC_OPERATION__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(ArithmeticExpression newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.ARITHMETIC_OPERATION__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.ARITHMETIC_OPERATION__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.ARITHMETIC_OPERATION__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.ARITHMETIC_OPERATION__LHS:
				return basicSetLhs(null, msgs);
			case SARPackage.ARITHMETIC_OPERATION__RHS:
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
			case SARPackage.ARITHMETIC_OPERATION__OPERATION:
				return getOperation();
			case SARPackage.ARITHMETIC_OPERATION__LHS:
				return getLhs();
			case SARPackage.ARITHMETIC_OPERATION__RHS:
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
			case SARPackage.ARITHMETIC_OPERATION__OPERATION:
				setOperation((ArithmeticOperator)newValue);
				return;
			case SARPackage.ARITHMETIC_OPERATION__LHS:
				setLhs((ArithmeticExpression)newValue);
				return;
			case SARPackage.ARITHMETIC_OPERATION__RHS:
				setRhs((ArithmeticExpression)newValue);
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
			case SARPackage.ARITHMETIC_OPERATION__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case SARPackage.ARITHMETIC_OPERATION__LHS:
				setLhs((ArithmeticExpression)null);
				return;
			case SARPackage.ARITHMETIC_OPERATION__RHS:
				setRhs((ArithmeticExpression)null);
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
			case SARPackage.ARITHMETIC_OPERATION__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case SARPackage.ARITHMETIC_OPERATION__LHS:
				return lhs != null;
			case SARPackage.ARITHMETIC_OPERATION__RHS:
				return rhs != null;
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
		result.append(" (operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

	@Override
	public String toProlog() {
		StringBuilder str = new StringBuilder();
		str.append("(");
		str.append(lhs.toProlog());
		str.append(operation.toProlog());
		str.append(rhs.toProlog());
		str.append(")");

		return str.toString();
	}

	@Override
	public void getVariables(HashSet<String> variables) {
		lhs.getVariables(variables);
		
		
	}

	@Override
	public String toProlog1() {
		StringBuilder str = new StringBuilder();
		str.append(operation.toProlog1());
		str.append("(");
		str.append(lhs.toProlog1());
		str.append(",");
		str.append(rhs.toProlog1());
		str.append(")");

		return str.toString();
	}

	@Override
	public String toProlog(HashMap<String, String> map) {
		StringBuilder str = new StringBuilder();
		str.append("(");
		str.append(lhs.toProlog(map));
		str.append(operation.toProlog());
		str.append(rhs.toProlog(map));
		str.append(")");

		return str.toString();
	}

} //ArithmeticOperationImpl
