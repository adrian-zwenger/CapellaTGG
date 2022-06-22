/**
 */
package Oa2Ctx_TransistionActors;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.ctx.SystemComponent;

import org.polarsys.capella.core.data.oa.Entity;

import runtime.CorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity2 System Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx_TransistionActors.Entity2SystemComponent#getSource <em>Source</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Entity2SystemComponent#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getEntity2SystemComponent()
 * @model
 * @generated
 */
public interface Entity2SystemComponent extends EObject, CorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Entity)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getEntity2SystemComponent_Source()
	 * @model
	 * @generated
	 */
	Entity getSource();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Entity2SystemComponent#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Entity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SystemComponent)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getEntity2SystemComponent_Target()
	 * @model
	 * @generated
	 */
	SystemComponent getTarget();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Entity2SystemComponent#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SystemComponent value);

} // Entity2SystemComponent
