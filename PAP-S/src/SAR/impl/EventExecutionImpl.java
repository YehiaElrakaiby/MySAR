/**
 */
package SAR.impl;

import SAR.AttributeAssignmentExpression;
import SAR.EventExecution;
import SAR.Execution;
import SAR.ExecutionType;
import SAR.SARPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.EventExecutionImpl#getExecution <em>Execution</em>}</li>
 *   <li>{@link SAR.impl.EventExecutionImpl#getAttributes_assignment <em>Attributes assignment</em>}</li>
 *   <li>{@link SAR.impl.EventExecutionImpl#getExecution_type <em>Execution type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventExecutionImpl extends ExecutionExpressionImpl implements EventExecution {
	/**
	 * The cached value of the '{@link #getExecution() <em>Execution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected Execution execution;

	/**
	 * The cached value of the '{@link #getAttributes_assignment() <em>Attributes assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes_assignment()
	 * @generated
	 * @ordered
	 */
	protected AttributeAssignmentExpression attributes_assignment;

	/**
	 * The default value of the '{@link #getExecution_type() <em>Execution type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution_type()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutionType EXECUTION_TYPE_EDEFAULT = ExecutionType.MANDATORY;

	/**
	 * The cached value of the '{@link #getExecution_type() <em>Execution type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution_type()
	 * @generated
	 * @ordered
	 */
	protected ExecutionType execution_type = EXECUTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.EVENT_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution getExecution() {
		if (execution != null && execution.eIsProxy()) {
			InternalEObject oldExecution = (InternalEObject)execution;
			execution = (Execution)eResolveProxy(oldExecution);
			if (execution != oldExecution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SARPackage.EVENT_EXECUTION__EXECUTION, oldExecution, execution));
			}
		}
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution basicGetExecution() {
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecution(Execution newExecution) {
		Execution oldExecution = execution;
		execution = newExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.EVENT_EXECUTION__EXECUTION, oldExecution, execution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignmentExpression getAttributes_assignment() {
		return attributes_assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes_assignment(AttributeAssignmentExpression newAttributes_assignment, NotificationChain msgs) {
		AttributeAssignmentExpression oldAttributes_assignment = attributes_assignment;
		attributes_assignment = newAttributes_assignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.EVENT_EXECUTION__ATTRIBUTES_ASSIGNMENT, oldAttributes_assignment, newAttributes_assignment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes_assignment(AttributeAssignmentExpression newAttributes_assignment) {
		if (newAttributes_assignment != attributes_assignment) {
			NotificationChain msgs = null;
			if (attributes_assignment != null)
				msgs = ((InternalEObject)attributes_assignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.EVENT_EXECUTION__ATTRIBUTES_ASSIGNMENT, null, msgs);
			if (newAttributes_assignment != null)
				msgs = ((InternalEObject)newAttributes_assignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.EVENT_EXECUTION__ATTRIBUTES_ASSIGNMENT, null, msgs);
			msgs = basicSetAttributes_assignment(newAttributes_assignment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.EVENT_EXECUTION__ATTRIBUTES_ASSIGNMENT, newAttributes_assignment, newAttributes_assignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionType getExecution_type() {
		return execution_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecution_type(ExecutionType newExecution_type) {
		ExecutionType oldExecution_type = execution_type;
		execution_type = newExecution_type == null ? EXECUTION_TYPE_EDEFAULT : newExecution_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.EVENT_EXECUTION__EXECUTION_TYPE, oldExecution_type, execution_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.EVENT_EXECUTION__ATTRIBUTES_ASSIGNMENT:
				return basicSetAttributes_assignment(null, msgs);
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
			case SARPackage.EVENT_EXECUTION__EXECUTION:
				if (resolve) return getExecution();
				return basicGetExecution();
			case SARPackage.EVENT_EXECUTION__ATTRIBUTES_ASSIGNMENT:
				return getAttributes_assignment();
			case SARPackage.EVENT_EXECUTION__EXECUTION_TYPE:
				return getExecution_type();
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
			case SARPackage.EVENT_EXECUTION__EXECUTION:
				setExecution((Execution)newValue);
				return;
			case SARPackage.EVENT_EXECUTION__ATTRIBUTES_ASSIGNMENT:
				setAttributes_assignment((AttributeAssignmentExpression)newValue);
				return;
			case SARPackage.EVENT_EXECUTION__EXECUTION_TYPE:
				setExecution_type((ExecutionType)newValue);
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
			case SARPackage.EVENT_EXECUTION__EXECUTION:
				setExecution((Execution)null);
				return;
			case SARPackage.EVENT_EXECUTION__ATTRIBUTES_ASSIGNMENT:
				setAttributes_assignment((AttributeAssignmentExpression)null);
				return;
			case SARPackage.EVENT_EXECUTION__EXECUTION_TYPE:
				setExecution_type(EXECUTION_TYPE_EDEFAULT);
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
			case SARPackage.EVENT_EXECUTION__EXECUTION:
				return execution != null;
			case SARPackage.EVENT_EXECUTION__ATTRIBUTES_ASSIGNMENT:
				return attributes_assignment != null;
			case SARPackage.EVENT_EXECUTION__EXECUTION_TYPE:
				return execution_type != EXECUTION_TYPE_EDEFAULT;
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
		result.append(" (execution_type: ");
		result.append(execution_type);
		result.append(')');
		return result.toString();
	}

	@Override
	public String toProlog() {
		StringBuilder str = new StringBuilder();
		if(execution_type.getLiteral().equalsIgnoreCase("must_execute")){
			str.append("must_execute");
		} else {
			str.append("execute");
		}
		str.append("(");
		str.append("'");
		str.append(execution.getId());
		str.append("'");
		str.append(",");
		str.append("[");
		if(attributes_assignment!=null) {
			str.append(attributes_assignment.toPrologExecution());
		}
		str.append("]");

		str.append(")");
		return str.toString();
	}
} //EventExecutionImpl
