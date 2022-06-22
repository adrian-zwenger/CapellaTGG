/**
 */
package modellingcore;

import org.eclipse.emf.common.util.EList;

import org.polarsys.kitalpha.emde.model.ExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modellingcore.ModelElement#getId <em>Id</em>}</li>
 *   <li>{@link modellingcore.ModelElement#getSid <em>Sid</em>}</li>
 *   <li>{@link modellingcore.ModelElement#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link modellingcore.ModelElement#getOwnedConstraints <em>Owned Constraints</em>}</li>
 *   <li>{@link modellingcore.ModelElement#getOwnedMigratedElements <em>Owned Migrated Elements</em>}</li>
 * </ul>
 *
 * @see modellingcore.ModellingcorePackage#getModelElement()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ModelElement'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Element'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='common base for all Capella elements\r\n[source: Capella study]' usage\040guideline='n/a (Abstract)' used\040in\040levels='operational,system,logical,physical,epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::Element' constraints=''"
 * @generated
 */
public interface ModelElement extends ExtensibleElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see modellingcore.ModellingcorePackage#getModelElement_Id()
	 * @model default="" id="true" required="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the unique identifier for this element\r\n[source: Capella study]' constraints='none' type='n/a' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='' constraints=''"
	 *        annotation="http://www.polarsys.org/capella/semantic"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link modellingcore.ModelElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sid</em>' attribute.
	 * @see #setSid(String)
	 * @see modellingcore.ModellingcorePackage#getModelElement_Sid()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the unique system identifier for this element' constraints='none' type='n/a' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic"
	 * @generated
	 */
	String getSid();

	/**
	 * Sets the value of the '{@link modellingcore.ModelElement#getSid <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sid</em>' attribute.
	 * @see #getSid()
	 * @generated
	 */
	void setSid(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference list.
	 * The list contents are of type {@link modellingcore.AbstractConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference list.
	 * @see modellingcore.ModellingcorePackage#getModelElement_Constraints()
	 * @model changeable="false"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the list of constraints applying to this element of the model\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Opposite reference of uml::Constraint::constrainedElement' constraints='Order must be computed'"
	 *        annotation="http://www.polarsys.org/capella/derived viatra.variant='opposite' viatra.expression='constrainedElements'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<AbstractConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link modellingcore.AbstractConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Constraints</em>' containment reference list.
	 * @see modellingcore.ModellingcorePackage#getModelElement_OwnedConstraints()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the constraints that are stored/owned by this element\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='none' constraints='Some packaged elements of uml::Element::nearestPackage on which AbstractConstraint stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 *        annotation="http://www.polarsys.org/capella/semantic"
	 * @generated
	 */
	EList<AbstractConstraint> getOwnedConstraints();

	/**
	 * Returns the value of the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * The list contents are of type {@link modellingcore.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Migrated Elements</em>' containment reference list.
	 * @see modellingcore.ModellingcorePackage#getModelElement_OwnedMigratedElements()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Temporary migrated elements for the purpose of model migration.' constraints='none' comment/notes='none'"
	 * @generated
	 */
	EList<ModelElement> getOwnedMigratedElements();

} // ModelElement
