/**
 */
package Oa2Ctx_TransistionActors;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.cs.Part;

import runtime.CorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oa Part2 Sa Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx_TransistionActors.OaPart2SaPart#getSource <em>Source</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.OaPart2SaPart#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOaPart2SaPart()
 * @model
 * @generated
 */
public interface OaPart2SaPart extends EObject, CorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Part)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOaPart2SaPart_Source()
	 * @model
	 * @generated
	 */
	Part getSource();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.OaPart2SaPart#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Part value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Part)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOaPart2SaPart_Target()
	 * @model
	 * @generated
	 */
	Part getTarget();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.OaPart2SaPart#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Part value);

} // OaPart2SaPart
