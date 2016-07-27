SYNTAXDEF SecRunS
FOR <http://www.sar.com/s>
START SecurityConfiguration

OPTIONS {
  usePredefinedTokens = "false"; 
 }

TOKENS {
	DEFINE UNARYOP $'!'$;
	//DEFINE BINARYOP $'&'$; 
	DEFINE UNDERSCORE $'_'$;
	DEFINE LINEBREAK $('\r\n' | '\r' | '\n')$;	
	DEFINE HANDLE $('%')('a'..'z' | 'A'..'Z' | '_' | ' ' | '0'..'9')$;
	DEFINE WHITESPACE $(' ' | '\t' | '\f')$;
	
	DEFINE VARIABLE $('?')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')+$;
	DEFINE BOOLEAN $'true' | 'false'$;
	DEFINE CALENDARS $'s' | 'm' | 'h' | 'd'$;
	DEFINE TEXT $('A'..'Z'|'a'..'z' | '0'..'9' |  '_' | '-' )+ $;
	DEFINE STRING $('"')('a'..'z' | 'A'..'Z' | '_' | ' ' | '0'..'9' | '@' | '.')+('"')$;
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
	
	//DEFINE UPPERCASE $('A'..'Z')('A'..'Z'|'a'..'z' | '0'..'9'  | '_')+ $;
	//DEFINE LOWERCASE $('a'..'z')('A'..'Z'|'a'..'z' | '0'..'9' | '_')+ $;	
		
	
}


TOKENSTYLES {
	"S@R_Configuration" COLOR #7F0055, BOLD;
	"Monitoring" COLOR #7F0055, BOLD;
	"Interception" COLOR #7F0055, BOLD;
	"Execution" COLOR #7F0055, BOLD;
	"Event_Declarations" COLOR #7F0055, BOLD;
	"Entity_Declarations" COLOR #7F0055, BOLD;
	"Definition_Rules" COLOR #7F0055, BOLD;
	"Entity" COLOR #7F0055, BOLD;
	"Define" COLOR #7F0055, BOLD;
	"As" COLOR #7F0055, BOLD;
	"OR" COLOR #7F0055, BOLD;

	"PreUpdateRule" COLOR #7F0055, BOLD;
	"If" COLOR #7F0055, BOLD;
	"Do" COLOR #7F0055, BOLD;
	"PostUpdateRule" COLOR #7F0055, BOLD;
	"execute" COLOR #7F0055, BOLD;
	"delete" COLOR #7F0055, BOLD;
	"add" COLOR #7F0055, BOLD;
	"update" COLOR #7F0055, BOLD;
	"UpdateRules" COLOR #7F0055, BOLD;
	"SecurityPolicy" COLOR #7F0055, BOLD;
	"Authorization" COLOR #7F0055, BOLD;
	"Obligation" COLOR #7F0055, BOLD;
	"Deadline" COLOR #7F0055, BOLD;
	"Cancellation" COLOR #7F0055, BOLD;
	"Reparation" COLOR #7F0055, BOLD;
	"delay" COLOR #7F0055, BOLD;
	"create" COLOR #7F0055, BOLD;
	"remove" COLOR #7F0055, BOLD;
	"Provisions" COLOR #7F0055, BOLD;
	"_" COLOR #7F0055, BOLD;
	"true_condition" COLOR #7F0055, BOLD;
	
	
}


RULES {
	SecurityConfiguration ::= "S@R_Configuration" id[TEXT] "{"
		 		
		 		"Event_Declarations" "{" event_declarations* "}"
		 		
		 		"Entity_Declarations" "{" entity_declarations* "}"
		 		
		 		
		 		security_policy		 		
		 				 		
		 		"UpdateRules" "{" pre_updates*  
		 						post_updates* 
		 						"}"
		 						
		 		"Definition_Rules" "{" predicate_definitions* "}"
		 		
		"}";
		
	Monitoring ::= "Monitoring" id[TEXT] "{"  (event_attributes ("," event_attributes)*)? "}";
	
	Interception ::= "Interception" id[TEXT] "{"  (event_attributes ("," event_attributes)*)? "}";
	
	Execution ::= "Execution" id[TEXT] "{"  (event_attributes ("," event_attributes)*)? "}";
	
	EventAttribute ::= field_type
						":" id[TEXT]; 
						
	EntityDeclaration ::= "Entity" id[TEXT] "{" (entity_attributes ("," entity_attributes)*)? "}"; 
	
	EntityAttribute ::=  field_type  
						":" id[TEXT]; 
						
	SimpleAttributeType ::= type[Integer:"integer", String:"string", Boolean:"boolean", Double:"double", Float:"float", Long:"long"];
	
	ListAttributeType ::= "[" types[Integer:"integer", String:"string", Boolean:"boolean", Double:"double", Float:"float", Long:"long"] ("," types[Integer:"integer", String:"string", Boolean:"boolean", Double:"double", Float:"float", Long:"long"])*  "]";

	PIPAttributeType ::= field_type ":" id[TEXT] "@PIP"
			("[" pip_options ("," pip_options)* "]")? ;
	
	PIPOption ::= type[Frequency:"frequency", Notification:"notification", Monitoring:"monitoring"] "=" value;
	
	
	SecurityPolicy ::= "SecurityPolicy" 
	"[" type[Open:"open", Closed:"closed", ExplicitPermitOverrides:"explicit_permit_overrides", ExplicitDenyOverrides:"explicit_deny_ovderrides"] "]" 
						"{" policy_rules* "}";
	
	AccessControlRule ::= "Authorization" id[TEXT]	 
	 						type[Permission:"Permitted", Prohibition:"Denied"] event
					 	  "If" activation_condition
					   	  ("Provisions" provisions_expression)?;
	
	
	ObligationRule ::= 
		"Obligation" id[TEXT]  
		"If" activation_condition 
		type[Maintenance:"Maintain", Achievement:"Oblige"] fulfillment_condition 
		"Deadline" deadline_condition
		("Cancellation" cancellation_condition)? 
		("Reparation" reparation_condition)?;

	PreUpdateRule ::= "PreUpdateRule" id[TEXT] 
				      "If" activation_condition 
				      "Do" update_expression;
				      
	PostUpdateRule ::= "PostUpdateRule" id[TEXT] 
				       "If" activation_condition 
				       "Do" update_expression;								
																			//Update Expression 
	
	
	@Operator(type="primitive",weight="3",superclass="UpdateExpression")	
	Delete ::=  object_reference "." "delete";
	
	@Operator(type="primitive",weight="3",superclass="UpdateExpression")	
	Create ::= "create"  "(" entity[TEXT] (  attributes_assignment  )? ")";
	
	@Operator(type="primitive",weight="3",superclass="UpdateExpression")	
	Update ::= object_reference "." "update"  attribute_assignment ;
	
	@Operator(type="primitive",weight="3",superclass="UpdateExpression")	
	Add ::= object_reference "." "add"   attribute_assignment ;
	
	@Operator(type="primitive",weight="3",superclass="UpdateExpression")	
	Remove ::= object_reference "." "remove"  attribute_assignment ;
								
	//Conjunction
	@Operator(type="binary_left_associative",weight="1",superclass="UpdateExpression")
	ComposedUpdate ::=  lhs operator[FollowedBy:"->", Disjunction:"or"] rhs;
	
	//Parentheses
	@Operator(type="primitive",weight="3",superclass="UpdateExpression")
	ParenthesizedUpdate ::= "(" op ")";
	
	/////////////////////////////////  Attribute Assignment Expression
	//Conjunction
	@Operator(type="binary_left_associative",weight="1",superclass="AttributeAssignmentExpression")
	ComposedAttributeAssignment ::=  lhs rhs;
	
	@Operator(type="primitive",weight="3",superclass="AttributeAssignmentExpression")
	AttributeValueAssignment ::= "(" attribute[TEXT] "," value ("," new_value)? ")";
	
	/////////////////////////////////  Value Expression
	//Conjunction
	@Operator(type="binary_left_associative",weight="1",superclass="ValueExpression")
	ComposedValue ::=  lhs "," rhs;
	
	@Operator(type="primitive",weight="3",superclass="ValueExpression")
	ConcreteValue ::= value;
	
	BracketedValue ::= "[" value "]";

	ParenthesizedValue ::= "(" value ")";
	
	
	/////////////////////////////////  Condition Expression
	//Conjunction
	@Operator(type="binary_left_associative",weight="1",superclass="ConditionExpression")
	ComposedCE ::=  lhs binaryOperator[Conjunction:"&", Disjunction:"or"] rhs;
	
	//Negation
	@Operator(type="unary_prefix",weight="2",superclass="ConditionExpression")
	NegatedCE ::= "!" op;
	
	//Parentheses
	@Operator(type="primitive",weight="3",superclass="ConditionExpression")
	ParenthesizedCE ::= "(" op ")";
	
	//Delay
	@Operator(type="primitive",weight="3",superclass="ConditionExpression")
	Delay ::= "delay" "<" unit[INTEGER] ":" calendar[CALENDARS] ">";
	
	//Delay
	@Operator(type="primitive",weight="3",superclass="ConditionExpression")
	True ::= "true_condition";
	
	
	//ArithmeticExpression
	@Operator(type="primitive",weight="3",superclass="ConditionExpression")	
	ArithmeticComparison ::= lhs operator[GreaterThanEquals:">=", GreaterThan:">", Equals:"==", LessThanEquals:"<=", LessThan:"<", NotEquals:"<>"] rhs;
	
	@Operator(type="primitive",weight="3",superclass="ConditionExpression")
	StateCondition ::= entity_reference "(" (attribute_condition_expression)? ")";
	
	@Operator(type="primitive",weight="3",superclass="ConditionExpression")
	EventCondition ::= event_reference "(" (attribute_condition_expression)? ")";
	
	EntitytReference ::= entity_id[TEXT] ("_" handle_id[INTEGER])?;
	
	EventReference ::= event_id[TEXT];
	
	@Operator(type="primitive",weight="3",superclass="ConditionExpression")
	AbstractCondition ::= predicate[TEXT]  parameters;
	
	// Attribute Condition Expression
	@Operator(type="primitive",weight="3",superclass="AttributeConditionExpression")	
	AttributeCondition ::= "(" attribute[TEXT] operator[LessThan:"<", LessThanEquals:"<=", GreaterThan:">", GreaterThanEquals:">=", Equals:"==", NotEquals:"<>"] attribute_value ")";
	
	@Operator(type="binary_left_associative",weight="1",superclass="AttributeConditionExpression")
	ComposedAttributeCondition ::= lhs rhs;
	
	
									//Abstract Condition Definitions
	PredicateDefinition ::= 
	"Define" predicate  
	"As" activation_conditions
	("OR" activation_conditions)*;
	
	Predicate ::= name[TEXT] parameters;
	
   									//Arithmetic Expression
	@Operator(type="binary_left_associative",weight="1",superclass="ArithmeticExpression")
	ArithmeticOperation ::=  lhs operation[Addition:"+", Subtraction:"-", Multiplication:"*", Division:"/"] rhs;
	
	@Operator(type="primitive",weight="3",superclass="ArithmeticExpression")
	SRInteger ::= value[INTEGER];
	
	@Operator(type="primitive",weight="3",superclass="ArithmeticExpression")
	Variable ::= value[VARIABLE];
	
	@Operator(type="primitive",weight="3",superclass="ArithmeticExpression")
	SRFloat ::= value[FLOAT];
	
	//Concrete Arithmetic Expression
	ConcreteArithmeticExpression ::= expression;

	Text ::= value[TEXT];
	
	SRBoolean ::= value[BOOLEAN];
	
	SRString ::= value[STRING];
	
	SRUnderscore ::= value[UNDERSCORE];
	
	ExecutionRule ::= "Execution" id[TEXT] 
		"If" activation_condition 
		"Do" execution_expression;
	
	 									//Execution Expression
	@Operator(type="binary_left_associative",weight="1",superclass="ExecutionExpression")
	ComposedExecution ::= lhs operator[FollowedBy:"->", Disjunction:"or"] rhs;
	
	@Operator(type="primitive",weight="3",superclass="ExecutionExpression")
	EventExecution ::= execution_type[Mandatory:"must_execute", Optional:"execute"] "(" execution[TEXT] "(" ( attributes_assignment )? ")" ")" ;	

}