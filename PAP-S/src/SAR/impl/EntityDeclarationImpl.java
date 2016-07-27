/**
 */
package SAR.impl;

import SAR.EntityAttribute;
import SAR.EntityDeclaration;
import SAR.SARPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.EntityDeclarationImpl#getEntity_attributes <em>Entity attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityDeclarationImpl extends ObjectDeclarationImpl implements EntityDeclaration {
	/**
	 * The cached value of the '{@link #getEntity_attributes() <em>Entity attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity_attributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityAttribute> entity_attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.ENTITY_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityAttribute> getEntity_attributes() {
		if (entity_attributes == null) {
			entity_attributes = new EObjectContainmentEList<EntityAttribute>(EntityAttribute.class, this, SARPackage.ENTITY_DECLARATION__ENTITY_ATTRIBUTES);
		}
		return entity_attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.ENTITY_DECLARATION__ENTITY_ATTRIBUTES:
				return ((InternalEList<?>)getEntity_attributes()).basicRemove(otherEnd, msgs);
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
			case SARPackage.ENTITY_DECLARATION__ENTITY_ATTRIBUTES:
				return getEntity_attributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SARPackage.ENTITY_DECLARATION__ENTITY_ATTRIBUTES:
				getEntity_attributes().clear();
				getEntity_attributes().addAll((Collection<? extends EntityAttribute>)newValue);
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
			case SARPackage.ENTITY_DECLARATION__ENTITY_ATTRIBUTES:
				getEntity_attributes().clear();
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
			case SARPackage.ENTITY_DECLARATION__ENTITY_ATTRIBUTES:
				return entity_attributes != null && !entity_attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String toProlog() {
		StringBuilder str= new StringBuilder();
		for(EntityAttribute entity_attribute:entity_attributes) {
			str.append(entity_attribute.toPrologMeta(this.id));
		}
		return str.toString();
	}

} //EntityDeclarationImpl
