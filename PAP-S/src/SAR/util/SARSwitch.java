/**
 */
package SAR.util;

import SAR.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see SAR.SARPackage
 * @generated
 */
public class SARSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SARPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SARSwitch() {
		if (modelPackage == null) {
			modelPackage = SARPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SARPackage.SECURITY_CONFIGURATION: {
				SecurityConfiguration securityConfiguration = (SecurityConfiguration)theEObject;
				T result = caseSecurityConfiguration(securityConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.EVENT_DECLARATION: {
				EventDeclaration eventDeclaration = (EventDeclaration)theEObject;
				T result = caseEventDeclaration(eventDeclaration);
				if (result == null) result = caseObjectDeclaration(eventDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.MONITORING: {
				Monitoring monitoring = (Monitoring)theEObject;
				T result = caseMonitoring(monitoring);
				if (result == null) result = caseEventDeclaration(monitoring);
				if (result == null) result = caseObjectDeclaration(monitoring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.INTERCEPTION: {
				Interception interception = (Interception)theEObject;
				T result = caseInterception(interception);
				if (result == null) result = caseEventDeclaration(interception);
				if (result == null) result = caseObjectDeclaration(interception);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.EXECUTION: {
				Execution execution = (Execution)theEObject;
				T result = caseExecution(execution);
				if (result == null) result = caseEventDeclaration(execution);
				if (result == null) result = caseObjectDeclaration(execution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.EVENT_ATTRIBUTE: {
				EventAttribute eventAttribute = (EventAttribute)theEObject;
				T result = caseEventAttribute(eventAttribute);
				if (result == null) result = caseAttributeDeclaration(eventAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.ENTITY_DECLARATION: {
				EntityDeclaration entityDeclaration = (EntityDeclaration)theEObject;
				T result = caseEntityDeclaration(entityDeclaration);
				if (result == null) result = caseObjectDeclaration(entityDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.ATTRIBUTE_DECLARATION: {
				AttributeDeclaration attributeDeclaration = (AttributeDeclaration)theEObject;
				T result = caseAttributeDeclaration(attributeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.ENTITY_ATTRIBUTE: {
				EntityAttribute entityAttribute = (EntityAttribute)theEObject;
				T result = caseEntityAttribute(entityAttribute);
				if (result == null) result = caseAttributeDeclaration(entityAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.CONDITION_EXPRESSION: {
				ConditionExpression conditionExpression = (ConditionExpression)theEObject;
				T result = caseConditionExpression(conditionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.STATE_CONDITION: {
				StateCondition stateCondition = (StateCondition)theEObject;
				T result = caseStateCondition(stateCondition);
				if (result == null) result = caseCondition(stateCondition);
				if (result == null) result = caseConditionExpression(stateCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseAttributeValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseValue(text);
				if (result == null) result = caseAttributeValue(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.SR_BOOLEAN: {
				SRBoolean srBoolean = (SRBoolean)theEObject;
				T result = caseSRBoolean(srBoolean);
				if (result == null) result = caseValue(srBoolean);
				if (result == null) result = caseAttributeValue(srBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.CONCRETE_ARITHMETIC_EXPRESSION: {
				ConcreteArithmeticExpression concreteArithmeticExpression = (ConcreteArithmeticExpression)theEObject;
				T result = caseConcreteArithmeticExpression(concreteArithmeticExpression);
				if (result == null) result = caseValue(concreteArithmeticExpression);
				if (result == null) result = caseAttributeValue(concreteArithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.ARITHMETIC_EXPRESSION: {
				ArithmeticExpression arithmeticExpression = (ArithmeticExpression)theEObject;
				T result = caseArithmeticExpression(arithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.SR_INTEGER: {
				SRInteger srInteger = (SRInteger)theEObject;
				T result = caseSRInteger(srInteger);
				if (result == null) result = caseArithmeticExpression(srInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseArithmeticExpression(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.SR_FLOAT: {
				SRFloat srFloat = (SRFloat)theEObject;
				T result = caseSRFloat(srFloat);
				if (result == null) result = caseArithmeticExpression(srFloat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.ARITHMETIC_OPERATION: {
				ArithmeticOperation arithmeticOperation = (ArithmeticOperation)theEObject;
				T result = caseArithmeticOperation(arithmeticOperation);
				if (result == null) result = caseArithmeticExpression(arithmeticOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.ATTRIBUTE_CONDITION: {
				AttributeCondition attributeCondition = (AttributeCondition)theEObject;
				T result = caseAttributeCondition(attributeCondition);
				if (result == null) result = caseAttributeConditionExpression(attributeCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.NEGATED_CE: {
				NegatedCE negatedCE = (NegatedCE)theEObject;
				T result = caseNegatedCE(negatedCE);
				if (result == null) result = caseConditionExpression(negatedCE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.COMPOSED_CE: {
				ComposedCE composedCE = (ComposedCE)theEObject;
				T result = caseComposedCE(composedCE);
				if (result == null) result = caseConditionExpression(composedCE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.PREDICATE: {
				Predicate predicate = (Predicate)theEObject;
				T result = casePredicate(predicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.ABSTRACT_CONDITION: {
				AbstractCondition abstractCondition = (AbstractCondition)theEObject;
				T result = caseAbstractCondition(abstractCondition);
				if (result == null) result = caseConditionExpression(abstractCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.PREDICATE_DEFINITION: {
				PredicateDefinition predicateDefinition = (PredicateDefinition)theEObject;
				T result = casePredicateDefinition(predicateDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.ARITHMETIC_COMPARISON: {
				ArithmeticComparison arithmeticComparison = (ArithmeticComparison)theEObject;
				T result = caseArithmeticComparison(arithmeticComparison);
				if (result == null) result = caseConditionExpression(arithmeticComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.PARENTHESIZED_CE: {
				ParenthesizedCE parenthesizedCE = (ParenthesizedCE)theEObject;
				T result = caseParenthesizedCE(parenthesizedCE);
				if (result == null) result = caseConditionExpression(parenthesizedCE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.UPDATE_RULE: {
				UpdateRule updateRule = (UpdateRule)theEObject;
				T result = caseUpdateRule(updateRule);
				if (result == null) result = caseRule(updateRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.UPDATE_EXPRESSION: {
				UpdateExpression updateExpression = (UpdateExpression)theEObject;
				T result = caseUpdateExpression(updateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.UPDATE_ATTRIBUTE: {
				UpdateAttribute updateAttribute = (UpdateAttribute)theEObject;
				T result = caseUpdateAttribute(updateAttribute);
				if (result == null) result = caseUpdateExpression(updateAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.EVENT_EXECUTION: {
				EventExecution eventExecution = (EventExecution)theEObject;
				T result = caseEventExecution(eventExecution);
				if (result == null) result = caseExecutionExpression(eventExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.COMPOSED_UPDATE: {
				ComposedUpdate composedUpdate = (ComposedUpdate)theEObject;
				T result = caseComposedUpdate(composedUpdate);
				if (result == null) result = caseUpdateExpression(composedUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.PARENTHESIZED_UPDATE: {
				ParenthesizedUpdate parenthesizedUpdate = (ParenthesizedUpdate)theEObject;
				T result = caseParenthesizedUpdate(parenthesizedUpdate);
				if (result == null) result = caseUpdateExpression(parenthesizedUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.DELETE: {
				Delete delete = (Delete)theEObject;
				T result = caseDelete(delete);
				if (result == null) result = caseUpdateObject(delete);
				if (result == null) result = caseUpdateExpression(delete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.UPDATE: {
				Update update = (Update)theEObject;
				T result = caseUpdate(update);
				if (result == null) result = caseUpdateAttribute(update);
				if (result == null) result = caseUpdateExpression(update);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.ADD: {
				Add add = (Add)theEObject;
				T result = caseAdd(add);
				if (result == null) result = caseUpdateAttribute(add);
				if (result == null) result = caseUpdateExpression(add);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.PRE_UPDATE_RULE: {
				PreUpdateRule preUpdateRule = (PreUpdateRule)theEObject;
				T result = casePreUpdateRule(preUpdateRule);
				if (result == null) result = caseUpdateRule(preUpdateRule);
				if (result == null) result = caseRule(preUpdateRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.POST_UPDATE_RULE: {
				PostUpdateRule postUpdateRule = (PostUpdateRule)theEObject;
				T result = casePostUpdateRule(postUpdateRule);
				if (result == null) result = caseUpdateRule(postUpdateRule);
				if (result == null) result = caseRule(postUpdateRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.SR_STRING: {
				SRString srString = (SRString)theEObject;
				T result = caseSRString(srString);
				if (result == null) result = caseValue(srString);
				if (result == null) result = caseAttributeValue(srString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.SECURITY_POLICY: {
				SecurityPolicy securityPolicy = (SecurityPolicy)theEObject;
				T result = caseSecurityPolicy(securityPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.ACCESS_CONTROL_RULE: {
				AccessControlRule accessControlRule = (AccessControlRule)theEObject;
				T result = caseAccessControlRule(accessControlRule);
				if (result == null) result = casePolicyRule(accessControlRule);
				if (result == null) result = caseRule(accessControlRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.OBLIGATION_RULE: {
				ObligationRule obligationRule = (ObligationRule)theEObject;
				T result = caseObligationRule(obligationRule);
				if (result == null) result = casePolicyRule(obligationRule);
				if (result == null) result = caseRule(obligationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.POLICY_RULE: {
				PolicyRule policyRule = (PolicyRule)theEObject;
				T result = casePolicyRule(policyRule);
				if (result == null) result = caseRule(policyRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.DELAY: {
				Delay delay = (Delay)theEObject;
				T result = caseDelay(delay);
				if (result == null) result = caseConditionExpression(delay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.OBJECT_DECLARATION: {
				ObjectDeclaration objectDeclaration = (ObjectDeclaration)theEObject;
				T result = caseObjectDeclaration(objectDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.UPDATE_OBJECT: {
				UpdateObject updateObject = (UpdateObject)theEObject;
				T result = caseUpdateObject(updateObject);
				if (result == null) result = caseUpdateExpression(updateObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.CREATE: {
				Create create = (Create)theEObject;
				T result = caseCreate(create);
				if (result == null) result = caseUpdateObject(create);
				if (result == null) result = caseUpdateExpression(create);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.REMOVE: {
				Remove remove = (Remove)theEObject;
				T result = caseRemove(remove);
				if (result == null) result = caseUpdateAttribute(remove);
				if (result == null) result = caseUpdateExpression(remove);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.ATTRIBUTE_VALUE_ASSIGNMENT: {
				AttributeValueAssignment attributeValueAssignment = (AttributeValueAssignment)theEObject;
				T result = caseAttributeValueAssignment(attributeValueAssignment);
				if (result == null) result = caseAttributeAssignmentExpression(attributeValueAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.VALUE_EXPRESSION: {
				ValueExpression valueExpression = (ValueExpression)theEObject;
				T result = caseValueExpression(valueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.COMPOSED_VALUE: {
				ComposedValue composedValue = (ComposedValue)theEObject;
				T result = caseComposedValue(composedValue);
				if (result == null) result = caseValueExpression(composedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.ATTRIBUTE_CONDITION_EXPRESSION: {
				AttributeConditionExpression attributeConditionExpression = (AttributeConditionExpression)theEObject;
				T result = caseAttributeConditionExpression(attributeConditionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.COMPOSED_ATTRIBUTE_CONDITION: {
				ComposedAttributeCondition composedAttributeCondition = (ComposedAttributeCondition)theEObject;
				T result = caseComposedAttributeCondition(composedAttributeCondition);
				if (result == null) result = caseAttributeConditionExpression(composedAttributeCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.COMPOSED_ATTRIBUTE_ASSIGNMENT: {
				ComposedAttributeAssignment composedAttributeAssignment = (ComposedAttributeAssignment)theEObject;
				T result = caseComposedAttributeAssignment(composedAttributeAssignment);
				if (result == null) result = caseAttributeAssignmentExpression(composedAttributeAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.ATTRIBUTE_ASSIGNMENT_EXPRESSION: {
				AttributeAssignmentExpression attributeAssignmentExpression = (AttributeAssignmentExpression)theEObject;
				T result = caseAttributeAssignmentExpression(attributeAssignmentExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.SIMPLE_ATTRIBUTE_TYPE: {
				SimpleAttributeType simpleAttributeType = (SimpleAttributeType)theEObject;
				T result = caseSimpleAttributeType(simpleAttributeType);
				if (result == null) result = caseFieldType(simpleAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.LIST_ATTRIBUTE_TYPE: {
				ListAttributeType listAttributeType = (ListAttributeType)theEObject;
				T result = caseListAttributeType(listAttributeType);
				if (result == null) result = caseFieldType(listAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.FIELD_TYPE: {
				FieldType fieldType = (FieldType)theEObject;
				T result = caseFieldType(fieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.BRACKETED_VALUE: {
				BracketedValue bracketedValue = (BracketedValue)theEObject;
				T result = caseBracketedValue(bracketedValue);
				if (result == null) result = caseAttributeValue(bracketedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.CONCRETE_VALUE: {
				ConcreteValue concreteValue = (ConcreteValue)theEObject;
				T result = caseConcreteValue(concreteValue);
				if (result == null) result = caseValueExpression(concreteValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.ATTRIBUTE_VALUE: {
				AttributeValue attributeValue = (AttributeValue)theEObject;
				T result = caseAttributeValue(attributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.PARENTHESIZED_VALUE: {
				ParenthesizedValue parenthesizedValue = (ParenthesizedValue)theEObject;
				T result = caseParenthesizedValue(parenthesizedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.ENTITYT_REFERENCE: {
				EntitytReference entitytReference = (EntitytReference)theEObject;
				T result = caseEntitytReference(entitytReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.EVENT_CONDITION: {
				EventCondition eventCondition = (EventCondition)theEObject;
				T result = caseEventCondition(eventCondition);
				if (result == null) result = caseCondition(eventCondition);
				if (result == null) result = caseConditionExpression(eventCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.EVENT_REFERENCE: {
				EventReference eventReference = (EventReference)theEObject;
				T result = caseEventReference(eventReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.EXECUTION_RULE: {
				ExecutionRule executionRule = (ExecutionRule)theEObject;
				T result = caseExecutionRule(executionRule);
				if (result == null) result = casePolicyRule(executionRule);
				if (result == null) result = caseRule(executionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.EXECUTION_EXPRESSION: {
				ExecutionExpression executionExpression = (ExecutionExpression)theEObject;
				T result = caseExecutionExpression(executionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.COMPOSED_EXECUTION: {
				ComposedExecution composedExecution = (ComposedExecution)theEObject;
				T result = caseComposedExecution(composedExecution);
				if (result == null) result = caseExecutionExpression(composedExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseConditionExpression(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.PIP_ATTRIBUTE_TYPE: {
				PIPAttributeType pipAttributeType = (PIPAttributeType)theEObject;
				T result = casePIPAttributeType(pipAttributeType);
				if (result == null) result = caseEntityAttribute(pipAttributeType);
				if (result == null) result = caseAttributeDeclaration(pipAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.PIP_OPTION: {
				PIPOption pipOption = (PIPOption)theEObject;
				T result = casePIPOption(pipOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.TRUE: {
				True true_ = (True)theEObject;
				T result = caseTrue(true_);
				if (result == null) result = caseConditionExpression(true_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SARPackage.SR_UNDERSCORE: {
				SRUnderscore srUnderscore = (SRUnderscore)theEObject;
				T result = caseSRUnderscore(srUnderscore);
				if (result == null) result = caseValue(srUnderscore);
				if (result == null) result = caseAttributeValue(srUnderscore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityConfiguration(SecurityConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDeclaration(EventDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitoring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitoring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoring(Monitoring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterception(Interception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecution(Execution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventAttribute(EventAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityDeclaration(EntityDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDeclaration(AttributeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityAttribute(EntityAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionExpression(ConditionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateCondition(StateCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SR Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SR Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSRBoolean(SRBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteArithmeticExpression(ConcreteArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticExpression(ArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SR Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SR Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSRInteger(SRInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SR Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SR Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSRFloat(SRFloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticOperation(ArithmeticOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeCondition(AttributeCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negated CE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negated CE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegatedCE(NegatedCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed CE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed CE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedCE(ComposedCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicate(Predicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCondition(AbstractCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateDefinition(PredicateDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticComparison(ArithmeticComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parenthesized CE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parenthesized CE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParenthesizedCE(ParenthesizedCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateRule(UpdateRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateExpression(UpdateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateAttribute(UpdateAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventExecution(EventExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedUpdate(ComposedUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parenthesized Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parenthesized Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParenthesizedUpdate(ParenthesizedUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelete(Delete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdate(Update object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdd(Add object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Update Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Update Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreUpdateRule(PreUpdateRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Update Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Update Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostUpdateRule(PostUpdateRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SR String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SR String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSRString(SRString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityPolicy(SecurityPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Control Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Control Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessControlRule(AccessControlRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obligation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obligation Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObligationRule(ObligationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyRule(PolicyRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelay(Delay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectDeclaration(ObjectDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateObject(UpdateObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreate(Create object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemove(Remove object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueAssignment(AttributeValueAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueExpression(ValueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedValue(ComposedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Condition Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Condition Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeConditionExpression(AttributeConditionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Attribute Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Attribute Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedAttributeCondition(ComposedAttributeCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Attribute Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedAttributeAssignment(ComposedAttributeAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Assignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Assignment Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeAssignmentExpression(AttributeAssignmentExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleAttributeType(SimpleAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListAttributeType(ListAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldType(FieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bracketed Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bracketed Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBracketedValue(BracketedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteValue(ConcreteValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValue(AttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parenthesized Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parenthesized Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParenthesizedValue(ParenthesizedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entityt Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entityt Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntitytReference(EntitytReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventCondition(EventCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventReference(EventReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionRule(ExecutionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionExpression(ExecutionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedExecution(ComposedExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PIP Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PIP Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePIPAttributeType(PIPAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PIP Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PIP Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePIPOption(PIPOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrue(True object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SR Underscore</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SR Underscore</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSRUnderscore(SRUnderscore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SARSwitch
