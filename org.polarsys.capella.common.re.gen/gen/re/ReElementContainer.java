/**
 */
package re;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link re.ReElementContainer#getOwnedElements <em>Owned Elements</em>}</li>
 * </ul>
 *
 * @see re.RePackage#getReElementContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ReElementContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link re.CatalogElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' containment reference list.
	 * @see re.RePackage#getReElementContainer_OwnedElements()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/semantic"
	 * @generated
	 */
	EList<CatalogElement> getOwnedElements();

} // ReElementContainer
