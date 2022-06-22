/**
 */
package re;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link re.ReDescriptionElement#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see re.RePackage#getReDescriptionElement()
 * @model abstract="true"
 * @generated
 */
public interface ReDescriptionElement extends ReNamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see re.RePackage#getReDescriptionElement_Description()
	 * @model annotation="http://www.polarsys.org/capella/semantic"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link re.ReDescriptionElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ReDescriptionElement
