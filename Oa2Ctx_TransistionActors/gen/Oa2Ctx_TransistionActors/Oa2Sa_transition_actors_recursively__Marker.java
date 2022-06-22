/**
 */
package Oa2Ctx_TransistionActors;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.cs.Part;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.ctx.SystemComponentPkg;

import org.polarsys.capella.core.data.oa.Entity;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oa2 Sa transition actors recursively Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCREATE__SRC__src_operational_entity <em>CREATE SRC src operational entity</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCREATE__SRC__src_operational_part <em>CREATE SRC src operational part</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCONTEXT__SRC__src_top_level_entity <em>CONTEXT SRC src top level entity</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCONTEXT__TRG__trg_sa_arch <em>CONTEXT TRG trg sa arch</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCREATE__TRG__trg_system_component <em>CREATE TRG trg system component</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCONTEXT__TRG__trg_system_component_pkg <em>CONTEXT TRG trg system component pkg</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCREATE__TRG__trg_system_part <em>CREATE TRG trg system part</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCREATE__CORR__OaEntity2SaSysComponent <em>CREATE CORR Oa Entity2 Sa Sys Component</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCREATE__CORR__part2part <em>CREATE CORR part2part</em>}</li>
 * </ul>
 *
 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors_recursively__Marker()
 * @model
 * @generated
 */
public interface Oa2Sa_transition_actors_recursively__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC src operational entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src operational entity</em>' reference.
	 * @see #setCREATE__SRC__src_operational_entity(Entity)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors_recursively__Marker_CREATE__SRC__src_operational_entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getCREATE__SRC__src_operational_entity();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCREATE__SRC__src_operational_entity <em>CREATE SRC src operational entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src operational entity</em>' reference.
	 * @see #getCREATE__SRC__src_operational_entity()
	 * @generated
	 */
	void setCREATE__SRC__src_operational_entity(Entity value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC src operational part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src operational part</em>' reference.
	 * @see #setCREATE__SRC__src_operational_part(Part)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors_recursively__Marker_CREATE__SRC__src_operational_part()
	 * @model required="true"
	 * @generated
	 */
	Part getCREATE__SRC__src_operational_part();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCREATE__SRC__src_operational_part <em>CREATE SRC src operational part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src operational part</em>' reference.
	 * @see #getCREATE__SRC__src_operational_part()
	 * @generated
	 */
	void setCREATE__SRC__src_operational_part(Part value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC src top level entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC src top level entity</em>' reference.
	 * @see #setCONTEXT__SRC__src_top_level_entity(Entity)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors_recursively__Marker_CONTEXT__SRC__src_top_level_entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getCONTEXT__SRC__src_top_level_entity();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCONTEXT__SRC__src_top_level_entity <em>CONTEXT SRC src top level entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC src top level entity</em>' reference.
	 * @see #getCONTEXT__SRC__src_top_level_entity()
	 * @generated
	 */
	void setCONTEXT__SRC__src_top_level_entity(Entity value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG trg sa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG trg sa arch</em>' reference.
	 * @see #setCONTEXT__TRG__trg_sa_arch(SystemAnalysis)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors_recursively__Marker_CONTEXT__TRG__trg_sa_arch()
	 * @model required="true"
	 * @generated
	 */
	SystemAnalysis getCONTEXT__TRG__trg_sa_arch();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCONTEXT__TRG__trg_sa_arch <em>CONTEXT TRG trg sa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG trg sa arch</em>' reference.
	 * @see #getCONTEXT__TRG__trg_sa_arch()
	 * @generated
	 */
	void setCONTEXT__TRG__trg_sa_arch(SystemAnalysis value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg system component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg system component</em>' reference.
	 * @see #setCREATE__TRG__trg_system_component(SystemComponent)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors_recursively__Marker_CREATE__TRG__trg_system_component()
	 * @model required="true"
	 * @generated
	 */
	SystemComponent getCREATE__TRG__trg_system_component();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCREATE__TRG__trg_system_component <em>CREATE TRG trg system component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg system component</em>' reference.
	 * @see #getCREATE__TRG__trg_system_component()
	 * @generated
	 */
	void setCREATE__TRG__trg_system_component(SystemComponent value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG trg system component pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG trg system component pkg</em>' reference.
	 * @see #setCONTEXT__TRG__trg_system_component_pkg(SystemComponentPkg)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors_recursively__Marker_CONTEXT__TRG__trg_system_component_pkg()
	 * @model required="true"
	 * @generated
	 */
	SystemComponentPkg getCONTEXT__TRG__trg_system_component_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCONTEXT__TRG__trg_system_component_pkg <em>CONTEXT TRG trg system component pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG trg system component pkg</em>' reference.
	 * @see #getCONTEXT__TRG__trg_system_component_pkg()
	 * @generated
	 */
	void setCONTEXT__TRG__trg_system_component_pkg(SystemComponentPkg value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg system part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg system part</em>' reference.
	 * @see #setCREATE__TRG__trg_system_part(Part)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors_recursively__Marker_CREATE__TRG__trg_system_part()
	 * @model required="true"
	 * @generated
	 */
	Part getCREATE__TRG__trg_system_part();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCREATE__TRG__trg_system_part <em>CREATE TRG trg system part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg system part</em>' reference.
	 * @see #getCREATE__TRG__trg_system_part()
	 * @generated
	 */
	void setCREATE__TRG__trg_system_part(Part value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR Oa Entity2 Sa Sys Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR Oa Entity2 Sa Sys Component</em>' reference.
	 * @see #setCREATE__CORR__OaEntity2SaSysComponent(Entity2SystemComponent)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors_recursively__Marker_CREATE__CORR__OaEntity2SaSysComponent()
	 * @model required="true"
	 * @generated
	 */
	Entity2SystemComponent getCREATE__CORR__OaEntity2SaSysComponent();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCREATE__CORR__OaEntity2SaSysComponent <em>CREATE CORR Oa Entity2 Sa Sys Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR Oa Entity2 Sa Sys Component</em>' reference.
	 * @see #getCREATE__CORR__OaEntity2SaSysComponent()
	 * @generated
	 */
	void setCREATE__CORR__OaEntity2SaSysComponent(Entity2SystemComponent value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR part2part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR part2part</em>' reference.
	 * @see #setCREATE__CORR__part2part(OaPart2SaPart)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_transition_actors_recursively__Marker_CREATE__CORR__part2part()
	 * @model required="true"
	 * @generated
	 */
	OaPart2SaPart getCREATE__CORR__part2part();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker#getCREATE__CORR__part2part <em>CREATE CORR part2part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR part2part</em>' reference.
	 * @see #getCREATE__CORR__part2part()
	 * @generated
	 */
	void setCREATE__CORR__part2part(OaPart2SaPart value);

} // Oa2Sa_transition_actors_recursively__Marker
