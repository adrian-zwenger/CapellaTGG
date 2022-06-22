/**
 */
package modellingcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finalizable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modellingcore.FinalizableElement#isFinal <em>Final</em>}</li>
 * </ul>
 *
 * @see modellingcore.ModellingcorePackage#getFinalizableElement()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='none' constraints='none' type='n/a' comment/notes='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
 * @generated
 */
public interface FinalizableElement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see modellingcore.ModellingcorePackage#getFinalizableElement_Final()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='none' constraints='none' type='n/a' comment/notes='none'"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link modellingcore.FinalizableElement#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

} // FinalizableElement
