/**
 */
package SAR.impl;

import SAR.EventAttribute;
import SAR.EventDeclaration;
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
 * An implementation of the model object '<em><b>Event Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.EventDeclarationImpl#getEvent_attributes <em>Event attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EventDeclarationImpl extends ObjectDeclarationImpl implements EventDeclaration {
	/**
	 * The cached value of the '{@link #getEvent_attributes() <em>Event attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent_attributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EventAttribute> event_attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.EVENT_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventAttribute> getEvent_attributes() {
		if (event_attributes == null) {
			event_attributes = new EObjectContainmentEList<EventAttribute>(EventAttribute.class, this, SARPackage.EVENT_DECLARATION__EVENT_ATTRIBUTES);
		}
		return event_attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SARPackage.EVENT_DECLARATION__EVENT_ATTRIBUTES:
				return ((InternalEList<?>)getEvent_attributes()).basicRemove(otherEnd, msgs);
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
			case SARPackage.EVENT_DECLARATION__EVENT_ATTRIBUTES:
				return getEvent_attributes();
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
			case SARPackage.EVENT_DECLARATION__EVENT_ATTRIBUTES:
				getEvent_attributes().clear();
				getEvent_attributes().addAll((Collection<? extends EventAttribute>)newValue);
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
			case SARPackage.EVENT_DECLARATION__EVENT_ATTRIBUTES:
				getEvent_attributes().clear();
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
			case SARPackage.EVENT_DECLARATION__EVENT_ATTRIBUTES:
				return event_attributes != null && !event_attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventDeclarationImpl
