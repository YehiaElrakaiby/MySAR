/**
 */
package SAR.impl;

import SAR.AbstractCondition;
import SAR.AccessControlRule;
import SAR.AccessControlRuleType;
import SAR.Add;
import SAR.ArithmeticComparison;
import SAR.ArithmeticExpression;
import SAR.ArithmeticOperation;
import SAR.ArithmeticOperator;
import SAR.AttributeAssignmentExpression;
import SAR.AttributeCondition;
import SAR.AttributeConditionExpression;
import SAR.AttributeDeclaration;
import SAR.AttributeValue;
import SAR.AttributeValueAssignment;
import SAR.BinaryOperator;
import SAR.BracketedValue;
import SAR.Calendar;
import SAR.ComparisonOperator;
import SAR.ComposedAttributeAssignment;
import SAR.ComposedAttributeCondition;
import SAR.ComposedCE;
import SAR.ComposedExecution;
import SAR.ComposedUpdate;
import SAR.ComposedValue;
import SAR.ConcreteArithmeticExpression;
import SAR.ConcreteValue;
import SAR.Condition;
import SAR.ConditionExpression;
import SAR.ConditionType;
import SAR.Create;
import SAR.Delay;
import SAR.Delete;
import SAR.EntityAttribute;
import SAR.EntityDeclaration;
import SAR.EntitytReference;
import SAR.EventAttribute;
import SAR.EventCondition;
import SAR.EventDeclaration;
import SAR.EventExecution;
import SAR.EventReference;
import SAR.Execution;
import SAR.ExecutionExpression;
import SAR.ExecutionRule;
import SAR.ExecutionType;
import SAR.FieldType;
import SAR.Interception;
import SAR.ListAttributeType;
import SAR.ModificationOperation;
import SAR.Monitoring;
import SAR.NegatedCE;
import SAR.ObjectDeclaration;
import SAR.ObligationRule;
import SAR.ObligationRuleType;
import SAR.Options;
import SAR.PIPAttributeType;
import SAR.PIPOption;
import SAR.ParenthesizedCE;
import SAR.ParenthesizedUpdate;
import SAR.ParenthesizedValue;
import SAR.PolicyRule;
import SAR.PolicyType;
import SAR.PostUpdateRule;
import SAR.PreUpdateRule;
import SAR.Predicate;
import SAR.PredicateDefinition;
import SAR.Remove;
import SAR.Rule;
import SAR.SARFactory;
import SAR.SARPackage;
import SAR.SRBoolean;
import SAR.SRFloat;
import SAR.SRInteger;
import SAR.SRString;
import SAR.SRUnderscore;
import SAR.SecurityConfiguration;
import SAR.SecurityPolicy;
import SAR.SimpleAttributeType;
import SAR.StateCondition;
import SAR.SupportedType;
import SAR.Text;
import SAR.True;
import SAR.Update;
import SAR.UpdateAttribute;
import SAR.UpdateExpression;
import SAR.UpdateObject;
import SAR.UpdateOperator;
import SAR.UpdateRule;
import SAR.UpdateRuleType;
import SAR.Value;
import SAR.ValueExpression;
import SAR.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SARPackageImpl extends EPackageImpl implements SARPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteArithmeticExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srFloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negatedCEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedCEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parenthesizedCEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parenthesizedUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preUpdateRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postUpdateRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControlRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obligationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeConditionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedAttributeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedAttributeAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeAssignmentExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAttributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listAttributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bracketedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parenthesizedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entitytReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipAttributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srUnderscoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supportedTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arithmeticOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum updateRuleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum updateOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modificationOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum policyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessControlRuleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum obligationRuleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calendarEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum optionsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see SAR.SARPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SARPackageImpl() {
		super(eNS_URI, SARFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SARPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SARPackage init() {
		if (isInited) return (SARPackage)EPackage.Registry.INSTANCE.getEPackage(SARPackage.eNS_URI);

		// Obtain or create and register package
		SARPackageImpl theSARPackage = (SARPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SARPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SARPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSARPackage.createPackageContents();

		// Initialize created meta-data
		theSARPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSARPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SARPackage.eNS_URI, theSARPackage);
		return theSARPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityConfiguration() {
		return securityConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityConfiguration_Id() {
		return (EAttribute)securityConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConfiguration_Event_declarations() {
		return (EReference)securityConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConfiguration_Entity_declarations() {
		return (EReference)securityConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConfiguration_Predicate_definitions() {
		return (EReference)securityConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConfiguration_Pre_updates() {
		return (EReference)securityConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConfiguration_Post_updates() {
		return (EReference)securityConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityConfiguration_Security_policy() {
		return (EReference)securityConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventDeclaration() {
		return eventDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventDeclaration_Event_attributes() {
		return (EReference)eventDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoring() {
		return monitoringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterception() {
		return interceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecution() {
		return executionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventAttribute() {
		return eventAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventAttribute_Field_type() {
		return (EReference)eventAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityDeclaration() {
		return entityDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityDeclaration_Entity_attributes() {
		return (EReference)entityDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDeclaration() {
		return attributeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDeclaration_Id() {
		return (EAttribute)attributeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityAttribute() {
		return entityAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityAttribute_Field_type() {
		return (EReference)entityAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionExpression() {
		return conditionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateCondition() {
		return stateConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateCondition_Entity_reference() {
		return (EReference)stateConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Value() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSRBoolean() {
		return srBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRBoolean_Value() {
		return (EAttribute)srBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteArithmeticExpression() {
		return concreteArithmeticExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteArithmeticExpression_Expression() {
		return (EReference)concreteArithmeticExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticExpression() {
		return arithmeticExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSRInteger() {
		return srIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRInteger_Value() {
		return (EAttribute)srIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Value() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSRFloat() {
		return srFloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRFloat_Value() {
		return (EAttribute)srFloatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticOperation() {
		return arithmeticOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArithmeticOperation_Operation() {
		return (EAttribute)arithmeticOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmeticOperation_Lhs() {
		return (EReference)arithmeticOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmeticOperation_Rhs() {
		return (EReference)arithmeticOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeCondition() {
		return attributeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeCondition_Attribute() {
		return (EReference)attributeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeCondition_Operator() {
		return (EAttribute)attributeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeCondition_Attribute_value() {
		return (EReference)attributeConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegatedCE() {
		return negatedCEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegatedCE_Op() {
		return (EReference)negatedCEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposedCE() {
		return composedCEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComposedCE_BinaryOperator() {
		return (EAttribute)composedCEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedCE_Rhs() {
		return (EReference)composedCEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedCE_Lhs() {
		return (EReference)composedCEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredicate_Name() {
		return (EAttribute)predicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicate_Parameters() {
		return (EReference)predicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCondition() {
		return abstractConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCondition_Predicate() {
		return (EReference)abstractConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCondition_Parameters() {
		return (EReference)abstractConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateDefinition() {
		return predicateDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateDefinition_Predicate() {
		return (EReference)predicateDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateDefinition_Activation_conditions() {
		return (EReference)predicateDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticComparison() {
		return arithmeticComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmeticComparison_Lhs() {
		return (EReference)arithmeticComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmeticComparison_Rhs() {
		return (EReference)arithmeticComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArithmeticComparison_Operator() {
		return (EAttribute)arithmeticComparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParenthesizedCE() {
		return parenthesizedCEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParenthesizedCE_Op() {
		return (EReference)parenthesizedCEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateRule() {
		return updateRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateRule_Update_expression() {
		return (EReference)updateRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateExpression() {
		return updateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateAttribute() {
		return updateAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateAttribute_Attribute_assignment() {
		return (EReference)updateAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateAttribute_Object_reference() {
		return (EReference)updateAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventExecution() {
		return eventExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventExecution_Execution() {
		return (EReference)eventExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventExecution_Attributes_assignment() {
		return (EReference)eventExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventExecution_Execution_type() {
		return (EAttribute)eventExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposedUpdate() {
		return composedUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComposedUpdate_Operator() {
		return (EAttribute)composedUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedUpdate_Lhs() {
		return (EReference)composedUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedUpdate_Rhs() {
		return (EReference)composedUpdateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParenthesizedUpdate() {
		return parenthesizedUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParenthesizedUpdate_Op() {
		return (EReference)parenthesizedUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelete() {
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelete_Object_reference() {
		return (EReference)deleteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdate() {
		return updateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdd() {
		return addEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreUpdateRule() {
		return preUpdateRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostUpdateRule() {
		return postUpdateRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSRString() {
		return srStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRString_Value() {
		return (EAttribute)srStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityPolicy() {
		return securityPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityPolicy_Type() {
		return (EAttribute)securityPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityPolicy_Policy_rules() {
		return (EReference)securityPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessControlRule() {
		return accessControlRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessControlRule_Type() {
		return (EAttribute)accessControlRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessControlRule_Event() {
		return (EReference)accessControlRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessControlRule_Provisions_expression() {
		return (EReference)accessControlRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObligationRule() {
		return obligationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObligationRule_Type() {
		return (EAttribute)obligationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationRule_Fulfillment_condition() {
		return (EReference)obligationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationRule_Deadline_condition() {
		return (EReference)obligationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationRule_Cancellation_condition() {
		return (EReference)obligationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationRule_Reparation_condition() {
		return (EReference)obligationRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Id() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Activation_condition() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyRule() {
		return policyRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelay() {
		return delayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_Unit() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_Calendar() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectDeclaration() {
		return objectDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectDeclaration_Id() {
		return (EAttribute)objectDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateObject() {
		return updateObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreate() {
		return createEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreate_Attributes_assignment() {
		return (EReference)createEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreate_Entity() {
		return (EReference)createEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemove() {
		return removeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueAssignment() {
		return attributeValueAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueAssignment_Attribute() {
		return (EReference)attributeValueAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueAssignment_Value() {
		return (EReference)attributeValueAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueAssignment_New_value() {
		return (EReference)attributeValueAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueExpression() {
		return valueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposedValue() {
		return composedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedValue_Lhs() {
		return (EReference)composedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedValue_Rhs() {
		return (EReference)composedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeConditionExpression() {
		return attributeConditionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposedAttributeCondition() {
		return composedAttributeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedAttributeCondition_Lhs() {
		return (EReference)composedAttributeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedAttributeCondition_Rhs() {
		return (EReference)composedAttributeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposedAttributeAssignment() {
		return composedAttributeAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedAttributeAssignment_Lhs() {
		return (EReference)composedAttributeAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedAttributeAssignment_Rhs() {
		return (EReference)composedAttributeAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeAssignmentExpression() {
		return attributeAssignmentExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleAttributeType() {
		return simpleAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAttributeType_Type() {
		return (EAttribute)simpleAttributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListAttributeType() {
		return listAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListAttributeType_Types() {
		return (EAttribute)listAttributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldType() {
		return fieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBracketedValue() {
		return bracketedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBracketedValue_Value() {
		return (EReference)bracketedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteValue() {
		return concreteValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteValue_Value() {
		return (EReference)concreteValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValue() {
		return attributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParenthesizedValue() {
		return parenthesizedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParenthesizedValue_Value() {
		return (EReference)parenthesizedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntitytReference() {
		return entitytReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntitytReference_Handle_id() {
		return (EAttribute)entitytReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntitytReference_Entity_id() {
		return (EReference)entitytReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventCondition() {
		return eventConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventCondition_Event_reference() {
		return (EReference)eventConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventReference() {
		return eventReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventReference_Event_id() {
		return (EReference)eventReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionRule() {
		return executionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionRule_Execution_expression() {
		return (EReference)executionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionExpression() {
		return executionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposedExecution() {
		return composedExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedExecution_Lhs() {
		return (EReference)composedExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedExecution_Rhs() {
		return (EReference)composedExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComposedExecution_Operator() {
		return (EAttribute)composedExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Attribute_condition_expression() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPIPAttributeType() {
		return pipAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPIPAttributeType_Pip_options() {
		return (EReference)pipAttributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPIPOption() {
		return pipOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPIPOption_Type() {
		return (EAttribute)pipOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPIPOption_Value() {
		return (EReference)pipOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrue() {
		return trueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSRUnderscore() {
		return srUnderscoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRUnderscore_Value() {
		return (EAttribute)srUnderscoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupportedType() {
		return supportedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArithmeticOperator() {
		return arithmeticOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonOperator() {
		return comparisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryOperator() {
		return binaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUpdateRuleType() {
		return updateRuleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUpdateOperator() {
		return updateOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModificationOperation() {
		return modificationOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPolicyType() {
		return policyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessControlRuleType() {
		return accessControlRuleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObligationRuleType() {
		return obligationRuleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCalendar() {
		return calendarEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionType() {
		return conditionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExecutionType() {
		return executionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOptions() {
		return optionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SARFactory getSARFactory() {
		return (SARFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		securityConfigurationEClass = createEClass(SECURITY_CONFIGURATION);
		createEAttribute(securityConfigurationEClass, SECURITY_CONFIGURATION__ID);
		createEReference(securityConfigurationEClass, SECURITY_CONFIGURATION__EVENT_DECLARATIONS);
		createEReference(securityConfigurationEClass, SECURITY_CONFIGURATION__ENTITY_DECLARATIONS);
		createEReference(securityConfigurationEClass, SECURITY_CONFIGURATION__PREDICATE_DEFINITIONS);
		createEReference(securityConfigurationEClass, SECURITY_CONFIGURATION__PRE_UPDATES);
		createEReference(securityConfigurationEClass, SECURITY_CONFIGURATION__POST_UPDATES);
		createEReference(securityConfigurationEClass, SECURITY_CONFIGURATION__SECURITY_POLICY);

		eventDeclarationEClass = createEClass(EVENT_DECLARATION);
		createEReference(eventDeclarationEClass, EVENT_DECLARATION__EVENT_ATTRIBUTES);

		monitoringEClass = createEClass(MONITORING);

		interceptionEClass = createEClass(INTERCEPTION);

		executionEClass = createEClass(EXECUTION);

		eventAttributeEClass = createEClass(EVENT_ATTRIBUTE);
		createEReference(eventAttributeEClass, EVENT_ATTRIBUTE__FIELD_TYPE);

		entityDeclarationEClass = createEClass(ENTITY_DECLARATION);
		createEReference(entityDeclarationEClass, ENTITY_DECLARATION__ENTITY_ATTRIBUTES);

		attributeDeclarationEClass = createEClass(ATTRIBUTE_DECLARATION);
		createEAttribute(attributeDeclarationEClass, ATTRIBUTE_DECLARATION__ID);

		entityAttributeEClass = createEClass(ENTITY_ATTRIBUTE);
		createEReference(entityAttributeEClass, ENTITY_ATTRIBUTE__FIELD_TYPE);

		conditionExpressionEClass = createEClass(CONDITION_EXPRESSION);

		stateConditionEClass = createEClass(STATE_CONDITION);
		createEReference(stateConditionEClass, STATE_CONDITION__ENTITY_REFERENCE);

		valueEClass = createEClass(VALUE);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__VALUE);

		srBooleanEClass = createEClass(SR_BOOLEAN);
		createEAttribute(srBooleanEClass, SR_BOOLEAN__VALUE);

		concreteArithmeticExpressionEClass = createEClass(CONCRETE_ARITHMETIC_EXPRESSION);
		createEReference(concreteArithmeticExpressionEClass, CONCRETE_ARITHMETIC_EXPRESSION__EXPRESSION);

		arithmeticExpressionEClass = createEClass(ARITHMETIC_EXPRESSION);

		srIntegerEClass = createEClass(SR_INTEGER);
		createEAttribute(srIntegerEClass, SR_INTEGER__VALUE);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__VALUE);

		srFloatEClass = createEClass(SR_FLOAT);
		createEAttribute(srFloatEClass, SR_FLOAT__VALUE);

		arithmeticOperationEClass = createEClass(ARITHMETIC_OPERATION);
		createEAttribute(arithmeticOperationEClass, ARITHMETIC_OPERATION__OPERATION);
		createEReference(arithmeticOperationEClass, ARITHMETIC_OPERATION__LHS);
		createEReference(arithmeticOperationEClass, ARITHMETIC_OPERATION__RHS);

		attributeConditionEClass = createEClass(ATTRIBUTE_CONDITION);
		createEReference(attributeConditionEClass, ATTRIBUTE_CONDITION__ATTRIBUTE);
		createEAttribute(attributeConditionEClass, ATTRIBUTE_CONDITION__OPERATOR);
		createEReference(attributeConditionEClass, ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE);

		negatedCEEClass = createEClass(NEGATED_CE);
		createEReference(negatedCEEClass, NEGATED_CE__OP);

		composedCEEClass = createEClass(COMPOSED_CE);
		createEAttribute(composedCEEClass, COMPOSED_CE__BINARY_OPERATOR);
		createEReference(composedCEEClass, COMPOSED_CE__RHS);
		createEReference(composedCEEClass, COMPOSED_CE__LHS);

		predicateEClass = createEClass(PREDICATE);
		createEAttribute(predicateEClass, PREDICATE__NAME);
		createEReference(predicateEClass, PREDICATE__PARAMETERS);

		abstractConditionEClass = createEClass(ABSTRACT_CONDITION);
		createEReference(abstractConditionEClass, ABSTRACT_CONDITION__PREDICATE);
		createEReference(abstractConditionEClass, ABSTRACT_CONDITION__PARAMETERS);

		predicateDefinitionEClass = createEClass(PREDICATE_DEFINITION);
		createEReference(predicateDefinitionEClass, PREDICATE_DEFINITION__PREDICATE);
		createEReference(predicateDefinitionEClass, PREDICATE_DEFINITION__ACTIVATION_CONDITIONS);

		arithmeticComparisonEClass = createEClass(ARITHMETIC_COMPARISON);
		createEReference(arithmeticComparisonEClass, ARITHMETIC_COMPARISON__LHS);
		createEReference(arithmeticComparisonEClass, ARITHMETIC_COMPARISON__RHS);
		createEAttribute(arithmeticComparisonEClass, ARITHMETIC_COMPARISON__OPERATOR);

		parenthesizedCEEClass = createEClass(PARENTHESIZED_CE);
		createEReference(parenthesizedCEEClass, PARENTHESIZED_CE__OP);

		updateRuleEClass = createEClass(UPDATE_RULE);
		createEReference(updateRuleEClass, UPDATE_RULE__UPDATE_EXPRESSION);

		updateExpressionEClass = createEClass(UPDATE_EXPRESSION);

		updateAttributeEClass = createEClass(UPDATE_ATTRIBUTE);
		createEReference(updateAttributeEClass, UPDATE_ATTRIBUTE__ATTRIBUTE_ASSIGNMENT);
		createEReference(updateAttributeEClass, UPDATE_ATTRIBUTE__OBJECT_REFERENCE);

		eventExecutionEClass = createEClass(EVENT_EXECUTION);
		createEReference(eventExecutionEClass, EVENT_EXECUTION__EXECUTION);
		createEReference(eventExecutionEClass, EVENT_EXECUTION__ATTRIBUTES_ASSIGNMENT);
		createEAttribute(eventExecutionEClass, EVENT_EXECUTION__EXECUTION_TYPE);

		composedUpdateEClass = createEClass(COMPOSED_UPDATE);
		createEAttribute(composedUpdateEClass, COMPOSED_UPDATE__OPERATOR);
		createEReference(composedUpdateEClass, COMPOSED_UPDATE__LHS);
		createEReference(composedUpdateEClass, COMPOSED_UPDATE__RHS);

		parenthesizedUpdateEClass = createEClass(PARENTHESIZED_UPDATE);
		createEReference(parenthesizedUpdateEClass, PARENTHESIZED_UPDATE__OP);

		deleteEClass = createEClass(DELETE);
		createEReference(deleteEClass, DELETE__OBJECT_REFERENCE);

		updateEClass = createEClass(UPDATE);

		addEClass = createEClass(ADD);

		preUpdateRuleEClass = createEClass(PRE_UPDATE_RULE);

		postUpdateRuleEClass = createEClass(POST_UPDATE_RULE);

		srStringEClass = createEClass(SR_STRING);
		createEAttribute(srStringEClass, SR_STRING__VALUE);

		securityPolicyEClass = createEClass(SECURITY_POLICY);
		createEAttribute(securityPolicyEClass, SECURITY_POLICY__TYPE);
		createEReference(securityPolicyEClass, SECURITY_POLICY__POLICY_RULES);

		accessControlRuleEClass = createEClass(ACCESS_CONTROL_RULE);
		createEAttribute(accessControlRuleEClass, ACCESS_CONTROL_RULE__TYPE);
		createEReference(accessControlRuleEClass, ACCESS_CONTROL_RULE__EVENT);
		createEReference(accessControlRuleEClass, ACCESS_CONTROL_RULE__PROVISIONS_EXPRESSION);

		obligationRuleEClass = createEClass(OBLIGATION_RULE);
		createEAttribute(obligationRuleEClass, OBLIGATION_RULE__TYPE);
		createEReference(obligationRuleEClass, OBLIGATION_RULE__FULFILLMENT_CONDITION);
		createEReference(obligationRuleEClass, OBLIGATION_RULE__DEADLINE_CONDITION);
		createEReference(obligationRuleEClass, OBLIGATION_RULE__CANCELLATION_CONDITION);
		createEReference(obligationRuleEClass, OBLIGATION_RULE__REPARATION_CONDITION);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__ID);
		createEReference(ruleEClass, RULE__ACTIVATION_CONDITION);

		policyRuleEClass = createEClass(POLICY_RULE);

		delayEClass = createEClass(DELAY);
		createEAttribute(delayEClass, DELAY__UNIT);
		createEAttribute(delayEClass, DELAY__CALENDAR);

		objectDeclarationEClass = createEClass(OBJECT_DECLARATION);
		createEAttribute(objectDeclarationEClass, OBJECT_DECLARATION__ID);

		updateObjectEClass = createEClass(UPDATE_OBJECT);

		createEClass = createEClass(CREATE);
		createEReference(createEClass, CREATE__ATTRIBUTES_ASSIGNMENT);
		createEReference(createEClass, CREATE__ENTITY);

		removeEClass = createEClass(REMOVE);

		attributeValueAssignmentEClass = createEClass(ATTRIBUTE_VALUE_ASSIGNMENT);
		createEReference(attributeValueAssignmentEClass, ATTRIBUTE_VALUE_ASSIGNMENT__ATTRIBUTE);
		createEReference(attributeValueAssignmentEClass, ATTRIBUTE_VALUE_ASSIGNMENT__VALUE);
		createEReference(attributeValueAssignmentEClass, ATTRIBUTE_VALUE_ASSIGNMENT__NEW_VALUE);

		valueExpressionEClass = createEClass(VALUE_EXPRESSION);

		composedValueEClass = createEClass(COMPOSED_VALUE);
		createEReference(composedValueEClass, COMPOSED_VALUE__LHS);
		createEReference(composedValueEClass, COMPOSED_VALUE__RHS);

		attributeConditionExpressionEClass = createEClass(ATTRIBUTE_CONDITION_EXPRESSION);

		composedAttributeConditionEClass = createEClass(COMPOSED_ATTRIBUTE_CONDITION);
		createEReference(composedAttributeConditionEClass, COMPOSED_ATTRIBUTE_CONDITION__LHS);
		createEReference(composedAttributeConditionEClass, COMPOSED_ATTRIBUTE_CONDITION__RHS);

		composedAttributeAssignmentEClass = createEClass(COMPOSED_ATTRIBUTE_ASSIGNMENT);
		createEReference(composedAttributeAssignmentEClass, COMPOSED_ATTRIBUTE_ASSIGNMENT__LHS);
		createEReference(composedAttributeAssignmentEClass, COMPOSED_ATTRIBUTE_ASSIGNMENT__RHS);

		attributeAssignmentExpressionEClass = createEClass(ATTRIBUTE_ASSIGNMENT_EXPRESSION);

		simpleAttributeTypeEClass = createEClass(SIMPLE_ATTRIBUTE_TYPE);
		createEAttribute(simpleAttributeTypeEClass, SIMPLE_ATTRIBUTE_TYPE__TYPE);

		listAttributeTypeEClass = createEClass(LIST_ATTRIBUTE_TYPE);
		createEAttribute(listAttributeTypeEClass, LIST_ATTRIBUTE_TYPE__TYPES);

		fieldTypeEClass = createEClass(FIELD_TYPE);

		bracketedValueEClass = createEClass(BRACKETED_VALUE);
		createEReference(bracketedValueEClass, BRACKETED_VALUE__VALUE);

		concreteValueEClass = createEClass(CONCRETE_VALUE);
		createEReference(concreteValueEClass, CONCRETE_VALUE__VALUE);

		attributeValueEClass = createEClass(ATTRIBUTE_VALUE);

		parenthesizedValueEClass = createEClass(PARENTHESIZED_VALUE);
		createEReference(parenthesizedValueEClass, PARENTHESIZED_VALUE__VALUE);

		entitytReferenceEClass = createEClass(ENTITYT_REFERENCE);
		createEAttribute(entitytReferenceEClass, ENTITYT_REFERENCE__HANDLE_ID);
		createEReference(entitytReferenceEClass, ENTITYT_REFERENCE__ENTITY_ID);

		eventConditionEClass = createEClass(EVENT_CONDITION);
		createEReference(eventConditionEClass, EVENT_CONDITION__EVENT_REFERENCE);

		eventReferenceEClass = createEClass(EVENT_REFERENCE);
		createEReference(eventReferenceEClass, EVENT_REFERENCE__EVENT_ID);

		executionRuleEClass = createEClass(EXECUTION_RULE);
		createEReference(executionRuleEClass, EXECUTION_RULE__EXECUTION_EXPRESSION);

		executionExpressionEClass = createEClass(EXECUTION_EXPRESSION);

		composedExecutionEClass = createEClass(COMPOSED_EXECUTION);
		createEReference(composedExecutionEClass, COMPOSED_EXECUTION__LHS);
		createEReference(composedExecutionEClass, COMPOSED_EXECUTION__RHS);
		createEAttribute(composedExecutionEClass, COMPOSED_EXECUTION__OPERATOR);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__ATTRIBUTE_CONDITION_EXPRESSION);

		pipAttributeTypeEClass = createEClass(PIP_ATTRIBUTE_TYPE);
		createEReference(pipAttributeTypeEClass, PIP_ATTRIBUTE_TYPE__PIP_OPTIONS);

		pipOptionEClass = createEClass(PIP_OPTION);
		createEAttribute(pipOptionEClass, PIP_OPTION__TYPE);
		createEReference(pipOptionEClass, PIP_OPTION__VALUE);

		trueEClass = createEClass(TRUE);

		srUnderscoreEClass = createEClass(SR_UNDERSCORE);
		createEAttribute(srUnderscoreEClass, SR_UNDERSCORE__VALUE);

		// Create enums
		supportedTypeEEnum = createEEnum(SUPPORTED_TYPE);
		arithmeticOperatorEEnum = createEEnum(ARITHMETIC_OPERATOR);
		comparisonOperatorEEnum = createEEnum(COMPARISON_OPERATOR);
		binaryOperatorEEnum = createEEnum(BINARY_OPERATOR);
		updateRuleTypeEEnum = createEEnum(UPDATE_RULE_TYPE);
		updateOperatorEEnum = createEEnum(UPDATE_OPERATOR);
		modificationOperationEEnum = createEEnum(MODIFICATION_OPERATION);
		policyTypeEEnum = createEEnum(POLICY_TYPE);
		accessControlRuleTypeEEnum = createEEnum(ACCESS_CONTROL_RULE_TYPE);
		obligationRuleTypeEEnum = createEEnum(OBLIGATION_RULE_TYPE);
		calendarEEnum = createEEnum(CALENDAR);
		conditionTypeEEnum = createEEnum(CONDITION_TYPE);
		executionTypeEEnum = createEEnum(EXECUTION_TYPE);
		optionsEEnum = createEEnum(OPTIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eventDeclarationEClass.getESuperTypes().add(this.getObjectDeclaration());
		monitoringEClass.getESuperTypes().add(this.getEventDeclaration());
		interceptionEClass.getESuperTypes().add(this.getEventDeclaration());
		executionEClass.getESuperTypes().add(this.getEventDeclaration());
		eventAttributeEClass.getESuperTypes().add(this.getAttributeDeclaration());
		entityDeclarationEClass.getESuperTypes().add(this.getObjectDeclaration());
		entityAttributeEClass.getESuperTypes().add(this.getAttributeDeclaration());
		stateConditionEClass.getESuperTypes().add(this.getCondition());
		valueEClass.getESuperTypes().add(this.getAttributeValue());
		textEClass.getESuperTypes().add(this.getValue());
		srBooleanEClass.getESuperTypes().add(this.getValue());
		concreteArithmeticExpressionEClass.getESuperTypes().add(this.getValue());
		srIntegerEClass.getESuperTypes().add(this.getArithmeticExpression());
		variableEClass.getESuperTypes().add(this.getArithmeticExpression());
		srFloatEClass.getESuperTypes().add(this.getArithmeticExpression());
		arithmeticOperationEClass.getESuperTypes().add(this.getArithmeticExpression());
		attributeConditionEClass.getESuperTypes().add(this.getAttributeConditionExpression());
		negatedCEEClass.getESuperTypes().add(this.getConditionExpression());
		composedCEEClass.getESuperTypes().add(this.getConditionExpression());
		abstractConditionEClass.getESuperTypes().add(this.getConditionExpression());
		arithmeticComparisonEClass.getESuperTypes().add(this.getConditionExpression());
		parenthesizedCEEClass.getESuperTypes().add(this.getConditionExpression());
		updateRuleEClass.getESuperTypes().add(this.getRule());
		updateAttributeEClass.getESuperTypes().add(this.getUpdateExpression());
		eventExecutionEClass.getESuperTypes().add(this.getExecutionExpression());
		composedUpdateEClass.getESuperTypes().add(this.getUpdateExpression());
		parenthesizedUpdateEClass.getESuperTypes().add(this.getUpdateExpression());
		deleteEClass.getESuperTypes().add(this.getUpdateObject());
		updateEClass.getESuperTypes().add(this.getUpdateAttribute());
		addEClass.getESuperTypes().add(this.getUpdateAttribute());
		preUpdateRuleEClass.getESuperTypes().add(this.getUpdateRule());
		postUpdateRuleEClass.getESuperTypes().add(this.getUpdateRule());
		srStringEClass.getESuperTypes().add(this.getValue());
		accessControlRuleEClass.getESuperTypes().add(this.getPolicyRule());
		obligationRuleEClass.getESuperTypes().add(this.getPolicyRule());
		policyRuleEClass.getESuperTypes().add(this.getRule());
		delayEClass.getESuperTypes().add(this.getConditionExpression());
		updateObjectEClass.getESuperTypes().add(this.getUpdateExpression());
		createEClass.getESuperTypes().add(this.getUpdateObject());
		removeEClass.getESuperTypes().add(this.getUpdateAttribute());
		attributeValueAssignmentEClass.getESuperTypes().add(this.getAttributeAssignmentExpression());
		composedValueEClass.getESuperTypes().add(this.getValueExpression());
		composedAttributeConditionEClass.getESuperTypes().add(this.getAttributeConditionExpression());
		composedAttributeAssignmentEClass.getESuperTypes().add(this.getAttributeAssignmentExpression());
		simpleAttributeTypeEClass.getESuperTypes().add(this.getFieldType());
		listAttributeTypeEClass.getESuperTypes().add(this.getFieldType());
		bracketedValueEClass.getESuperTypes().add(this.getAttributeValue());
		concreteValueEClass.getESuperTypes().add(this.getValueExpression());
		eventConditionEClass.getESuperTypes().add(this.getCondition());
		executionRuleEClass.getESuperTypes().add(this.getPolicyRule());
		composedExecutionEClass.getESuperTypes().add(this.getExecutionExpression());
		conditionEClass.getESuperTypes().add(this.getConditionExpression());
		pipAttributeTypeEClass.getESuperTypes().add(this.getEntityAttribute());
		trueEClass.getESuperTypes().add(this.getConditionExpression());
		srUnderscoreEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(securityConfigurationEClass, SecurityConfiguration.class, "SecurityConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityConfiguration_Id(), ecorePackage.getEString(), "id", null, 1, 1, SecurityConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityConfiguration_Event_declarations(), this.getEventDeclaration(), null, "event_declarations", null, 0, -1, SecurityConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityConfiguration_Entity_declarations(), this.getEntityDeclaration(), null, "entity_declarations", null, 0, -1, SecurityConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityConfiguration_Predicate_definitions(), this.getPredicateDefinition(), null, "predicate_definitions", null, 0, -1, SecurityConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityConfiguration_Pre_updates(), this.getPreUpdateRule(), null, "pre_updates", null, 0, -1, SecurityConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityConfiguration_Post_updates(), this.getPostUpdateRule(), null, "post_updates", null, 0, -1, SecurityConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityConfiguration_Security_policy(), this.getSecurityPolicy(), null, "security_policy", null, 1, 1, SecurityConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventDeclarationEClass, EventDeclaration.class, "EventDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventDeclaration_Event_attributes(), this.getEventAttribute(), null, "event_attributes", null, 0, -1, EventDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monitoringEClass, Monitoring.class, "Monitoring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interceptionEClass, Interception.class, "Interception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionEClass, Execution.class, "Execution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventAttributeEClass, EventAttribute.class, "EventAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventAttribute_Field_type(), this.getFieldType(), null, "field_type", null, 1, 1, EventAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityDeclarationEClass, EntityDeclaration.class, "EntityDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityDeclaration_Entity_attributes(), this.getEntityAttribute(), null, "entity_attributes", null, 0, -1, EntityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeDeclarationEClass, AttributeDeclaration.class, "AttributeDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeDeclaration_Id(), ecorePackage.getEString(), "id", null, 1, 1, AttributeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityAttributeEClass, EntityAttribute.class, "EntityAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityAttribute_Field_type(), this.getFieldType(), null, "field_type", null, 1, 1, EntityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionExpressionEClass, ConditionExpression.class, "ConditionExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateConditionEClass, StateCondition.class, "StateCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateCondition_Entity_reference(), this.getEntitytReference(), null, "entity_reference", null, 1, 1, StateCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Value(), ecorePackage.getEString(), "value", null, 1, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srBooleanEClass, SRBoolean.class, "SRBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSRBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, SRBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteArithmeticExpressionEClass, ConcreteArithmeticExpression.class, "ConcreteArithmeticExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteArithmeticExpression_Expression(), this.getArithmeticExpression(), null, "expression", null, 1, 1, ConcreteArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arithmeticExpressionEClass, ArithmeticExpression.class, "ArithmeticExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srIntegerEClass, SRInteger.class, "SRInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSRInteger_Value(), ecorePackage.getEInt(), "value", null, 1, 1, SRInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Value(), ecorePackage.getEString(), "value", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srFloatEClass, SRFloat.class, "SRFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSRFloat_Value(), ecorePackage.getEFloat(), "value", null, 1, 1, SRFloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arithmeticOperationEClass, ArithmeticOperation.class, "ArithmeticOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArithmeticOperation_Operation(), this.getArithmeticOperator(), "operation", null, 1, 1, ArithmeticOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmeticOperation_Lhs(), this.getArithmeticExpression(), null, "lhs", null, 1, 1, ArithmeticOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmeticOperation_Rhs(), this.getArithmeticExpression(), null, "rhs", null, 1, 1, ArithmeticOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeConditionEClass, AttributeCondition.class, "AttributeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeCondition_Attribute(), this.getAttributeDeclaration(), null, "attribute", null, 1, 1, AttributeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeCondition_Operator(), this.getComparisonOperator(), "operator", null, 1, 1, AttributeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeCondition_Attribute_value(), this.getAttributeValue(), null, "attribute_value", null, 1, 1, AttributeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negatedCEEClass, NegatedCE.class, "NegatedCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegatedCE_Op(), this.getConditionExpression(), null, "op", null, 1, 1, NegatedCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composedCEEClass, ComposedCE.class, "ComposedCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComposedCE_BinaryOperator(), this.getBinaryOperator(), "binaryOperator", null, 1, 1, ComposedCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedCE_Rhs(), this.getConditionExpression(), null, "rhs", null, 1, 1, ComposedCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedCE_Lhs(), this.getConditionExpression(), null, "lhs", null, 1, 1, ComposedCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredicate_Name(), ecorePackage.getEString(), "name", null, 1, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicate_Parameters(), this.getParenthesizedValue(), null, "parameters", null, 1, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConditionEClass, AbstractCondition.class, "AbstractCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractCondition_Predicate(), this.getPredicate(), null, "predicate", null, 1, 1, AbstractCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCondition_Parameters(), this.getParenthesizedValue(), null, "parameters", null, 1, 1, AbstractCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateDefinitionEClass, PredicateDefinition.class, "PredicateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateDefinition_Predicate(), this.getPredicate(), null, "predicate", null, 1, 1, PredicateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateDefinition_Activation_conditions(), this.getConditionExpression(), null, "activation_conditions", null, 1, -1, PredicateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arithmeticComparisonEClass, ArithmeticComparison.class, "ArithmeticComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArithmeticComparison_Lhs(), this.getArithmeticExpression(), null, "lhs", null, 1, 1, ArithmeticComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmeticComparison_Rhs(), this.getArithmeticExpression(), null, "rhs", null, 1, 1, ArithmeticComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArithmeticComparison_Operator(), this.getComparisonOperator(), "operator", null, 1, 1, ArithmeticComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parenthesizedCEEClass, ParenthesizedCE.class, "ParenthesizedCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParenthesizedCE_Op(), this.getConditionExpression(), null, "op", null, 1, 1, ParenthesizedCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateRuleEClass, UpdateRule.class, "UpdateRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateRule_Update_expression(), this.getUpdateExpression(), null, "update_expression", null, 1, 1, UpdateRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateExpressionEClass, UpdateExpression.class, "UpdateExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateAttributeEClass, UpdateAttribute.class, "UpdateAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateAttribute_Attribute_assignment(), this.getAttributeValueAssignment(), null, "attribute_assignment", null, 1, 1, UpdateAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateAttribute_Object_reference(), this.getEntitytReference(), null, "object_reference", null, 1, 1, UpdateAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventExecutionEClass, EventExecution.class, "EventExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventExecution_Execution(), this.getExecution(), null, "execution", null, 1, 1, EventExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventExecution_Attributes_assignment(), this.getAttributeAssignmentExpression(), null, "attributes_assignment", null, 0, 1, EventExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventExecution_Execution_type(), this.getExecutionType(), "execution_type", null, 1, 1, EventExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composedUpdateEClass, ComposedUpdate.class, "ComposedUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComposedUpdate_Operator(), this.getUpdateOperator(), "operator", null, 1, 1, ComposedUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedUpdate_Lhs(), this.getUpdateExpression(), null, "lhs", null, 1, 1, ComposedUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedUpdate_Rhs(), this.getUpdateExpression(), null, "rhs", null, 1, 1, ComposedUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parenthesizedUpdateEClass, ParenthesizedUpdate.class, "ParenthesizedUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParenthesizedUpdate_Op(), this.getUpdateExpression(), null, "op", null, 1, 1, ParenthesizedUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelete_Object_reference(), this.getEntitytReference(), null, "object_reference", null, 1, 1, Delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateEClass, Update.class, "Update", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addEClass, Add.class, "Add", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preUpdateRuleEClass, PreUpdateRule.class, "PreUpdateRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postUpdateRuleEClass, PostUpdateRule.class, "PostUpdateRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srStringEClass, SRString.class, "SRString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSRString_Value(), ecorePackage.getEString(), "value", null, 1, 1, SRString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityPolicyEClass, SecurityPolicy.class, "SecurityPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityPolicy_Type(), this.getPolicyType(), "type", null, 1, 1, SecurityPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityPolicy_Policy_rules(), this.getPolicyRule(), null, "policy_rules", null, 0, -1, SecurityPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessControlRuleEClass, AccessControlRule.class, "AccessControlRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessControlRule_Type(), this.getAccessControlRuleType(), "type", null, 1, 1, AccessControlRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControlRule_Event(), this.getEventCondition(), null, "event", null, 1, 1, AccessControlRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControlRule_Provisions_expression(), this.getExecutionExpression(), null, "provisions_expression", null, 0, 1, AccessControlRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(obligationRuleEClass, ObligationRule.class, "ObligationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObligationRule_Type(), this.getObligationRuleType(), "type", null, 1, 1, ObligationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObligationRule_Fulfillment_condition(), this.getConditionExpression(), null, "fulfillment_condition", null, 1, 1, ObligationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObligationRule_Deadline_condition(), this.getConditionExpression(), null, "deadline_condition", null, 1, 1, ObligationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObligationRule_Cancellation_condition(), this.getConditionExpression(), null, "cancellation_condition", null, 0, 1, ObligationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObligationRule_Reparation_condition(), this.getConditionExpression(), null, "reparation_condition", null, 0, 1, ObligationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Id(), ecorePackage.getEString(), "id", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Activation_condition(), this.getConditionExpression(), null, "activation_condition", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyRuleEClass, PolicyRule.class, "PolicyRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delayEClass, Delay.class, "Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelay_Unit(), ecorePackage.getEInt(), "unit", null, 1, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelay_Calendar(), this.getCalendar(), "calendar", null, 1, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectDeclarationEClass, ObjectDeclaration.class, "ObjectDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectDeclaration_Id(), ecorePackage.getEString(), "id", null, 1, 1, ObjectDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateObjectEClass, UpdateObject.class, "UpdateObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createEClass, Create.class, "Create", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreate_Attributes_assignment(), this.getAttributeAssignmentExpression(), null, "attributes_assignment", null, 0, 1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreate_Entity(), this.getEntityDeclaration(), null, "entity", null, 1, 1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeEClass, Remove.class, "Remove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeValueAssignmentEClass, AttributeValueAssignment.class, "AttributeValueAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValueAssignment_Attribute(), this.getAttributeDeclaration(), null, "attribute", null, 1, 1, AttributeValueAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeValueAssignment_Value(), this.getAttributeValue(), null, "value", null, 1, 1, AttributeValueAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeValueAssignment_New_value(), this.getAttributeValue(), null, "new_value", null, 0, 1, AttributeValueAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueExpressionEClass, ValueExpression.class, "ValueExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(composedValueEClass, ComposedValue.class, "ComposedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposedValue_Lhs(), this.getValueExpression(), null, "lhs", null, 1, 1, ComposedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedValue_Rhs(), this.getValueExpression(), null, "rhs", null, 1, 1, ComposedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeConditionExpressionEClass, AttributeConditionExpression.class, "AttributeConditionExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(composedAttributeConditionEClass, ComposedAttributeCondition.class, "ComposedAttributeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposedAttributeCondition_Lhs(), this.getAttributeConditionExpression(), null, "lhs", null, 1, 1, ComposedAttributeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedAttributeCondition_Rhs(), this.getAttributeConditionExpression(), null, "rhs", null, 1, 1, ComposedAttributeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composedAttributeAssignmentEClass, ComposedAttributeAssignment.class, "ComposedAttributeAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposedAttributeAssignment_Lhs(), this.getAttributeAssignmentExpression(), null, "lhs", null, 1, 1, ComposedAttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedAttributeAssignment_Rhs(), this.getAttributeAssignmentExpression(), null, "rhs", null, 1, 1, ComposedAttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeAssignmentExpressionEClass, AttributeAssignmentExpression.class, "AttributeAssignmentExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleAttributeTypeEClass, SimpleAttributeType.class, "SimpleAttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleAttributeType_Type(), this.getSupportedType(), "type", null, 1, 1, SimpleAttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listAttributeTypeEClass, ListAttributeType.class, "ListAttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListAttributeType_Types(), this.getSupportedType(), "types", null, 1, -1, ListAttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldTypeEClass, FieldType.class, "FieldType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bracketedValueEClass, BracketedValue.class, "BracketedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBracketedValue_Value(), this.getValueExpression(), null, "value", null, 1, 1, BracketedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteValueEClass, ConcreteValue.class, "ConcreteValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteValue_Value(), this.getValue(), null, "value", null, 1, 1, ConcreteValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parenthesizedValueEClass, ParenthesizedValue.class, "ParenthesizedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParenthesizedValue_Value(), this.getValueExpression(), null, "value", null, 1, 1, ParenthesizedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entitytReferenceEClass, EntitytReference.class, "EntitytReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntitytReference_Handle_id(), ecorePackage.getEInt(), "handle_id", null, 0, 1, EntitytReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntitytReference_Entity_id(), this.getObjectDeclaration(), null, "entity_id", null, 1, 1, EntitytReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventConditionEClass, EventCondition.class, "EventCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventCondition_Event_reference(), this.getEventReference(), null, "event_reference", null, 1, 1, EventCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventReferenceEClass, EventReference.class, "EventReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventReference_Event_id(), this.getEventDeclaration(), null, "event_id", null, 1, 1, EventReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionRuleEClass, ExecutionRule.class, "ExecutionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionRule_Execution_expression(), this.getExecutionExpression(), null, "execution_expression", null, 1, 1, ExecutionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionExpressionEClass, ExecutionExpression.class, "ExecutionExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(composedExecutionEClass, ComposedExecution.class, "ComposedExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposedExecution_Lhs(), this.getExecutionExpression(), null, "lhs", null, 1, 1, ComposedExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedExecution_Rhs(), this.getExecutionExpression(), null, "rhs", null, 1, 1, ComposedExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposedExecution_Operator(), this.getUpdateOperator(), "operator", null, 1, 1, ComposedExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Attribute_condition_expression(), this.getAttributeConditionExpression(), null, "attribute_condition_expression", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pipAttributeTypeEClass, PIPAttributeType.class, "PIPAttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPIPAttributeType_Pip_options(), this.getPIPOption(), null, "pip_options", null, 0, -1, PIPAttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pipOptionEClass, PIPOption.class, "PIPOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPIPOption_Type(), this.getOptions(), "type", null, 1, 1, PIPOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPIPOption_Value(), this.getValue(), null, "value", null, 1, 1, PIPOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trueEClass, True.class, "True", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srUnderscoreEClass, SRUnderscore.class, "SRUnderscore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSRUnderscore_Value(), ecorePackage.getEString(), "value", null, 1, 1, SRUnderscore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(supportedTypeEEnum, SupportedType.class, "SupportedType");
		addEEnumLiteral(supportedTypeEEnum, SupportedType.INTEGER);
		addEEnumLiteral(supportedTypeEEnum, SupportedType.STRING);
		addEEnumLiteral(supportedTypeEEnum, SupportedType.BOOLEAN);
		addEEnumLiteral(supportedTypeEEnum, SupportedType.DOUBLE);
		addEEnumLiteral(supportedTypeEEnum, SupportedType.FLOAT);
		addEEnumLiteral(supportedTypeEEnum, SupportedType.LONG);

		initEEnum(arithmeticOperatorEEnum, ArithmeticOperator.class, "ArithmeticOperator");
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.ADDITION);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.SUBTRACTION);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.DIVISION);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.MULTIPLICATION);

		initEEnum(comparisonOperatorEEnum, ComparisonOperator.class, "ComparisonOperator");
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS_THAN);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS_THAN_EQUALS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER_THAN);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER_THAN_EQUALS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.EQUALS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.NOT_EQUALS);

		initEEnum(binaryOperatorEEnum, BinaryOperator.class, "BinaryOperator");
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.CONJUNCTION);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.DISJUNCTION);

		initEEnum(updateRuleTypeEEnum, UpdateRuleType.class, "UpdateRuleType");
		addEEnumLiteral(updateRuleTypeEEnum, UpdateRuleType.PRE_UPDATE);
		addEEnumLiteral(updateRuleTypeEEnum, UpdateRuleType.POST_UPDATE);

		initEEnum(updateOperatorEEnum, UpdateOperator.class, "UpdateOperator");
		addEEnumLiteral(updateOperatorEEnum, UpdateOperator.FOLLOWED_BY);
		addEEnumLiteral(updateOperatorEEnum, UpdateOperator.DISJUNCTION);

		initEEnum(modificationOperationEEnum, ModificationOperation.class, "ModificationOperation");
		addEEnumLiteral(modificationOperationEEnum, ModificationOperation.ENCRYPTION);
		addEEnumLiteral(modificationOperationEEnum, ModificationOperation.ANONYMIZATION);

		initEEnum(policyTypeEEnum, PolicyType.class, "PolicyType");
		addEEnumLiteral(policyTypeEEnum, PolicyType.OPEN);
		addEEnumLiteral(policyTypeEEnum, PolicyType.CLOSED);
		addEEnumLiteral(policyTypeEEnum, PolicyType.EXPLICIT_PERMIT_OVERRIDES);
		addEEnumLiteral(policyTypeEEnum, PolicyType.EXPLICIT_DENY_OVERRIDES);

		initEEnum(accessControlRuleTypeEEnum, AccessControlRuleType.class, "AccessControlRuleType");
		addEEnumLiteral(accessControlRuleTypeEEnum, AccessControlRuleType.PERMISSION);
		addEEnumLiteral(accessControlRuleTypeEEnum, AccessControlRuleType.PROHIBITION);

		initEEnum(obligationRuleTypeEEnum, ObligationRuleType.class, "ObligationRuleType");
		addEEnumLiteral(obligationRuleTypeEEnum, ObligationRuleType.MAINTENANCE);
		addEEnumLiteral(obligationRuleTypeEEnum, ObligationRuleType.ACHIEVEMENT);

		initEEnum(calendarEEnum, Calendar.class, "Calendar");
		addEEnumLiteral(calendarEEnum, Calendar.DAYS);
		addEEnumLiteral(calendarEEnum, Calendar.HOURS);
		addEEnumLiteral(calendarEEnum, Calendar.MINUTES);
		addEEnumLiteral(calendarEEnum, Calendar.SECONDS);

		initEEnum(conditionTypeEEnum, ConditionType.class, "ConditionType");
		addEEnumLiteral(conditionTypeEEnum, ConditionType.EVENT);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.ENTITY);

		initEEnum(executionTypeEEnum, ExecutionType.class, "ExecutionType");
		addEEnumLiteral(executionTypeEEnum, ExecutionType.MANDATORY);
		addEEnumLiteral(executionTypeEEnum, ExecutionType.OPTIONAL);

		initEEnum(optionsEEnum, Options.class, "Options");
		addEEnumLiteral(optionsEEnum, Options.FREQUENCY);
		addEEnumLiteral(optionsEEnum, Options.NOTIFICATION);
		addEEnumLiteral(optionsEEnum, Options.MONITORING);

		// Create resource
		createResource(eNS_URI);
	}

} //SARPackageImpl
