/**
 */
package behavior.impl;

import behavior.AbstractBehavior;
import behavior.AbstractEvent;
import behavior.AbstractMessageEvent;
import behavior.AbstractSignal;
import behavior.AbstractSignalEvent;
import behavior.AbstractTimeEvent;
import behavior.BehaviorFactory;
import behavior.BehaviorPackage;
import behavior.TimeExpression;

import modellingcore.ModellingcorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorPackageImpl extends EPackageImpl implements BehaviorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTimeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMessageEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSignalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeExpressionEClass = null;

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
	 * @see behavior.BehaviorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviorPackageImpl() {
		super(eNS_URI, BehaviorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BehaviorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviorPackage init() {
		if (isInited) return (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBehaviorPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BehaviorPackageImpl theBehaviorPackage = registeredBehaviorPackage instanceof BehaviorPackageImpl ? (BehaviorPackageImpl)registeredBehaviorPackage : new BehaviorPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ModellingcorePackage.eINSTANCE.eClass();
		EmdePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBehaviorPackage.createPackageContents();

		// Initialize created meta-data
		theBehaviorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBehaviorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehaviorPackage.eNS_URI, theBehaviorPackage);
		return theBehaviorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractBehavior() {
		return abstractBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractBehavior_IsControlOperator() {
		return (EAttribute)abstractBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBehavior_OwnedParameterSet() {
		return (EReference)abstractBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBehavior_OwnedParameter() {
		return (EReference)abstractBehaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSignal() {
		return abstractSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEvent() {
		return abstractEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTimeEvent() {
		return abstractTimeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTimeEvent_IsRelative() {
		return (EAttribute)abstractTimeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTimeEvent_When() {
		return (EReference)abstractTimeEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMessageEvent() {
		return abstractMessageEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSignalEvent() {
		return abstractSignalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSignalEvent_Signal() {
		return (EReference)abstractSignalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeExpression() {
		return timeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeExpression_Observations() {
		return (EReference)timeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeExpression_Expression() {
		return (EReference)timeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorFactory getBehaviorFactory() {
		return (BehaviorFactory)getEFactoryInstance();
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
		abstractBehaviorEClass = createEClass(ABSTRACT_BEHAVIOR);
		createEAttribute(abstractBehaviorEClass, ABSTRACT_BEHAVIOR__IS_CONTROL_OPERATOR);
		createEReference(abstractBehaviorEClass, ABSTRACT_BEHAVIOR__OWNED_PARAMETER_SET);
		createEReference(abstractBehaviorEClass, ABSTRACT_BEHAVIOR__OWNED_PARAMETER);

		abstractSignalEClass = createEClass(ABSTRACT_SIGNAL);

		abstractEventEClass = createEClass(ABSTRACT_EVENT);

		abstractTimeEventEClass = createEClass(ABSTRACT_TIME_EVENT);
		createEAttribute(abstractTimeEventEClass, ABSTRACT_TIME_EVENT__IS_RELATIVE);
		createEReference(abstractTimeEventEClass, ABSTRACT_TIME_EVENT__WHEN);

		abstractMessageEventEClass = createEClass(ABSTRACT_MESSAGE_EVENT);

		abstractSignalEventEClass = createEClass(ABSTRACT_SIGNAL_EVENT);
		createEReference(abstractSignalEventEClass, ABSTRACT_SIGNAL_EVENT__SIGNAL);

		timeExpressionEClass = createEClass(TIME_EXPRESSION);
		createEReference(timeExpressionEClass, TIME_EXPRESSION__OBSERVATIONS);
		createEReference(timeExpressionEClass, TIME_EXPRESSION__EXPRESSION);
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

		// Obtain other dependent packages
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage)EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractBehaviorEClass.getESuperTypes().add(theModellingcorePackage.getAbstractNamedElement());
		abstractSignalEClass.getESuperTypes().add(theModellingcorePackage.getAbstractType());
		abstractEventEClass.getESuperTypes().add(theModellingcorePackage.getAbstractType());
		abstractTimeEventEClass.getESuperTypes().add(this.getAbstractEvent());
		abstractMessageEventEClass.getESuperTypes().add(this.getAbstractEvent());
		abstractSignalEventEClass.getESuperTypes().add(this.getAbstractMessageEvent());
		timeExpressionEClass.getESuperTypes().add(theModellingcorePackage.getValueSpecification());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractBehaviorEClass, AbstractBehavior.class, "AbstractBehavior", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractBehavior_IsControlOperator(), ecorePackage.getEBoolean(), "isControlOperator", null, 0, 1, AbstractBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBehavior_OwnedParameterSet(), theModellingcorePackage.getAbstractParameterSet(), null, "ownedParameterSet", null, 0, -1, AbstractBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBehavior_OwnedParameter(), theModellingcorePackage.getAbstractParameter(), null, "ownedParameter", null, 0, -1, AbstractBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractSignalEClass, AbstractSignal.class, "AbstractSignal", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractEventEClass, AbstractEvent.class, "AbstractEvent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractTimeEventEClass, AbstractTimeEvent.class, "AbstractTimeEvent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTimeEvent_IsRelative(), ecorePackage.getEBoolean(), "isRelative", null, 0, 1, AbstractTimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTimeEvent_When(), this.getTimeExpression(), null, "when", null, 1, 1, AbstractTimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMessageEventEClass, AbstractMessageEvent.class, "AbstractMessageEvent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractSignalEventEClass, AbstractSignalEvent.class, "AbstractSignalEvent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractSignalEvent_Signal(), this.getAbstractSignal(), null, "signal", null, 1, 1, AbstractSignalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeExpressionEClass, TimeExpression.class, "TimeExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeExpression_Observations(), theModellingcorePackage.getAbstractNamedElement(), null, "observations", null, 0, 1, TimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeExpression_Expression(), theModellingcorePackage.getValueSpecification(), null, "expression", null, 0, 1, TimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/kitalpha/emde/1.0.0/extension
		createExtensionAnnotations();
		// http://www.polarsys.org/kitalpha/ecore/documentation
		createDocumentationAnnotations();
		// http://www.polarsys.org/capella/semantic
		createSemanticAnnotations();
		// http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping
		createMappingAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/extension</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtensionAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/extension";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "trackResourceModification", "true",
			   "useUUIDs", "false",
			   "useIDAttributes", "true",
			   "extensibleProviderFactory", "true",
			   "childCreationExtenders", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/ecore/documentation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocumentationAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/ecore/documentation";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "description", "Behaviour aims at defining the core concepts of behavioural model.\r\n[source: Capella study]",
			   "usage guideline", "none",
			   "used in levels", "operational,system,logical,physical,epbs",
			   "usage examples", "none",
			   "constraints", "This package depends on the model ModellingCore.ecore",
			   "comment/notes", "none",
			   "reference documentation", "none"
		   });
		addAnnotation
		  (abstractBehaviorEClass,
		   source,
		   new String[] {
			   "description", "A Behavior is a specification of how its context classifier changes state over time.\r\nThe concept of behavior is extended to own Parameter Sets.\r\n[source: UML superstructure v2.2]\r\n\r\nDynamic response to an excitation of an engineering thing.\r\n[source: INCOSE AP233 WG, \"System Engineering Concepts - A semantic glossary and model\"]\r\n",
			   "usage guideline", "n/a (abstract)",
			   "used in levels", "n/a",
			   "usage examples", "n/a",
			   "constraints", "none",
			   "comment/notes", "This element is a combination of UML2\'s Behavior from BasicBehavior package, and Behavior from CompleteBehavior package.\r\nIt has Parameters, and also has ParameterSets definition (e.g. specific groupings of some of the parameters)",
			   "reference documentation", "none"
		   });
		addAnnotation
		  (getAbstractBehavior_IsControlOperator(),
		   source,
		   new String[] {
			   "description", "Tells whether the type of this behavior node is to be treated as control\r\n[source: UML superstructure v2.2]",
			   "constraints", "none",
			   "type", "n/a",
			   "comment/notes", "none"
		   });
		addAnnotation
		  (getAbstractBehavior_OwnedParameterSet(),
		   source,
		   new String[] {
			   "description", "The ParameterSets owned by this Behavior\r\n[source: UML superstructure v2.2]",
			   "constraints", "none",
			   "comment/notes", "none"
		   });
		addAnnotation
		  (getAbstractBehavior_OwnedParameter(),
		   source,
		   new String[] {
			   "description", "References a list of parameters to the behavior that describes the order and type of arguments that can be given\r\nwhen the behavior is invoked and of the values that will be returned when the behavior completes its execution\r\n[source: UML superstructure v2.2]",
			   "constraints", "none",
			   "comment/notes", "none"
		   });
		addAnnotation
		  (abstractSignalEClass,
		   source,
		   new String[] {
			   "description", "A signal is a specification of send request instances communicated between objects. The receiving object handles the\r\nreceived request instances as specified by its receptions. The data carried by a send request (which was passed to it by the\r\nsend invocation occurrence that caused that request) are represented as attributes of the signal. A signal is defined\r\nindependently of the classifiers handling the signal occurrence\r\n[source: UML superstructure v2.2]",
			   "usage guideline", "n/a (Abstract)",
			   "used in levels", "n/a",
			   "usage examples", "n/a",
			   "constraints", "none",
			   "comment/notes", "the UML2 definition of this element contains an attribute \"ownedAttribute [0..*]\", that is absent here, because the Capella version is a simplified one.\r\nThis element should be removed, since it is only used in Information package, (Signal and references to the Signal), no need for a decoupling class located here.",
			   "reference documentation", "none"
		   });
		addAnnotation
		  (abstractEventEClass,
		   source,
		   new String[] {
			   "description", "An event is the specification of some occurrence that may potentially trigger effects by an object\r\n[source: UML superstructure v2.2]",
			   "usage guideline", "n/a (Abstract)",
			   "used in levels", "n/a",
			   "usage examples", "n/a",
			   "constraints", "none",
			   "comment/notes", "none",
			   "reference documentation", "none"
		   });
		addAnnotation
		  (abstractTimeEventEClass,
		   source,
		   new String[] {
			   "description", "A time event specifies a point in time by an expression. The expression might be absolute or might be relative to some\r\nother point in time.\r\n[source: UML superstructure v2.2]",
			   "usage guideline", "n/a (Abstract)",
			   "used in levels", "n/a",
			   "usage examples", "n/a",
			   "constraints", "none",
			   "comment/notes", "not used/implemented as of Capella",
			   "reference documentation", "none"
		   });
		addAnnotation
		  (getAbstractTimeEvent_IsRelative(),
		   source,
		   new String[] {
			   "description", "Specifies whether it is relative or absolute time\r\n[source: UML superstructure v2.2]",
			   "constraints", "none",
			   "type", "n/a",
			   "comment/notes", "none"
		   });
		addAnnotation
		  (getAbstractTimeEvent_When(),
		   source,
		   new String[] {
			   "description", "Specifies the corresponding time deadline\r\n[source: UML superstructure v2.2]",
			   "constraints", "none",
			   "comment/notes", "none"
		   });
		addAnnotation
		  (abstractMessageEventEClass,
		   source,
		   new String[] {
			   "description", "A message event specifies the receipt by an object of either a call or a signal\r\n[source: UML superstructure v2.2]",
			   "usage guideline", "n/a (Abstract)",
			   "used in levels", "n/a",
			   "usage examples", "n/a",
			   "constraints", "none",
			   "comment/notes", "not used/implemented as of Capella",
			   "reference documentation", "none"
		   });
		addAnnotation
		  (abstractSignalEventEClass,
		   source,
		   new String[] {
			   "description", "A signal event represents the receipt of an asynchronous signal. A signal event may cause a response, such as a state\r\nmachine transition as specified in the classifier behavior of the classifier that specified the receiver object, if the signal\r\nreferenced by the send request is mentioned in a reception owned or inherited by the classifier that specified the receiver\r\nobject.\r\n[source: UML superstructure v2.2]",
			   "usage guideline", "n/a (Abstract)",
			   "used in levels", "n/a",
			   "usage examples", "n/a",
			   "constraints", "none",
			   "comment/notes", "not used/implemented as of Capella",
			   "reference documentation", "none"
		   });
		addAnnotation
		  (getAbstractSignalEvent_Signal(),
		   source,
		   new String[] {
			   "description", "The specific signal that is associated with this event\r\n[source: UML superstructure v2.2]",
			   "constraints", "none",
			   "comment/notes", "none"
		   });
		addAnnotation
		  (timeExpressionEClass,
		   source,
		   new String[] {
			   "description", "A Time Expression defines a value specification that represents a time value\r\n[source: UML superstructure v2.2]",
			   "usage guideline", "n/a (Abstract)",
			   "used in levels", "n/a",
			   "usage examples", "n/a",
			   "constraints", "none",
			   "comment/notes", "not used/implemented as of Capella",
			   "reference documentation", "none"
		   });
		addAnnotation
		  (getTimeExpression_Observations(),
		   source,
		   new String[] {
			   "description", "Refers to the time and duration observations that are involved in expr\r\n[source: UML superstructure v2.2]",
			   "constraints", "none",
			   "comment/notes", "cardinality of TimeExpression::observations should be changed to [0..*]"
		   });
		addAnnotation
		  (getTimeExpression_Expression(),
		   source,
		   new String[] {
			   "description", "The value of the time expression\r\n[source: UML superstructure v2.2]",
			   "constraints", "none",
			   "comment/notes", "none"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/semantic</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSemanticAnnotations() {
		String source = "http://www.polarsys.org/capella/semantic";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAbstractBehavior_IsControlOperator(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAbstractTimeEvent_IsRelative(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMappingAnnotations() {
		String source = "http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping";
		addAnnotation
		  (abstractBehaviorEClass,
		   source,
		   new String[] {
			   "UML/SysML semantic equivalences", "",
			   "base metaclass in UML/SysML profile ", "",
			   "explanation", "uml::Behavior",
			   "constraints", "none"
		   });
		addAnnotation
		  (getAbstractBehavior_IsControlOperator(),
		   source,
		   new String[] {
			   "UML/SysML semantic equivalences", "",
			   "explanation", "_todo_ Maybye it can be mapped to uml::ObjectNode::isControlType...",
			   "constraints", "none"
		   });
		addAnnotation
		  (getAbstractBehavior_OwnedParameterSet(),
		   source,
		   new String[] {
			   "UML/SysML semantic equivalences", "uml::Behavior::ownedParameterSet",
			   "explanation", "none",
			   "constraints", "Order must be computed"
		   });
		addAnnotation
		  (getAbstractBehavior_OwnedParameter(),
		   source,
		   new String[] {
			   "UML/SysML semantic equivalences", "uml::Behavior::ownedParameter",
			   "explanation", "none",
			   "constraints", "none"
		   });
		addAnnotation
		  (abstractSignalEClass,
		   source,
		   new String[] {
			   "UML/SysML semantic equivalences", "",
			   "base metaclass in UML/SysML profile ", "",
			   "explanation", "uml::Signal",
			   "constraints", "none"
		   });
		addAnnotation
		  (abstractEventEClass,
		   source,
		   new String[] {
			   "UML/SysML semantic equivalences", "",
			   "base metaclass in UML/SysML profile ", "",
			   "explanation", "uml::Event",
			   "constraints", "none"
		   });
		addAnnotation
		  (abstractTimeEventEClass,
		   source,
		   new String[] {
			   "UML/SysML semantic equivalences", "",
			   "base metaclass in UML/SysML profile ", "",
			   "explanation", "uml::TimeEvent",
			   "constraints", "none"
		   });
		addAnnotation
		  (getAbstractTimeEvent_IsRelative(),
		   source,
		   new String[] {
			   "UML/SysML semantic equivalences", "uml::TimeEvent::isRelative",
			   "explanation", "none",
			   "constraints", "none"
		   });
		addAnnotation
		  (getAbstractTimeEvent_When(),
		   source,
		   new String[] {
			   "UML/SysML semantic equivalences", "uml::TimeEvent::when",
			   "explanation", "none",
			   "constraints", "Multiplicity must be [1..1]"
		   });
		addAnnotation
		  (abstractMessageEventEClass,
		   source,
		   new String[] {
			   "UML/SysML semantic equivalences", "",
			   "base metaclass in UML/SysML profile ", "",
			   "explanation", "uml::MessageEvent",
			   "constraints", "none"
		   });
		addAnnotation
		  (abstractSignalEventEClass,
		   source,
		   new String[] {
			   "UML/SysML semantic equivalences", "",
			   "base metaclass in UML/SysML profile ", "",
			   "explanation", "uml::SignalEvent",
			   "constraints", "none"
		   });
		addAnnotation
		  (getAbstractSignalEvent_Signal(),
		   source,
		   new String[] {
			   "UML/SysML semantic equivalences", "uml::SignalEvent::signal",
			   "explanation", "none",
			   "constraints", "none"
		   });
		addAnnotation
		  (timeExpressionEClass,
		   source,
		   new String[] {
			   "UML/SysML semantic equivalences", "",
			   "base metaclass in UML/SysML profile ", "",
			   "explanation", "uml::TimeExpression",
			   "constraints", "none"
		   });
		addAnnotation
		  (getTimeExpression_Observations(),
		   source,
		   new String[] {
			   "UML/SysML semantic equivalences", "uml::TimeExpression::observation",
			   "explanation", "none",
			   "constraints", "Multiplicity must be [0..1]"
		   });
		addAnnotation
		  (getTimeExpression_Expression(),
		   source,
		   new String[] {
			   "UML/SysML semantic equivalences", "uml::TimeExpression::expr",
			   "explanation", "none",
			   "constraints", "none"
		   });
	}

} //BehaviorPackageImpl
