/**
 */
package re.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.kitalpha.emde.model.EmdePackage;

import re.CatalogElement;
import re.CatalogElementKind;
import re.CatalogElementLink;
import re.CatalogElementPkg;
import re.CompliancyDefinition;
import re.CompliancyDefinitionPkg;
import re.GroupingElementPkg;
import re.ReAbstractElement;
import re.ReDescriptionElement;
import re.ReElementContainer;
import re.ReFactory;
import re.ReNamedElement;
import re.RePackage;
import re.RecCatalog;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RePackageImpl extends EPackageImpl implements RePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reAbstractElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reDescriptionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reElementContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogElementPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupingElementPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogElementLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compliancyDefinitionPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compliancyDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum catalogElementKindEEnum = null;

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
	 * @see re.RePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RePackageImpl() {
		super(eNS_URI, ReFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RePackage init() {
		if (isInited) return (RePackage)EPackage.Registry.INSTANCE.getEPackage(RePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RePackageImpl theRePackage = registeredRePackage instanceof RePackageImpl ? (RePackageImpl)registeredRePackage : new RePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EmdePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRePackage.createPackageContents();

		// Initialize created meta-data
		theRePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RePackage.eNS_URI, theRePackage);
		return theRePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReAbstractElement() {
		return reAbstractElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReAbstractElement_Id() {
		return (EAttribute)reAbstractElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReNamedElement() {
		return reNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReNamedElement_Name() {
		return (EAttribute)reNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReDescriptionElement() {
		return reDescriptionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReDescriptionElement_Description() {
		return (EAttribute)reDescriptionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReElementContainer() {
		return reElementContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReElementContainer_OwnedElements() {
		return (EReference)reElementContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogElementPkg() {
		return catalogElementPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogElementPkg_OwnedElementPkgs() {
		return (EReference)catalogElementPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecCatalog() {
		return recCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecCatalog_OwnedCompliancyDefinitionPkg() {
		return (EReference)recCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupingElementPkg() {
		return groupingElementPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogElementLink() {
		return catalogElementLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogElementLink_Source() {
		return (EReference)catalogElementLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogElementLink_Target() {
		return (EReference)catalogElementLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogElementLink_Origin() {
		return (EReference)catalogElementLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogElementLink_UnsynchronizedFeatures() {
		return (EAttribute)catalogElementLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogElementLink_Suffixed() {
		return (EAttribute)catalogElementLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogElement() {
		return catalogElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogElement_Kind() {
		return (EAttribute)catalogElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogElement_Author() {
		return (EAttribute)catalogElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogElement_Environment() {
		return (EAttribute)catalogElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogElement_Suffix() {
		return (EAttribute)catalogElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogElement_Purpose() {
		return (EAttribute)catalogElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogElement_ReadOnly() {
		return (EAttribute)catalogElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogElement_Version() {
		return (EAttribute)catalogElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogElement_Tags() {
		return (EAttribute)catalogElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogElement_Origin() {
		return (EReference)catalogElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogElement_CurrentCompliancy() {
		return (EReference)catalogElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogElement_DefaultReplicaCompliancy() {
		return (EReference)catalogElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogElement_OwnedLinks() {
		return (EReference)catalogElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogElement_ReferencedElements() {
		return (EReference)catalogElementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogElement_ReplicatedElements() {
		return (EReference)catalogElementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompliancyDefinitionPkg() {
		return compliancyDefinitionPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompliancyDefinitionPkg_OwnedDefinitions() {
		return (EReference)compliancyDefinitionPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompliancyDefinition() {
		return compliancyDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCatalogElementKind() {
		return catalogElementKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReFactory getReFactory() {
		return (ReFactory)getEFactoryInstance();
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
		reAbstractElementEClass = createEClass(RE_ABSTRACT_ELEMENT);
		createEAttribute(reAbstractElementEClass, RE_ABSTRACT_ELEMENT__ID);

		reNamedElementEClass = createEClass(RE_NAMED_ELEMENT);
		createEAttribute(reNamedElementEClass, RE_NAMED_ELEMENT__NAME);

		reDescriptionElementEClass = createEClass(RE_DESCRIPTION_ELEMENT);
		createEAttribute(reDescriptionElementEClass, RE_DESCRIPTION_ELEMENT__DESCRIPTION);

		reElementContainerEClass = createEClass(RE_ELEMENT_CONTAINER);
		createEReference(reElementContainerEClass, RE_ELEMENT_CONTAINER__OWNED_ELEMENTS);

		catalogElementPkgEClass = createEClass(CATALOG_ELEMENT_PKG);
		createEReference(catalogElementPkgEClass, CATALOG_ELEMENT_PKG__OWNED_ELEMENT_PKGS);

		recCatalogEClass = createEClass(REC_CATALOG);
		createEReference(recCatalogEClass, REC_CATALOG__OWNED_COMPLIANCY_DEFINITION_PKG);

		groupingElementPkgEClass = createEClass(GROUPING_ELEMENT_PKG);

		catalogElementLinkEClass = createEClass(CATALOG_ELEMENT_LINK);
		createEReference(catalogElementLinkEClass, CATALOG_ELEMENT_LINK__SOURCE);
		createEReference(catalogElementLinkEClass, CATALOG_ELEMENT_LINK__TARGET);
		createEReference(catalogElementLinkEClass, CATALOG_ELEMENT_LINK__ORIGIN);
		createEAttribute(catalogElementLinkEClass, CATALOG_ELEMENT_LINK__UNSYNCHRONIZED_FEATURES);
		createEAttribute(catalogElementLinkEClass, CATALOG_ELEMENT_LINK__SUFFIXED);

		catalogElementEClass = createEClass(CATALOG_ELEMENT);
		createEAttribute(catalogElementEClass, CATALOG_ELEMENT__KIND);
		createEAttribute(catalogElementEClass, CATALOG_ELEMENT__AUTHOR);
		createEAttribute(catalogElementEClass, CATALOG_ELEMENT__ENVIRONMENT);
		createEAttribute(catalogElementEClass, CATALOG_ELEMENT__SUFFIX);
		createEAttribute(catalogElementEClass, CATALOG_ELEMENT__PURPOSE);
		createEAttribute(catalogElementEClass, CATALOG_ELEMENT__READ_ONLY);
		createEAttribute(catalogElementEClass, CATALOG_ELEMENT__VERSION);
		createEAttribute(catalogElementEClass, CATALOG_ELEMENT__TAGS);
		createEReference(catalogElementEClass, CATALOG_ELEMENT__ORIGIN);
		createEReference(catalogElementEClass, CATALOG_ELEMENT__CURRENT_COMPLIANCY);
		createEReference(catalogElementEClass, CATALOG_ELEMENT__DEFAULT_REPLICA_COMPLIANCY);
		createEReference(catalogElementEClass, CATALOG_ELEMENT__OWNED_LINKS);
		createEReference(catalogElementEClass, CATALOG_ELEMENT__REFERENCED_ELEMENTS);
		createEReference(catalogElementEClass, CATALOG_ELEMENT__REPLICATED_ELEMENTS);

		compliancyDefinitionPkgEClass = createEClass(COMPLIANCY_DEFINITION_PKG);
		createEReference(compliancyDefinitionPkgEClass, COMPLIANCY_DEFINITION_PKG__OWNED_DEFINITIONS);

		compliancyDefinitionEClass = createEClass(COMPLIANCY_DEFINITION);

		// Create enums
		catalogElementKindEEnum = createEEnum(CATALOG_ELEMENT_KIND);
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
		EmdePackage theEmdePackage = (EmdePackage)EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reAbstractElementEClass.getESuperTypes().add(theEmdePackage.getExtensibleElement());
		reNamedElementEClass.getESuperTypes().add(this.getReAbstractElement());
		reDescriptionElementEClass.getESuperTypes().add(this.getReNamedElement());
		catalogElementPkgEClass.getESuperTypes().add(this.getReNamedElement());
		catalogElementPkgEClass.getESuperTypes().add(this.getReElementContainer());
		recCatalogEClass.getESuperTypes().add(this.getCatalogElementPkg());
		recCatalogEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		groupingElementPkgEClass.getESuperTypes().add(this.getCatalogElementPkg());
		groupingElementPkgEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		catalogElementLinkEClass.getESuperTypes().add(this.getReAbstractElement());
		catalogElementEClass.getESuperTypes().add(this.getReDescriptionElement());
		catalogElementEClass.getESuperTypes().add(this.getReElementContainer());
		compliancyDefinitionPkgEClass.getESuperTypes().add(this.getReNamedElement());
		compliancyDefinitionEClass.getESuperTypes().add(this.getReDescriptionElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(reAbstractElementEClass, ReAbstractElement.class, "ReAbstractElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReAbstractElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, ReAbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reNamedElementEClass, ReNamedElement.class, "ReNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ReNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reDescriptionElementEClass, ReDescriptionElement.class, "ReDescriptionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReDescriptionElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ReDescriptionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reElementContainerEClass, ReElementContainer.class, "ReElementContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReElementContainer_OwnedElements(), this.getCatalogElement(), null, "ownedElements", null, 0, -1, ReElementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogElementPkgEClass, CatalogElementPkg.class, "CatalogElementPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalogElementPkg_OwnedElementPkgs(), this.getCatalogElementPkg(), null, "ownedElementPkgs", null, 0, -1, CatalogElementPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recCatalogEClass, RecCatalog.class, "RecCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecCatalog_OwnedCompliancyDefinitionPkg(), this.getCompliancyDefinitionPkg(), null, "ownedCompliancyDefinitionPkg", null, 0, 1, RecCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupingElementPkgEClass, GroupingElementPkg.class, "GroupingElementPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(catalogElementLinkEClass, CatalogElementLink.class, "CatalogElementLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalogElementLink_Source(), this.getCatalogElement(), null, "source", null, 0, 1, CatalogElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogElementLink_Target(), ecorePackage.getEObject(), null, "target", null, 0, 1, CatalogElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogElementLink_Origin(), this.getCatalogElementLink(), null, "origin", null, 0, 1, CatalogElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogElementLink_UnsynchronizedFeatures(), ecorePackage.getEString(), "unsynchronizedFeatures", null, 0, -1, CatalogElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogElementLink_Suffixed(), ecorePackage.getEBoolean(), "suffixed", null, 0, 1, CatalogElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogElementEClass, CatalogElement.class, "CatalogElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogElement_Kind(), this.getCatalogElementKind(), "kind", "REC", 0, 1, CatalogElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogElement_Author(), ecorePackage.getEString(), "author", null, 0, 1, CatalogElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogElement_Environment(), ecorePackage.getEString(), "environment", null, 0, 1, CatalogElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogElement_Suffix(), ecorePackage.getEString(), "suffix", null, 0, 1, CatalogElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogElement_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, CatalogElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogElement_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", "false", 0, 1, CatalogElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogElement_Version(), ecorePackage.getEString(), "version", null, 0, 1, CatalogElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogElement_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, CatalogElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogElement_Origin(), this.getCatalogElement(), null, "origin", null, 0, 1, CatalogElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogElement_CurrentCompliancy(), this.getCompliancyDefinition(), null, "currentCompliancy", null, 0, 1, CatalogElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogElement_DefaultReplicaCompliancy(), this.getCompliancyDefinition(), null, "defaultReplicaCompliancy", null, 0, 1, CatalogElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogElement_OwnedLinks(), this.getCatalogElementLink(), null, "ownedLinks", null, 0, -1, CatalogElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogElement_ReferencedElements(), ecorePackage.getEObject(), null, "referencedElements", null, 0, -1, CatalogElement.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogElement_ReplicatedElements(), this.getCatalogElement(), null, "replicatedElements", null, 0, -1, CatalogElement.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(compliancyDefinitionPkgEClass, CompliancyDefinitionPkg.class, "CompliancyDefinitionPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompliancyDefinitionPkg_OwnedDefinitions(), this.getCompliancyDefinition(), null, "ownedDefinitions", null, 0, -1, CompliancyDefinitionPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compliancyDefinitionEClass, CompliancyDefinition.class, "CompliancyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(catalogElementKindEEnum, CatalogElementKind.class, "CatalogElementKind");
		addEEnumLiteral(catalogElementKindEEnum, CatalogElementKind.REC);
		addEEnumLiteral(catalogElementKindEEnum, CatalogElementKind.RPL);
		addEEnumLiteral(catalogElementKindEEnum, CatalogElementKind.REC_RPL);
		addEEnumLiteral(catalogElementKindEEnum, CatalogElementKind.GROUPING);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/kitalpha/emde/1.0.0/extension
		createExtensionAnnotations();
		// http://www.polarsys.org/capella/semantic
		createSemanticAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraint
		createConstraintAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping
		createConstraintMappingAnnotations();
		// http://www.polarsys.org/capella/derived
		createDerivedAnnotations();
		// http://www.polarsys.org/kitalpha/ecore/documentation
		createDocumentationAnnotations();
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
			   "extensibleProviderFactory", "true",
			   "childCreationExtenders", "true"
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
		  (getReNamedElement_Name(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getReDescriptionElement_Description(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getReElementContainer_OwnedElements(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (catalogElementPkgEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (catalogElementEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCatalogElement_Kind(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCatalogElement_Author(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCatalogElement_Environment(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCatalogElement_Suffix(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCatalogElement_Purpose(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCatalogElement_ReadOnly(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCatalogElement_Version(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCatalogElement_Tags(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCatalogElement_Origin(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCatalogElement_ReferencedElements(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCatalogElement_ReplicatedElements(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (compliancyDefinitionEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraint";
		addAnnotation
		  (recCatalogEClass,
		   source,
		   new String[] {
			   "ExtendedElement", "http://www.polarsys.org/capella/core/modeller/5.0.0#//SystemEngineering "
		   });
		addAnnotation
		  (groupingElementPkgEClass,
		   source,
		   new String[] {
			   "ExtendedElement", "http://www.polarsys.org/capella/core/modeller/5.0.0#//SystemEngineering http://www.polarsys.org/capella/core/cs/5.0.0#//BlockArchitecture"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintMappingAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping";
		addAnnotation
		  (recCatalogEClass,
		   source,
		   new String[] {
			   "Mapping", "platform:/resource/org.polarsys.capella.core.data.gen/model/CapellaModeller.ecore#//SystemEngineering "
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/derived</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivedAnnotations() {
		String source = "http://www.polarsys.org/capella/derived";
		addAnnotation
		  (getCatalogElement_ReferencedElements(),
		   source,
		   new String[] {
			   "viatra.variant", "alias",
			   "viatra.expression", "ownedLinks.target"
		   });
		addAnnotation
		  (getCatalogElement_ReplicatedElements(),
		   source,
		   new String[] {
			   "viatra.variant", "opposite",
			   "viatra.expression", "origin"
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
		  (getCatalogElement_ReplicatedElements(),
		   source,
		   new String[] {
			   "description", "retrieve all referencing elements which have the current element as origin"
		   });
	}

} //RePackageImpl
