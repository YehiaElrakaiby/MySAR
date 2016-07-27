/**
 */
package SAR.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import SAR.ConditionExpression;
import SAR.ParenthesizedCE;
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
 * An implementation of the model object '<em><b>Parenthesized CE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.ParenthesizedCEImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParenthesizedCEImpl extends ConditionExpressionImpl implements ParenthesizedCE {
	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected ConditionExpression op;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParenthesizedCEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.PARENTHESIZED_CE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionExpression getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp(ConditionExpression newOp, NotificationChain msgs) {
		ConditionExpression oldOp = op;
		op = newOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.PARENTHESIZED_CE__OP, oldOp, newOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(ConditionExpression newOp) {
		if (newOp != op) {
			NotificationChain msgs = null;
			if (op != null)
				msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.PARENTHESIZED_CE__OP, null, msgs);
			if (newOp != null)
				msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.PARENTHESIZED_CE__OP, null, msgs);
			msgs = basicSetOp(newOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.PARENTHESIZED_CE__OP, newOp, newOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.PARENTHESIZED_CE__OP:
				return basicSetOp(null, msgs);
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
			case SARPackage.PARENTHESIZED_CE__OP:
				return getOp();
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
			case SARPackage.PARENTHESIZED_CE__OP:
				setOp((ConditionExpression)newValue);
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
			case SARPackage.PARENTHESIZED_CE__OP:
				setOp((ConditionExpression)null);
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
			case SARPackage.PARENTHESIZED_CE__OP:
				return op != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Object toProlog() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		str.append("'()'");
		str.append(",");
		str.append(op.toProlog());
		str.append("]");
		
		
		
		return str.toString();
	}

	@Override
	public void getVariables(HashSet<String> variables) {
		op.getVariables(variables);
		
	}

	@Override
	public void getTrigger(ArrayList<String> triggers, EList<PredicateDefinition> predicate_definitions, HashMap<String, String> map) {
		op.getTrigger(triggers, predicate_definitions, map);
	}

	@Override
	public void getDependencies(ArrayList<String> dependencies, EList<PredicateDefinition> predicate_definitions,
			HashMap<String, String> map) {
		op.getDependencies(dependencies, predicate_definitions, map);
		
	}

} //ParenthesizedCEImpl
