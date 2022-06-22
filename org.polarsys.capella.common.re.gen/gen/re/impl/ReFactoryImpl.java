/**
 */
package re.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import re.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReFactoryImpl extends EFactoryImpl implements ReFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReFactory init() {
		try {
			ReFactory theReFactory = (ReFactory)EPackage.Registry.INSTANCE.getEFactory(RePackage.eNS_URI);
			if (theReFactory != null) {
				return theReFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReFactoryImpl() {
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
			case RePackage.CATALOG_ELEMENT_PKG: return createCatalogElementPkg();
			case RePackage.REC_CATALOG: return createRecCatalog();
			case RePackage.GROUPING_ELEMENT_PKG: return createGroupingElementPkg();
			case RePackage.CATALOG_ELEMENT_LINK: return createCatalogElementLink();
			case RePackage.CATALOG_ELEMENT: return createCatalogElement();
			case RePackage.COMPLIANCY_DEFINITION_PKG: return createCompliancyDefinitionPkg();
			case RePackage.COMPLIANCY_DEFINITION: return createCompliancyDefinition();
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
			case RePackage.CATALOG_ELEMENT_KIND:
				return createCatalogElementKindFromString(eDataType, initialValue);
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
			case RePackage.CATALOG_ELEMENT_KIND:
				return convertCatalogElementKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogElementPkg createCatalogElementPkg() {
		CatalogElementPkgImpl catalogElementPkg = new CatalogElementPkgImpl();
		return catalogElementPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecCatalog createRecCatalog() {
		RecCatalogImpl recCatalog = new RecCatalogImpl();
		return recCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingElementPkg createGroupingElementPkg() {
		GroupingElementPkgImpl groupingElementPkg = new GroupingElementPkgImpl();
		return groupingElementPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogElementLink createCatalogElementLink() {
		CatalogElementLinkImpl catalogElementLink = new CatalogElementLinkImpl();
		return catalogElementLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogElement createCatalogElement() {
		CatalogElementImpl catalogElement = new CatalogElementImpl();
		return catalogElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompliancyDefinitionPkg createCompliancyDefinitionPkg() {
		CompliancyDefinitionPkgImpl compliancyDefinitionPkg = new CompliancyDefinitionPkgImpl();
		return compliancyDefinitionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompliancyDefinition createCompliancyDefinition() {
		CompliancyDefinitionImpl compliancyDefinition = new CompliancyDefinitionImpl();
		return compliancyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogElementKind createCatalogElementKindFromString(EDataType eDataType, String initialValue) {
		CatalogElementKind result = CatalogElementKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCatalogElementKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RePackage getRePackage() {
		return (RePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RePackage getPackage() {
		return RePackage.eINSTANCE;
	}

} //ReFactoryImpl
