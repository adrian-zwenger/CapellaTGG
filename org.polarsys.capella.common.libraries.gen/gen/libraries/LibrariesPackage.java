/**
 */
package libraries;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.kitalpha.emde.model.EmdePackage;

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
 * @see libraries.LibrariesFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/extension extensibleProviderFactory='true' childCreationExtenders='true'"
 * @generated
 */
public interface LibrariesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "libraries";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/capella/common/libraries/5.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "libraries";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibrariesPackage eINSTANCE = libraries.impl.LibrariesPackageImpl.init();

	/**
	 * The meta object id for the '{@link libraries.impl.LibraryAbstractElementImpl <em>Library Abstract Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see libraries.impl.LibraryAbstractElementImpl
	 * @see libraries.impl.LibrariesPackageImpl#getLibraryAbstractElement()
	 * @generated
	 */
	int LIBRARY_ABSTRACT_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ABSTRACT_ELEMENT__OWNED_EXTENSIONS = EmdePackage.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ABSTRACT_ELEMENT__ID = EmdePackage.EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Library Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ABSTRACT_ELEMENT_FEATURE_COUNT = EmdePackage.EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Library Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ABSTRACT_ELEMENT_OPERATION_COUNT = EmdePackage.EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link libraries.impl.ModelInformationImpl <em>Model Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see libraries.impl.ModelInformationImpl
	 * @see libraries.impl.LibrariesPackageImpl#getModelInformation()
	 * @generated
	 */
	int MODEL_INFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INFORMATION__OWNED_EXTENSIONS = LIBRARY_ABSTRACT_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INFORMATION__ID = LIBRARY_ABSTRACT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owned References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INFORMATION__OWNED_REFERENCES = LIBRARY_ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INFORMATION__VERSION = LIBRARY_ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INFORMATION_FEATURE_COUNT = LIBRARY_ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INFORMATION_OPERATION_COUNT = LIBRARY_ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link libraries.impl.LibraryReferenceImpl <em>Library Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see libraries.impl.LibraryReferenceImpl
	 * @see libraries.impl.LibrariesPackageImpl#getLibraryReference()
	 * @generated
	 */
	int LIBRARY_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__OWNED_EXTENSIONS = LIBRARY_ABSTRACT_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__ID = LIBRARY_ABSTRACT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__LIBRARY = LIBRARY_ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__ACCESS_POLICY = LIBRARY_ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__VERSION = LIBRARY_ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Library Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE_FEATURE_COUNT = LIBRARY_ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Library Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE_OPERATION_COUNT = LIBRARY_ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link libraries.impl.ModelVersionImpl <em>Model Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see libraries.impl.ModelVersionImpl
	 * @see libraries.impl.LibrariesPackageImpl#getModelVersion()
	 * @generated
	 */
	int MODEL_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VERSION__OWNED_EXTENSIONS = LIBRARY_ABSTRACT_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VERSION__ID = LIBRARY_ABSTRACT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Major Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VERSION__MAJOR_VERSION_NUMBER = LIBRARY_ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minor Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VERSION__MINOR_VERSION_NUMBER = LIBRARY_ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Modified File Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VERSION__LAST_MODIFIED_FILE_STAMP = LIBRARY_ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VERSION_FEATURE_COUNT = LIBRARY_ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Model Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VERSION_OPERATION_COUNT = LIBRARY_ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link libraries.AccessPolicy <em>Access Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see libraries.AccessPolicy
	 * @see libraries.impl.LibrariesPackageImpl#getAccessPolicy()
	 * @generated
	 */
	int ACCESS_POLICY = 4;


	/**
	 * Returns the meta object for class '{@link libraries.ModelInformation <em>Model Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Information</em>'.
	 * @see libraries.ModelInformation
	 * @generated
	 */
	EClass getModelInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link libraries.ModelInformation#getOwnedReferences <em>Owned References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned References</em>'.
	 * @see libraries.ModelInformation#getOwnedReferences()
	 * @see #getModelInformation()
	 * @generated
	 */
	EReference getModelInformation_OwnedReferences();

	/**
	 * Returns the meta object for the reference '{@link libraries.ModelInformation#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version</em>'.
	 * @see libraries.ModelInformation#getVersion()
	 * @see #getModelInformation()
	 * @generated
	 */
	EReference getModelInformation_Version();

	/**
	 * Returns the meta object for class '{@link libraries.LibraryReference <em>Library Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Reference</em>'.
	 * @see libraries.LibraryReference
	 * @generated
	 */
	EClass getLibraryReference();

	/**
	 * Returns the meta object for the reference '{@link libraries.LibraryReference#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Library</em>'.
	 * @see libraries.LibraryReference#getLibrary()
	 * @see #getLibraryReference()
	 * @generated
	 */
	EReference getLibraryReference_Library();

	/**
	 * Returns the meta object for the attribute '{@link libraries.LibraryReference#getAccessPolicy <em>Access Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Policy</em>'.
	 * @see libraries.LibraryReference#getAccessPolicy()
	 * @see #getLibraryReference()
	 * @generated
	 */
	EAttribute getLibraryReference_AccessPolicy();

	/**
	 * Returns the meta object for the reference '{@link libraries.LibraryReference#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version</em>'.
	 * @see libraries.LibraryReference#getVersion()
	 * @see #getLibraryReference()
	 * @generated
	 */
	EReference getLibraryReference_Version();

	/**
	 * Returns the meta object for class '{@link libraries.ModelVersion <em>Model Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Version</em>'.
	 * @see libraries.ModelVersion
	 * @generated
	 */
	EClass getModelVersion();

	/**
	 * Returns the meta object for the attribute '{@link libraries.ModelVersion#getMajorVersionNumber <em>Major Version Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major Version Number</em>'.
	 * @see libraries.ModelVersion#getMajorVersionNumber()
	 * @see #getModelVersion()
	 * @generated
	 */
	EAttribute getModelVersion_MajorVersionNumber();

	/**
	 * Returns the meta object for the attribute '{@link libraries.ModelVersion#getMinorVersionNumber <em>Minor Version Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor Version Number</em>'.
	 * @see libraries.ModelVersion#getMinorVersionNumber()
	 * @see #getModelVersion()
	 * @generated
	 */
	EAttribute getModelVersion_MinorVersionNumber();

	/**
	 * Returns the meta object for the attribute '{@link libraries.ModelVersion#getLastModifiedFileStamp <em>Last Modified File Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified File Stamp</em>'.
	 * @see libraries.ModelVersion#getLastModifiedFileStamp()
	 * @see #getModelVersion()
	 * @generated
	 */
	EAttribute getModelVersion_LastModifiedFileStamp();

	/**
	 * Returns the meta object for class '{@link libraries.LibraryAbstractElement <em>Library Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Abstract Element</em>'.
	 * @see libraries.LibraryAbstractElement
	 * @generated
	 */
	EClass getLibraryAbstractElement();

	/**
	 * Returns the meta object for the attribute '{@link libraries.LibraryAbstractElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see libraries.LibraryAbstractElement#getId()
	 * @see #getLibraryAbstractElement()
	 * @generated
	 */
	EAttribute getLibraryAbstractElement_Id();

	/**
	 * Returns the meta object for enum '{@link libraries.AccessPolicy <em>Access Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Policy</em>'.
	 * @see libraries.AccessPolicy
	 * @generated
	 */
	EEnum getAccessPolicy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LibrariesFactory getLibrariesFactory();

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
		 * The meta object literal for the '{@link libraries.impl.ModelInformationImpl <em>Model Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see libraries.impl.ModelInformationImpl
		 * @see libraries.impl.LibrariesPackageImpl#getModelInformation()
		 * @generated
		 */
		EClass MODEL_INFORMATION = eINSTANCE.getModelInformation();

		/**
		 * The meta object literal for the '<em><b>Owned References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_INFORMATION__OWNED_REFERENCES = eINSTANCE.getModelInformation_OwnedReferences();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_INFORMATION__VERSION = eINSTANCE.getModelInformation_Version();

		/**
		 * The meta object literal for the '{@link libraries.impl.LibraryReferenceImpl <em>Library Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see libraries.impl.LibraryReferenceImpl
		 * @see libraries.impl.LibrariesPackageImpl#getLibraryReference()
		 * @generated
		 */
		EClass LIBRARY_REFERENCE = eINSTANCE.getLibraryReference();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_REFERENCE__LIBRARY = eINSTANCE.getLibraryReference_Library();

		/**
		 * The meta object literal for the '<em><b>Access Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY_REFERENCE__ACCESS_POLICY = eINSTANCE.getLibraryReference_AccessPolicy();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_REFERENCE__VERSION = eINSTANCE.getLibraryReference_Version();

		/**
		 * The meta object literal for the '{@link libraries.impl.ModelVersionImpl <em>Model Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see libraries.impl.ModelVersionImpl
		 * @see libraries.impl.LibrariesPackageImpl#getModelVersion()
		 * @generated
		 */
		EClass MODEL_VERSION = eINSTANCE.getModelVersion();

		/**
		 * The meta object literal for the '<em><b>Major Version Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_VERSION__MAJOR_VERSION_NUMBER = eINSTANCE.getModelVersion_MajorVersionNumber();

		/**
		 * The meta object literal for the '<em><b>Minor Version Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_VERSION__MINOR_VERSION_NUMBER = eINSTANCE.getModelVersion_MinorVersionNumber();

		/**
		 * The meta object literal for the '<em><b>Last Modified File Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_VERSION__LAST_MODIFIED_FILE_STAMP = eINSTANCE.getModelVersion_LastModifiedFileStamp();

		/**
		 * The meta object literal for the '{@link libraries.impl.LibraryAbstractElementImpl <em>Library Abstract Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see libraries.impl.LibraryAbstractElementImpl
		 * @see libraries.impl.LibrariesPackageImpl#getLibraryAbstractElement()
		 * @generated
		 */
		EClass LIBRARY_ABSTRACT_ELEMENT = eINSTANCE.getLibraryAbstractElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY_ABSTRACT_ELEMENT__ID = eINSTANCE.getLibraryAbstractElement_Id();

		/**
		 * The meta object literal for the '{@link libraries.AccessPolicy <em>Access Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see libraries.AccessPolicy
		 * @see libraries.impl.LibrariesPackageImpl#getAccessPolicy()
		 * @generated
		 */
		EEnum ACCESS_POLICY = eINSTANCE.getAccessPolicy();

	}

} //LibrariesPackage
