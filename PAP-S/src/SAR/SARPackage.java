/**
 */
package SAR;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SAR.SARFactory
 * @model kind="package"
 * @generated
 */
public interface SARPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SAR";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sar.com/s";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SecRunS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SARPackage eINSTANCE = SAR.impl.SARPackageImpl.init();

	/**
	 * The meta object id for the '{@link SAR.impl.SecurityConfigurationImpl <em>Security Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.SecurityConfigurationImpl
	 * @see SAR.impl.SARPackageImpl#getSecurityConfiguration()
	 * @generated
	 */
	int SECURITY_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONFIGURATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Event declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONFIGURATION__EVENT_DECLARATIONS = 1;

	/**
	 * The feature id for the '<em><b>Entity declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONFIGURATION__ENTITY_DECLARATIONS = 2;

	/**
	 * The feature id for the '<em><b>Predicate definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONFIGURATION__PREDICATE_DEFINITIONS = 3;

	/**
	 * The feature id for the '<em><b>Pre updates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONFIGURATION__PRE_UPDATES = 4;

	/**
	 * The feature id for the '<em><b>Post updates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONFIGURATION__POST_UPDATES = 5;

	/**
	 * The feature id for the '<em><b>Security policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONFIGURATION__SECURITY_POLICY = 6;

	/**
	 * The number of structural features of the '<em>Security Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONFIGURATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Security Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SAR.impl.ObjectDeclarationImpl <em>Object Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ObjectDeclarationImpl
	 * @see SAR.impl.SARPackageImpl#getObjectDeclaration()
	 * @generated
	 */
	int OBJECT_DECLARATION = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_DECLARATION__ID = 0;

	/**
	 * The number of structural features of the '<em>Object Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Object Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SAR.impl.EventDeclarationImpl <em>Event Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.EventDeclarationImpl
	 * @see SAR.impl.SARPackageImpl#getEventDeclaration()
	 * @generated
	 */
	int EVENT_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DECLARATION__ID = OBJECT_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Event attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DECLARATION__EVENT_ATTRIBUTES = OBJECT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DECLARATION_FEATURE_COUNT = OBJECT_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DECLARATION_OPERATION_COUNT = OBJECT_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SAR.impl.MonitoringImpl <em>Monitoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.MonitoringImpl
	 * @see SAR.impl.SARPackageImpl#getMonitoring()
	 * @generated
	 */
	int MONITORING = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__ID = EVENT_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Event attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__EVENT_ATTRIBUTES = EVENT_DECLARATION__EVENT_ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Monitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_FEATURE_COUNT = EVENT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Monitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_OPERATION_COUNT = EVENT_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SAR.impl.InterceptionImpl <em>Interception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.InterceptionImpl
	 * @see SAR.impl.SARPackageImpl#getInterception()
	 * @generated
	 */
	int INTERCEPTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTION__ID = EVENT_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Event attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTION__EVENT_ATTRIBUTES = EVENT_DECLARATION__EVENT_ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Interception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTION_FEATURE_COUNT = EVENT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTION_OPERATION_COUNT = EVENT_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SAR.impl.ExecutionImpl <em>Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ExecutionImpl
	 * @see SAR.impl.SARPackageImpl#getExecution()
	 * @generated
	 */
	int EXECUTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__ID = EVENT_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Event attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__EVENT_ATTRIBUTES = EVENT_DECLARATION__EVENT_ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEATURE_COUNT = EVENT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OPERATION_COUNT = EVENT_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SAR.impl.AttributeDeclarationImpl <em>Attribute Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.AttributeDeclarationImpl
	 * @see SAR.impl.SARPackageImpl#getAttributeDeclaration()
	 * @generated
	 */
	int ATTRIBUTE_DECLARATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DECLARATION__ID = 0;

	/**
	 * The number of structural features of the '<em>Attribute Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SAR.impl.EventAttributeImpl <em>Event Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.EventAttributeImpl
	 * @see SAR.impl.SARPackageImpl#getEventAttribute()
	 * @generated
	 */
	int EVENT_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE__ID = ATTRIBUTE_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Field type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE__FIELD_TYPE = ATTRIBUTE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SAR.impl.EntityDeclarationImpl <em>Entity Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.EntityDeclarationImpl
	 * @see SAR.impl.SARPackageImpl#getEntityDeclaration()
	 * @generated
	 */
	int ENTITY_DECLARATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION__ID = OBJECT_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Entity attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION__ENTITY_ATTRIBUTES = OBJECT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION_FEATURE_COUNT = OBJECT_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION_OPERATION_COUNT = OBJECT_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SAR.impl.EntityAttributeImpl <em>Entity Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.EntityAttributeImpl
	 * @see SAR.impl.SARPackageImpl#getEntityAttribute()
	 * @generated
	 */
	int ENTITY_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__ID = ATTRIBUTE_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Field type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__FIELD_TYPE = ATTRIBUTE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SAR.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ConditionExpressionImpl
	 * @see SAR.impl.SARPackageImpl#getConditionExpression()
	 * @generated
	 */
	int CONDITION_EXPRESSION = 9;

	/**
	 * The number of structural features of the '<em>Condition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SAR.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ConditionImpl
	 * @see SAR.impl.SARPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 70;

	/**
	 * The feature id for the '<em><b>Attribute condition expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ATTRIBUTE_CONDITION_EXPRESSION = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = CONDITION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SAR.impl.StateConditionImpl <em>State Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.StateConditionImpl
	 * @see SAR.impl.SARPackageImpl#getStateCondition()
	 * @generated
	 */
	int STATE_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Attribute condition expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONDITION__ATTRIBUTE_CONDITION_EXPRESSION = CONDITION__ATTRIBUTE_CONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Entity reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONDITION__ENTITY_REFERENCE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SAR.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ValueImpl
	 * @see SAR.impl.SARPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 11;

	/**
	 * The meta object id for the '{@link SAR.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.TextImpl
	 * @see SAR.impl.SARPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 12;

	/**
	 * The meta object id for the '{@link SAR.impl.SRBooleanImpl <em>SR Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.SRBooleanImpl
	 * @see SAR.impl.SARPackageImpl#getSRBoolean()
	 * @generated
	 */
	int SR_BOOLEAN = 13;

	/**
	 * The meta object id for the '{@link SAR.impl.ConcreteArithmeticExpressionImpl <em>Concrete Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ConcreteArithmeticExpressionImpl
	 * @see SAR.impl.SARPackageImpl#getConcreteArithmeticExpression()
	 * @generated
	 */
	int CONCRETE_ARITHMETIC_EXPRESSION = 14;

	/**
	 * The meta object id for the '{@link SAR.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ArithmeticExpressionImpl
	 * @see SAR.impl.SARPackageImpl#getArithmeticExpression()
	 * @generated
	 */
	int ARITHMETIC_EXPRESSION = 15;

	/**
	 * The meta object id for the '{@link SAR.impl.SRIntegerImpl <em>SR Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.SRIntegerImpl
	 * @see SAR.impl.SARPackageImpl#getSRInteger()
	 * @generated
	 */
	int SR_INTEGER = 16;

	/**
	 * The meta object id for the '{@link SAR.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.VariableImpl
	 * @see SAR.impl.SARPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 17;

	/**
	 * The meta object id for the '{@link SAR.impl.SRFloatImpl <em>SR Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.SRFloatImpl
	 * @see SAR.impl.SARPackageImpl#getSRFloat()
	 * @generated
	 */
	int SR_FLOAT = 18;

	/**
	 * The meta object id for the '{@link SAR.impl.ArithmeticOperationImpl <em>Arithmetic Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ArithmeticOperationImpl
	 * @see SAR.impl.SARPackageImpl#getArithmeticOperation()
	 * @generated
	 */
	int ARITHMETIC_OPERATION = 19;

	/**
	 * The meta object id for the '{@link SAR.impl.AttributeConditionExpressionImpl <em>Attribute Condition Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.AttributeConditionExpressionImpl
	 * @see SAR.impl.SARPackageImpl#getAttributeConditionExpression()
	 * @generated
	 */
	int ATTRIBUTE_CONDITION_EXPRESSION = 53;

	/**
	 * The meta object id for the '{@link SAR.impl.AttributeConditionImpl <em>Attribute Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.AttributeConditionImpl
	 * @see SAR.impl.SARPackageImpl#getAttributeCondition()
	 * @generated
	 */
	int ATTRIBUTE_CONDITION = 20;

	/**
	 * The meta object id for the '{@link SAR.impl.NegatedCEImpl <em>Negated CE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.NegatedCEImpl
	 * @see SAR.impl.SARPackageImpl#getNegatedCE()
	 * @generated
	 */
	int NEGATED_CE = 21;

	/**
	 * The meta object id for the '{@link SAR.impl.ComposedCEImpl <em>Composed CE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ComposedCEImpl
	 * @see SAR.impl.SARPackageImpl#getComposedCE()
	 * @generated
	 */
	int COMPOSED_CE = 22;

	/**
	 * The meta object id for the '{@link SAR.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.PredicateImpl
	 * @see SAR.impl.SARPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 23;

	/**
	 * The meta object id for the '{@link SAR.impl.AbstractConditionImpl <em>Abstract Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.AbstractConditionImpl
	 * @see SAR.impl.SARPackageImpl#getAbstractCondition()
	 * @generated
	 */
	int ABSTRACT_CONDITION = 24;

	/**
	 * The meta object id for the '{@link SAR.impl.PredicateDefinitionImpl <em>Predicate Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.PredicateDefinitionImpl
	 * @see SAR.impl.SARPackageImpl#getPredicateDefinition()
	 * @generated
	 */
	int PREDICATE_DEFINITION = 25;

	/**
	 * The meta object id for the '{@link SAR.impl.ArithmeticComparisonImpl <em>Arithmetic Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ArithmeticComparisonImpl
	 * @see SAR.impl.SARPackageImpl#getArithmeticComparison()
	 * @generated
	 */
	int ARITHMETIC_COMPARISON = 26;

	/**
	 * The meta object id for the '{@link SAR.impl.ParenthesizedCEImpl <em>Parenthesized CE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ParenthesizedCEImpl
	 * @see SAR.impl.SARPackageImpl#getParenthesizedCE()
	 * @generated
	 */
	int PARENTHESIZED_CE = 27;

	/**
	 * The meta object id for the '{@link SAR.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.RuleImpl
	 * @see SAR.impl.SARPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 43;

	/**
	 * The meta object id for the '{@link SAR.impl.UpdateRuleImpl <em>Update Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.UpdateRuleImpl
	 * @see SAR.impl.SARPackageImpl#getUpdateRule()
	 * @generated
	 */
	int UPDATE_RULE = 28;

	/**
	 * The meta object id for the '{@link SAR.impl.UpdateExpressionImpl <em>Update Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.UpdateExpressionImpl
	 * @see SAR.impl.SARPackageImpl#getUpdateExpression()
	 * @generated
	 */
	int UPDATE_EXPRESSION = 29;

	/**
	 * The meta object id for the '{@link SAR.impl.UpdateAttributeImpl <em>Update Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.UpdateAttributeImpl
	 * @see SAR.impl.SARPackageImpl#getUpdateAttribute()
	 * @generated
	 */
	int UPDATE_ATTRIBUTE = 30;

	/**
	 * The meta object id for the '{@link SAR.impl.ComposedUpdateImpl <em>Composed Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ComposedUpdateImpl
	 * @see SAR.impl.SARPackageImpl#getComposedUpdate()
	 * @generated
	 */
	int COMPOSED_UPDATE = 32;

	/**
	 * The meta object id for the '{@link SAR.impl.ParenthesizedUpdateImpl <em>Parenthesized Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ParenthesizedUpdateImpl
	 * @see SAR.impl.SARPackageImpl#getParenthesizedUpdate()
	 * @generated
	 */
	int PARENTHESIZED_UPDATE = 33;

	/**
	 * The meta object id for the '{@link SAR.impl.UpdateObjectImpl <em>Update Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.UpdateObjectImpl
	 * @see SAR.impl.SARPackageImpl#getUpdateObject()
	 * @generated
	 */
	int UPDATE_OBJECT = 47;

	/**
	 * The meta object id for the '{@link SAR.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.DeleteImpl
	 * @see SAR.impl.SARPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 34;

	/**
	 * The meta object id for the '{@link SAR.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.UpdateImpl
	 * @see SAR.impl.SARPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 35;

	/**
	 * The meta object id for the '{@link SAR.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.AddImpl
	 * @see SAR.impl.SARPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 36;

	/**
	 * The meta object id for the '{@link SAR.impl.PreUpdateRuleImpl <em>Pre Update Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.PreUpdateRuleImpl
	 * @see SAR.impl.SARPackageImpl#getPreUpdateRule()
	 * @generated
	 */
	int PRE_UPDATE_RULE = 37;

	/**
	 * The meta object id for the '{@link SAR.impl.PostUpdateRuleImpl <em>Post Update Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.PostUpdateRuleImpl
	 * @see SAR.impl.SARPackageImpl#getPostUpdateRule()
	 * @generated
	 */
	int POST_UPDATE_RULE = 38;

	/**
	 * The meta object id for the '{@link SAR.impl.SRStringImpl <em>SR String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.SRStringImpl
	 * @see SAR.impl.SARPackageImpl#getSRString()
	 * @generated
	 */
	int SR_STRING = 39;

	/**
	 * The meta object id for the '{@link SAR.impl.SecurityPolicyImpl <em>Security Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.SecurityPolicyImpl
	 * @see SAR.impl.SARPackageImpl#getSecurityPolicy()
	 * @generated
	 */
	int SECURITY_POLICY = 40;

	/**
	 * The meta object id for the '{@link SAR.impl.PolicyRuleImpl <em>Policy Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.PolicyRuleImpl
	 * @see SAR.impl.SARPackageImpl#getPolicyRule()
	 * @generated
	 */
	int POLICY_RULE = 44;

	/**
	 * The meta object id for the '{@link SAR.impl.AccessControlRuleImpl <em>Access Control Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.AccessControlRuleImpl
	 * @see SAR.impl.SARPackageImpl#getAccessControlRule()
	 * @generated
	 */
	int ACCESS_CONTROL_RULE = 41;

	/**
	 * The meta object id for the '{@link SAR.impl.ObligationRuleImpl <em>Obligation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ObligationRuleImpl
	 * @see SAR.impl.SARPackageImpl#getObligationRule()
	 * @generated
	 */
	int OBLIGATION_RULE = 42;

	/**
	 * The meta object id for the '{@link SAR.impl.DelayImpl <em>Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.DelayImpl
	 * @see SAR.impl.SARPackageImpl#getDelay()
	 * @generated
	 */
	int DELAY = 45;

	/**
	 * The meta object id for the '{@link SAR.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.CreateImpl
	 * @see SAR.impl.SARPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 48;

	/**
	 * The meta object id for the '{@link SAR.impl.RemoveImpl <em>Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.RemoveImpl
	 * @see SAR.impl.SARPackageImpl#getRemove()
	 * @generated
	 */
	int REMOVE = 49;

	/**
	 * The meta object id for the '{@link SAR.impl.AttributeAssignmentExpressionImpl <em>Attribute Assignment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.AttributeAssignmentExpressionImpl
	 * @see SAR.impl.SARPackageImpl#getAttributeAssignmentExpression()
	 * @generated
	 */
	int ATTRIBUTE_ASSIGNMENT_EXPRESSION = 56;

	/**
	 * The meta object id for the '{@link SAR.impl.AttributeValueAssignmentImpl <em>Attribute Value Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.AttributeValueAssignmentImpl
	 * @see SAR.impl.SARPackageImpl#getAttributeValueAssignment()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_ASSIGNMENT = 50;

	/**
	 * The meta object id for the '{@link SAR.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ValueExpressionImpl
	 * @see SAR.impl.SARPackageImpl#getValueExpression()
	 * @generated
	 */
	int VALUE_EXPRESSION = 51;

	/**
	 * The meta object id for the '{@link SAR.impl.ComposedValueImpl <em>Composed Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ComposedValueImpl
	 * @see SAR.impl.SARPackageImpl#getComposedValue()
	 * @generated
	 */
	int COMPOSED_VALUE = 52;

	/**
	 * The meta object id for the '{@link SAR.impl.ComposedAttributeConditionImpl <em>Composed Attribute Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ComposedAttributeConditionImpl
	 * @see SAR.impl.SARPackageImpl#getComposedAttributeCondition()
	 * @generated
	 */
	int COMPOSED_ATTRIBUTE_CONDITION = 54;

	/**
	 * The meta object id for the '{@link SAR.impl.ComposedAttributeAssignmentImpl <em>Composed Attribute Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ComposedAttributeAssignmentImpl
	 * @see SAR.impl.SARPackageImpl#getComposedAttributeAssignment()
	 * @generated
	 */
	int COMPOSED_ATTRIBUTE_ASSIGNMENT = 55;

	/**
	 * The meta object id for the '{@link SAR.impl.FieldTypeImpl <em>Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.FieldTypeImpl
	 * @see SAR.impl.SARPackageImpl#getFieldType()
	 * @generated
	 */
	int FIELD_TYPE = 59;

	/**
	 * The meta object id for the '{@link SAR.impl.SimpleAttributeTypeImpl <em>Simple Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.SimpleAttributeTypeImpl
	 * @see SAR.impl.SARPackageImpl#getSimpleAttributeType()
	 * @generated
	 */
	int SIMPLE_ATTRIBUTE_TYPE = 57;

	/**
	 * The meta object id for the '{@link SAR.impl.ListAttributeTypeImpl <em>List Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ListAttributeTypeImpl
	 * @see SAR.impl.SARPackageImpl#getListAttributeType()
	 * @generated
	 */
	int LIST_ATTRIBUTE_TYPE = 58;

	/**
	 * The meta object id for the '{@link SAR.impl.BracketedValueImpl <em>Bracketed Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.BracketedValueImpl
	 * @see SAR.impl.SARPackageImpl#getBracketedValue()
	 * @generated
	 */
	int BRACKETED_VALUE = 60;

	/**
	 * The meta object id for the '{@link SAR.impl.ConcreteValueImpl <em>Concrete Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ConcreteValueImpl
	 * @see SAR.impl.SARPackageImpl#getConcreteValue()
	 * @generated
	 */
	int CONCRETE_VALUE = 61;

	/**
	 * The meta object id for the '{@link SAR.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.AttributeValueImpl
	 * @see SAR.impl.SARPackageImpl#getAttributeValue()
	 * @generated
	 */
	int ATTRIBUTE_VALUE = 62;

	/**
	 * The number of structural features of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = ATTRIBUTE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_BOOLEAN__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SR Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_BOOLEAN_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SR Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_BOOLEAN_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ARITHMETIC_EXPRESSION__EXPRESSION = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concrete Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ARITHMETIC_EXPRESSION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concrete Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ARITHMETIC_EXPRESSION_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_INTEGER__VALUE = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SR Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_INTEGER_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SR Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_INTEGER_OPERATION_COUNT = ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_FLOAT__VALUE = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SR Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_FLOAT_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SR Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_FLOAT_OPERATION_COUNT = ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION__OPERATION = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION__LHS = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION__RHS = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arithmetic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arithmetic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION_OPERATION_COUNT = ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Condition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDITION_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Attribute Condition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDITION_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDITION__ATTRIBUTE = ATTRIBUTE_CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDITION__OPERATOR = ATTRIBUTE_CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE = ATTRIBUTE_CONDITION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDITION_FEATURE_COUNT = ATTRIBUTE_CONDITION_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attribute Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDITION_OPERATION_COUNT = ATTRIBUTE_CONDITION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_CE__OP = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negated CE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_CE_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Negated CE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_CE_OPERATION_COUNT = CONDITION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binary Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_CE__BINARY_OPERATOR = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_CE__RHS = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_CE__LHS = CONDITION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composed CE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_CE_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composed CE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_CE_OPERATION_COUNT = CONDITION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONDITION__PREDICATE = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONDITION__PARAMETERS = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONDITION_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONDITION_OPERATION_COUNT = CONDITION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION__PREDICATE = 0;

	/**
	 * The feature id for the '<em><b>Activation conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION__ACTIVATION_CONDITIONS = 1;

	/**
	 * The number of structural features of the '<em>Predicate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Predicate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_COMPARISON__LHS = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_COMPARISON__RHS = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_COMPARISON__OPERATOR = CONDITION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arithmetic Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_COMPARISON_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arithmetic Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_COMPARISON_OPERATION_COUNT = CONDITION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_CE__OP = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parenthesized CE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_CE_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parenthesized CE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_CE_OPERATION_COUNT = CONDITION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ID = 0;

	/**
	 * The feature id for the '<em><b>Activation condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ACTIVATION_CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_RULE__ID = RULE__ID;

	/**
	 * The feature id for the '<em><b>Activation condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_RULE__ACTIVATION_CONDITION = RULE__ACTIVATION_CONDITION;

	/**
	 * The feature id for the '<em><b>Update expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_RULE__UPDATE_EXPRESSION = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_RULE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Update Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Attribute assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE__ATTRIBUTE_ASSIGNMENT = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE__OBJECT_REFERENCE = UPDATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Update Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE_OPERATION_COUNT = UPDATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SAR.impl.EventExecutionImpl <em>Event Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.EventExecutionImpl
	 * @see SAR.impl.SARPackageImpl#getEventExecution()
	 * @generated
	 */
	int EVENT_EXECUTION = 31;

	/**
	 * The meta object id for the '{@link SAR.impl.ParenthesizedValueImpl <em>Parenthesized Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ParenthesizedValueImpl
	 * @see SAR.impl.SARPackageImpl#getParenthesizedValue()
	 * @generated
	 */
	int PARENTHESIZED_VALUE = 63;

	/**
	 * The meta object id for the '{@link SAR.impl.EntitytReferenceImpl <em>Entityt Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.EntitytReferenceImpl
	 * @see SAR.impl.SARPackageImpl#getEntitytReference()
	 * @generated
	 */
	int ENTITYT_REFERENCE = 64;

	/**
	 * The meta object id for the '{@link SAR.impl.EventConditionImpl <em>Event Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.EventConditionImpl
	 * @see SAR.impl.SARPackageImpl#getEventCondition()
	 * @generated
	 */
	int EVENT_CONDITION = 65;

	/**
	 * The meta object id for the '{@link SAR.impl.EventReferenceImpl <em>Event Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.EventReferenceImpl
	 * @see SAR.impl.SARPackageImpl#getEventReference()
	 * @generated
	 */
	int EVENT_REFERENCE = 66;

	/**
	 * The meta object id for the '{@link SAR.impl.ExecutionExpressionImpl <em>Execution Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ExecutionExpressionImpl
	 * @see SAR.impl.SARPackageImpl#getExecutionExpression()
	 * @generated
	 */
	int EXECUTION_EXPRESSION = 68;

	/**
	 * The number of structural features of the '<em>Execution Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Execution Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_EXECUTION__EXECUTION = EXECUTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_EXECUTION__ATTRIBUTES_ASSIGNMENT = EXECUTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_EXECUTION__EXECUTION_TYPE = EXECUTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_EXECUTION_FEATURE_COUNT = EXECUTION_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Event Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_EXECUTION_OPERATION_COUNT = EXECUTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_UPDATE__OPERATOR = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_UPDATE__LHS = UPDATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_UPDATE__RHS = UPDATE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composed Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_UPDATE_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composed Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_UPDATE_OPERATION_COUNT = UPDATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_UPDATE__OP = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parenthesized Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_UPDATE_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parenthesized Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_UPDATE_OPERATION_COUNT = UPDATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECT_FEATURE_COUNT = UPDATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECT_OPERATION_COUNT = UPDATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__OBJECT_REFERENCE = UPDATE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = UPDATE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = UPDATE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__ATTRIBUTE_ASSIGNMENT = UPDATE_ATTRIBUTE__ATTRIBUTE_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Object reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__OBJECT_REFERENCE = UPDATE_ATTRIBUTE__OBJECT_REFERENCE;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = UPDATE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_COUNT = UPDATE_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__ATTRIBUTE_ASSIGNMENT = UPDATE_ATTRIBUTE__ATTRIBUTE_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Object reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__OBJECT_REFERENCE = UPDATE_ATTRIBUTE__OBJECT_REFERENCE;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = UPDATE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = UPDATE_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE_RULE__ID = UPDATE_RULE__ID;

	/**
	 * The feature id for the '<em><b>Activation condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE_RULE__ACTIVATION_CONDITION = UPDATE_RULE__ACTIVATION_CONDITION;

	/**
	 * The feature id for the '<em><b>Update expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE_RULE__UPDATE_EXPRESSION = UPDATE_RULE__UPDATE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Pre Update Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE_RULE_FEATURE_COUNT = UPDATE_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pre Update Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE_RULE_OPERATION_COUNT = UPDATE_RULE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE_RULE__ID = UPDATE_RULE__ID;

	/**
	 * The feature id for the '<em><b>Activation condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE_RULE__ACTIVATION_CONDITION = UPDATE_RULE__ACTIVATION_CONDITION;

	/**
	 * The feature id for the '<em><b>Update expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE_RULE__UPDATE_EXPRESSION = UPDATE_RULE__UPDATE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Post Update Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE_RULE_FEATURE_COUNT = UPDATE_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Post Update Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE_RULE_OPERATION_COUNT = UPDATE_RULE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_STRING__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SR String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_STRING_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SR String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_STRING_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_POLICY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Policy rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_POLICY__POLICY_RULES = 1;

	/**
	 * The number of structural features of the '<em>Security Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_POLICY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_POLICY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_RULE__ID = RULE__ID;

	/**
	 * The feature id for the '<em><b>Activation condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_RULE__ACTIVATION_CONDITION = RULE__ACTIVATION_CONDITION;

	/**
	 * The number of structural features of the '<em>Policy Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Policy Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_RULE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_RULE__ID = POLICY_RULE__ID;

	/**
	 * The feature id for the '<em><b>Activation condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_RULE__ACTIVATION_CONDITION = POLICY_RULE__ACTIVATION_CONDITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_RULE__TYPE = POLICY_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_RULE__EVENT = POLICY_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provisions expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_RULE__PROVISIONS_EXPRESSION = POLICY_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Access Control Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_RULE_FEATURE_COUNT = POLICY_RULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Access Control Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_RULE_OPERATION_COUNT = POLICY_RULE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_RULE__ID = POLICY_RULE__ID;

	/**
	 * The feature id for the '<em><b>Activation condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_RULE__ACTIVATION_CONDITION = POLICY_RULE__ACTIVATION_CONDITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_RULE__TYPE = POLICY_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fulfillment condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_RULE__FULFILLMENT_CONDITION = POLICY_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deadline condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_RULE__DEADLINE_CONDITION = POLICY_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cancellation condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_RULE__CANCELLATION_CONDITION = POLICY_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reparation condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_RULE__REPARATION_CONDITION = POLICY_RULE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Obligation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_RULE_FEATURE_COUNT = POLICY_RULE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Obligation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_RULE_OPERATION_COUNT = POLICY_RULE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__UNIT = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__CALENDAR = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_OPERATION_COUNT = CONDITION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__ATTRIBUTES_ASSIGNMENT = UPDATE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__ENTITY = UPDATE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = UPDATE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OPERATION_COUNT = UPDATE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__ATTRIBUTE_ASSIGNMENT = UPDATE_ATTRIBUTE__ATTRIBUTE_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Object reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__OBJECT_REFERENCE = UPDATE_ATTRIBUTE__OBJECT_REFERENCE;

	/**
	 * The number of structural features of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_COUNT = UPDATE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPERATION_COUNT = UPDATE_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Assignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Attribute Assignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ASSIGNMENT__ATTRIBUTE = ATTRIBUTE_ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ASSIGNMENT__VALUE = ATTRIBUTE_ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ASSIGNMENT__NEW_VALUE = ATTRIBUTE_ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Value Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ASSIGNMENT_FEATURE_COUNT = ATTRIBUTE_ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attribute Value Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ASSIGNMENT_OPERATION_COUNT = ATTRIBUTE_ASSIGNMENT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_VALUE__LHS = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_VALUE__RHS = VALUE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composed Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_VALUE_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composed Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_VALUE_OPERATION_COUNT = VALUE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE_CONDITION__LHS = ATTRIBUTE_CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE_CONDITION__RHS = ATTRIBUTE_CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composed Attribute Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE_CONDITION_FEATURE_COUNT = ATTRIBUTE_CONDITION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composed Attribute Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE_CONDITION_OPERATION_COUNT = ATTRIBUTE_CONDITION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE_ASSIGNMENT__LHS = ATTRIBUTE_ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE_ASSIGNMENT__RHS = ATTRIBUTE_ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composed Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT = ATTRIBUTE_ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composed Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE_ASSIGNMENT_OPERATION_COUNT = ATTRIBUTE_ASSIGNMENT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_TYPE__TYPE = FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_TYPE_FEATURE_COUNT = FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_TYPE_OPERATION_COUNT = FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ATTRIBUTE_TYPE__TYPES = FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ATTRIBUTE_TYPE_FEATURE_COUNT = FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ATTRIBUTE_TYPE_OPERATION_COUNT = FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKETED_VALUE__VALUE = ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bracketed Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKETED_VALUE_FEATURE_COUNT = ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bracketed Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKETED_VALUE_OPERATION_COUNT = ATTRIBUTE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_VALUE__VALUE = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concrete Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_VALUE_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concrete Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_VALUE_OPERATION_COUNT = VALUE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Parenthesized Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parenthesized Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_VALUE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Handle id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITYT_REFERENCE__HANDLE_ID = 0;

	/**
	 * The feature id for the '<em><b>Entity id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITYT_REFERENCE__ENTITY_ID = 1;

	/**
	 * The number of structural features of the '<em>Entityt Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITYT_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entityt Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITYT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Attribute condition expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONDITION__ATTRIBUTE_CONDITION_EXPRESSION = CONDITION__ATTRIBUTE_CONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Event reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONDITION__EVENT_REFERENCE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE__EVENT_ID = 0;

	/**
	 * The number of structural features of the '<em>Event Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SAR.impl.ExecutionRuleImpl <em>Execution Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ExecutionRuleImpl
	 * @see SAR.impl.SARPackageImpl#getExecutionRule()
	 * @generated
	 */
	int EXECUTION_RULE = 67;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RULE__ID = POLICY_RULE__ID;

	/**
	 * The feature id for the '<em><b>Activation condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RULE__ACTIVATION_CONDITION = POLICY_RULE__ACTIVATION_CONDITION;

	/**
	 * The feature id for the '<em><b>Execution expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RULE__EXECUTION_EXPRESSION = POLICY_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RULE_FEATURE_COUNT = POLICY_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Execution Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RULE_OPERATION_COUNT = POLICY_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SAR.impl.ComposedExecutionImpl <em>Composed Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.ComposedExecutionImpl
	 * @see SAR.impl.SARPackageImpl#getComposedExecution()
	 * @generated
	 */
	int COMPOSED_EXECUTION = 69;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EXECUTION__LHS = EXECUTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EXECUTION__RHS = EXECUTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EXECUTION__OPERATOR = EXECUTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composed Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EXECUTION_FEATURE_COUNT = EXECUTION_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composed Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EXECUTION_OPERATION_COUNT = EXECUTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SAR.impl.PIPAttributeTypeImpl <em>PIP Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.PIPAttributeTypeImpl
	 * @see SAR.impl.SARPackageImpl#getPIPAttributeType()
	 * @generated
	 */
	int PIP_ATTRIBUTE_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIP_ATTRIBUTE_TYPE__ID = ENTITY_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Field type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIP_ATTRIBUTE_TYPE__FIELD_TYPE = ENTITY_ATTRIBUTE__FIELD_TYPE;

	/**
	 * The feature id for the '<em><b>Pip options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIP_ATTRIBUTE_TYPE__PIP_OPTIONS = ENTITY_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PIP Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIP_ATTRIBUTE_TYPE_FEATURE_COUNT = ENTITY_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PIP Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIP_ATTRIBUTE_TYPE_OPERATION_COUNT = ENTITY_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SAR.impl.PIPOptionImpl <em>PIP Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.PIPOptionImpl
	 * @see SAR.impl.SARPackageImpl#getPIPOption()
	 * @generated
	 */
	int PIP_OPTION = 72;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIP_OPTION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIP_OPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>PIP Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIP_OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PIP Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIP_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SAR.impl.TrueImpl <em>True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.TrueImpl
	 * @see SAR.impl.SARPackageImpl#getTrue()
	 * @generated
	 */
	int TRUE = 73;

	/**
	 * The number of structural features of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OPERATION_COUNT = CONDITION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SAR.impl.SRUnderscoreImpl <em>SR Underscore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.impl.SRUnderscoreImpl
	 * @see SAR.impl.SARPackageImpl#getSRUnderscore()
	 * @generated
	 */
	int SR_UNDERSCORE = 74;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_UNDERSCORE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SR Underscore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_UNDERSCORE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SR Underscore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SR_UNDERSCORE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SAR.SupportedType <em>Supported Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.SupportedType
	 * @see SAR.impl.SARPackageImpl#getSupportedType()
	 * @generated
	 */
	int SUPPORTED_TYPE = 75;

	/**
	 * The meta object id for the '{@link SAR.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.ArithmeticOperator
	 * @see SAR.impl.SARPackageImpl#getArithmeticOperator()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR = 76;

	/**
	 * The meta object id for the '{@link SAR.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.ComparisonOperator
	 * @see SAR.impl.SARPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 77;

	/**
	 * The meta object id for the '{@link SAR.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.BinaryOperator
	 * @see SAR.impl.SARPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 78;

	/**
	 * The meta object id for the '{@link SAR.UpdateRuleType <em>Update Rule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.UpdateRuleType
	 * @see SAR.impl.SARPackageImpl#getUpdateRuleType()
	 * @generated
	 */
	int UPDATE_RULE_TYPE = 79;

	/**
	 * The meta object id for the '{@link SAR.UpdateOperator <em>Update Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.UpdateOperator
	 * @see SAR.impl.SARPackageImpl#getUpdateOperator()
	 * @generated
	 */
	int UPDATE_OPERATOR = 80;

	/**
	 * The meta object id for the '{@link SAR.ModificationOperation <em>Modification Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.ModificationOperation
	 * @see SAR.impl.SARPackageImpl#getModificationOperation()
	 * @generated
	 */
	int MODIFICATION_OPERATION = 81;

	/**
	 * The meta object id for the '{@link SAR.PolicyType <em>Policy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.PolicyType
	 * @see SAR.impl.SARPackageImpl#getPolicyType()
	 * @generated
	 */
	int POLICY_TYPE = 82;

	/**
	 * The meta object id for the '{@link SAR.AccessControlRuleType <em>Access Control Rule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.AccessControlRuleType
	 * @see SAR.impl.SARPackageImpl#getAccessControlRuleType()
	 * @generated
	 */
	int ACCESS_CONTROL_RULE_TYPE = 83;

	/**
	 * The meta object id for the '{@link SAR.ObligationRuleType <em>Obligation Rule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.ObligationRuleType
	 * @see SAR.impl.SARPackageImpl#getObligationRuleType()
	 * @generated
	 */
	int OBLIGATION_RULE_TYPE = 84;

	/**
	 * The meta object id for the '{@link SAR.Calendar <em>Calendar</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.Calendar
	 * @see SAR.impl.SARPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 85;

	/**
	 * The meta object id for the '{@link SAR.ConditionType <em>Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.ConditionType
	 * @see SAR.impl.SARPackageImpl#getConditionType()
	 * @generated
	 */
	int CONDITION_TYPE = 86;


	/**
	 * The meta object id for the '{@link SAR.ExecutionType <em>Execution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.ExecutionType
	 * @see SAR.impl.SARPackageImpl#getExecutionType()
	 * @generated
	 */
	int EXECUTION_TYPE = 87;


	/**
	 * The meta object id for the '{@link SAR.Options <em>Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SAR.Options
	 * @see SAR.impl.SARPackageImpl#getOptions()
	 * @generated
	 */
	int OPTIONS = 88;


	/**
	 * Returns the meta object for class '{@link SAR.SecurityConfiguration <em>Security Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Configuration</em>'.
	 * @see SAR.SecurityConfiguration
	 * @generated
	 */
	EClass getSecurityConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link SAR.SecurityConfiguration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SAR.SecurityConfiguration#getId()
	 * @see #getSecurityConfiguration()
	 * @generated
	 */
	EAttribute getSecurityConfiguration_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link SAR.SecurityConfiguration#getEvent_declarations <em>Event declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event declarations</em>'.
	 * @see SAR.SecurityConfiguration#getEvent_declarations()
	 * @see #getSecurityConfiguration()
	 * @generated
	 */
	EReference getSecurityConfiguration_Event_declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link SAR.SecurityConfiguration#getEntity_declarations <em>Entity declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity declarations</em>'.
	 * @see SAR.SecurityConfiguration#getEntity_declarations()
	 * @see #getSecurityConfiguration()
	 * @generated
	 */
	EReference getSecurityConfiguration_Entity_declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link SAR.SecurityConfiguration#getPredicate_definitions <em>Predicate definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicate definitions</em>'.
	 * @see SAR.SecurityConfiguration#getPredicate_definitions()
	 * @see #getSecurityConfiguration()
	 * @generated
	 */
	EReference getSecurityConfiguration_Predicate_definitions();

	/**
	 * Returns the meta object for the containment reference list '{@link SAR.SecurityConfiguration#getPre_updates <em>Pre updates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre updates</em>'.
	 * @see SAR.SecurityConfiguration#getPre_updates()
	 * @see #getSecurityConfiguration()
	 * @generated
	 */
	EReference getSecurityConfiguration_Pre_updates();

	/**
	 * Returns the meta object for the containment reference list '{@link SAR.SecurityConfiguration#getPost_updates <em>Post updates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post updates</em>'.
	 * @see SAR.SecurityConfiguration#getPost_updates()
	 * @see #getSecurityConfiguration()
	 * @generated
	 */
	EReference getSecurityConfiguration_Post_updates();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.SecurityConfiguration#getSecurity_policy <em>Security policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security policy</em>'.
	 * @see SAR.SecurityConfiguration#getSecurity_policy()
	 * @see #getSecurityConfiguration()
	 * @generated
	 */
	EReference getSecurityConfiguration_Security_policy();

	/**
	 * Returns the meta object for class '{@link SAR.EventDeclaration <em>Event Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Declaration</em>'.
	 * @see SAR.EventDeclaration
	 * @generated
	 */
	EClass getEventDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link SAR.EventDeclaration#getEvent_attributes <em>Event attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event attributes</em>'.
	 * @see SAR.EventDeclaration#getEvent_attributes()
	 * @see #getEventDeclaration()
	 * @generated
	 */
	EReference getEventDeclaration_Event_attributes();

	/**
	 * Returns the meta object for class '{@link SAR.Monitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring</em>'.
	 * @see SAR.Monitoring
	 * @generated
	 */
	EClass getMonitoring();

	/**
	 * Returns the meta object for class '{@link SAR.Interception <em>Interception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interception</em>'.
	 * @see SAR.Interception
	 * @generated
	 */
	EClass getInterception();

	/**
	 * Returns the meta object for class '{@link SAR.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution</em>'.
	 * @see SAR.Execution
	 * @generated
	 */
	EClass getExecution();

	/**
	 * Returns the meta object for class '{@link SAR.EventAttribute <em>Event Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Attribute</em>'.
	 * @see SAR.EventAttribute
	 * @generated
	 */
	EClass getEventAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.EventAttribute#getField_type <em>Field type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field type</em>'.
	 * @see SAR.EventAttribute#getField_type()
	 * @see #getEventAttribute()
	 * @generated
	 */
	EReference getEventAttribute_Field_type();

	/**
	 * Returns the meta object for class '{@link SAR.EntityDeclaration <em>Entity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Declaration</em>'.
	 * @see SAR.EntityDeclaration
	 * @generated
	 */
	EClass getEntityDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link SAR.EntityDeclaration#getEntity_attributes <em>Entity attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity attributes</em>'.
	 * @see SAR.EntityDeclaration#getEntity_attributes()
	 * @see #getEntityDeclaration()
	 * @generated
	 */
	EReference getEntityDeclaration_Entity_attributes();

	/**
	 * Returns the meta object for class '{@link SAR.AttributeDeclaration <em>Attribute Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Declaration</em>'.
	 * @see SAR.AttributeDeclaration
	 * @generated
	 */
	EClass getAttributeDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link SAR.AttributeDeclaration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SAR.AttributeDeclaration#getId()
	 * @see #getAttributeDeclaration()
	 * @generated
	 */
	EAttribute getAttributeDeclaration_Id();

	/**
	 * Returns the meta object for class '{@link SAR.EntityAttribute <em>Entity Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Attribute</em>'.
	 * @see SAR.EntityAttribute
	 * @generated
	 */
	EClass getEntityAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.EntityAttribute#getField_type <em>Field type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field type</em>'.
	 * @see SAR.EntityAttribute#getField_type()
	 * @see #getEntityAttribute()
	 * @generated
	 */
	EReference getEntityAttribute_Field_type();

	/**
	 * Returns the meta object for class '{@link SAR.ConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Expression</em>'.
	 * @see SAR.ConditionExpression
	 * @generated
	 */
	EClass getConditionExpression();

	/**
	 * Returns the meta object for class '{@link SAR.StateCondition <em>State Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Condition</em>'.
	 * @see SAR.StateCondition
	 * @generated
	 */
	EClass getStateCondition();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.StateCondition#getEntity_reference <em>Entity reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity reference</em>'.
	 * @see SAR.StateCondition#getEntity_reference()
	 * @see #getStateCondition()
	 * @generated
	 */
	EReference getStateCondition_Entity_reference();

	/**
	 * Returns the meta object for class '{@link SAR.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see SAR.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link SAR.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see SAR.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link SAR.Text#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SAR.Text#getValue()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Value();

	/**
	 * Returns the meta object for class '{@link SAR.SRBoolean <em>SR Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SR Boolean</em>'.
	 * @see SAR.SRBoolean
	 * @generated
	 */
	EClass getSRBoolean();

	/**
	 * Returns the meta object for the attribute '{@link SAR.SRBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SAR.SRBoolean#isValue()
	 * @see #getSRBoolean()
	 * @generated
	 */
	EAttribute getSRBoolean_Value();

	/**
	 * Returns the meta object for class '{@link SAR.ConcreteArithmeticExpression <em>Concrete Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Arithmetic Expression</em>'.
	 * @see SAR.ConcreteArithmeticExpression
	 * @generated
	 */
	EClass getConcreteArithmeticExpression();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ConcreteArithmeticExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see SAR.ConcreteArithmeticExpression#getExpression()
	 * @see #getConcreteArithmeticExpression()
	 * @generated
	 */
	EReference getConcreteArithmeticExpression_Expression();

	/**
	 * Returns the meta object for class '{@link SAR.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expression</em>'.
	 * @see SAR.ArithmeticExpression
	 * @generated
	 */
	EClass getArithmeticExpression();

	/**
	 * Returns the meta object for class '{@link SAR.SRInteger <em>SR Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SR Integer</em>'.
	 * @see SAR.SRInteger
	 * @generated
	 */
	EClass getSRInteger();

	/**
	 * Returns the meta object for the attribute '{@link SAR.SRInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SAR.SRInteger#getValue()
	 * @see #getSRInteger()
	 * @generated
	 */
	EAttribute getSRInteger_Value();

	/**
	 * Returns the meta object for class '{@link SAR.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see SAR.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link SAR.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SAR.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for class '{@link SAR.SRFloat <em>SR Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SR Float</em>'.
	 * @see SAR.SRFloat
	 * @generated
	 */
	EClass getSRFloat();

	/**
	 * Returns the meta object for the attribute '{@link SAR.SRFloat#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SAR.SRFloat#getValue()
	 * @see #getSRFloat()
	 * @generated
	 */
	EAttribute getSRFloat_Value();

	/**
	 * Returns the meta object for class '{@link SAR.ArithmeticOperation <em>Arithmetic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Operation</em>'.
	 * @see SAR.ArithmeticOperation
	 * @generated
	 */
	EClass getArithmeticOperation();

	/**
	 * Returns the meta object for the attribute '{@link SAR.ArithmeticOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see SAR.ArithmeticOperation#getOperation()
	 * @see #getArithmeticOperation()
	 * @generated
	 */
	EAttribute getArithmeticOperation_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ArithmeticOperation#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see SAR.ArithmeticOperation#getLhs()
	 * @see #getArithmeticOperation()
	 * @generated
	 */
	EReference getArithmeticOperation_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ArithmeticOperation#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see SAR.ArithmeticOperation#getRhs()
	 * @see #getArithmeticOperation()
	 * @generated
	 */
	EReference getArithmeticOperation_Rhs();

	/**
	 * Returns the meta object for class '{@link SAR.AttributeCondition <em>Attribute Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Condition</em>'.
	 * @see SAR.AttributeCondition
	 * @generated
	 */
	EClass getAttributeCondition();

	/**
	 * Returns the meta object for the reference '{@link SAR.AttributeCondition#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see SAR.AttributeCondition#getAttribute()
	 * @see #getAttributeCondition()
	 * @generated
	 */
	EReference getAttributeCondition_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link SAR.AttributeCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see SAR.AttributeCondition#getOperator()
	 * @see #getAttributeCondition()
	 * @generated
	 */
	EAttribute getAttributeCondition_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.AttributeCondition#getAttribute_value <em>Attribute value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute value</em>'.
	 * @see SAR.AttributeCondition#getAttribute_value()
	 * @see #getAttributeCondition()
	 * @generated
	 */
	EReference getAttributeCondition_Attribute_value();

	/**
	 * Returns the meta object for class '{@link SAR.NegatedCE <em>Negated CE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negated CE</em>'.
	 * @see SAR.NegatedCE
	 * @generated
	 */
	EClass getNegatedCE();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.NegatedCE#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see SAR.NegatedCE#getOp()
	 * @see #getNegatedCE()
	 * @generated
	 */
	EReference getNegatedCE_Op();

	/**
	 * Returns the meta object for class '{@link SAR.ComposedCE <em>Composed CE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed CE</em>'.
	 * @see SAR.ComposedCE
	 * @generated
	 */
	EClass getComposedCE();

	/**
	 * Returns the meta object for the attribute '{@link SAR.ComposedCE#getBinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Operator</em>'.
	 * @see SAR.ComposedCE#getBinaryOperator()
	 * @see #getComposedCE()
	 * @generated
	 */
	EAttribute getComposedCE_BinaryOperator();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ComposedCE#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see SAR.ComposedCE#getRhs()
	 * @see #getComposedCE()
	 * @generated
	 */
	EReference getComposedCE_Rhs();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ComposedCE#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see SAR.ComposedCE#getLhs()
	 * @see #getComposedCE()
	 * @generated
	 */
	EReference getComposedCE_Lhs();

	/**
	 * Returns the meta object for class '{@link SAR.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see SAR.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for the attribute '{@link SAR.Predicate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SAR.Predicate#getName()
	 * @see #getPredicate()
	 * @generated
	 */
	EAttribute getPredicate_Name();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.Predicate#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see SAR.Predicate#getParameters()
	 * @see #getPredicate()
	 * @generated
	 */
	EReference getPredicate_Parameters();

	/**
	 * Returns the meta object for class '{@link SAR.AbstractCondition <em>Abstract Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Condition</em>'.
	 * @see SAR.AbstractCondition
	 * @generated
	 */
	EClass getAbstractCondition();

	/**
	 * Returns the meta object for the reference '{@link SAR.AbstractCondition#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predicate</em>'.
	 * @see SAR.AbstractCondition#getPredicate()
	 * @see #getAbstractCondition()
	 * @generated
	 */
	EReference getAbstractCondition_Predicate();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.AbstractCondition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see SAR.AbstractCondition#getParameters()
	 * @see #getAbstractCondition()
	 * @generated
	 */
	EReference getAbstractCondition_Parameters();

	/**
	 * Returns the meta object for class '{@link SAR.PredicateDefinition <em>Predicate Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Definition</em>'.
	 * @see SAR.PredicateDefinition
	 * @generated
	 */
	EClass getPredicateDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.PredicateDefinition#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see SAR.PredicateDefinition#getPredicate()
	 * @see #getPredicateDefinition()
	 * @generated
	 */
	EReference getPredicateDefinition_Predicate();

	/**
	 * Returns the meta object for the containment reference list '{@link SAR.PredicateDefinition#getActivation_conditions <em>Activation conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activation conditions</em>'.
	 * @see SAR.PredicateDefinition#getActivation_conditions()
	 * @see #getPredicateDefinition()
	 * @generated
	 */
	EReference getPredicateDefinition_Activation_conditions();

	/**
	 * Returns the meta object for class '{@link SAR.ArithmeticComparison <em>Arithmetic Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Comparison</em>'.
	 * @see SAR.ArithmeticComparison
	 * @generated
	 */
	EClass getArithmeticComparison();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ArithmeticComparison#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see SAR.ArithmeticComparison#getLhs()
	 * @see #getArithmeticComparison()
	 * @generated
	 */
	EReference getArithmeticComparison_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ArithmeticComparison#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see SAR.ArithmeticComparison#getRhs()
	 * @see #getArithmeticComparison()
	 * @generated
	 */
	EReference getArithmeticComparison_Rhs();

	/**
	 * Returns the meta object for the attribute '{@link SAR.ArithmeticComparison#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see SAR.ArithmeticComparison#getOperator()
	 * @see #getArithmeticComparison()
	 * @generated
	 */
	EAttribute getArithmeticComparison_Operator();

	/**
	 * Returns the meta object for class '{@link SAR.ParenthesizedCE <em>Parenthesized CE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parenthesized CE</em>'.
	 * @see SAR.ParenthesizedCE
	 * @generated
	 */
	EClass getParenthesizedCE();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ParenthesizedCE#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see SAR.ParenthesizedCE#getOp()
	 * @see #getParenthesizedCE()
	 * @generated
	 */
	EReference getParenthesizedCE_Op();

	/**
	 * Returns the meta object for class '{@link SAR.UpdateRule <em>Update Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Rule</em>'.
	 * @see SAR.UpdateRule
	 * @generated
	 */
	EClass getUpdateRule();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.UpdateRule#getUpdate_expression <em>Update expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update expression</em>'.
	 * @see SAR.UpdateRule#getUpdate_expression()
	 * @see #getUpdateRule()
	 * @generated
	 */
	EReference getUpdateRule_Update_expression();

	/**
	 * Returns the meta object for class '{@link SAR.UpdateExpression <em>Update Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Expression</em>'.
	 * @see SAR.UpdateExpression
	 * @generated
	 */
	EClass getUpdateExpression();

	/**
	 * Returns the meta object for class '{@link SAR.UpdateAttribute <em>Update Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Attribute</em>'.
	 * @see SAR.UpdateAttribute
	 * @generated
	 */
	EClass getUpdateAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.UpdateAttribute#getAttribute_assignment <em>Attribute assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute assignment</em>'.
	 * @see SAR.UpdateAttribute#getAttribute_assignment()
	 * @see #getUpdateAttribute()
	 * @generated
	 */
	EReference getUpdateAttribute_Attribute_assignment();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.UpdateAttribute#getObject_reference <em>Object reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object reference</em>'.
	 * @see SAR.UpdateAttribute#getObject_reference()
	 * @see #getUpdateAttribute()
	 * @generated
	 */
	EReference getUpdateAttribute_Object_reference();

	/**
	 * Returns the meta object for class '{@link SAR.EventExecution <em>Event Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Execution</em>'.
	 * @see SAR.EventExecution
	 * @generated
	 */
	EClass getEventExecution();

	/**
	 * Returns the meta object for the reference '{@link SAR.EventExecution#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution</em>'.
	 * @see SAR.EventExecution#getExecution()
	 * @see #getEventExecution()
	 * @generated
	 */
	EReference getEventExecution_Execution();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.EventExecution#getAttributes_assignment <em>Attributes assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes assignment</em>'.
	 * @see SAR.EventExecution#getAttributes_assignment()
	 * @see #getEventExecution()
	 * @generated
	 */
	EReference getEventExecution_Attributes_assignment();

	/**
	 * Returns the meta object for the attribute '{@link SAR.EventExecution#getExecution_type <em>Execution type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution type</em>'.
	 * @see SAR.EventExecution#getExecution_type()
	 * @see #getEventExecution()
	 * @generated
	 */
	EAttribute getEventExecution_Execution_type();

	/**
	 * Returns the meta object for class '{@link SAR.ComposedUpdate <em>Composed Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Update</em>'.
	 * @see SAR.ComposedUpdate
	 * @generated
	 */
	EClass getComposedUpdate();

	/**
	 * Returns the meta object for the attribute '{@link SAR.ComposedUpdate#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see SAR.ComposedUpdate#getOperator()
	 * @see #getComposedUpdate()
	 * @generated
	 */
	EAttribute getComposedUpdate_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ComposedUpdate#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see SAR.ComposedUpdate#getLhs()
	 * @see #getComposedUpdate()
	 * @generated
	 */
	EReference getComposedUpdate_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ComposedUpdate#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see SAR.ComposedUpdate#getRhs()
	 * @see #getComposedUpdate()
	 * @generated
	 */
	EReference getComposedUpdate_Rhs();

	/**
	 * Returns the meta object for class '{@link SAR.ParenthesizedUpdate <em>Parenthesized Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parenthesized Update</em>'.
	 * @see SAR.ParenthesizedUpdate
	 * @generated
	 */
	EClass getParenthesizedUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ParenthesizedUpdate#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see SAR.ParenthesizedUpdate#getOp()
	 * @see #getParenthesizedUpdate()
	 * @generated
	 */
	EReference getParenthesizedUpdate_Op();

	/**
	 * Returns the meta object for class '{@link SAR.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see SAR.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.Delete#getObject_reference <em>Object reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object reference</em>'.
	 * @see SAR.Delete#getObject_reference()
	 * @see #getDelete()
	 * @generated
	 */
	EReference getDelete_Object_reference();

	/**
	 * Returns the meta object for class '{@link SAR.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see SAR.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for class '{@link SAR.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see SAR.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link SAR.PreUpdateRule <em>Pre Update Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Update Rule</em>'.
	 * @see SAR.PreUpdateRule
	 * @generated
	 */
	EClass getPreUpdateRule();

	/**
	 * Returns the meta object for class '{@link SAR.PostUpdateRule <em>Post Update Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Update Rule</em>'.
	 * @see SAR.PostUpdateRule
	 * @generated
	 */
	EClass getPostUpdateRule();

	/**
	 * Returns the meta object for class '{@link SAR.SRString <em>SR String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SR String</em>'.
	 * @see SAR.SRString
	 * @generated
	 */
	EClass getSRString();

	/**
	 * Returns the meta object for the attribute '{@link SAR.SRString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SAR.SRString#getValue()
	 * @see #getSRString()
	 * @generated
	 */
	EAttribute getSRString_Value();

	/**
	 * Returns the meta object for class '{@link SAR.SecurityPolicy <em>Security Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Policy</em>'.
	 * @see SAR.SecurityPolicy
	 * @generated
	 */
	EClass getSecurityPolicy();

	/**
	 * Returns the meta object for the attribute '{@link SAR.SecurityPolicy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see SAR.SecurityPolicy#getType()
	 * @see #getSecurityPolicy()
	 * @generated
	 */
	EAttribute getSecurityPolicy_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link SAR.SecurityPolicy#getPolicy_rules <em>Policy rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy rules</em>'.
	 * @see SAR.SecurityPolicy#getPolicy_rules()
	 * @see #getSecurityPolicy()
	 * @generated
	 */
	EReference getSecurityPolicy_Policy_rules();

	/**
	 * Returns the meta object for class '{@link SAR.AccessControlRule <em>Access Control Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Control Rule</em>'.
	 * @see SAR.AccessControlRule
	 * @generated
	 */
	EClass getAccessControlRule();

	/**
	 * Returns the meta object for the attribute '{@link SAR.AccessControlRule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see SAR.AccessControlRule#getType()
	 * @see #getAccessControlRule()
	 * @generated
	 */
	EAttribute getAccessControlRule_Type();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.AccessControlRule#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see SAR.AccessControlRule#getEvent()
	 * @see #getAccessControlRule()
	 * @generated
	 */
	EReference getAccessControlRule_Event();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.AccessControlRule#getProvisions_expression <em>Provisions expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provisions expression</em>'.
	 * @see SAR.AccessControlRule#getProvisions_expression()
	 * @see #getAccessControlRule()
	 * @generated
	 */
	EReference getAccessControlRule_Provisions_expression();

	/**
	 * Returns the meta object for class '{@link SAR.ObligationRule <em>Obligation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obligation Rule</em>'.
	 * @see SAR.ObligationRule
	 * @generated
	 */
	EClass getObligationRule();

	/**
	 * Returns the meta object for the attribute '{@link SAR.ObligationRule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see SAR.ObligationRule#getType()
	 * @see #getObligationRule()
	 * @generated
	 */
	EAttribute getObligationRule_Type();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ObligationRule#getFulfillment_condition <em>Fulfillment condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fulfillment condition</em>'.
	 * @see SAR.ObligationRule#getFulfillment_condition()
	 * @see #getObligationRule()
	 * @generated
	 */
	EReference getObligationRule_Fulfillment_condition();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ObligationRule#getDeadline_condition <em>Deadline condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deadline condition</em>'.
	 * @see SAR.ObligationRule#getDeadline_condition()
	 * @see #getObligationRule()
	 * @generated
	 */
	EReference getObligationRule_Deadline_condition();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ObligationRule#getCancellation_condition <em>Cancellation condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cancellation condition</em>'.
	 * @see SAR.ObligationRule#getCancellation_condition()
	 * @see #getObligationRule()
	 * @generated
	 */
	EReference getObligationRule_Cancellation_condition();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ObligationRule#getReparation_condition <em>Reparation condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reparation condition</em>'.
	 * @see SAR.ObligationRule#getReparation_condition()
	 * @see #getObligationRule()
	 * @generated
	 */
	EReference getObligationRule_Reparation_condition();

	/**
	 * Returns the meta object for class '{@link SAR.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see SAR.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link SAR.Rule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SAR.Rule#getId()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Id();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.Rule#getActivation_condition <em>Activation condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation condition</em>'.
	 * @see SAR.Rule#getActivation_condition()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Activation_condition();

	/**
	 * Returns the meta object for class '{@link SAR.PolicyRule <em>Policy Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Rule</em>'.
	 * @see SAR.PolicyRule
	 * @generated
	 */
	EClass getPolicyRule();

	/**
	 * Returns the meta object for class '{@link SAR.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay</em>'.
	 * @see SAR.Delay
	 * @generated
	 */
	EClass getDelay();

	/**
	 * Returns the meta object for the attribute '{@link SAR.Delay#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see SAR.Delay#getUnit()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_Unit();

	/**
	 * Returns the meta object for the attribute '{@link SAR.Delay#getCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calendar</em>'.
	 * @see SAR.Delay#getCalendar()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_Calendar();

	/**
	 * Returns the meta object for class '{@link SAR.ObjectDeclaration <em>Object Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Declaration</em>'.
	 * @see SAR.ObjectDeclaration
	 * @generated
	 */
	EClass getObjectDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link SAR.ObjectDeclaration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SAR.ObjectDeclaration#getId()
	 * @see #getObjectDeclaration()
	 * @generated
	 */
	EAttribute getObjectDeclaration_Id();

	/**
	 * Returns the meta object for class '{@link SAR.UpdateObject <em>Update Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Object</em>'.
	 * @see SAR.UpdateObject
	 * @generated
	 */
	EClass getUpdateObject();

	/**
	 * Returns the meta object for class '{@link SAR.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see SAR.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.Create#getAttributes_assignment <em>Attributes assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes assignment</em>'.
	 * @see SAR.Create#getAttributes_assignment()
	 * @see #getCreate()
	 * @generated
	 */
	EReference getCreate_Attributes_assignment();

	/**
	 * Returns the meta object for the reference '{@link SAR.Create#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see SAR.Create#getEntity()
	 * @see #getCreate()
	 * @generated
	 */
	EReference getCreate_Entity();

	/**
	 * Returns the meta object for class '{@link SAR.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove</em>'.
	 * @see SAR.Remove
	 * @generated
	 */
	EClass getRemove();

	/**
	 * Returns the meta object for class '{@link SAR.AttributeValueAssignment <em>Attribute Value Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Assignment</em>'.
	 * @see SAR.AttributeValueAssignment
	 * @generated
	 */
	EClass getAttributeValueAssignment();

	/**
	 * Returns the meta object for the reference '{@link SAR.AttributeValueAssignment#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see SAR.AttributeValueAssignment#getAttribute()
	 * @see #getAttributeValueAssignment()
	 * @generated
	 */
	EReference getAttributeValueAssignment_Attribute();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.AttributeValueAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see SAR.AttributeValueAssignment#getValue()
	 * @see #getAttributeValueAssignment()
	 * @generated
	 */
	EReference getAttributeValueAssignment_Value();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.AttributeValueAssignment#getNew_value <em>New value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New value</em>'.
	 * @see SAR.AttributeValueAssignment#getNew_value()
	 * @see #getAttributeValueAssignment()
	 * @generated
	 */
	EReference getAttributeValueAssignment_New_value();

	/**
	 * Returns the meta object for class '{@link SAR.ValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Expression</em>'.
	 * @see SAR.ValueExpression
	 * @generated
	 */
	EClass getValueExpression();

	/**
	 * Returns the meta object for class '{@link SAR.ComposedValue <em>Composed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Value</em>'.
	 * @see SAR.ComposedValue
	 * @generated
	 */
	EClass getComposedValue();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ComposedValue#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see SAR.ComposedValue#getLhs()
	 * @see #getComposedValue()
	 * @generated
	 */
	EReference getComposedValue_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ComposedValue#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see SAR.ComposedValue#getRhs()
	 * @see #getComposedValue()
	 * @generated
	 */
	EReference getComposedValue_Rhs();

	/**
	 * Returns the meta object for class '{@link SAR.AttributeConditionExpression <em>Attribute Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Condition Expression</em>'.
	 * @see SAR.AttributeConditionExpression
	 * @generated
	 */
	EClass getAttributeConditionExpression();

	/**
	 * Returns the meta object for class '{@link SAR.ComposedAttributeCondition <em>Composed Attribute Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Attribute Condition</em>'.
	 * @see SAR.ComposedAttributeCondition
	 * @generated
	 */
	EClass getComposedAttributeCondition();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ComposedAttributeCondition#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see SAR.ComposedAttributeCondition#getLhs()
	 * @see #getComposedAttributeCondition()
	 * @generated
	 */
	EReference getComposedAttributeCondition_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ComposedAttributeCondition#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see SAR.ComposedAttributeCondition#getRhs()
	 * @see #getComposedAttributeCondition()
	 * @generated
	 */
	EReference getComposedAttributeCondition_Rhs();

	/**
	 * Returns the meta object for class '{@link SAR.ComposedAttributeAssignment <em>Composed Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Attribute Assignment</em>'.
	 * @see SAR.ComposedAttributeAssignment
	 * @generated
	 */
	EClass getComposedAttributeAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ComposedAttributeAssignment#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see SAR.ComposedAttributeAssignment#getLhs()
	 * @see #getComposedAttributeAssignment()
	 * @generated
	 */
	EReference getComposedAttributeAssignment_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ComposedAttributeAssignment#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see SAR.ComposedAttributeAssignment#getRhs()
	 * @see #getComposedAttributeAssignment()
	 * @generated
	 */
	EReference getComposedAttributeAssignment_Rhs();

	/**
	 * Returns the meta object for class '{@link SAR.AttributeAssignmentExpression <em>Attribute Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Assignment Expression</em>'.
	 * @see SAR.AttributeAssignmentExpression
	 * @generated
	 */
	EClass getAttributeAssignmentExpression();

	/**
	 * Returns the meta object for class '{@link SAR.SimpleAttributeType <em>Simple Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Attribute Type</em>'.
	 * @see SAR.SimpleAttributeType
	 * @generated
	 */
	EClass getSimpleAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link SAR.SimpleAttributeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see SAR.SimpleAttributeType#getType()
	 * @see #getSimpleAttributeType()
	 * @generated
	 */
	EAttribute getSimpleAttributeType_Type();

	/**
	 * Returns the meta object for class '{@link SAR.ListAttributeType <em>List Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Attribute Type</em>'.
	 * @see SAR.ListAttributeType
	 * @generated
	 */
	EClass getListAttributeType();

	/**
	 * Returns the meta object for the attribute list '{@link SAR.ListAttributeType#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Types</em>'.
	 * @see SAR.ListAttributeType#getTypes()
	 * @see #getListAttributeType()
	 * @generated
	 */
	EAttribute getListAttributeType_Types();

	/**
	 * Returns the meta object for class '{@link SAR.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Type</em>'.
	 * @see SAR.FieldType
	 * @generated
	 */
	EClass getFieldType();

	/**
	 * Returns the meta object for class '{@link SAR.BracketedValue <em>Bracketed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bracketed Value</em>'.
	 * @see SAR.BracketedValue
	 * @generated
	 */
	EClass getBracketedValue();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.BracketedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see SAR.BracketedValue#getValue()
	 * @see #getBracketedValue()
	 * @generated
	 */
	EReference getBracketedValue_Value();

	/**
	 * Returns the meta object for class '{@link SAR.ConcreteValue <em>Concrete Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Value</em>'.
	 * @see SAR.ConcreteValue
	 * @generated
	 */
	EClass getConcreteValue();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ConcreteValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see SAR.ConcreteValue#getValue()
	 * @see #getConcreteValue()
	 * @generated
	 */
	EReference getConcreteValue_Value();

	/**
	 * Returns the meta object for class '{@link SAR.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value</em>'.
	 * @see SAR.AttributeValue
	 * @generated
	 */
	EClass getAttributeValue();

	/**
	 * Returns the meta object for class '{@link SAR.ParenthesizedValue <em>Parenthesized Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parenthesized Value</em>'.
	 * @see SAR.ParenthesizedValue
	 * @generated
	 */
	EClass getParenthesizedValue();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ParenthesizedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see SAR.ParenthesizedValue#getValue()
	 * @see #getParenthesizedValue()
	 * @generated
	 */
	EReference getParenthesizedValue_Value();

	/**
	 * Returns the meta object for class '{@link SAR.EntitytReference <em>Entityt Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entityt Reference</em>'.
	 * @see SAR.EntitytReference
	 * @generated
	 */
	EClass getEntitytReference();

	/**
	 * Returns the meta object for the attribute '{@link SAR.EntitytReference#getHandle_id <em>Handle id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle id</em>'.
	 * @see SAR.EntitytReference#getHandle_id()
	 * @see #getEntitytReference()
	 * @generated
	 */
	EAttribute getEntitytReference_Handle_id();

	/**
	 * Returns the meta object for the reference '{@link SAR.EntitytReference#getEntity_id <em>Entity id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity id</em>'.
	 * @see SAR.EntitytReference#getEntity_id()
	 * @see #getEntitytReference()
	 * @generated
	 */
	EReference getEntitytReference_Entity_id();

	/**
	 * Returns the meta object for class '{@link SAR.EventCondition <em>Event Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Condition</em>'.
	 * @see SAR.EventCondition
	 * @generated
	 */
	EClass getEventCondition();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.EventCondition#getEvent_reference <em>Event reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event reference</em>'.
	 * @see SAR.EventCondition#getEvent_reference()
	 * @see #getEventCondition()
	 * @generated
	 */
	EReference getEventCondition_Event_reference();

	/**
	 * Returns the meta object for class '{@link SAR.EventReference <em>Event Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Reference</em>'.
	 * @see SAR.EventReference
	 * @generated
	 */
	EClass getEventReference();

	/**
	 * Returns the meta object for the reference '{@link SAR.EventReference#getEvent_id <em>Event id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event id</em>'.
	 * @see SAR.EventReference#getEvent_id()
	 * @see #getEventReference()
	 * @generated
	 */
	EReference getEventReference_Event_id();

	/**
	 * Returns the meta object for class '{@link SAR.ExecutionRule <em>Execution Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Rule</em>'.
	 * @see SAR.ExecutionRule
	 * @generated
	 */
	EClass getExecutionRule();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ExecutionRule#getExecution_expression <em>Execution expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution expression</em>'.
	 * @see SAR.ExecutionRule#getExecution_expression()
	 * @see #getExecutionRule()
	 * @generated
	 */
	EReference getExecutionRule_Execution_expression();

	/**
	 * Returns the meta object for class '{@link SAR.ExecutionExpression <em>Execution Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Expression</em>'.
	 * @see SAR.ExecutionExpression
	 * @generated
	 */
	EClass getExecutionExpression();

	/**
	 * Returns the meta object for class '{@link SAR.ComposedExecution <em>Composed Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Execution</em>'.
	 * @see SAR.ComposedExecution
	 * @generated
	 */
	EClass getComposedExecution();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ComposedExecution#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see SAR.ComposedExecution#getLhs()
	 * @see #getComposedExecution()
	 * @generated
	 */
	EReference getComposedExecution_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.ComposedExecution#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see SAR.ComposedExecution#getRhs()
	 * @see #getComposedExecution()
	 * @generated
	 */
	EReference getComposedExecution_Rhs();

	/**
	 * Returns the meta object for the attribute '{@link SAR.ComposedExecution#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see SAR.ComposedExecution#getOperator()
	 * @see #getComposedExecution()
	 * @generated
	 */
	EAttribute getComposedExecution_Operator();

	/**
	 * Returns the meta object for class '{@link SAR.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see SAR.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.Condition#getAttribute_condition_expression <em>Attribute condition expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute condition expression</em>'.
	 * @see SAR.Condition#getAttribute_condition_expression()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Attribute_condition_expression();

	/**
	 * Returns the meta object for class '{@link SAR.PIPAttributeType <em>PIP Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIP Attribute Type</em>'.
	 * @see SAR.PIPAttributeType
	 * @generated
	 */
	EClass getPIPAttributeType();

	/**
	 * Returns the meta object for the containment reference list '{@link SAR.PIPAttributeType#getPip_options <em>Pip options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pip options</em>'.
	 * @see SAR.PIPAttributeType#getPip_options()
	 * @see #getPIPAttributeType()
	 * @generated
	 */
	EReference getPIPAttributeType_Pip_options();

	/**
	 * Returns the meta object for class '{@link SAR.PIPOption <em>PIP Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIP Option</em>'.
	 * @see SAR.PIPOption
	 * @generated
	 */
	EClass getPIPOption();

	/**
	 * Returns the meta object for the attribute '{@link SAR.PIPOption#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see SAR.PIPOption#getType()
	 * @see #getPIPOption()
	 * @generated
	 */
	EAttribute getPIPOption_Type();

	/**
	 * Returns the meta object for the containment reference '{@link SAR.PIPOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see SAR.PIPOption#getValue()
	 * @see #getPIPOption()
	 * @generated
	 */
	EReference getPIPOption_Value();

	/**
	 * Returns the meta object for class '{@link SAR.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True</em>'.
	 * @see SAR.True
	 * @generated
	 */
	EClass getTrue();

	/**
	 * Returns the meta object for class '{@link SAR.SRUnderscore <em>SR Underscore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SR Underscore</em>'.
	 * @see SAR.SRUnderscore
	 * @generated
	 */
	EClass getSRUnderscore();

	/**
	 * Returns the meta object for the attribute '{@link SAR.SRUnderscore#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SAR.SRUnderscore#getValue()
	 * @see #getSRUnderscore()
	 * @generated
	 */
	EAttribute getSRUnderscore_Value();

	/**
	 * Returns the meta object for enum '{@link SAR.SupportedType <em>Supported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supported Type</em>'.
	 * @see SAR.SupportedType
	 * @generated
	 */
	EEnum getSupportedType();

	/**
	 * Returns the meta object for enum '{@link SAR.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithmetic Operator</em>'.
	 * @see SAR.ArithmeticOperator
	 * @generated
	 */
	EEnum getArithmeticOperator();

	/**
	 * Returns the meta object for enum '{@link SAR.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see SAR.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link SAR.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see SAR.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the meta object for enum '{@link SAR.UpdateRuleType <em>Update Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Update Rule Type</em>'.
	 * @see SAR.UpdateRuleType
	 * @generated
	 */
	EEnum getUpdateRuleType();

	/**
	 * Returns the meta object for enum '{@link SAR.UpdateOperator <em>Update Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Update Operator</em>'.
	 * @see SAR.UpdateOperator
	 * @generated
	 */
	EEnum getUpdateOperator();

	/**
	 * Returns the meta object for enum '{@link SAR.ModificationOperation <em>Modification Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modification Operation</em>'.
	 * @see SAR.ModificationOperation
	 * @generated
	 */
	EEnum getModificationOperation();

	/**
	 * Returns the meta object for enum '{@link SAR.PolicyType <em>Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Policy Type</em>'.
	 * @see SAR.PolicyType
	 * @generated
	 */
	EEnum getPolicyType();

	/**
	 * Returns the meta object for enum '{@link SAR.AccessControlRuleType <em>Access Control Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Control Rule Type</em>'.
	 * @see SAR.AccessControlRuleType
	 * @generated
	 */
	EEnum getAccessControlRuleType();

	/**
	 * Returns the meta object for enum '{@link SAR.ObligationRuleType <em>Obligation Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Obligation Rule Type</em>'.
	 * @see SAR.ObligationRuleType
	 * @generated
	 */
	EEnum getObligationRuleType();

	/**
	 * Returns the meta object for enum '{@link SAR.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calendar</em>'.
	 * @see SAR.Calendar
	 * @generated
	 */
	EEnum getCalendar();

	/**
	 * Returns the meta object for enum '{@link SAR.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Type</em>'.
	 * @see SAR.ConditionType
	 * @generated
	 */
	EEnum getConditionType();

	/**
	 * Returns the meta object for enum '{@link SAR.ExecutionType <em>Execution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execution Type</em>'.
	 * @see SAR.ExecutionType
	 * @generated
	 */
	EEnum getExecutionType();

	/**
	 * Returns the meta object for enum '{@link SAR.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Options</em>'.
	 * @see SAR.Options
	 * @generated
	 */
	EEnum getOptions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SARFactory getSARFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SAR.impl.SecurityConfigurationImpl <em>Security Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.SecurityConfigurationImpl
		 * @see SAR.impl.SARPackageImpl#getSecurityConfiguration()
		 * @generated
		 */
		EClass SECURITY_CONFIGURATION = eINSTANCE.getSecurityConfiguration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONFIGURATION__ID = eINSTANCE.getSecurityConfiguration_Id();

		/**
		 * The meta object literal for the '<em><b>Event declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONFIGURATION__EVENT_DECLARATIONS = eINSTANCE.getSecurityConfiguration_Event_declarations();

		/**
		 * The meta object literal for the '<em><b>Entity declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONFIGURATION__ENTITY_DECLARATIONS = eINSTANCE.getSecurityConfiguration_Entity_declarations();

		/**
		 * The meta object literal for the '<em><b>Predicate definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONFIGURATION__PREDICATE_DEFINITIONS = eINSTANCE.getSecurityConfiguration_Predicate_definitions();

		/**
		 * The meta object literal for the '<em><b>Pre updates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONFIGURATION__PRE_UPDATES = eINSTANCE.getSecurityConfiguration_Pre_updates();

		/**
		 * The meta object literal for the '<em><b>Post updates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONFIGURATION__POST_UPDATES = eINSTANCE.getSecurityConfiguration_Post_updates();

		/**
		 * The meta object literal for the '<em><b>Security policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONFIGURATION__SECURITY_POLICY = eINSTANCE.getSecurityConfiguration_Security_policy();

		/**
		 * The meta object literal for the '{@link SAR.impl.EventDeclarationImpl <em>Event Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.EventDeclarationImpl
		 * @see SAR.impl.SARPackageImpl#getEventDeclaration()
		 * @generated
		 */
		EClass EVENT_DECLARATION = eINSTANCE.getEventDeclaration();

		/**
		 * The meta object literal for the '<em><b>Event attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_DECLARATION__EVENT_ATTRIBUTES = eINSTANCE.getEventDeclaration_Event_attributes();

		/**
		 * The meta object literal for the '{@link SAR.impl.MonitoringImpl <em>Monitoring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.MonitoringImpl
		 * @see SAR.impl.SARPackageImpl#getMonitoring()
		 * @generated
		 */
		EClass MONITORING = eINSTANCE.getMonitoring();

		/**
		 * The meta object literal for the '{@link SAR.impl.InterceptionImpl <em>Interception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.InterceptionImpl
		 * @see SAR.impl.SARPackageImpl#getInterception()
		 * @generated
		 */
		EClass INTERCEPTION = eINSTANCE.getInterception();

		/**
		 * The meta object literal for the '{@link SAR.impl.ExecutionImpl <em>Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ExecutionImpl
		 * @see SAR.impl.SARPackageImpl#getExecution()
		 * @generated
		 */
		EClass EXECUTION = eINSTANCE.getExecution();

		/**
		 * The meta object literal for the '{@link SAR.impl.EventAttributeImpl <em>Event Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.EventAttributeImpl
		 * @see SAR.impl.SARPackageImpl#getEventAttribute()
		 * @generated
		 */
		EClass EVENT_ATTRIBUTE = eINSTANCE.getEventAttribute();

		/**
		 * The meta object literal for the '<em><b>Field type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_ATTRIBUTE__FIELD_TYPE = eINSTANCE.getEventAttribute_Field_type();

		/**
		 * The meta object literal for the '{@link SAR.impl.EntityDeclarationImpl <em>Entity Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.EntityDeclarationImpl
		 * @see SAR.impl.SARPackageImpl#getEntityDeclaration()
		 * @generated
		 */
		EClass ENTITY_DECLARATION = eINSTANCE.getEntityDeclaration();

		/**
		 * The meta object literal for the '<em><b>Entity attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_DECLARATION__ENTITY_ATTRIBUTES = eINSTANCE.getEntityDeclaration_Entity_attributes();

		/**
		 * The meta object literal for the '{@link SAR.impl.AttributeDeclarationImpl <em>Attribute Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.AttributeDeclarationImpl
		 * @see SAR.impl.SARPackageImpl#getAttributeDeclaration()
		 * @generated
		 */
		EClass ATTRIBUTE_DECLARATION = eINSTANCE.getAttributeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DECLARATION__ID = eINSTANCE.getAttributeDeclaration_Id();

		/**
		 * The meta object literal for the '{@link SAR.impl.EntityAttributeImpl <em>Entity Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.EntityAttributeImpl
		 * @see SAR.impl.SARPackageImpl#getEntityAttribute()
		 * @generated
		 */
		EClass ENTITY_ATTRIBUTE = eINSTANCE.getEntityAttribute();

		/**
		 * The meta object literal for the '<em><b>Field type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ATTRIBUTE__FIELD_TYPE = eINSTANCE.getEntityAttribute_Field_type();

		/**
		 * The meta object literal for the '{@link SAR.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ConditionExpressionImpl
		 * @see SAR.impl.SARPackageImpl#getConditionExpression()
		 * @generated
		 */
		EClass CONDITION_EXPRESSION = eINSTANCE.getConditionExpression();

		/**
		 * The meta object literal for the '{@link SAR.impl.StateConditionImpl <em>State Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.StateConditionImpl
		 * @see SAR.impl.SARPackageImpl#getStateCondition()
		 * @generated
		 */
		EClass STATE_CONDITION = eINSTANCE.getStateCondition();

		/**
		 * The meta object literal for the '<em><b>Entity reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_CONDITION__ENTITY_REFERENCE = eINSTANCE.getStateCondition_Entity_reference();

		/**
		 * The meta object literal for the '{@link SAR.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ValueImpl
		 * @see SAR.impl.SARPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link SAR.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.TextImpl
		 * @see SAR.impl.SARPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__VALUE = eINSTANCE.getText_Value();

		/**
		 * The meta object literal for the '{@link SAR.impl.SRBooleanImpl <em>SR Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.SRBooleanImpl
		 * @see SAR.impl.SARPackageImpl#getSRBoolean()
		 * @generated
		 */
		EClass SR_BOOLEAN = eINSTANCE.getSRBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SR_BOOLEAN__VALUE = eINSTANCE.getSRBoolean_Value();

		/**
		 * The meta object literal for the '{@link SAR.impl.ConcreteArithmeticExpressionImpl <em>Concrete Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ConcreteArithmeticExpressionImpl
		 * @see SAR.impl.SARPackageImpl#getConcreteArithmeticExpression()
		 * @generated
		 */
		EClass CONCRETE_ARITHMETIC_EXPRESSION = eINSTANCE.getConcreteArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_ARITHMETIC_EXPRESSION__EXPRESSION = eINSTANCE.getConcreteArithmeticExpression_Expression();

		/**
		 * The meta object literal for the '{@link SAR.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ArithmeticExpressionImpl
		 * @see SAR.impl.SARPackageImpl#getArithmeticExpression()
		 * @generated
		 */
		EClass ARITHMETIC_EXPRESSION = eINSTANCE.getArithmeticExpression();

		/**
		 * The meta object literal for the '{@link SAR.impl.SRIntegerImpl <em>SR Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.SRIntegerImpl
		 * @see SAR.impl.SARPackageImpl#getSRInteger()
		 * @generated
		 */
		EClass SR_INTEGER = eINSTANCE.getSRInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SR_INTEGER__VALUE = eINSTANCE.getSRInteger_Value();

		/**
		 * The meta object literal for the '{@link SAR.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.VariableImpl
		 * @see SAR.impl.SARPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link SAR.impl.SRFloatImpl <em>SR Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.SRFloatImpl
		 * @see SAR.impl.SARPackageImpl#getSRFloat()
		 * @generated
		 */
		EClass SR_FLOAT = eINSTANCE.getSRFloat();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SR_FLOAT__VALUE = eINSTANCE.getSRFloat_Value();

		/**
		 * The meta object literal for the '{@link SAR.impl.ArithmeticOperationImpl <em>Arithmetic Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ArithmeticOperationImpl
		 * @see SAR.impl.SARPackageImpl#getArithmeticOperation()
		 * @generated
		 */
		EClass ARITHMETIC_OPERATION = eINSTANCE.getArithmeticOperation();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_OPERATION__OPERATION = eINSTANCE.getArithmeticOperation_Operation();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_OPERATION__LHS = eINSTANCE.getArithmeticOperation_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_OPERATION__RHS = eINSTANCE.getArithmeticOperation_Rhs();

		/**
		 * The meta object literal for the '{@link SAR.impl.AttributeConditionImpl <em>Attribute Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.AttributeConditionImpl
		 * @see SAR.impl.SARPackageImpl#getAttributeCondition()
		 * @generated
		 */
		EClass ATTRIBUTE_CONDITION = eINSTANCE.getAttributeCondition();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONDITION__ATTRIBUTE = eINSTANCE.getAttributeCondition_Attribute();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONDITION__OPERATOR = eINSTANCE.getAttributeCondition_Operator();

		/**
		 * The meta object literal for the '<em><b>Attribute value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE = eINSTANCE.getAttributeCondition_Attribute_value();

		/**
		 * The meta object literal for the '{@link SAR.impl.NegatedCEImpl <em>Negated CE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.NegatedCEImpl
		 * @see SAR.impl.SARPackageImpl#getNegatedCE()
		 * @generated
		 */
		EClass NEGATED_CE = eINSTANCE.getNegatedCE();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATED_CE__OP = eINSTANCE.getNegatedCE_Op();

		/**
		 * The meta object literal for the '{@link SAR.impl.ComposedCEImpl <em>Composed CE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ComposedCEImpl
		 * @see SAR.impl.SARPackageImpl#getComposedCE()
		 * @generated
		 */
		EClass COMPOSED_CE = eINSTANCE.getComposedCE();

		/**
		 * The meta object literal for the '<em><b>Binary Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSED_CE__BINARY_OPERATOR = eINSTANCE.getComposedCE_BinaryOperator();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_CE__RHS = eINSTANCE.getComposedCE_Rhs();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_CE__LHS = eINSTANCE.getComposedCE_Lhs();

		/**
		 * The meta object literal for the '{@link SAR.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.PredicateImpl
		 * @see SAR.impl.SARPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE__NAME = eINSTANCE.getPredicate_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE__PARAMETERS = eINSTANCE.getPredicate_Parameters();

		/**
		 * The meta object literal for the '{@link SAR.impl.AbstractConditionImpl <em>Abstract Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.AbstractConditionImpl
		 * @see SAR.impl.SARPackageImpl#getAbstractCondition()
		 * @generated
		 */
		EClass ABSTRACT_CONDITION = eINSTANCE.getAbstractCondition();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONDITION__PREDICATE = eINSTANCE.getAbstractCondition_Predicate();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONDITION__PARAMETERS = eINSTANCE.getAbstractCondition_Parameters();

		/**
		 * The meta object literal for the '{@link SAR.impl.PredicateDefinitionImpl <em>Predicate Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.PredicateDefinitionImpl
		 * @see SAR.impl.SARPackageImpl#getPredicateDefinition()
		 * @generated
		 */
		EClass PREDICATE_DEFINITION = eINSTANCE.getPredicateDefinition();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_DEFINITION__PREDICATE = eINSTANCE.getPredicateDefinition_Predicate();

		/**
		 * The meta object literal for the '<em><b>Activation conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_DEFINITION__ACTIVATION_CONDITIONS = eINSTANCE.getPredicateDefinition_Activation_conditions();

		/**
		 * The meta object literal for the '{@link SAR.impl.ArithmeticComparisonImpl <em>Arithmetic Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ArithmeticComparisonImpl
		 * @see SAR.impl.SARPackageImpl#getArithmeticComparison()
		 * @generated
		 */
		EClass ARITHMETIC_COMPARISON = eINSTANCE.getArithmeticComparison();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_COMPARISON__LHS = eINSTANCE.getArithmeticComparison_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_COMPARISON__RHS = eINSTANCE.getArithmeticComparison_Rhs();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_COMPARISON__OPERATOR = eINSTANCE.getArithmeticComparison_Operator();

		/**
		 * The meta object literal for the '{@link SAR.impl.ParenthesizedCEImpl <em>Parenthesized CE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ParenthesizedCEImpl
		 * @see SAR.impl.SARPackageImpl#getParenthesizedCE()
		 * @generated
		 */
		EClass PARENTHESIZED_CE = eINSTANCE.getParenthesizedCE();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTHESIZED_CE__OP = eINSTANCE.getParenthesizedCE_Op();

		/**
		 * The meta object literal for the '{@link SAR.impl.UpdateRuleImpl <em>Update Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.UpdateRuleImpl
		 * @see SAR.impl.SARPackageImpl#getUpdateRule()
		 * @generated
		 */
		EClass UPDATE_RULE = eINSTANCE.getUpdateRule();

		/**
		 * The meta object literal for the '<em><b>Update expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_RULE__UPDATE_EXPRESSION = eINSTANCE.getUpdateRule_Update_expression();

		/**
		 * The meta object literal for the '{@link SAR.impl.UpdateExpressionImpl <em>Update Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.UpdateExpressionImpl
		 * @see SAR.impl.SARPackageImpl#getUpdateExpression()
		 * @generated
		 */
		EClass UPDATE_EXPRESSION = eINSTANCE.getUpdateExpression();

		/**
		 * The meta object literal for the '{@link SAR.impl.UpdateAttributeImpl <em>Update Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.UpdateAttributeImpl
		 * @see SAR.impl.SARPackageImpl#getUpdateAttribute()
		 * @generated
		 */
		EClass UPDATE_ATTRIBUTE = eINSTANCE.getUpdateAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute assignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ATTRIBUTE__ATTRIBUTE_ASSIGNMENT = eINSTANCE.getUpdateAttribute_Attribute_assignment();

		/**
		 * The meta object literal for the '<em><b>Object reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ATTRIBUTE__OBJECT_REFERENCE = eINSTANCE.getUpdateAttribute_Object_reference();

		/**
		 * The meta object literal for the '{@link SAR.impl.EventExecutionImpl <em>Event Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.EventExecutionImpl
		 * @see SAR.impl.SARPackageImpl#getEventExecution()
		 * @generated
		 */
		EClass EVENT_EXECUTION = eINSTANCE.getEventExecution();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_EXECUTION__EXECUTION = eINSTANCE.getEventExecution_Execution();

		/**
		 * The meta object literal for the '<em><b>Attributes assignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_EXECUTION__ATTRIBUTES_ASSIGNMENT = eINSTANCE.getEventExecution_Attributes_assignment();

		/**
		 * The meta object literal for the '<em><b>Execution type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_EXECUTION__EXECUTION_TYPE = eINSTANCE.getEventExecution_Execution_type();

		/**
		 * The meta object literal for the '{@link SAR.impl.ComposedUpdateImpl <em>Composed Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ComposedUpdateImpl
		 * @see SAR.impl.SARPackageImpl#getComposedUpdate()
		 * @generated
		 */
		EClass COMPOSED_UPDATE = eINSTANCE.getComposedUpdate();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSED_UPDATE__OPERATOR = eINSTANCE.getComposedUpdate_Operator();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_UPDATE__LHS = eINSTANCE.getComposedUpdate_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_UPDATE__RHS = eINSTANCE.getComposedUpdate_Rhs();

		/**
		 * The meta object literal for the '{@link SAR.impl.ParenthesizedUpdateImpl <em>Parenthesized Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ParenthesizedUpdateImpl
		 * @see SAR.impl.SARPackageImpl#getParenthesizedUpdate()
		 * @generated
		 */
		EClass PARENTHESIZED_UPDATE = eINSTANCE.getParenthesizedUpdate();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTHESIZED_UPDATE__OP = eINSTANCE.getParenthesizedUpdate_Op();

		/**
		 * The meta object literal for the '{@link SAR.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.DeleteImpl
		 * @see SAR.impl.SARPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '<em><b>Object reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE__OBJECT_REFERENCE = eINSTANCE.getDelete_Object_reference();

		/**
		 * The meta object literal for the '{@link SAR.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.UpdateImpl
		 * @see SAR.impl.SARPackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '{@link SAR.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.AddImpl
		 * @see SAR.impl.SARPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '{@link SAR.impl.PreUpdateRuleImpl <em>Pre Update Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.PreUpdateRuleImpl
		 * @see SAR.impl.SARPackageImpl#getPreUpdateRule()
		 * @generated
		 */
		EClass PRE_UPDATE_RULE = eINSTANCE.getPreUpdateRule();

		/**
		 * The meta object literal for the '{@link SAR.impl.PostUpdateRuleImpl <em>Post Update Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.PostUpdateRuleImpl
		 * @see SAR.impl.SARPackageImpl#getPostUpdateRule()
		 * @generated
		 */
		EClass POST_UPDATE_RULE = eINSTANCE.getPostUpdateRule();

		/**
		 * The meta object literal for the '{@link SAR.impl.SRStringImpl <em>SR String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.SRStringImpl
		 * @see SAR.impl.SARPackageImpl#getSRString()
		 * @generated
		 */
		EClass SR_STRING = eINSTANCE.getSRString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SR_STRING__VALUE = eINSTANCE.getSRString_Value();

		/**
		 * The meta object literal for the '{@link SAR.impl.SecurityPolicyImpl <em>Security Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.SecurityPolicyImpl
		 * @see SAR.impl.SARPackageImpl#getSecurityPolicy()
		 * @generated
		 */
		EClass SECURITY_POLICY = eINSTANCE.getSecurityPolicy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_POLICY__TYPE = eINSTANCE.getSecurityPolicy_Type();

		/**
		 * The meta object literal for the '<em><b>Policy rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_POLICY__POLICY_RULES = eINSTANCE.getSecurityPolicy_Policy_rules();

		/**
		 * The meta object literal for the '{@link SAR.impl.AccessControlRuleImpl <em>Access Control Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.AccessControlRuleImpl
		 * @see SAR.impl.SARPackageImpl#getAccessControlRule()
		 * @generated
		 */
		EClass ACCESS_CONTROL_RULE = eINSTANCE.getAccessControlRule();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL_RULE__TYPE = eINSTANCE.getAccessControlRule_Type();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL_RULE__EVENT = eINSTANCE.getAccessControlRule_Event();

		/**
		 * The meta object literal for the '<em><b>Provisions expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL_RULE__PROVISIONS_EXPRESSION = eINSTANCE.getAccessControlRule_Provisions_expression();

		/**
		 * The meta object literal for the '{@link SAR.impl.ObligationRuleImpl <em>Obligation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ObligationRuleImpl
		 * @see SAR.impl.SARPackageImpl#getObligationRule()
		 * @generated
		 */
		EClass OBLIGATION_RULE = eINSTANCE.getObligationRule();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBLIGATION_RULE__TYPE = eINSTANCE.getObligationRule_Type();

		/**
		 * The meta object literal for the '<em><b>Fulfillment condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBLIGATION_RULE__FULFILLMENT_CONDITION = eINSTANCE.getObligationRule_Fulfillment_condition();

		/**
		 * The meta object literal for the '<em><b>Deadline condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBLIGATION_RULE__DEADLINE_CONDITION = eINSTANCE.getObligationRule_Deadline_condition();

		/**
		 * The meta object literal for the '<em><b>Cancellation condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBLIGATION_RULE__CANCELLATION_CONDITION = eINSTANCE.getObligationRule_Cancellation_condition();

		/**
		 * The meta object literal for the '<em><b>Reparation condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBLIGATION_RULE__REPARATION_CONDITION = eINSTANCE.getObligationRule_Reparation_condition();

		/**
		 * The meta object literal for the '{@link SAR.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.RuleImpl
		 * @see SAR.impl.SARPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ID = eINSTANCE.getRule_Id();

		/**
		 * The meta object literal for the '<em><b>Activation condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__ACTIVATION_CONDITION = eINSTANCE.getRule_Activation_condition();

		/**
		 * The meta object literal for the '{@link SAR.impl.PolicyRuleImpl <em>Policy Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.PolicyRuleImpl
		 * @see SAR.impl.SARPackageImpl#getPolicyRule()
		 * @generated
		 */
		EClass POLICY_RULE = eINSTANCE.getPolicyRule();

		/**
		 * The meta object literal for the '{@link SAR.impl.DelayImpl <em>Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.DelayImpl
		 * @see SAR.impl.SARPackageImpl#getDelay()
		 * @generated
		 */
		EClass DELAY = eINSTANCE.getDelay();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__UNIT = eINSTANCE.getDelay_Unit();

		/**
		 * The meta object literal for the '<em><b>Calendar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__CALENDAR = eINSTANCE.getDelay_Calendar();

		/**
		 * The meta object literal for the '{@link SAR.impl.ObjectDeclarationImpl <em>Object Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ObjectDeclarationImpl
		 * @see SAR.impl.SARPackageImpl#getObjectDeclaration()
		 * @generated
		 */
		EClass OBJECT_DECLARATION = eINSTANCE.getObjectDeclaration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_DECLARATION__ID = eINSTANCE.getObjectDeclaration_Id();

		/**
		 * The meta object literal for the '{@link SAR.impl.UpdateObjectImpl <em>Update Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.UpdateObjectImpl
		 * @see SAR.impl.SARPackageImpl#getUpdateObject()
		 * @generated
		 */
		EClass UPDATE_OBJECT = eINSTANCE.getUpdateObject();

		/**
		 * The meta object literal for the '{@link SAR.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.CreateImpl
		 * @see SAR.impl.SARPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '<em><b>Attributes assignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE__ATTRIBUTES_ASSIGNMENT = eINSTANCE.getCreate_Attributes_assignment();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE__ENTITY = eINSTANCE.getCreate_Entity();

		/**
		 * The meta object literal for the '{@link SAR.impl.RemoveImpl <em>Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.RemoveImpl
		 * @see SAR.impl.SARPackageImpl#getRemove()
		 * @generated
		 */
		EClass REMOVE = eINSTANCE.getRemove();

		/**
		 * The meta object literal for the '{@link SAR.impl.AttributeValueAssignmentImpl <em>Attribute Value Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.AttributeValueAssignmentImpl
		 * @see SAR.impl.SARPackageImpl#getAttributeValueAssignment()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_ASSIGNMENT = eINSTANCE.getAttributeValueAssignment();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_ASSIGNMENT__ATTRIBUTE = eINSTANCE.getAttributeValueAssignment_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_ASSIGNMENT__VALUE = eINSTANCE.getAttributeValueAssignment_Value();

		/**
		 * The meta object literal for the '<em><b>New value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_ASSIGNMENT__NEW_VALUE = eINSTANCE.getAttributeValueAssignment_New_value();

		/**
		 * The meta object literal for the '{@link SAR.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ValueExpressionImpl
		 * @see SAR.impl.SARPackageImpl#getValueExpression()
		 * @generated
		 */
		EClass VALUE_EXPRESSION = eINSTANCE.getValueExpression();

		/**
		 * The meta object literal for the '{@link SAR.impl.ComposedValueImpl <em>Composed Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ComposedValueImpl
		 * @see SAR.impl.SARPackageImpl#getComposedValue()
		 * @generated
		 */
		EClass COMPOSED_VALUE = eINSTANCE.getComposedValue();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_VALUE__LHS = eINSTANCE.getComposedValue_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_VALUE__RHS = eINSTANCE.getComposedValue_Rhs();

		/**
		 * The meta object literal for the '{@link SAR.impl.AttributeConditionExpressionImpl <em>Attribute Condition Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.AttributeConditionExpressionImpl
		 * @see SAR.impl.SARPackageImpl#getAttributeConditionExpression()
		 * @generated
		 */
		EClass ATTRIBUTE_CONDITION_EXPRESSION = eINSTANCE.getAttributeConditionExpression();

		/**
		 * The meta object literal for the '{@link SAR.impl.ComposedAttributeConditionImpl <em>Composed Attribute Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ComposedAttributeConditionImpl
		 * @see SAR.impl.SARPackageImpl#getComposedAttributeCondition()
		 * @generated
		 */
		EClass COMPOSED_ATTRIBUTE_CONDITION = eINSTANCE.getComposedAttributeCondition();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_ATTRIBUTE_CONDITION__LHS = eINSTANCE.getComposedAttributeCondition_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_ATTRIBUTE_CONDITION__RHS = eINSTANCE.getComposedAttributeCondition_Rhs();

		/**
		 * The meta object literal for the '{@link SAR.impl.ComposedAttributeAssignmentImpl <em>Composed Attribute Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ComposedAttributeAssignmentImpl
		 * @see SAR.impl.SARPackageImpl#getComposedAttributeAssignment()
		 * @generated
		 */
		EClass COMPOSED_ATTRIBUTE_ASSIGNMENT = eINSTANCE.getComposedAttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_ATTRIBUTE_ASSIGNMENT__LHS = eINSTANCE.getComposedAttributeAssignment_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_ATTRIBUTE_ASSIGNMENT__RHS = eINSTANCE.getComposedAttributeAssignment_Rhs();

		/**
		 * The meta object literal for the '{@link SAR.impl.AttributeAssignmentExpressionImpl <em>Attribute Assignment Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.AttributeAssignmentExpressionImpl
		 * @see SAR.impl.SARPackageImpl#getAttributeAssignmentExpression()
		 * @generated
		 */
		EClass ATTRIBUTE_ASSIGNMENT_EXPRESSION = eINSTANCE.getAttributeAssignmentExpression();

		/**
		 * The meta object literal for the '{@link SAR.impl.SimpleAttributeTypeImpl <em>Simple Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.SimpleAttributeTypeImpl
		 * @see SAR.impl.SARPackageImpl#getSimpleAttributeType()
		 * @generated
		 */
		EClass SIMPLE_ATTRIBUTE_TYPE = eINSTANCE.getSimpleAttributeType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ATTRIBUTE_TYPE__TYPE = eINSTANCE.getSimpleAttributeType_Type();

		/**
		 * The meta object literal for the '{@link SAR.impl.ListAttributeTypeImpl <em>List Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ListAttributeTypeImpl
		 * @see SAR.impl.SARPackageImpl#getListAttributeType()
		 * @generated
		 */
		EClass LIST_ATTRIBUTE_TYPE = eINSTANCE.getListAttributeType();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ATTRIBUTE_TYPE__TYPES = eINSTANCE.getListAttributeType_Types();

		/**
		 * The meta object literal for the '{@link SAR.impl.FieldTypeImpl <em>Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.FieldTypeImpl
		 * @see SAR.impl.SARPackageImpl#getFieldType()
		 * @generated
		 */
		EClass FIELD_TYPE = eINSTANCE.getFieldType();

		/**
		 * The meta object literal for the '{@link SAR.impl.BracketedValueImpl <em>Bracketed Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.BracketedValueImpl
		 * @see SAR.impl.SARPackageImpl#getBracketedValue()
		 * @generated
		 */
		EClass BRACKETED_VALUE = eINSTANCE.getBracketedValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRACKETED_VALUE__VALUE = eINSTANCE.getBracketedValue_Value();

		/**
		 * The meta object literal for the '{@link SAR.impl.ConcreteValueImpl <em>Concrete Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ConcreteValueImpl
		 * @see SAR.impl.SARPackageImpl#getConcreteValue()
		 * @generated
		 */
		EClass CONCRETE_VALUE = eINSTANCE.getConcreteValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_VALUE__VALUE = eINSTANCE.getConcreteValue_Value();

		/**
		 * The meta object literal for the '{@link SAR.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.AttributeValueImpl
		 * @see SAR.impl.SARPackageImpl#getAttributeValue()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

		/**
		 * The meta object literal for the '{@link SAR.impl.ParenthesizedValueImpl <em>Parenthesized Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ParenthesizedValueImpl
		 * @see SAR.impl.SARPackageImpl#getParenthesizedValue()
		 * @generated
		 */
		EClass PARENTHESIZED_VALUE = eINSTANCE.getParenthesizedValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTHESIZED_VALUE__VALUE = eINSTANCE.getParenthesizedValue_Value();

		/**
		 * The meta object literal for the '{@link SAR.impl.EntitytReferenceImpl <em>Entityt Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.EntitytReferenceImpl
		 * @see SAR.impl.SARPackageImpl#getEntitytReference()
		 * @generated
		 */
		EClass ENTITYT_REFERENCE = eINSTANCE.getEntitytReference();

		/**
		 * The meta object literal for the '<em><b>Handle id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITYT_REFERENCE__HANDLE_ID = eINSTANCE.getEntitytReference_Handle_id();

		/**
		 * The meta object literal for the '<em><b>Entity id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITYT_REFERENCE__ENTITY_ID = eINSTANCE.getEntitytReference_Entity_id();

		/**
		 * The meta object literal for the '{@link SAR.impl.EventConditionImpl <em>Event Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.EventConditionImpl
		 * @see SAR.impl.SARPackageImpl#getEventCondition()
		 * @generated
		 */
		EClass EVENT_CONDITION = eINSTANCE.getEventCondition();

		/**
		 * The meta object literal for the '<em><b>Event reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CONDITION__EVENT_REFERENCE = eINSTANCE.getEventCondition_Event_reference();

		/**
		 * The meta object literal for the '{@link SAR.impl.EventReferenceImpl <em>Event Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.EventReferenceImpl
		 * @see SAR.impl.SARPackageImpl#getEventReference()
		 * @generated
		 */
		EClass EVENT_REFERENCE = eINSTANCE.getEventReference();

		/**
		 * The meta object literal for the '<em><b>Event id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_REFERENCE__EVENT_ID = eINSTANCE.getEventReference_Event_id();

		/**
		 * The meta object literal for the '{@link SAR.impl.ExecutionRuleImpl <em>Execution Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ExecutionRuleImpl
		 * @see SAR.impl.SARPackageImpl#getExecutionRule()
		 * @generated
		 */
		EClass EXECUTION_RULE = eINSTANCE.getExecutionRule();

		/**
		 * The meta object literal for the '<em><b>Execution expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_RULE__EXECUTION_EXPRESSION = eINSTANCE.getExecutionRule_Execution_expression();

		/**
		 * The meta object literal for the '{@link SAR.impl.ExecutionExpressionImpl <em>Execution Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ExecutionExpressionImpl
		 * @see SAR.impl.SARPackageImpl#getExecutionExpression()
		 * @generated
		 */
		EClass EXECUTION_EXPRESSION = eINSTANCE.getExecutionExpression();

		/**
		 * The meta object literal for the '{@link SAR.impl.ComposedExecutionImpl <em>Composed Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ComposedExecutionImpl
		 * @see SAR.impl.SARPackageImpl#getComposedExecution()
		 * @generated
		 */
		EClass COMPOSED_EXECUTION = eINSTANCE.getComposedExecution();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_EXECUTION__LHS = eINSTANCE.getComposedExecution_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_EXECUTION__RHS = eINSTANCE.getComposedExecution_Rhs();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSED_EXECUTION__OPERATOR = eINSTANCE.getComposedExecution_Operator();

		/**
		 * The meta object literal for the '{@link SAR.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.ConditionImpl
		 * @see SAR.impl.SARPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Attribute condition expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ATTRIBUTE_CONDITION_EXPRESSION = eINSTANCE.getCondition_Attribute_condition_expression();

		/**
		 * The meta object literal for the '{@link SAR.impl.PIPAttributeTypeImpl <em>PIP Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.PIPAttributeTypeImpl
		 * @see SAR.impl.SARPackageImpl#getPIPAttributeType()
		 * @generated
		 */
		EClass PIP_ATTRIBUTE_TYPE = eINSTANCE.getPIPAttributeType();

		/**
		 * The meta object literal for the '<em><b>Pip options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIP_ATTRIBUTE_TYPE__PIP_OPTIONS = eINSTANCE.getPIPAttributeType_Pip_options();

		/**
		 * The meta object literal for the '{@link SAR.impl.PIPOptionImpl <em>PIP Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.PIPOptionImpl
		 * @see SAR.impl.SARPackageImpl#getPIPOption()
		 * @generated
		 */
		EClass PIP_OPTION = eINSTANCE.getPIPOption();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIP_OPTION__TYPE = eINSTANCE.getPIPOption_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIP_OPTION__VALUE = eINSTANCE.getPIPOption_Value();

		/**
		 * The meta object literal for the '{@link SAR.impl.TrueImpl <em>True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.TrueImpl
		 * @see SAR.impl.SARPackageImpl#getTrue()
		 * @generated
		 */
		EClass TRUE = eINSTANCE.getTrue();

		/**
		 * The meta object literal for the '{@link SAR.impl.SRUnderscoreImpl <em>SR Underscore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.impl.SRUnderscoreImpl
		 * @see SAR.impl.SARPackageImpl#getSRUnderscore()
		 * @generated
		 */
		EClass SR_UNDERSCORE = eINSTANCE.getSRUnderscore();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SR_UNDERSCORE__VALUE = eINSTANCE.getSRUnderscore_Value();

		/**
		 * The meta object literal for the '{@link SAR.SupportedType <em>Supported Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.SupportedType
		 * @see SAR.impl.SARPackageImpl#getSupportedType()
		 * @generated
		 */
		EEnum SUPPORTED_TYPE = eINSTANCE.getSupportedType();

		/**
		 * The meta object literal for the '{@link SAR.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.ArithmeticOperator
		 * @see SAR.impl.SARPackageImpl#getArithmeticOperator()
		 * @generated
		 */
		EEnum ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

		/**
		 * The meta object literal for the '{@link SAR.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.ComparisonOperator
		 * @see SAR.impl.SARPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '{@link SAR.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.BinaryOperator
		 * @see SAR.impl.SARPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '{@link SAR.UpdateRuleType <em>Update Rule Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.UpdateRuleType
		 * @see SAR.impl.SARPackageImpl#getUpdateRuleType()
		 * @generated
		 */
		EEnum UPDATE_RULE_TYPE = eINSTANCE.getUpdateRuleType();

		/**
		 * The meta object literal for the '{@link SAR.UpdateOperator <em>Update Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.UpdateOperator
		 * @see SAR.impl.SARPackageImpl#getUpdateOperator()
		 * @generated
		 */
		EEnum UPDATE_OPERATOR = eINSTANCE.getUpdateOperator();

		/**
		 * The meta object literal for the '{@link SAR.ModificationOperation <em>Modification Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.ModificationOperation
		 * @see SAR.impl.SARPackageImpl#getModificationOperation()
		 * @generated
		 */
		EEnum MODIFICATION_OPERATION = eINSTANCE.getModificationOperation();

		/**
		 * The meta object literal for the '{@link SAR.PolicyType <em>Policy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.PolicyType
		 * @see SAR.impl.SARPackageImpl#getPolicyType()
		 * @generated
		 */
		EEnum POLICY_TYPE = eINSTANCE.getPolicyType();

		/**
		 * The meta object literal for the '{@link SAR.AccessControlRuleType <em>Access Control Rule Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.AccessControlRuleType
		 * @see SAR.impl.SARPackageImpl#getAccessControlRuleType()
		 * @generated
		 */
		EEnum ACCESS_CONTROL_RULE_TYPE = eINSTANCE.getAccessControlRuleType();

		/**
		 * The meta object literal for the '{@link SAR.ObligationRuleType <em>Obligation Rule Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.ObligationRuleType
		 * @see SAR.impl.SARPackageImpl#getObligationRuleType()
		 * @generated
		 */
		EEnum OBLIGATION_RULE_TYPE = eINSTANCE.getObligationRuleType();

		/**
		 * The meta object literal for the '{@link SAR.Calendar <em>Calendar</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.Calendar
		 * @see SAR.impl.SARPackageImpl#getCalendar()
		 * @generated
		 */
		EEnum CALENDAR = eINSTANCE.getCalendar();

		/**
		 * The meta object literal for the '{@link SAR.ConditionType <em>Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.ConditionType
		 * @see SAR.impl.SARPackageImpl#getConditionType()
		 * @generated
		 */
		EEnum CONDITION_TYPE = eINSTANCE.getConditionType();

		/**
		 * The meta object literal for the '{@link SAR.ExecutionType <em>Execution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.ExecutionType
		 * @see SAR.impl.SARPackageImpl#getExecutionType()
		 * @generated
		 */
		EEnum EXECUTION_TYPE = eINSTANCE.getExecutionType();

		/**
		 * The meta object literal for the '{@link SAR.Options <em>Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SAR.Options
		 * @see SAR.impl.SARPackageImpl#getOptions()
		 * @generated
		 */
		EEnum OPTIONS = eINSTANCE.getOptions();

	}

} //SARPackage
