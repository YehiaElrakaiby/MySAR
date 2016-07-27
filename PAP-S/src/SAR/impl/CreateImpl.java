/**
 */
package SAR.impl;

import SAR.AttributeAssignmentExpression;
import SAR.Create;
import SAR.EntityDeclaration;
import SAR.SARPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.CreateImpl#getAttributes_assignment <em>Attributes assignment</em>}</li>
 *   <li>{@link SAR.impl.CreateImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateImpl extends UpdateObjectImpl implements Create {
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
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EntityDeclaration entity;

	static Integer fact_id = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.CREATE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SARPackage.CREATE__ATTRIBUTES_ASSIGNMENT, oldAttributes_assignment, newAttributes_assignment);
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
				msgs = ((InternalEObject)attributes_assignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SARPackage.CREATE__ATTRIBUTES_ASSIGNMENT, null, msgs);
			if (newAttributes_assignment != null)
				msgs = ((InternalEObject)newAttributes_assignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SARPackage.CREATE__ATTRIBUTES_ASSIGNMENT, null, msgs);
			msgs = basicSetAttributes_assignment(newAttributes_assignment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.CREATE__ATTRIBUTES_ASSIGNMENT, newAttributes_assignment, newAttributes_assignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityDeclaration getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (EntityDeclaration)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SARPackage.CREATE__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityDeclaration basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(EntityDeclaration newEntity) {
		EntityDeclaration oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.CREATE__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.CREATE__ATTRIBUTES_ASSIGNMENT:
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
			case SARPackage.CREATE__ATTRIBUTES_ASSIGNMENT:
				return getAttributes_assignment();
			case SARPackage.CREATE__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
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
			case SARPackage.CREATE__ATTRIBUTES_ASSIGNMENT:
				setAttributes_assignment((AttributeAssignmentExpression)newValue);
				return;
			case SARPackage.CREATE__ENTITY:
				setEntity((EntityDeclaration)newValue);
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
			case SARPackage.CREATE__ATTRIBUTES_ASSIGNMENT:
				setAttributes_assignment((AttributeAssignmentExpression)null);
				return;
			case SARPackage.CREATE__ENTITY:
				setEntity((EntityDeclaration)null);
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
			case SARPackage.CREATE__ATTRIBUTES_ASSIGNMENT:
				return attributes_assignment != null;
			case SARPackage.CREATE__ENTITY:
				return entity != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Object toProlog() {
		StringBuilder str = new StringBuilder();
		String variableName = "OBJ" + fact_id++;
		String entityName = "'"+entity.getId() +"'";
		if(attributes_assignment==null) {
			str.append("create(HAN_" + variableName + ","+entityName +")");
		} else{
			str.append("[");
			str.append("followedBy");
			str.append(",");
			str.append("create(HAN_" + variableName + ","+entityName +")");
			str.append(",");
			str.append(attributes_assignment.toProlog("add",variableName, entity.getId()));
			str.append("]");}
		return str.toString();
	}

} //CreateImpl
