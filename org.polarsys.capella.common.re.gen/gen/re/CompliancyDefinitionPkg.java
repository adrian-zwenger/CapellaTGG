/**
 */
package re;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compliancy Definition Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link re.CompliancyDefinitionPkg#getOwnedDefinitions <em>Owned Definitions</em>}</li>
 * </ul>
 *
 * @see re.RePackage#getCompliancyDefinitionPkg()
 * @model
 * @generated
 */
public interface CompliancyDefinitionPkg extends ReNamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link re.CompliancyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Definitions</em>' containment reference list.
	 * @see re.RePackage#getCompliancyDefinitionPkg_OwnedDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompliancyDefinition> getOwnedDefinitions();

} // CompliancyDefinitionPkg
