/**
 */
package SAR.util;

import SAR.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SAR.SARPackage
 * @generated
 */
public class SARAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SARPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SARAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SARPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SARSwitch<Adapter> modelSwitch =
		new SARSwitch<Adapter>() {
			@Override
			public Adapter caseSecurityConfiguration(SecurityConfiguration object) {
				return createSecurityConfigurationAdapter();
			}
			@Override
			public Adapter caseEventDeclaration(EventDeclaration object) {
				return createEventDeclarationAdapter();
			}
			@Override
			public Adapter caseMonitoring(Monitoring object) {
				return createMonitoringAdapter();
			}
			@Override
			public Adapter caseInterception(Interception object) {
				return createInterceptionAdapter();
			}
			@Override
			public Adapter caseExecution(Execution object) {
				return createExecutionAdapter();
			}
			@Override
			public Adapter caseEventAttribute(EventAttribute object) {
				return createEventAttributeAdapter();
			}
			@Override
			public Adapter caseEntityDeclaration(EntityDeclaration object) {
				return createEntityDeclarationAdapter();
			}
			@Override
			public Adapter caseAttributeDeclaration(AttributeDeclaration object) {
				return createAttributeDeclarationAdapter();
			}
			@Override
			public Adapter caseEntityAttribute(EntityAttribute object) {
				return createEntityAttributeAdapter();
			}
			@Override
			public Adapter caseConditionExpression(ConditionExpression object) {
				return createConditionExpressionAdapter();
			}
			@Override
			public Adapter caseStateCondition(StateCondition object) {
				return createStateConditionAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseSRBoolean(SRBoolean object) {
				return createSRBooleanAdapter();
			}
			@Override
			public Adapter caseConcreteArithmeticExpression(ConcreteArithmeticExpression object) {
				return createConcreteArithmeticExpressionAdapter();
			}
			@Override
			public Adapter caseArithmeticExpression(ArithmeticExpression object) {
				return createArithmeticExpressionAdapter();
			}
			@Override
			public Adapter caseSRInteger(SRInteger object) {
				return createSRIntegerAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseSRFloat(SRFloat object) {
				return createSRFloatAdapter();
			}
			@Override
			public Adapter caseArithmeticOperation(ArithmeticOperation object) {
				return createArithmeticOperationAdapter();
			}
			@Override
			public Adapter caseAttributeCondition(AttributeCondition object) {
				return createAttributeConditionAdapter();
			}
			@Override
			public Adapter caseNegatedCE(NegatedCE object) {
				return createNegatedCEAdapter();
			}
			@Override
			public Adapter caseComposedCE(ComposedCE object) {
				return createComposedCEAdapter();
			}
			@Override
			public Adapter casePredicate(Predicate object) {
				return createPredicateAdapter();
			}
			@Override
			public Adapter caseAbstractCondition(AbstractCondition object) {
				return createAbstractConditionAdapter();
			}
			@Override
			public Adapter casePredicateDefinition(PredicateDefinition object) {
				return createPredicateDefinitionAdapter();
			}
			@Override
			public Adapter caseArithmeticComparison(ArithmeticComparison object) {
				return createArithmeticComparisonAdapter();
			}
			@Override
			public Adapter caseParenthesizedCE(ParenthesizedCE object) {
				return createParenthesizedCEAdapter();
			}
			@Override
			public Adapter caseUpdateRule(UpdateRule object) {
				return createUpdateRuleAdapter();
			}
			@Override
			public Adapter caseUpdateExpression(UpdateExpression object) {
				return createUpdateExpressionAdapter();
			}
			@Override
			public Adapter caseUpdateAttribute(UpdateAttribute object) {
				return createUpdateAttributeAdapter();
			}
			@Override
			public Adapter caseEventExecution(EventExecution object) {
				return createEventExecutionAdapter();
			}
			@Override
			public Adapter caseComposedUpdate(ComposedUpdate object) {
				return createComposedUpdateAdapter();
			}
			@Override
			public Adapter caseParenthesizedUpdate(ParenthesizedUpdate object) {
				return createParenthesizedUpdateAdapter();
			}
			@Override
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
			}
			@Override
			public Adapter caseUpdate(Update object) {
				return createUpdateAdapter();
			}
			@Override
			public Adapter caseAdd(Add object) {
				return createAddAdapter();
			}
			@Override
			public Adapter casePreUpdateRule(PreUpdateRule object) {
				return createPreUpdateRuleAdapter();
			}
			@Override
			public Adapter casePostUpdateRule(PostUpdateRule object) {
				return createPostUpdateRuleAdapter();
			}
			@Override
			public Adapter caseSRString(SRString object) {
				return createSRStringAdapter();
			}
			@Override
			public Adapter caseSecurityPolicy(SecurityPolicy object) {
				return createSecurityPolicyAdapter();
			}
			@Override
			public Adapter caseAccessControlRule(AccessControlRule object) {
				return createAccessControlRuleAdapter();
			}
			@Override
			public Adapter caseObligationRule(ObligationRule object) {
				return createObligationRuleAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter casePolicyRule(PolicyRule object) {
				return createPolicyRuleAdapter();
			}
			@Override
			public Adapter caseDelay(Delay object) {
				return createDelayAdapter();
			}
			@Override
			public Adapter caseObjectDeclaration(ObjectDeclaration object) {
				return createObjectDeclarationAdapter();
			}
			@Override
			public Adapter caseUpdateObject(UpdateObject object) {
				return createUpdateObjectAdapter();
			}
			@Override
			public Adapter caseCreate(Create object) {
				return createCreateAdapter();
			}
			@Override
			public Adapter caseRemove(Remove object) {
				return createRemoveAdapter();
			}
			@Override
			public Adapter caseAttributeValueAssignment(AttributeValueAssignment object) {
				return createAttributeValueAssignmentAdapter();
			}
			@Override
			public Adapter caseValueExpression(ValueExpression object) {
				return createValueExpressionAdapter();
			}
			@Override
			public Adapter caseComposedValue(ComposedValue object) {
				return createComposedValueAdapter();
			}
			@Override
			public Adapter caseAttributeConditionExpression(AttributeConditionExpression object) {
				return createAttributeConditionExpressionAdapter();
			}
			@Override
			public Adapter caseComposedAttributeCondition(ComposedAttributeCondition object) {
				return createComposedAttributeConditionAdapter();
			}
			@Override
			public Adapter caseComposedAttributeAssignment(ComposedAttributeAssignment object) {
				return createComposedAttributeAssignmentAdapter();
			}
			@Override
			public Adapter caseAttributeAssignmentExpression(AttributeAssignmentExpression object) {
				return createAttributeAssignmentExpressionAdapter();
			}
			@Override
			public Adapter caseSimpleAttributeType(SimpleAttributeType object) {
				return createSimpleAttributeTypeAdapter();
			}
			@Override
			public Adapter caseListAttributeType(ListAttributeType object) {
				return createListAttributeTypeAdapter();
			}
			@Override
			public Adapter caseFieldType(FieldType object) {
				return createFieldTypeAdapter();
			}
			@Override
			public Adapter caseBracketedValue(BracketedValue object) {
				return createBracketedValueAdapter();
			}
			@Override
			public Adapter caseConcreteValue(ConcreteValue object) {
				return createConcreteValueAdapter();
			}
			@Override
			public Adapter caseAttributeValue(AttributeValue object) {
				return createAttributeValueAdapter();
			}
			@Override
			public Adapter caseParenthesizedValue(ParenthesizedValue object) {
				return createParenthesizedValueAdapter();
			}
			@Override
			public Adapter caseEntitytReference(EntitytReference object) {
				return createEntitytReferenceAdapter();
			}
			@Override
			public Adapter caseEventCondition(EventCondition object) {
				return createEventConditionAdapter();
			}
			@Override
			public Adapter caseEventReference(EventReference object) {
				return createEventReferenceAdapter();
			}
			@Override
			public Adapter caseExecutionRule(ExecutionRule object) {
				return createExecutionRuleAdapter();
			}
			@Override
			public Adapter caseExecutionExpression(ExecutionExpression object) {
				return createExecutionExpressionAdapter();
			}
			@Override
			public Adapter caseComposedExecution(ComposedExecution object) {
				return createComposedExecutionAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter casePIPAttributeType(PIPAttributeType object) {
				return createPIPAttributeTypeAdapter();
			}
			@Override
			public Adapter casePIPOption(PIPOption object) {
				return createPIPOptionAdapter();
			}
			@Override
			public Adapter caseTrue(True object) {
				return createTrueAdapter();
			}
			@Override
			public Adapter caseSRUnderscore(SRUnderscore object) {
				return createSRUnderscoreAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link SAR.SecurityConfiguration <em>Security Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.SecurityConfiguration
	 * @generated
	 */
	public Adapter createSecurityConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.EventDeclaration <em>Event Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.EventDeclaration
	 * @generated
	 */
	public Adapter createEventDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.Monitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.Monitoring
	 * @generated
	 */
	public Adapter createMonitoringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.Interception <em>Interception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.Interception
	 * @generated
	 */
	public Adapter createInterceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.Execution
	 * @generated
	 */
	public Adapter createExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.EventAttribute <em>Event Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.EventAttribute
	 * @generated
	 */
	public Adapter createEventAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.EntityDeclaration <em>Entity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.EntityDeclaration
	 * @generated
	 */
	public Adapter createEntityDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.AttributeDeclaration <em>Attribute Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.AttributeDeclaration
	 * @generated
	 */
	public Adapter createAttributeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.EntityAttribute <em>Entity Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.EntityAttribute
	 * @generated
	 */
	public Adapter createEntityAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ConditionExpression
	 * @generated
	 */
	public Adapter createConditionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.StateCondition <em>State Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.StateCondition
	 * @generated
	 */
	public Adapter createStateConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.SRBoolean <em>SR Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.SRBoolean
	 * @generated
	 */
	public Adapter createSRBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ConcreteArithmeticExpression <em>Concrete Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ConcreteArithmeticExpression
	 * @generated
	 */
	public Adapter createConcreteArithmeticExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ArithmeticExpression
	 * @generated
	 */
	public Adapter createArithmeticExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.SRInteger <em>SR Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.SRInteger
	 * @generated
	 */
	public Adapter createSRIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.SRFloat <em>SR Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.SRFloat
	 * @generated
	 */
	public Adapter createSRFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ArithmeticOperation <em>Arithmetic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ArithmeticOperation
	 * @generated
	 */
	public Adapter createArithmeticOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.AttributeCondition <em>Attribute Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.AttributeCondition
	 * @generated
	 */
	public Adapter createAttributeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.NegatedCE <em>Negated CE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.NegatedCE
	 * @generated
	 */
	public Adapter createNegatedCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ComposedCE <em>Composed CE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ComposedCE
	 * @generated
	 */
	public Adapter createComposedCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.Predicate
	 * @generated
	 */
	public Adapter createPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.AbstractCondition <em>Abstract Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.AbstractCondition
	 * @generated
	 */
	public Adapter createAbstractConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.PredicateDefinition <em>Predicate Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.PredicateDefinition
	 * @generated
	 */
	public Adapter createPredicateDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ArithmeticComparison <em>Arithmetic Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ArithmeticComparison
	 * @generated
	 */
	public Adapter createArithmeticComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ParenthesizedCE <em>Parenthesized CE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ParenthesizedCE
	 * @generated
	 */
	public Adapter createParenthesizedCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.UpdateRule <em>Update Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.UpdateRule
	 * @generated
	 */
	public Adapter createUpdateRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.UpdateExpression <em>Update Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.UpdateExpression
	 * @generated
	 */
	public Adapter createUpdateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.UpdateAttribute <em>Update Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.UpdateAttribute
	 * @generated
	 */
	public Adapter createUpdateAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.EventExecution <em>Event Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.EventExecution
	 * @generated
	 */
	public Adapter createEventExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ComposedUpdate <em>Composed Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ComposedUpdate
	 * @generated
	 */
	public Adapter createComposedUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ParenthesizedUpdate <em>Parenthesized Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ParenthesizedUpdate
	 * @generated
	 */
	public Adapter createParenthesizedUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.Update
	 * @generated
	 */
	public Adapter createUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.Add
	 * @generated
	 */
	public Adapter createAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.PreUpdateRule <em>Pre Update Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.PreUpdateRule
	 * @generated
	 */
	public Adapter createPreUpdateRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.PostUpdateRule <em>Post Update Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.PostUpdateRule
	 * @generated
	 */
	public Adapter createPostUpdateRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.SRString <em>SR String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.SRString
	 * @generated
	 */
	public Adapter createSRStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.SecurityPolicy <em>Security Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.SecurityPolicy
	 * @generated
	 */
	public Adapter createSecurityPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.AccessControlRule <em>Access Control Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.AccessControlRule
	 * @generated
	 */
	public Adapter createAccessControlRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ObligationRule <em>Obligation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ObligationRule
	 * @generated
	 */
	public Adapter createObligationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.PolicyRule <em>Policy Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.PolicyRule
	 * @generated
	 */
	public Adapter createPolicyRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.Delay
	 * @generated
	 */
	public Adapter createDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ObjectDeclaration <em>Object Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ObjectDeclaration
	 * @generated
	 */
	public Adapter createObjectDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.UpdateObject <em>Update Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.UpdateObject
	 * @generated
	 */
	public Adapter createUpdateObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.Create
	 * @generated
	 */
	public Adapter createCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.Remove
	 * @generated
	 */
	public Adapter createRemoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.AttributeValueAssignment <em>Attribute Value Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.AttributeValueAssignment
	 * @generated
	 */
	public Adapter createAttributeValueAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ValueExpression
	 * @generated
	 */
	public Adapter createValueExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ComposedValue <em>Composed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ComposedValue
	 * @generated
	 */
	public Adapter createComposedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.AttributeConditionExpression <em>Attribute Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.AttributeConditionExpression
	 * @generated
	 */
	public Adapter createAttributeConditionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ComposedAttributeCondition <em>Composed Attribute Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ComposedAttributeCondition
	 * @generated
	 */
	public Adapter createComposedAttributeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ComposedAttributeAssignment <em>Composed Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ComposedAttributeAssignment
	 * @generated
	 */
	public Adapter createComposedAttributeAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.AttributeAssignmentExpression <em>Attribute Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.AttributeAssignmentExpression
	 * @generated
	 */
	public Adapter createAttributeAssignmentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.SimpleAttributeType <em>Simple Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.SimpleAttributeType
	 * @generated
	 */
	public Adapter createSimpleAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ListAttributeType <em>List Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ListAttributeType
	 * @generated
	 */
	public Adapter createListAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.FieldType
	 * @generated
	 */
	public Adapter createFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.BracketedValue <em>Bracketed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.BracketedValue
	 * @generated
	 */
	public Adapter createBracketedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ConcreteValue <em>Concrete Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ConcreteValue
	 * @generated
	 */
	public Adapter createConcreteValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.AttributeValue
	 * @generated
	 */
	public Adapter createAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ParenthesizedValue <em>Parenthesized Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ParenthesizedValue
	 * @generated
	 */
	public Adapter createParenthesizedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.EntitytReference <em>Entityt Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.EntitytReference
	 * @generated
	 */
	public Adapter createEntitytReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.EventCondition <em>Event Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.EventCondition
	 * @generated
	 */
	public Adapter createEventConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.EventReference <em>Event Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.EventReference
	 * @generated
	 */
	public Adapter createEventReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ExecutionRule <em>Execution Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ExecutionRule
	 * @generated
	 */
	public Adapter createExecutionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ExecutionExpression <em>Execution Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ExecutionExpression
	 * @generated
	 */
	public Adapter createExecutionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.ComposedExecution <em>Composed Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.ComposedExecution
	 * @generated
	 */
	public Adapter createComposedExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.PIPAttributeType <em>PIP Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.PIPAttributeType
	 * @generated
	 */
	public Adapter createPIPAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.PIPOption <em>PIP Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.PIPOption
	 * @generated
	 */
	public Adapter createPIPOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.True
	 * @generated
	 */
	public Adapter createTrueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SAR.SRUnderscore <em>SR Underscore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SAR.SRUnderscore
	 * @generated
	 */
	public Adapter createSRUnderscoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SARAdapterFactory
