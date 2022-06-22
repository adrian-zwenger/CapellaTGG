/**
 */
package re;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Element Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link re.CatalogElementPkg#getOwnedElementPkgs <em>Owned Element Pkgs</em>}</li>
 * </ul>
 *
 * @see re.RePackage#getCatalogElementPkg()
 * @model annotation="http://www.polarsys.org/capella/semantic"
 * @generated
 */
public interface CatalogElementPkg extends ReNamedElement, ReElementContainer {
	/**
	 * Returns the value of the '<em><b>Owned Element Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link re.CatalogElementPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element Pkgs</em>' containment reference list.
	 * @see re.RePackage#getCatalogElementPkg_OwnedElementPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<CatalogElementPkg> getOwnedElementPkgs();

} // CatalogElementPkg
