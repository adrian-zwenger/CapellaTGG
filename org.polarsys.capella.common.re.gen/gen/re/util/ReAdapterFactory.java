/**
 */
package re.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.emde.model.Element;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

import re.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see re.RePackage
 * @generated
 */
public class ReAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RePackage.eINSTANCE;
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
	protected ReSwitch<Adapter> modelSwitch =
		new ReSwitch<Adapter>() {
			@Override
			public Adapter caseReAbstractElement(ReAbstractElement object) {
				return createReAbstractElementAdapter();
			}
			@Override
			public Adapter caseReNamedElement(ReNamedElement object) {
				return createReNamedElementAdapter();
			}
			@Override
			public Adapter caseReDescriptionElement(ReDescriptionElement object) {
				return createReDescriptionElementAdapter();
			}
			@Override
			public Adapter caseReElementContainer(ReElementContainer object) {
				return createReElementContainerAdapter();
			}
			@Override
			public Adapter caseCatalogElementPkg(CatalogElementPkg object) {
				return createCatalogElementPkgAdapter();
			}
			@Override
			public Adapter caseRecCatalog(RecCatalog object) {
				return createRecCatalogAdapter();
			}
			@Override
			public Adapter caseGroupingElementPkg(GroupingElementPkg object) {
				return createGroupingElementPkgAdapter();
			}
			@Override
			public Adapter caseCatalogElementLink(CatalogElementLink object) {
				return createCatalogElementLinkAdapter();
			}
			@Override
			public Adapter caseCatalogElement(CatalogElement object) {
				return createCatalogElementAdapter();
			}
			@Override
			public Adapter caseCompliancyDefinitionPkg(CompliancyDefinitionPkg object) {
				return createCompliancyDefinitionPkgAdapter();
			}
			@Override
			public Adapter caseCompliancyDefinition(CompliancyDefinition object) {
				return createCompliancyDefinitionAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseExtensibleElement(ExtensibleElement object) {
				return createExtensibleElementAdapter();
			}
			@Override
			public Adapter caseElementExtension(ElementExtension object) {
				return createElementExtensionAdapter();
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
	 * Creates a new adapter for an object of class '{@link re.ReAbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see re.ReAbstractElement
	 * @generated
	 */
	public Adapter createReAbstractElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link re.ReNamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see re.ReNamedElement
	 * @generated
	 */
	public Adapter createReNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link re.ReDescriptionElement <em>Description Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see re.ReDescriptionElement
	 * @generated
	 */
	public Adapter createReDescriptionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link re.ReElementContainer <em>Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see re.ReElementContainer
	 * @generated
	 */
	public Adapter createReElementContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link re.CatalogElementPkg <em>Catalog Element Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see re.CatalogElementPkg
	 * @generated
	 */
	public Adapter createCatalogElementPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link re.RecCatalog <em>Rec Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see re.RecCatalog
	 * @generated
	 */
	public Adapter createRecCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link re.GroupingElementPkg <em>Grouping Element Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see re.GroupingElementPkg
	 * @generated
	 */
	public Adapter createGroupingElementPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link re.CatalogElementLink <em>Catalog Element Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see re.CatalogElementLink
	 * @generated
	 */
	public Adapter createCatalogElementLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link re.CatalogElement <em>Catalog Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see re.CatalogElement
	 * @generated
	 */
	public Adapter createCatalogElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link re.CompliancyDefinitionPkg <em>Compliancy Definition Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see re.CompliancyDefinitionPkg
	 * @generated
	 */
	public Adapter createCompliancyDefinitionPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link re.CompliancyDefinition <em>Compliancy Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see re.CompliancyDefinition
	 * @generated
	 */
	public Adapter createCompliancyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.emde.model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.emde.model.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.emde.model.ExtensibleElement <em>Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.emde.model.ExtensibleElement
	 * @generated
	 */
	public Adapter createExtensibleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.emde.model.ElementExtension <em>Element Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.emde.model.ElementExtension
	 * @generated
	 */
	public Adapter createElementExtensionAdapter() {
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

} //ReAdapterFactory
