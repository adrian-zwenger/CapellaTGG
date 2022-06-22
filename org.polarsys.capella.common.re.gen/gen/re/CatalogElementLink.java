/**
 */
package re;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Element Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link re.CatalogElementLink#getSource <em>Source</em>}</li>
 *   <li>{@link re.CatalogElementLink#getTarget <em>Target</em>}</li>
 *   <li>{@link re.CatalogElementLink#getOrigin <em>Origin</em>}</li>
 *   <li>{@link re.CatalogElementLink#getUnsynchronizedFeatures <em>Unsynchronized Features</em>}</li>
 *   <li>{@link re.CatalogElementLink#isSuffixed <em>Suffixed</em>}</li>
 * </ul>
 *
 * @see re.RePackage#getCatalogElementLink()
 * @model
 * @generated
 */
public interface CatalogElementLink extends ReAbstractElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(CatalogElement)
	 * @see re.RePackage#getCatalogElementLink_Source()
	 * @model
	 * @generated
	 */
	CatalogElement getSource();

	/**
	 * Sets the value of the '{@link re.CatalogElementLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(CatalogElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EObject)
	 * @see re.RePackage#getCatalogElementLink_Target()
	 * @model
	 * @generated
	 */
	EObject getTarget();

	/**
	 * Sets the value of the '{@link re.CatalogElementLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EObject value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(CatalogElementLink)
	 * @see re.RePackage#getCatalogElementLink_Origin()
	 * @model
	 * @generated
	 */
	CatalogElementLink getOrigin();

	/**
	 * Sets the value of the '{@link re.CatalogElementLink#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(CatalogElementLink value);

	/**
	 * Returns the value of the '<em><b>Unsynchronized Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsynchronized Features</em>' attribute list.
	 * @see re.RePackage#getCatalogElementLink_UnsynchronizedFeatures()
	 * @model
	 * @generated
	 */
	EList<String> getUnsynchronizedFeatures();

	/**
	 * Returns the value of the '<em><b>Suffixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffixed</em>' attribute.
	 * @see #setSuffixed(boolean)
	 * @see re.RePackage#getCatalogElementLink_Suffixed()
	 * @model
	 * @generated
	 */
	boolean isSuffixed();

	/**
	 * Sets the value of the '{@link re.CatalogElementLink#isSuffixed <em>Suffixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffixed</em>' attribute.
	 * @see #isSuffixed()
	 * @generated
	 */
	void setSuffixed(boolean value);

} // CatalogElementLink
