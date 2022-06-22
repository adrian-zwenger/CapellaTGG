/**
 */
package libraries;

import org.polarsys.kitalpha.emde.model.ExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Abstract Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link libraries.LibraryAbstractElement#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see libraries.LibrariesPackage#getLibraryAbstractElement()
 * @model abstract="true"
 * @generated
 */
public interface LibraryAbstractElement extends ExtensibleElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see libraries.LibrariesPackage#getLibraryAbstractElement_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link libraries.LibraryAbstractElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // LibraryAbstractElement
