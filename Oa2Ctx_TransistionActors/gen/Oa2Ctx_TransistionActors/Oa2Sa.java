/**
 */
package Oa2Ctx_TransistionActors;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.data.oa.OperationalAnalysis;

import runtime.CorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oa2 Sa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa#getSource <em>Source</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa()
 * @model
 * @generated
 */
public interface Oa2Sa extends EObject, CorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OperationalAnalysis)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_Source()
	 * @model
	 * @generated
	 */
	OperationalAnalysis getSource();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OperationalAnalysis value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SystemAnalysis)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_Target()
	 * @model
	 * @generated
	 */
	SystemAnalysis getTarget();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SystemAnalysis value);

} // Oa2Sa
