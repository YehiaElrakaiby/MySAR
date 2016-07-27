/**
 */
package SAR.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import SAR.Calendar;
import SAR.Delay;
import SAR.PredicateDefinition;
import SAR.SARPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SAR.impl.DelayImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link SAR.impl.DelayImpl#getCalendar <em>Calendar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelayImpl extends ConditionExpressionImpl implements Delay {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final int UNIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected int unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalendar() <em>Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendar()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar CALENDAR_EDEFAULT = Calendar.DAYS;

	/**
	 * The cached value of the '{@link #getCalendar() <em>Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendar()
	 * @generated
	 * @ordered
	 */
	protected Calendar calendar = CALENDAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SARPackage.Literals.DELAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(int newUnit) {
		int oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.DELAY__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getCalendar() {
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalendar(Calendar newCalendar) {
		Calendar oldCalendar = calendar;
		calendar = newCalendar == null ? CALENDAR_EDEFAULT : newCalendar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SARPackage.DELAY__CALENDAR, oldCalendar, calendar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SARPackage.DELAY__UNIT:
				return getUnit();
			case SARPackage.DELAY__CALENDAR:
				return getCalendar();
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
			case SARPackage.DELAY__UNIT:
				setUnit((Integer)newValue);
				return;
			case SARPackage.DELAY__CALENDAR:
				setCalendar((Calendar)newValue);
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
			case SARPackage.DELAY__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case SARPackage.DELAY__CALENDAR:
				setCalendar(CALENDAR_EDEFAULT);
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
			case SARPackage.DELAY__UNIT:
				return unit != UNIT_EDEFAULT;
			case SARPackage.DELAY__CALENDAR:
				return calendar != CALENDAR_EDEFAULT;
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
		result.append(" (unit: ");
		result.append(unit);
		result.append(", calendar: ");
		result.append(calendar);
		result.append(')');
		return result.toString();
	}

	@Override
	public Object toProlog() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		str.append("'delay'");
		str.append(",");
		
		str.append("delay(");
		str.append(getUnit());
		str.append(",");
		str.append("'"+getCalendar().getLiteral()+"'");
		str.append(")");
		str.append("]");
		return str.toString();
	}

	@Override
	public void getVariables(HashSet<String> variables) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTrigger(ArrayList<String> triggers, EList<PredicateDefinition> predicate_definitions, HashMap<String, String> map) {
		triggers.add("[[X,'sar_id','=:=','clock']]");
		
	}
	
	@Override
	public void getDependencies(ArrayList<String> dependencies, EList<PredicateDefinition> predicate_definitions,
			HashMap<String, String> map) {
		dependencies.add("[[HAN_system_0,'sar_id','=:=','system'],[HAN_system_0,'clock','=:=',Time]]");
	}


} //DelayImpl
