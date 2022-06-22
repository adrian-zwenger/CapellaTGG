/**
 */
package libraries;

import org.eclipse.emf.common.util.EList;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link libraries.ModelInformation#getOwnedReferences <em>Owned References</em>}</li>
 *   <li>{@link libraries.ModelInformation#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see libraries.LibrariesPackage#getModelInformation()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement='http://www.polarsys.org/capella/core/modeller/5.0.0#//Project'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping='platform:/resource/org.polarsys.capella.core.data.gen/model/CapellaModeller.ecore#//Project'"
 * @generated
 */
public interface ModelInformation extends LibraryAbstractElement, ElementExtension {
	/**
	 * Returns the value of the '<em><b>Owned References</b></em>' containment reference list.
	 * The list contents are of type {@link libraries.LibraryReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned References</em>' containment reference list.
	 * @see libraries.LibrariesPackage#getModelInformation_OwnedReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<LibraryReference> getOwnedReferences();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' reference.
	 * @see #setVersion(ModelVersion)
	 * @see libraries.LibrariesPackage#getModelInformation_Version()
	 * @model
	 * @generated
	 */
	ModelVersion getVersion();

	/**
	 * Sets the value of the '{@link libraries.ModelInformation#getVersion <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(ModelVersion value);

} // ModelInformation
