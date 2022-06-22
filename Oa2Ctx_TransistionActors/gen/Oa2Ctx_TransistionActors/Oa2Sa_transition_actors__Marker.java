/**
 */
package Oa2Ctx_TransistionActors;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.cs.Part;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.ctx.SystemComponentPkg;

import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.core.data.oa.EntityPkg;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oa2 Sa transition actors Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCONTEXT__SRC__src_entity_pkg <em>CONTEXT SRC src entity pkg</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCONTEXT__SRC__src_oa_arch <em>CONTEXT SRC src oa arch</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCREATE__SRC__src_oa_entity <em>CREATE SRC src oa entity</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCREATE__SRC__src_oa_part <em>CREATE SRC src oa part</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCONTEXT__TRG__trg_componenet_pkg <em>CONTEXT TRG trg componenet pkg</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCONTEXT__TRG__trg_sa_arch <em>CONTEXT TRG trg sa arch</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCREATE__TRG__trg_sys_component <em>CREATE TRG trg sys component</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCREATE__TRG__trg_sys_part <em>CREATE TRG trg sys part</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCREATE__CORR__entity2component <em>CREATE CORR entity2component</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCONTEXT__CORR__oa2sa <em>CONTEXT CORR oa2sa</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCREATE__CORR__part2part <em>CREATE CORR part2part</em>}</li>
 * </ul>
 *
 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors__Marker()
 * @model
 * @generated
 */
public interface Oa2Sa_transition_actors__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC src entity pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC src entity pkg</em>' reference.
	 * @see #setCONTEXT__SRC__src_entity_pkg(EntityPkg)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors__Marker_CONTEXT__SRC__src_entity_pkg()
	 * @model required="true"
	 * @generated
	 */
	EntityPkg getCONTEXT__SRC__src_entity_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCONTEXT__SRC__src_entity_pkg <em>CONTEXT SRC src entity pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC src entity pkg</em>' reference.
	 * @see #getCONTEXT__SRC__src_entity_pkg()
	 * @generated
	 */
	void setCONTEXT__SRC__src_entity_pkg(EntityPkg value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC src oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC src oa arch</em>' reference.
	 * @see #setCONTEXT__SRC__src_oa_arch(OperationalAnalysis)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors__Marker_CONTEXT__SRC__src_oa_arch()
	 * @model required="true"
	 * @generated
	 */
	OperationalAnalysis getCONTEXT__SRC__src_oa_arch();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCONTEXT__SRC__src_oa_arch <em>CONTEXT SRC src oa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC src oa arch</em>' reference.
	 * @see #getCONTEXT__SRC__src_oa_arch()
	 * @generated
	 */
	void setCONTEXT__SRC__src_oa_arch(OperationalAnalysis value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC src oa entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src oa entity</em>' reference.
	 * @see #setCREATE__SRC__src_oa_entity(Entity)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors__Marker_CREATE__SRC__src_oa_entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getCREATE__SRC__src_oa_entity();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCREATE__SRC__src_oa_entity <em>CREATE SRC src oa entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src oa entity</em>' reference.
	 * @see #getCREATE__SRC__src_oa_entity()
	 * @generated
	 */
	void setCREATE__SRC__src_oa_entity(Entity value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC src oa part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src oa part</em>' reference.
	 * @see #setCREATE__SRC__src_oa_part(Part)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors__Marker_CREATE__SRC__src_oa_part()
	 * @model required="true"
	 * @generated
	 */
	Part getCREATE__SRC__src_oa_part();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCREATE__SRC__src_oa_part <em>CREATE SRC src oa part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src oa part</em>' reference.
	 * @see #getCREATE__SRC__src_oa_part()
	 * @generated
	 */
	void setCREATE__SRC__src_oa_part(Part value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG trg componenet pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG trg componenet pkg</em>' reference.
	 * @see #setCONTEXT__TRG__trg_componenet_pkg(SystemComponentPkg)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors__Marker_CONTEXT__TRG__trg_componenet_pkg()
	 * @model required="true"
	 * @generated
	 */
	SystemComponentPkg getCONTEXT__TRG__trg_componenet_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCONTEXT__TRG__trg_componenet_pkg <em>CONTEXT TRG trg componenet pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG trg componenet pkg</em>' reference.
	 * @see #getCONTEXT__TRG__trg_componenet_pkg()
	 * @generated
	 */
	void setCONTEXT__TRG__trg_componenet_pkg(SystemComponentPkg value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG trg sa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG trg sa arch</em>' reference.
	 * @see #setCONTEXT__TRG__trg_sa_arch(SystemAnalysis)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors__Marker_CONTEXT__TRG__trg_sa_arch()
	 * @model required="true"
	 * @generated
	 */
	SystemAnalysis getCONTEXT__TRG__trg_sa_arch();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCONTEXT__TRG__trg_sa_arch <em>CONTEXT TRG trg sa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG trg sa arch</em>' reference.
	 * @see #getCONTEXT__TRG__trg_sa_arch()
	 * @generated
	 */
	void setCONTEXT__TRG__trg_sa_arch(SystemAnalysis value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg sys component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg sys component</em>' reference.
	 * @see #setCREATE__TRG__trg_sys_component(SystemComponent)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors__Marker_CREATE__TRG__trg_sys_component()
	 * @model required="true"
	 * @generated
	 */
	SystemComponent getCREATE__TRG__trg_sys_component();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCREATE__TRG__trg_sys_component <em>CREATE TRG trg sys component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg sys component</em>' reference.
	 * @see #getCREATE__TRG__trg_sys_component()
	 * @generated
	 */
	void setCREATE__TRG__trg_sys_component(SystemComponent value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg sys part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg sys part</em>' reference.
	 * @see #setCREATE__TRG__trg_sys_part(Part)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors__Marker_CREATE__TRG__trg_sys_part()
	 * @model required="true"
	 * @generated
	 */
	Part getCREATE__TRG__trg_sys_part();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCREATE__TRG__trg_sys_part <em>CREATE TRG trg sys part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg sys part</em>' reference.
	 * @see #getCREATE__TRG__trg_sys_part()
	 * @generated
	 */
	void setCREATE__TRG__trg_sys_part(Part value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR entity2component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR entity2component</em>' reference.
	 * @see #setCREATE__CORR__entity2component(Entity2SystemComponent)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors__Marker_CREATE__CORR__entity2component()
	 * @model required="true"
	 * @generated
	 */
	Entity2SystemComponent getCREATE__CORR__entity2component();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCREATE__CORR__entity2component <em>CREATE CORR entity2component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR entity2component</em>' reference.
	 * @see #getCREATE__CORR__entity2component()
	 * @generated
	 */
	void setCREATE__CORR__entity2component(Entity2SystemComponent value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR oa2sa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR oa2sa</em>' reference.
	 * @see #setCONTEXT__CORR__oa2sa(Oa2Sa)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors__Marker_CONTEXT__CORR__oa2sa()
	 * @model required="true"
	 * @generated
	 */
	Oa2Sa getCONTEXT__CORR__oa2sa();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCONTEXT__CORR__oa2sa <em>CONTEXT CORR oa2sa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR oa2sa</em>' reference.
	 * @see #getCONTEXT__CORR__oa2sa()
	 * @generated
	 */
	void setCONTEXT__CORR__oa2sa(Oa2Sa value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR part2part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR part2part</em>' reference.
	 * @see #setCREATE__CORR__part2part(OaPart2SaPart)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors__Marker_CREATE__CORR__part2part()
	 * @model required="true"
	 * @generated
	 */
	OaPart2SaPart getCREATE__CORR__part2part();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker#getCREATE__CORR__part2part <em>CREATE CORR part2part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR part2part</em>' reference.
	 * @see #getCREATE__CORR__part2part()
	 * @generated
	 */
	void setCREATE__CORR__part2part(OaPart2SaPart value);

} // Oa2Sa_transition_actors__Marker
