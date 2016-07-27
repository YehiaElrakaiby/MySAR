/**
 */
package SAR;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SAR.SARPackage
 * @generated
 */
public interface SARFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SARFactory eINSTANCE = SAR.impl.SARFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Security Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Configuration</em>'.
	 * @generated
	 */
	SecurityConfiguration createSecurityConfiguration();

	/**
	 * Returns a new object of class '<em>Monitoring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitoring</em>'.
	 * @generated
	 */
	Monitoring createMonitoring();

	/**
	 * Returns a new object of class '<em>Interception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interception</em>'.
	 * @generated
	 */
	Interception createInterception();

	/**
	 * Returns a new object of class '<em>Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution</em>'.
	 * @generated
	 */
	Execution createExecution();

	/**
	 * Returns a new object of class '<em>Event Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Attribute</em>'.
	 * @generated
	 */
	EventAttribute createEventAttribute();

	/**
	 * Returns a new object of class '<em>Entity Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Declaration</em>'.
	 * @generated
	 */
	EntityDeclaration createEntityDeclaration();

	/**
	 * Returns a new object of class '<em>Entity Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Attribute</em>'.
	 * @generated
	 */
	EntityAttribute createEntityAttribute();

	/**
	 * Returns a new object of class '<em>State Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Condition</em>'.
	 * @generated
	 */
	StateCondition createStateCondition();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>SR Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SR Boolean</em>'.
	 * @generated
	 */
	SRBoolean createSRBoolean();

	/**
	 * Returns a new object of class '<em>Concrete Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Arithmetic Expression</em>'.
	 * @generated
	 */
	ConcreteArithmeticExpression createConcreteArithmeticExpression();

	/**
	 * Returns a new object of class '<em>SR Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SR Integer</em>'.
	 * @generated
	 */
	SRInteger createSRInteger();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>SR Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SR Float</em>'.
	 * @generated
	 */
	SRFloat createSRFloat();

	/**
	 * Returns a new object of class '<em>Arithmetic Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Operation</em>'.
	 * @generated
	 */
	ArithmeticOperation createArithmeticOperation();

	/**
	 * Returns a new object of class '<em>Attribute Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Condition</em>'.
	 * @generated
	 */
	AttributeCondition createAttributeCondition();

	/**
	 * Returns a new object of class '<em>Negated CE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negated CE</em>'.
	 * @generated
	 */
	NegatedCE createNegatedCE();

	/**
	 * Returns a new object of class '<em>Composed CE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composed CE</em>'.
	 * @generated
	 */
	ComposedCE createComposedCE();

	/**
	 * Returns a new object of class '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate</em>'.
	 * @generated
	 */
	Predicate createPredicate();

	/**
	 * Returns a new object of class '<em>Abstract Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Condition</em>'.
	 * @generated
	 */
	AbstractCondition createAbstractCondition();

	/**
	 * Returns a new object of class '<em>Predicate Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Definition</em>'.
	 * @generated
	 */
	PredicateDefinition createPredicateDefinition();

	/**
	 * Returns a new object of class '<em>Arithmetic Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Comparison</em>'.
	 * @generated
	 */
	ArithmeticComparison createArithmeticComparison();

	/**
	 * Returns a new object of class '<em>Parenthesized CE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parenthesized CE</em>'.
	 * @generated
	 */
	ParenthesizedCE createParenthesizedCE();

	/**
	 * Returns a new object of class '<em>Event Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Execution</em>'.
	 * @generated
	 */
	EventExecution createEventExecution();

	/**
	 * Returns a new object of class '<em>Composed Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composed Update</em>'.
	 * @generated
	 */
	ComposedUpdate createComposedUpdate();

	/**
	 * Returns a new object of class '<em>Parenthesized Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parenthesized Update</em>'.
	 * @generated
	 */
	ParenthesizedUpdate createParenthesizedUpdate();

	/**
	 * Returns a new object of class '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete</em>'.
	 * @generated
	 */
	Delete createDelete();

	/**
	 * Returns a new object of class '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update</em>'.
	 * @generated
	 */
	Update createUpdate();

	/**
	 * Returns a new object of class '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add</em>'.
	 * @generated
	 */
	Add createAdd();

	/**
	 * Returns a new object of class '<em>Pre Update Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Update Rule</em>'.
	 * @generated
	 */
	PreUpdateRule createPreUpdateRule();

	/**
	 * Returns a new object of class '<em>Post Update Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Post Update Rule</em>'.
	 * @generated
	 */
	PostUpdateRule createPostUpdateRule();

	/**
	 * Returns a new object of class '<em>SR String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SR String</em>'.
	 * @generated
	 */
	SRString createSRString();

	/**
	 * Returns a new object of class '<em>Security Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Policy</em>'.
	 * @generated
	 */
	SecurityPolicy createSecurityPolicy();

	/**
	 * Returns a new object of class '<em>Access Control Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Control Rule</em>'.
	 * @generated
	 */
	AccessControlRule createAccessControlRule();

	/**
	 * Returns a new object of class '<em>Obligation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obligation Rule</em>'.
	 * @generated
	 */
	ObligationRule createObligationRule();

	/**
	 * Returns a new object of class '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay</em>'.
	 * @generated
	 */
	Delay createDelay();

	/**
	 * Returns a new object of class '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create</em>'.
	 * @generated
	 */
	Create createCreate();

	/**
	 * Returns a new object of class '<em>Remove</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove</em>'.
	 * @generated
	 */
	Remove createRemove();

	/**
	 * Returns a new object of class '<em>Attribute Value Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Assignment</em>'.
	 * @generated
	 */
	AttributeValueAssignment createAttributeValueAssignment();

	/**
	 * Returns a new object of class '<em>Composed Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composed Value</em>'.
	 * @generated
	 */
	ComposedValue createComposedValue();

	/**
	 * Returns a new object of class '<em>Composed Attribute Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composed Attribute Condition</em>'.
	 * @generated
	 */
	ComposedAttributeCondition createComposedAttributeCondition();

	/**
	 * Returns a new object of class '<em>Composed Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composed Attribute Assignment</em>'.
	 * @generated
	 */
	ComposedAttributeAssignment createComposedAttributeAssignment();

	/**
	 * Returns a new object of class '<em>Simple Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Attribute Type</em>'.
	 * @generated
	 */
	SimpleAttributeType createSimpleAttributeType();

	/**
	 * Returns a new object of class '<em>List Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Attribute Type</em>'.
	 * @generated
	 */
	ListAttributeType createListAttributeType();

	/**
	 * Returns a new object of class '<em>Bracketed Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bracketed Value</em>'.
	 * @generated
	 */
	BracketedValue createBracketedValue();

	/**
	 * Returns a new object of class '<em>Concrete Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Value</em>'.
	 * @generated
	 */
	ConcreteValue createConcreteValue();

	/**
	 * Returns a new object of class '<em>Parenthesized Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parenthesized Value</em>'.
	 * @generated
	 */
	ParenthesizedValue createParenthesizedValue();

	/**
	 * Returns a new object of class '<em>Entityt Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entityt Reference</em>'.
	 * @generated
	 */
	EntitytReference createEntitytReference();

	/**
	 * Returns a new object of class '<em>Event Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Condition</em>'.
	 * @generated
	 */
	EventCondition createEventCondition();

	/**
	 * Returns a new object of class '<em>Event Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Reference</em>'.
	 * @generated
	 */
	EventReference createEventReference();

	/**
	 * Returns a new object of class '<em>Execution Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Rule</em>'.
	 * @generated
	 */
	ExecutionRule createExecutionRule();

	/**
	 * Returns a new object of class '<em>Composed Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composed Execution</em>'.
	 * @generated
	 */
	ComposedExecution createComposedExecution();

	/**
	 * Returns a new object of class '<em>PIP Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PIP Attribute Type</em>'.
	 * @generated
	 */
	PIPAttributeType createPIPAttributeType();

	/**
	 * Returns a new object of class '<em>PIP Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PIP Option</em>'.
	 * @generated
	 */
	PIPOption createPIPOption();

	/**
	 * Returns a new object of class '<em>True</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>True</em>'.
	 * @generated
	 */
	True createTrue();

	/**
	 * Returns a new object of class '<em>SR Underscore</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SR Underscore</em>'.
	 * @generated
	 */
	SRUnderscore createSRUnderscore();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SARPackage getSARPackage();

} //SARFactory
