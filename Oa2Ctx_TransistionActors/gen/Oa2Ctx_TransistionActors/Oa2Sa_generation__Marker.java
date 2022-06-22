/**
 */
package Oa2Ctx_TransistionActors;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.cs.Part;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.ctx.SystemComponentPkg;

import org.polarsys.capella.core.data.oa.EntityPkg;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oa2 Sa generation Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker#getCREATE__SRC__src_entity_pkg <em>CREATE SRC src entity pkg</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker#getCREATE__TRG__trg_sa_arch <em>CREATE TRG trg sa arch</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker#getCREATE__TRG__trg_system_as_component <em>CREATE TRG trg system as component</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker#getCREATE__TRG__trg_system_as_part <em>CREATE TRG trg system as part</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker#getCREATE__TRG__trg_system_component_pkg <em>CREATE TRG trg system component pkg</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker#getCREATE__CORR__new_oa2sa <em>CREATE CORR new oa2sa</em>}</li>
 * </ul>
 *
 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_generation__Marker()
 * @model
 * @generated
 */
public interface Oa2Sa_generation__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC src entity pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src entity pkg</em>' reference.
	 * @see #setCREATE__SRC__src_entity_pkg(EntityPkg)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_generation__Marker_CREATE__SRC__src_entity_pkg()
	 * @model required="true"
	 * @generated
	 */
	EntityPkg getCREATE__SRC__src_entity_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker#getCREATE__SRC__src_entity_pkg <em>CREATE SRC src entity pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src entity pkg</em>' reference.
	 * @see #getCREATE__SRC__src_entity_pkg()
	 * @generated
	 */
	void setCREATE__SRC__src_entity_pkg(EntityPkg value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC src oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src oa arch</em>' reference.
	 * @see #setCREATE__SRC__src_oa_arch(OperationalAnalysis)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_generation__Marker_CREATE__SRC__src_oa_arch()
	 * @model required="true"
	 * @generated
	 */
	OperationalAnalysis getCREATE__SRC__src_oa_arch();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src oa arch</em>' reference.
	 * @see #getCREATE__SRC__src_oa_arch()
	 * @generated
	 */
	void setCREATE__SRC__src_oa_arch(OperationalAnalysis value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg sa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg sa arch</em>' reference.
	 * @see #setCREATE__TRG__trg_sa_arch(SystemAnalysis)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_generation__Marker_CREATE__TRG__trg_sa_arch()
	 * @model required="true"
	 * @generated
	 */
	SystemAnalysis getCREATE__TRG__trg_sa_arch();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker#getCREATE__TRG__trg_sa_arch <em>CREATE TRG trg sa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg sa arch</em>' reference.
	 * @see #getCREATE__TRG__trg_sa_arch()
	 * @generated
	 */
	void setCREATE__TRG__trg_sa_arch(SystemAnalysis value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg system as component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg system as component</em>' reference.
	 * @see #setCREATE__TRG__trg_system_as_component(SystemComponent)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_generation__Marker_CREATE__TRG__trg_system_as_component()
	 * @model required="true"
	 * @generated
	 */
	SystemComponent getCREATE__TRG__trg_system_as_component();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker#getCREATE__TRG__trg_system_as_component <em>CREATE TRG trg system as component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg system as component</em>' reference.
	 * @see #getCREATE__TRG__trg_system_as_component()
	 * @generated
	 */
	void setCREATE__TRG__trg_system_as_component(SystemComponent value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg system as part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg system as part</em>' reference.
	 * @see #setCREATE__TRG__trg_system_as_part(Part)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_generation__Marker_CREATE__TRG__trg_system_as_part()
	 * @model required="true"
	 * @generated
	 */
	Part getCREATE__TRG__trg_system_as_part();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker#getCREATE__TRG__trg_system_as_part <em>CREATE TRG trg system as part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg system as part</em>' reference.
	 * @see #getCREATE__TRG__trg_system_as_part()
	 * @generated
	 */
	void setCREATE__TRG__trg_system_as_part(Part value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg system component pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg system component pkg</em>' reference.
	 * @see #setCREATE__TRG__trg_system_component_pkg(SystemComponentPkg)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_generation__Marker_CREATE__TRG__trg_system_component_pkg()
	 * @model required="true"
	 * @generated
	 */
	SystemComponentPkg getCREATE__TRG__trg_system_component_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker#getCREATE__TRG__trg_system_component_pkg <em>CREATE TRG trg system component pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg system component pkg</em>' reference.
	 * @see #getCREATE__TRG__trg_system_component_pkg()
	 * @generated
	 */
	void setCREATE__TRG__trg_system_component_pkg(SystemComponentPkg value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR new oa2sa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR new oa2sa</em>' reference.
	 * @see #setCREATE__CORR__new_oa2sa(Oa2Sa)
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#getOa2Sa_generation__Marker_CREATE__CORR__new_oa2sa()
	 * @model required="true"
	 * @generated
	 */
	Oa2Sa getCREATE__CORR__new_oa2sa();

	/**
	 * Sets the value of the '{@link Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker#getCREATE__CORR__new_oa2sa <em>CREATE CORR new oa2sa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR new oa2sa</em>' reference.
	 * @see #getCREATE__CORR__new_oa2sa()
	 * @generated
	 */
	void setCREATE__CORR__new_oa2sa(Oa2Sa value);

} // Oa2Sa_generation__Marker
