/**
 */
package SAR.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import SAR.BinaryOperator;
import SAR.ComposedCE;
import SAR.ConditionExpression;
import SAR.PredicateDefinition;
import SAR.SARPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composed CE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.ComposedCEImpl#getBinaryOperator <em>Binary Operator</em>}</li>
 *   <li>{@link SAR.impl.ComposedCEImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link SAR.impl.ComposedCEImpl#getLhs <em>Lhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposedCEImpl extends ConditionExpressionImpl implements ComposedCE {
	/**
	 * The default value of the '{@link #getBinaryOperator() <em>Binary Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryOperator BINARY_OPERATOR_EDEFAULT = BinaryOperator.CONJUNCTION;

	/**
	 * The cached value of the '{@link #getBinaryOperator() <em>Binary Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryOperator()
	 * @generated
	 * @ordered
	 */
	protected BinaryOperator binaryOperator = BINARY_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected ConditionExpression rhs;

	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected ConditionExpression lhs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedCEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.COMPOSED_CE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator getBinaryOperator() {
		return binaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryOperator(BinaryOperator newBinaryOperator) {
		BinaryOperator oldBinaryOperator = binaryOperator;
		binaryOperator = newBinaryOperator == null ? BINARY_OPERATOR_EDEFAULT : newBinaryOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.COMPOSED_CE__BINARY_OPERATOR, oldBinaryOperator, binaryOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionExpression getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(ConditionExpression newRhs, NotificationChain msgs) {
		ConditionExpression oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.COMPOSED_CE__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(ConditionExpression newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.COMPOSED_CE__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.COMPOSED_CE__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.COMPOSED_CE__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionExpression getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(ConditionExpression newLhs, NotificationChain msgs) {
		ConditionExpression oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.COMPOSED_CE__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(ConditionExpression newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.COMPOSED_CE__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.COMPOSED_CE__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.COMPOSED_CE__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.COMPOSED_CE__RHS:
				return basicSetRhs(null, msgs);
			case SARPackage.COMPOSED_CE__LHS:
				return basicSetLhs(null, msgs);
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
			case SARPackage.COMPOSED_CE__BINARY_OPERATOR:
				return getBinaryOperator();
			case SARPackage.COMPOSED_CE__RHS:
				return getRhs();
			case SARPackage.COMPOSED_CE__LHS:
				return getLhs();
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
			case SARPackage.COMPOSED_CE__BINARY_OPERATOR:
				setBinaryOperator((BinaryOperator)newValue);
				return;
			case SARPackage.COMPOSED_CE__RHS:
				setRhs((ConditionExpression)newValue);
				return;
			case SARPackage.COMPOSED_CE__LHS:
				setLhs((ConditionExpression)newValue);
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
			case SARPackage.COMPOSED_CE__BINARY_OPERATOR:
				setBinaryOperator(BINARY_OPERATOR_EDEFAULT);
				return;
			case SARPackage.COMPOSED_CE__RHS:
				setRhs((ConditionExpression)null);
				return;
			case SARPackage.COMPOSED_CE__LHS:
				setLhs((ConditionExpression)null);
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
			case SARPackage.COMPOSED_CE__BINARY_OPERATOR:
				return binaryOperator != BINARY_OPERATOR_EDEFAULT;
			case SARPackage.COMPOSED_CE__RHS:
				return rhs != null;
			case SARPackage.COMPOSED_CE__LHS:
				return lhs != null;
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
		result.append(" (binaryOperator: ");
		result.append(binaryOperator);
		result.append(')');
		return result.toString();
	}

	@Override
	public Object toProlog() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		str.append(binaryOperator.toProlog());
		str.append(",");
		str.append(lhs.toProlog());
		str.append(",");
		str.append(rhs.toProlog());
		str.append("]");
		
		
		
		return str.toString();
	}

	@Override
	public void getVariables(HashSet<String> variables) {
		lhs.getVariables(variables);
		rhs.getVariables(variables);
		
	}

	@Override
	public void getTrigger(ArrayList<String> triggers, EList<PredicateDefinition> predicate_definitions, HashMap<String, String> map) {
		lhs.getTrigger(triggers,predicate_definitions,map);
		rhs.getTrigger(triggers,predicate_definitions,map);
	}
	
	@Override
	public void getDependencies(ArrayList<String> dependencies, EList<PredicateDefinition> predicate_definitions,
			HashMap<String, String> map) {
		lhs.getDependencies(dependencies, predicate_definitions, map);
		rhs.getDependencies(dependencies, predicate_definitions, map);

	}

} //ComposedCEImpl
