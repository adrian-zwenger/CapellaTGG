/**
 */
package libraries;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see libraries.LibrariesPackage
 * @generated
 */
public interface LibrariesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibrariesFactory eINSTANCE = libraries.impl.LibrariesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Information</em>'.
	 * @generated
	 */
	ModelInformation createModelInformation();

	/**
	 * Returns a new object of class '<em>Library Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library Reference</em>'.
	 * @generated
	 */
	LibraryReference createLibraryReference();

	/**
	 * Returns a new object of class '<em>Model Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Version</em>'.
	 * @generated
	 */
	ModelVersion createModelVersion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LibrariesPackage getLibrariesPackage();

} //LibrariesFactory
