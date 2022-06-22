/**
 */
package re;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rec Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link re.RecCatalog#getOwnedCompliancyDefinitionPkg <em>Owned Compliancy Definition Pkg</em>}</li>
 * </ul>
 *
 * @see re.RePackage#getRecCatalog()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement='http://www.polarsys.org/capella/core/modeller/5.0.0#//SystemEngineering '"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping='platform:/resource/org.polarsys.capella.core.data.gen/model/CapellaModeller.ecore#//SystemEngineering '"
 * @generated
 */
public interface RecCatalog extends CatalogElementPkg, ElementExtension {
	/**
	 * Returns the value of the '<em><b>Owned Compliancy Definition Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Compliancy Definition Pkg</em>' containment reference.
	 * @see #setOwnedCompliancyDefinitionPkg(CompliancyDefinitionPkg)
	 * @see re.RePackage#getRecCatalog_OwnedCompliancyDefinitionPkg()
	 * @model containment="true"
	 * @generated
	 */
	CompliancyDefinitionPkg getOwnedCompliancyDefinitionPkg();

	/**
	 * Sets the value of the '{@link re.RecCatalog#getOwnedCompliancyDefinitionPkg <em>Owned Compliancy Definition Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Compliancy Definition Pkg</em>' containment reference.
	 * @see #getOwnedCompliancyDefinitionPkg()
	 * @generated
	 */
	void setOwnedCompliancyDefinitionPkg(CompliancyDefinitionPkg value);

} // RecCatalog
