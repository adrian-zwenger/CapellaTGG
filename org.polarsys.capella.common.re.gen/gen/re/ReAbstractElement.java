/**
 */
package re;

import org.polarsys.kitalpha.emde.model.ExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link re.ReAbstractElement#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see re.RePackage#getReAbstractElement()
 * @model abstract="true"
 * @generated
 */
public interface ReAbstractElement extends ExtensibleElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see re.RePackage#getReAbstractElement_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link re.ReAbstractElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ReAbstractElement
