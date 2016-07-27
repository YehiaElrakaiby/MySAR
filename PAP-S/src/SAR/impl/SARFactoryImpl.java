/**
 */
package SAR.impl;

import SAR.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SARFactoryImpl extends EFactoryImpl implements SARFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SARFactory init() {
		try {
			SARFactory theSARFactory = (SARFactory)EPackage.Registry.INSTANCE.getEFactory(SARPackage.eNS_URI);
			if (theSARFactory != null) {
				return theSARFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SARFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SARFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SARPackage.SECURITY_CONFIGURATION: return createSecurityConfiguration();
			case SARPackage.MONITORING: return createMonitoring();
			case SARPackage.INTERCEPTION: return createInterception();
			case SARPackage.EXECUTION: return createExecution();
			case SARPackage.EVENT_ATTRIBUTE: return createEventAttribute();
			case SARPackage.ENTITY_DECLARATION: return createEntityDeclaration();
			case SARPackage.ENTITY_ATTRIBUTE: return createEntityAttribute();
			case SARPackage.STATE_CONDITION: return createStateCondition();
			case SARPackage.TEXT: return createText();
			case SARPackage.SR_BOOLEAN: return createSRBoolean();
			case SARPackage.CONCRETE_ARITHMETIC_EXPRESSION: return createConcreteArithmeticExpression();
			case SARPackage.SR_INTEGER: return createSRInteger();
			case SARPackage.VARIABLE: return createVariable();
			case SARPackage.SR_FLOAT: return createSRFloat();
			case SARPackage.ARITHMETIC_OPERATION: return createArithmeticOperation();
			case SARPackage.ATTRIBUTE_CONDITION: return createAttributeCondition();
			case SARPackage.NEGATED_CE: return createNegatedCE();
			case SARPackage.COMPOSED_CE: return createComposedCE();
			case SARPackage.PREDICATE: return createPredicate();
			case SARPackage.ABSTRACT_CONDITION: return createAbstractCondition();
			case SARPackage.PREDICATE_DEFINITION: return createPredicateDefinition();
			case SARPackage.ARITHMETIC_COMPARISON: return createArithmeticComparison();
			case SARPackage.PARENTHESIZED_CE: return createParenthesizedCE();
			case SARPackage.EVENT_EXECUTION: return createEventExecution();
			case SARPackage.COMPOSED_UPDATE: return createComposedUpdate();
			case SARPackage.PARENTHESIZED_UPDATE: return createParenthesizedUpdate();
			case SARPackage.DELETE: return createDelete();
			case SARPackage.UPDATE: return createUpdate();
			case SARPackage.ADD: return createAdd();
			case SARPackage.PRE_UPDATE_RULE: return createPreUpdateRule();
			case SARPackage.POST_UPDATE_RULE: return createPostUpdateRule();
			case SARPackage.SR_STRING: return createSRString();
			case SARPackage.SECURITY_POLICY: return createSecurityPolicy();
			case SARPackage.ACCESS_CONTROL_RULE: return createAccessControlRule();
			case SARPackage.OBLIGATION_RULE: return createObligationRule();
			case SARPackage.DELAY: return createDelay();
			case SARPackage.CREATE: return createCreate();
			case SARPackage.REMOVE: return createRemove();
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT: return createAttributeValueAssignment();
			case SARPackage.COMPOSED_VALUE: return createComposedValue();
			case SARPackage.COMPOSED_ATTRIBUTE_CONDITION: return createComposedAttributeCondition();
			case SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT: return createComposedAttributeAssignment();
			case SARPackage.SIMPLE_ATTRIBUTE_TYPE: return createSimpleAttributeType();
			case SARPackage.LIST_ATTRIBUTE_TYPE: return createListAttributeType();
			case SARPackage.BRACKETED_VALUE: return createBracketedValue();
			case SARPackage.CONCRETE_VALUE: return createConcreteValue();
			case SARPackage.PARENTHESIZED_VALUE: return createParenthesizedValue();
			case SARPackage.ENTITYT_REFERENCE: return createEntitytReference();
			case SARPackage.EVENT_CONDITION: return createEventCondition();
			case SARPackage.EVENT_REFERENCE: return createEventReference();
			case SARPackage.EXECUTION_RULE: return createExecutionRule();
			case SARPackage.COMPOSED_EXECUTION: return createComposedExecution();
			case SARPackage.PIP_ATTRIBUTE_TYPE: return createPIPAttributeType();
			case SARPackage.PIP_OPTION: return createPIPOption();
			case SARPackage.TRUE: return createTrue();
			case SARPackage.SR_UNDERSCORE: return createSRUnderscore();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SARPackage.SUPPORTED_TYPE:
				return createSupportedTypeFromString(eDataType, initialValue);
			case SARPackage.ARITHMETIC_OPERATOR:
				return createArithmeticOperatorFromString(eDataType, initialValue);
			case SARPackage.COMPARISON_OPERATOR:
				return createComparisonOperatorFromString(eDataType, initialValue);
			case SARPackage.BINARY_OPERATOR:
				return createBinaryOperatorFromString(eDataType, initialValue);
			case SARPackage.UPDATE_RULE_TYPE:
				return createUpdateRuleTypeFromString(eDataType, initialValue);
			case SARPackage.UPDATE_OPERATOR:
				return createUpdateOperatorFromString(eDataType, initialValue);
			case SARPackage.MODIFICATION_OPERATION:
				return createModificationOperationFromString(eDataType, initialValue);
			case SARPackage.POLICY_TYPE:
				return createPolicyTypeFromString(eDataType, initialValue);
			case SARPackage.ACCESS_CONTROL_RULE_TYPE:
				return createAccessControlRuleTypeFromString(eDataType, initialValue);
			case SARPackage.OBLIGATION_RULE_TYPE:
				return createObligationRuleTypeFromString(eDataType, initialValue);
			case SARPackage.CALENDAR:
				return createCalendarFromString(eDataType, initialValue);
			case SARPackage.CONDITION_TYPE:
				return createConditionTypeFromString(eDataType, initialValue);
			case SARPackage.EXECUTION_TYPE:
				return createExecutionTypeFromString(eDataType, initialValue);
			case SARPackage.OPTIONS:
				return createOptionsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SARPackage.SUPPORTED_TYPE:
				return convertSupportedTypeToString(eDataType, instanceValue);
			case SARPackage.ARITHMETIC_OPERATOR:
				return convertArithmeticOperatorToString(eDataType, instanceValue);
			case SARPackage.COMPARISON_OPERATOR:
				return convertComparisonOperatorToString(eDataType, instanceValue);
			case SARPackage.BINARY_OPERATOR:
				return convertBinaryOperatorToString(eDataType, instanceValue);
			case SARPackage.UPDATE_RULE_TYPE:
				return convertUpdateRuleTypeToString(eDataType, instanceValue);
			case SARPackage.UPDATE_OPERATOR:
				return convertUpdateOperatorToString(eDataType, instanceValue);
			case SARPackage.MODIFICATION_OPERATION:
				return convertModificationOperationToString(eDataType, instanceValue);
			case SARPackage.POLICY_TYPE:
				return convertPolicyTypeToString(eDataType, instanceValue);
			case SARPackage.ACCESS_CONTROL_RULE_TYPE:
				return convertAccessControlRuleTypeToString(eDataType, instanceValue);
			case SARPackage.OBLIGATION_RULE_TYPE:
				return convertObligationRuleTypeToString(eDataType, instanceValue);
			case SARPackage.CALENDAR:
				return convertCalendarToString(eDataType, instanceValue);
			case SARPackage.CONDITION_TYPE:
				return convertConditionTypeToString(eDataType, instanceValue);
			case SARPackage.EXECUTION_TYPE:
				return convertExecutionTypeToString(eDataType, instanceValue);
			case SARPackage.OPTIONS:
				return convertOptionsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConfiguration createSecurityConfiguration() {
		SecurityConfigurationImpl securityConfiguration = new SecurityConfigurationImpl();
		return securityConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitoring createMonitoring() {
		MonitoringImpl monitoring = new MonitoringImpl();
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interception createInterception() {
		InterceptionImpl interception = new InterceptionImpl();
		return interception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution createExecution() {
		ExecutionImpl execution = new ExecutionImpl();
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventAttribute createEventAttribute() {
		EventAttributeImpl eventAttribute = new EventAttributeImpl();
		return eventAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityDeclaration createEntityDeclaration() {
		EntityDeclarationImpl entityDeclaration = new EntityDeclarationImpl();
		return entityDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAttribute createEntityAttribute() {
		EntityAttributeImpl entityAttribute = new EntityAttributeImpl();
		return entityAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateCondition createStateCondition() {
		StateConditionImpl stateCondition = new StateConditionImpl();
		return stateCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRBoolean createSRBoolean() {
		SRBooleanImpl srBoolean = new SRBooleanImpl();
		return srBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteArithmeticExpression createConcreteArithmeticExpression() {
		ConcreteArithmeticExpressionImpl concreteArithmeticExpression = new ConcreteArithmeticExpressionImpl();
		return concreteArithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRInteger createSRInteger() {
		SRIntegerImpl srInteger = new SRIntegerImpl();
		return srInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRFloat createSRFloat() {
		SRFloatImpl srFloat = new SRFloatImpl();
		return srFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperation createArithmeticOperation() {
		ArithmeticOperationImpl arithmeticOperation = new ArithmeticOperationImpl();
		return arithmeticOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeCondition createAttributeCondition() {
		AttributeConditionImpl attributeCondition = new AttributeConditionImpl();
		return attributeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegatedCE createNegatedCE() {
		NegatedCEImpl negatedCE = new NegatedCEImpl();
		return negatedCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedCE createComposedCE() {
		ComposedCEImpl composedCE = new ComposedCEImpl();
		return composedCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate createPredicate() {
		PredicateImpl predicate = new PredicateImpl();
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCondition createAbstractCondition() {
		AbstractConditionImpl abstractCondition = new AbstractConditionImpl();
		return abstractCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateDefinition createPredicateDefinition() {
		PredicateDefinitionImpl predicateDefinition = new PredicateDefinitionImpl();
		return predicateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticComparison createArithmeticComparison() {
		ArithmeticComparisonImpl arithmeticComparison = new ArithmeticComparisonImpl();
		return arithmeticComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParenthesizedCE createParenthesizedCE() {
		ParenthesizedCEImpl parenthesizedCE = new ParenthesizedCEImpl();
		return parenthesizedCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventExecution createEventExecution() {
		EventExecutionImpl eventExecution = new EventExecutionImpl();
		return eventExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedUpdate createComposedUpdate() {
		ComposedUpdateImpl composedUpdate = new ComposedUpdateImpl();
		return composedUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParenthesizedUpdate createParenthesizedUpdate() {
		ParenthesizedUpdateImpl parenthesizedUpdate = new ParenthesizedUpdateImpl();
		return parenthesizedUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Update createUpdate() {
		UpdateImpl update = new UpdateImpl();
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreUpdateRule createPreUpdateRule() {
		PreUpdateRuleImpl preUpdateRule = new PreUpdateRuleImpl();
		return preUpdateRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostUpdateRule createPostUpdateRule() {
		PostUpdateRuleImpl postUpdateRule = new PostUpdateRuleImpl();
		return postUpdateRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRString createSRString() {
		SRStringImpl srString = new SRStringImpl();
		return srString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPolicy createSecurityPolicy() {
		SecurityPolicyImpl securityPolicy = new SecurityPolicyImpl();
		return securityPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlRule createAccessControlRule() {
		AccessControlRuleImpl accessControlRule = new AccessControlRuleImpl();
		return accessControlRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObligationRule createObligationRule() {
		ObligationRuleImpl obligationRule = new ObligationRuleImpl();
		return obligationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delay createDelay() {
		DelayImpl delay = new DelayImpl();
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Remove createRemove() {
		RemoveImpl remove = new RemoveImpl();
		return remove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueAssignment createAttributeValueAssignment() {
		AttributeValueAssignmentImpl attributeValueAssignment = new AttributeValueAssignmentImpl();
		return attributeValueAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedValue createComposedValue() {
		ComposedValueImpl composedValue = new ComposedValueImpl();
		return composedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedAttributeCondition createComposedAttributeCondition() {
		ComposedAttributeConditionImpl composedAttributeCondition = new ComposedAttributeConditionImpl();
		return composedAttributeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedAttributeAssignment createComposedAttributeAssignment() {
		ComposedAttributeAssignmentImpl composedAttributeAssignment = new ComposedAttributeAssignmentImpl();
		return composedAttributeAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAttributeType createSimpleAttributeType() {
		SimpleAttributeTypeImpl simpleAttributeType = new SimpleAttributeTypeImpl();
		return simpleAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListAttributeType createListAttributeType() {
		ListAttributeTypeImpl listAttributeType = new ListAttributeTypeImpl();
		return listAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BracketedValue createBracketedValue() {
		BracketedValueImpl bracketedValue = new BracketedValueImpl();
		return bracketedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteValue createConcreteValue() {
		ConcreteValueImpl concreteValue = new ConcreteValueImpl();
		return concreteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParenthesizedValue createParenthesizedValue() {
		ParenthesizedValueImpl parenthesizedValue = new ParenthesizedValueImpl();
		return parenthesizedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitytReference createEntitytReference() {
		EntitytReferenceImpl entitytReference = new EntitytReferenceImpl();
		return entitytReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCondition createEventCondition() {
		EventConditionImpl eventCondition = new EventConditionImpl();
		return eventCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventReference createEventReference() {
		EventReferenceImpl eventReference = new EventReferenceImpl();
		return eventReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionRule createExecutionRule() {
		ExecutionRuleImpl executionRule = new ExecutionRuleImpl();
		return executionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedExecution createComposedExecution() {
		ComposedExecutionImpl composedExecution = new ComposedExecutionImpl();
		return composedExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIPAttributeType createPIPAttributeType() {
		PIPAttributeTypeImpl pipAttributeType = new PIPAttributeTypeImpl();
		return pipAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIPOption createPIPOption() {
		PIPOptionImpl pipOption = new PIPOptionImpl();
		return pipOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public True createTrue() {
		TrueImpl true_ = new TrueImpl();
		return true_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRUnderscore createSRUnderscore() {
		SRUnderscoreImpl srUnderscore = new SRUnderscoreImpl();
		return srUnderscore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedType createSupportedTypeFromString(EDataType eDataType, String initialValue) {
		SupportedType result = SupportedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupportedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperator createArithmeticOperatorFromString(EDataType eDataType, String initialValue) {
		ArithmeticOperator result = ArithmeticOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArithmeticOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator createComparisonOperatorFromString(EDataType eDataType, String initialValue) {
		ComparisonOperator result = ComparisonOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator createBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		BinaryOperator result = BinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateRuleType createUpdateRuleTypeFromString(EDataType eDataType, String initialValue) {
		UpdateRuleType result = UpdateRuleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateRuleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateOperator createUpdateOperatorFromString(EDataType eDataType, String initialValue) {
		UpdateOperator result = UpdateOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationOperation createModificationOperationFromString(EDataType eDataType, String initialValue) {
		ModificationOperation result = ModificationOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModificationOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyType createPolicyTypeFromString(EDataType eDataType, String initialValue) {
		PolicyType result = PolicyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolicyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlRuleType createAccessControlRuleTypeFromString(EDataType eDataType, String initialValue) {
		AccessControlRuleType result = AccessControlRuleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessControlRuleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObligationRuleType createObligationRuleTypeFromString(EDataType eDataType, String initialValue) {
		ObligationRuleType result = ObligationRuleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObligationRuleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar createCalendarFromString(EDataType eDataType, String initialValue) {
		Calendar result = Calendar.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionType createConditionTypeFromString(EDataType eDataType, String initialValue) {
		ConditionType result = ConditionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionType createExecutionTypeFromString(EDataType eDataType, String initialValue) {
		ExecutionType result = ExecutionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Options createOptionsFromString(EDataType eDataType, String initialValue) {
		Options result = Options.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SARPackage getSARPackage() {
		return (SARPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SARPackage getPackage() {
		return SARPackage.eINSTANCE;
	}

} //SARFactoryImpl
