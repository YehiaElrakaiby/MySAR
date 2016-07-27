/**
 */
package SAR;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Policy Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SAR.SARPackage#getPolicyType()
 * @model
 * @generated
 */
public enum PolicyType implements Enumerator {
	/**
	 * The '<em><b>Open</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN(0, "Open", "open"),

	/**
	 * The '<em><b>Closed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED(1, "Closed", "closed"),

	/**
	 * The '<em><b>Explicit Permit Overrides</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT_PERMIT_OVERRIDES_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLICIT_PERMIT_OVERRIDES(2, "ExplicitPermitOverrides", "explicit_permit_overrides"),

	/**
	 * The '<em><b>Explicit Deny Overrides</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT_DENY_OVERRIDES_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLICIT_DENY_OVERRIDES(3, "ExplicitDenyOverrides", "explicit_deny_ovderrides");

	/**
	 * The '<em><b>Open</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN
	 * @model name="Open" literal="open"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_VALUE = 0;

	/**
	 * The '<em><b>Closed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Closed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOSED
	 * @model name="Closed" literal="closed"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_VALUE = 1;

	/**
	 * The '<em><b>Explicit Permit Overrides</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Explicit Permit Overrides</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT_PERMIT_OVERRIDES
	 * @model name="ExplicitPermitOverrides" literal="explicit_permit_overrides"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLICIT_PERMIT_OVERRIDES_VALUE = 2;

	/**
	 * The '<em><b>Explicit Deny Overrides</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Explicit Deny Overrides</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT_DENY_OVERRIDES
	 * @model name="ExplicitDenyOverrides" literal="explicit_deny_ovderrides"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLICIT_DENY_OVERRIDES_VALUE = 3;

	/**
	 * An array of all the '<em><b>Policy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PolicyType[] VALUES_ARRAY =
		new PolicyType[] {
			OPEN,
			CLOSED,
			EXPLICIT_PERMIT_OVERRIDES,
			EXPLICIT_DENY_OVERRIDES,
		};

	/**
	 * A public read-only list of all the '<em><b>Policy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PolicyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Policy Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PolicyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PolicyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Policy Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PolicyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PolicyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Policy Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PolicyType get(int value) {
		switch (value) {
			case OPEN_VALUE: return OPEN;
			case CLOSED_VALUE: return CLOSED;
			case EXPLICIT_PERMIT_OVERRIDES_VALUE: return EXPLICIT_PERMIT_OVERRIDES;
			case EXPLICIT_DENY_OVERRIDES_VALUE: return EXPLICIT_DENY_OVERRIDES;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PolicyType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

	public Object toProlog() {
		
		return "'"+getLiteral()+"'";
	}
	
} //PolicyType
