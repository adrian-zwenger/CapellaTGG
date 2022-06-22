/**
 */
package libraries;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link libraries.LibraryReference#getLibrary <em>Library</em>}</li>
 *   <li>{@link libraries.LibraryReference#getAccessPolicy <em>Access Policy</em>}</li>
 *   <li>{@link libraries.LibraryReference#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see libraries.LibrariesPackage#getLibraryReference()
 * @model
 * @generated
 */
public interface LibraryReference extends LibraryAbstractElement {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' reference.
	 * @see #setLibrary(ModelInformation)
	 * @see libraries.LibrariesPackage#getLibraryReference_Library()
	 * @model required="true"
	 * @generated
	 */
	ModelInformation getLibrary();

	/**
	 * Sets the value of the '{@link libraries.LibraryReference#getLibrary <em>Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(ModelInformation value);

	/**
	 * Returns the value of the '<em><b>Access Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link libraries.AccessPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Policy</em>' attribute.
	 * @see libraries.AccessPolicy
	 * @see #setAccessPolicy(AccessPolicy)
	 * @see libraries.LibrariesPackage#getLibraryReference_AccessPolicy()
	 * @model required="true"
	 * @generated
	 */
	AccessPolicy getAccessPolicy();

	/**
	 * Sets the value of the '{@link libraries.LibraryReference#getAccessPolicy <em>Access Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Policy</em>' attribute.
	 * @see libraries.AccessPolicy
	 * @see #getAccessPolicy()
	 * @generated
	 */
	void setAccessPolicy(AccessPolicy value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' reference.
	 * @see #setVersion(ModelVersion)
	 * @see libraries.LibrariesPackage#getLibraryReference_Version()
	 * @model
	 * @generated
	 */
	ModelVersion getVersion();

	/**
	 * Sets the value of the '{@link libraries.LibraryReference#getVersion <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(ModelVersion value);

} // LibraryReference
