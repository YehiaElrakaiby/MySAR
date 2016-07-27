/**
 */
package SAR;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SAR.AbstractCondition#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link SAR.AbstractCondition#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see SAR.SARPackage#getAbstractCondition()
 * @model
 * @generated
 */
public interface AbstractCondition extends ConditionExpression {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' reference.
	 * @see #setPredicate(Predicate)
	 * @see SAR.SARPackage#getAbstractCondition_Predicate()
	 * @model required="true"
	 * @generated
	 */
	Predicate getPredicate();

	/**
	 * Sets the value of the '{@link SAR.AbstractCondition#getPredicate <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Predicate value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParenthesizedValue)
	 * @see SAR.SARPackage#getAbstractCondition_Parameters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ParenthesizedValue getParameters();

	/**
	 * Sets the value of the '{@link SAR.AbstractCondition#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(ParenthesizedValue value);

} // AbstractCondition
