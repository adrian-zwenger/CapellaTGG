/**
 */
package re;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link re.ReNamedElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see re.RePackage#getReNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface ReNamedElement extends ReAbstractElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see re.RePackage#getReNamedElement_Name()
	 * @model annotation="http://www.polarsys.org/capella/semantic"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link re.ReNamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ReNamedElement
