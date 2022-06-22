/**
 */
package modellingcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Parameter Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modellingcore.AbstractParameterSet#getOwnedConditions <em>Owned Conditions</em>}</li>
 *   <li>{@link modellingcore.AbstractParameterSet#getProbability <em>Probability</em>}</li>
 *   <li>{@link modellingcore.AbstractParameterSet#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see modellingcore.ModellingcorePackage#getAbstractParameterSet()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A parameter set is an element that provides alternative sets of inputs or outputs that a behavior may use.\r\n[source: UML superstructure v2.2]' usage\040guideline='n/a' used\040in\040levels='n/a' usage\040examples='n/a' constraints='- The parameters in a parameter set must all be inputs or all be outputs of the same parameterized entity, and the parameter set is owned by that entity.\r\n- If a behavior has input parameters that are in a parameter set, then any inputs that are not in a parameter set must be streaming. Same for output parameters.\r\n- Two parameter sets cannot have exactly the same set of parameters.\r\n[source: UML superstructure v2.2]' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::ParameterSet' constraints='none'"
 * @generated
 */
public interface AbstractParameterSet extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link modellingcore.AbstractConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Conditions</em>' containment reference list.
	 * @see modellingcore.ModellingcorePackage#getAbstractParameterSet_OwnedConditions()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Constraint that should be satisfied for the owner of the parameters in an input parameter set to start execution using\r\nthe values provided for those parameters, or the owner of the parameters in an output parameter set to end execution\r\nproviding the values for those parameters, if all preconditions and conditions on input parameter sets were satisfied\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::ParameterSet::condition' explanation='none' constraints='Order must be computed'"
	 * @generated
	 */
	EList<AbstractConstraint> getOwnedConditions();

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' containment reference.
	 * @see #setProbability(ValueSpecification)
	 * @see modellingcore.ModellingcorePackage#getAbstractParameterSet_Probability()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the probability the parameter set will be given values at runtime\r\n[source: SysML specification v1.1]' constraints='These must be between zero and one inclusive, and add up to one for output parameter sets of the\r\nsame behavior at the time the probabilities are used.\r\n[source: SysML specification v1.1]' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::specific' explanation='If SysML::Activities::Probability stereotype is applied, Capella AbstractParameterSet::probability is equal to SysML::Activities::Probability::probability.' constraints='none'"
	 * @generated
	 */
	ValueSpecification getProbability();

	/**
	 * Sets the value of the '{@link modellingcore.AbstractParameterSet#getProbability <em>Probability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' containment reference.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link modellingcore.AbstractParameter}.
	 * It is bidirectional and its opposite is '{@link modellingcore.AbstractParameter#getParameterSet <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see modellingcore.ModellingcorePackage#getAbstractParameterSet_Parameters()
	 * @see modellingcore.AbstractParameter#getParameterSet
	 * @model opposite="parameterSet" required="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Parameters in the parameter set.\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::ParameterSet::parameter' explanation='none' constraints='Order must be computed'"
	 * @generated
	 */
	EList<AbstractParameter> getParameters();

} // AbstractParameterSet
