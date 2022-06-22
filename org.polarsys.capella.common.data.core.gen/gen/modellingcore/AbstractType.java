/**
 */
package modellingcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modellingcore.AbstractType#getAbstractTypedElements <em>Abstract Typed Elements</em>}</li>
 * </ul>
 *
 * @see modellingcore.ModellingcorePackage#getAbstractType()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='base abstract class supporting the definition of data types\r\n[source: Capella study]' usage\040guideline='n/a (Abstract)' used\040in\040levels='operational,system,logical,physical,epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::Type' constraints='none'"
 * @generated
 */
public interface AbstractType extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Abstract Typed Elements</b></em>' reference list.
	 * The list contents are of type {@link modellingcore.AbstractTypedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Typed Elements</em>' reference list.
	 * @see modellingcore.ModellingcorePackage#getAbstractType_AbstractTypedElements()
	 * @model transient="true" changeable="false"
	 *        annotation="http://www.polarsys.org/capella/derived viatra.variant='opposite' viatra.expression='abstractType'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the list of typed elements that reference this type\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and Transient' constraints='none'"
	 * @generated
	 */
	EList<AbstractTypedElement> getAbstractTypedElements();

} // AbstractType
