/**
 */
package SAR.impl;

import SAR.EventDeclaration;
import SAR.EventReference;
import SAR.SARPackage;

import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.EventReferenceImpl#getEvent_id <em>Event id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventReferenceImpl extends MinimalEObjectImpl.Container implements EventReference {
	/**
	 * The cached value of the '{@link #getEvent_id() <em>Event id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent_id()
	 * @generated
	 * @ordered
	 */
	protected EventDeclaration event_id;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.EVENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDeclaration getEvent_id() {
		if (event_id != null && event_id.eIsProxy()) {
			InternalEObject oldEvent_id = (InternalEObject)event_id;
			event_id = (EventDeclaration)eResolveProxy(oldEvent_id);
			if (event_id != oldEvent_id) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SARPackage.EVENT_REFERENCE__EVENT_ID, oldEvent_id, event_id));
			}
		}
		return event_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDeclaration basicGetEvent_id() {
		return event_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent_id(EventDeclaration newEvent_id) {
		EventDeclaration oldEvent_id = event_id;
		event_id = newEvent_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.EVENT_REFERENCE__EVENT_ID, oldEvent_id, event_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SARPackage.EVENT_REFERENCE__EVENT_ID:
				if (resolve) return getEvent_id();
				return basicGetEvent_id();
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
			case SARPackage.EVENT_REFERENCE__EVENT_ID:
				setEvent_id((EventDeclaration)newValue);
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
			case SARPackage.EVENT_REFERENCE__EVENT_ID:
				setEvent_id((EventDeclaration)null);
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
			case SARPackage.EVENT_REFERENCE__EVENT_ID:
				return event_id != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toProlog() {
		StringBuilder str = new StringBuilder();
		str.append(this.event_id.getId());
		return str.toString();
	}

	@Override
	public void getVariables(HashSet<String> variables) {
		variables.add("HAN_"+this.toProlog());		
	}

} //EventReferenceImpl
