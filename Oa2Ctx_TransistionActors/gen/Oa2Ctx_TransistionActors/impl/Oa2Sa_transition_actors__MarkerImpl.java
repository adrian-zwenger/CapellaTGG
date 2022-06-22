/**
 */
package Oa2Ctx_TransistionActors.impl;

import Oa2Ctx_TransistionActors.Entity2SystemComponent;
import Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage;
import Oa2Ctx_TransistionActors.Oa2Sa;
import Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker;
import Oa2Ctx_TransistionActors.OaPart2SaPart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.cs.Part;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.ctx.SystemComponentPkg;

import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.core.data.oa.EntityPkg;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oa2 Sa transition actors Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_transition_actors__MarkerImpl#getCONTEXT__SRC__src_entity_pkg <em>CONTEXT SRC src entity pkg</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_transition_actors__MarkerImpl#getCONTEXT__SRC__src_oa_arch <em>CONTEXT SRC src oa arch</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_transition_actors__MarkerImpl#getCREATE__SRC__src_oa_entity <em>CREATE SRC src oa entity</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_transition_actors__MarkerImpl#getCREATE__SRC__src_oa_part <em>CREATE SRC src oa part</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_transition_actors__MarkerImpl#getCONTEXT__TRG__trg_componenet_pkg <em>CONTEXT TRG trg componenet pkg</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_transition_actors__MarkerImpl#getCONTEXT__TRG__trg_sa_arch <em>CONTEXT TRG trg sa arch</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_transition_actors__MarkerImpl#getCREATE__TRG__trg_sys_component <em>CREATE TRG trg sys component</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_transition_actors__MarkerImpl#getCREATE__TRG__trg_sys_part <em>CREATE TRG trg sys part</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_transition_actors__MarkerImpl#getCREATE__CORR__entity2component <em>CREATE CORR entity2component</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_transition_actors__MarkerImpl#getCONTEXT__CORR__oa2sa <em>CONTEXT CORR oa2sa</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_transition_actors__MarkerImpl#getCREATE__CORR__part2part <em>CREATE CORR part2part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Oa2Sa_transition_actors__MarkerImpl extends TGGRuleApplicationImpl implements Oa2Sa_transition_actors__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__src_entity_pkg() <em>CONTEXT SRC src entity pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__src_entity_pkg()
	 * @generated
	 * @ordered
	 */
	protected EntityPkg contexT__SRC__src_entity_pkg;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__src_oa_arch() <em>CONTEXT SRC src oa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__src_oa_arch()
	 * @generated
	 * @ordered
	 */
	protected OperationalAnalysis contexT__SRC__src_oa_arch;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__src_oa_entity() <em>CREATE SRC src oa entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__src_oa_entity()
	 * @generated
	 * @ordered
	 */
	protected Entity creatE__SRC__src_oa_entity;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__src_oa_part() <em>CREATE SRC src oa part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__src_oa_part()
	 * @generated
	 * @ordered
	 */
	protected Part creatE__SRC__src_oa_part;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__trg_componenet_pkg() <em>CONTEXT TRG trg componenet pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__trg_componenet_pkg()
	 * @generated
	 * @ordered
	 */
	protected SystemComponentPkg contexT__TRG__trg_componenet_pkg;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__trg_sa_arch() <em>CONTEXT TRG trg sa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__trg_sa_arch()
	 * @generated
	 * @ordered
	 */
	protected SystemAnalysis contexT__TRG__trg_sa_arch;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_sys_component() <em>CREATE TRG trg sys component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_sys_component()
	 * @generated
	 * @ordered
	 */
	protected SystemComponent creatE__TRG__trg_sys_component;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_sys_part() <em>CREATE TRG trg sys part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_sys_part()
	 * @generated
	 * @ordered
	 */
	protected Part creatE__TRG__trg_sys_part;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__entity2component() <em>CREATE CORR entity2component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__entity2component()
	 * @generated
	 * @ordered
	 */
	protected Entity2SystemComponent creatE__CORR__entity2component;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__oa2sa() <em>CONTEXT CORR oa2sa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__oa2sa()
	 * @generated
	 * @ordered
	 */
	protected Oa2Sa contexT__CORR__oa2sa;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__part2part() <em>CREATE CORR part2part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__part2part()
	 * @generated
	 * @ordered
	 */
	protected OaPart2SaPart creatE__CORR__part2part;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Oa2Sa_transition_actors__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Oa2Ctx_TransistionActorsPackage.Literals.OA2_SA_TRANSITION_ACTORS_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPkg getCONTEXT__SRC__src_entity_pkg() {
		if (contexT__SRC__src_entity_pkg != null && contexT__SRC__src_entity_pkg.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__src_entity_pkg = (InternalEObject)contexT__SRC__src_entity_pkg;
			contexT__SRC__src_entity_pkg = (EntityPkg)eResolveProxy(oldCONTEXT__SRC__src_entity_pkg);
			if (contexT__SRC__src_entity_pkg != oldCONTEXT__SRC__src_entity_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_SRC_SRC_ENTITY_PKG, oldCONTEXT__SRC__src_entity_pkg, contexT__SRC__src_entity_pkg));
			}
		}
		return contexT__SRC__src_entity_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPkg basicGetCONTEXT__SRC__src_entity_pkg() {
		return contexT__SRC__src_entity_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__src_entity_pkg(EntityPkg newCONTEXT__SRC__src_entity_pkg) {
		EntityPkg oldCONTEXT__SRC__src_entity_pkg = contexT__SRC__src_entity_pkg;
		contexT__SRC__src_entity_pkg = newCONTEXT__SRC__src_entity_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_SRC_SRC_ENTITY_PKG, oldCONTEXT__SRC__src_entity_pkg, contexT__SRC__src_entity_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis getCONTEXT__SRC__src_oa_arch() {
		if (contexT__SRC__src_oa_arch != null && contexT__SRC__src_oa_arch.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__src_oa_arch = (InternalEObject)contexT__SRC__src_oa_arch;
			contexT__SRC__src_oa_arch = (OperationalAnalysis)eResolveProxy(oldCONTEXT__SRC__src_oa_arch);
			if (contexT__SRC__src_oa_arch != oldCONTEXT__SRC__src_oa_arch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_SRC_SRC_OA_ARCH, oldCONTEXT__SRC__src_oa_arch, contexT__SRC__src_oa_arch));
			}
		}
		return contexT__SRC__src_oa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis basicGetCONTEXT__SRC__src_oa_arch() {
		return contexT__SRC__src_oa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__src_oa_arch(OperationalAnalysis newCONTEXT__SRC__src_oa_arch) {
		OperationalAnalysis oldCONTEXT__SRC__src_oa_arch = contexT__SRC__src_oa_arch;
		contexT__SRC__src_oa_arch = newCONTEXT__SRC__src_oa_arch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_SRC_SRC_OA_ARCH, oldCONTEXT__SRC__src_oa_arch, contexT__SRC__src_oa_arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getCREATE__SRC__src_oa_entity() {
		if (creatE__SRC__src_oa_entity != null && creatE__SRC__src_oa_entity.eIsProxy()) {
			InternalEObject oldCREATE__SRC__src_oa_entity = (InternalEObject)creatE__SRC__src_oa_entity;
			creatE__SRC__src_oa_entity = (Entity)eResolveProxy(oldCREATE__SRC__src_oa_entity);
			if (creatE__SRC__src_oa_entity != oldCREATE__SRC__src_oa_entity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_SRC_SRC_OA_ENTITY, oldCREATE__SRC__src_oa_entity, creatE__SRC__src_oa_entity));
			}
		}
		return creatE__SRC__src_oa_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetCREATE__SRC__src_oa_entity() {
		return creatE__SRC__src_oa_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__src_oa_entity(Entity newCREATE__SRC__src_oa_entity) {
		Entity oldCREATE__SRC__src_oa_entity = creatE__SRC__src_oa_entity;
		creatE__SRC__src_oa_entity = newCREATE__SRC__src_oa_entity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_SRC_SRC_OA_ENTITY, oldCREATE__SRC__src_oa_entity, creatE__SRC__src_oa_entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part getCREATE__SRC__src_oa_part() {
		if (creatE__SRC__src_oa_part != null && creatE__SRC__src_oa_part.eIsProxy()) {
			InternalEObject oldCREATE__SRC__src_oa_part = (InternalEObject)creatE__SRC__src_oa_part;
			creatE__SRC__src_oa_part = (Part)eResolveProxy(oldCREATE__SRC__src_oa_part);
			if (creatE__SRC__src_oa_part != oldCREATE__SRC__src_oa_part) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_SRC_SRC_OA_PART, oldCREATE__SRC__src_oa_part, creatE__SRC__src_oa_part));
			}
		}
		return creatE__SRC__src_oa_part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetCREATE__SRC__src_oa_part() {
		return creatE__SRC__src_oa_part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__src_oa_part(Part newCREATE__SRC__src_oa_part) {
		Part oldCREATE__SRC__src_oa_part = creatE__SRC__src_oa_part;
		creatE__SRC__src_oa_part = newCREATE__SRC__src_oa_part;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_SRC_SRC_OA_PART, oldCREATE__SRC__src_oa_part, creatE__SRC__src_oa_part));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentPkg getCONTEXT__TRG__trg_componenet_pkg() {
		if (contexT__TRG__trg_componenet_pkg != null && contexT__TRG__trg_componenet_pkg.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__trg_componenet_pkg = (InternalEObject)contexT__TRG__trg_componenet_pkg;
			contexT__TRG__trg_componenet_pkg = (SystemComponentPkg)eResolveProxy(oldCONTEXT__TRG__trg_componenet_pkg);
			if (contexT__TRG__trg_componenet_pkg != oldCONTEXT__TRG__trg_componenet_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_TRG_TRG_COMPONENET_PKG, oldCONTEXT__TRG__trg_componenet_pkg, contexT__TRG__trg_componenet_pkg));
			}
		}
		return contexT__TRG__trg_componenet_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentPkg basicGetCONTEXT__TRG__trg_componenet_pkg() {
		return contexT__TRG__trg_componenet_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__trg_componenet_pkg(SystemComponentPkg newCONTEXT__TRG__trg_componenet_pkg) {
		SystemComponentPkg oldCONTEXT__TRG__trg_componenet_pkg = contexT__TRG__trg_componenet_pkg;
		contexT__TRG__trg_componenet_pkg = newCONTEXT__TRG__trg_componenet_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_TRG_TRG_COMPONENET_PKG, oldCONTEXT__TRG__trg_componenet_pkg, contexT__TRG__trg_componenet_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis getCONTEXT__TRG__trg_sa_arch() {
		if (contexT__TRG__trg_sa_arch != null && contexT__TRG__trg_sa_arch.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__trg_sa_arch = (InternalEObject)contexT__TRG__trg_sa_arch;
			contexT__TRG__trg_sa_arch = (SystemAnalysis)eResolveProxy(oldCONTEXT__TRG__trg_sa_arch);
			if (contexT__TRG__trg_sa_arch != oldCONTEXT__TRG__trg_sa_arch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_TRG_TRG_SA_ARCH, oldCONTEXT__TRG__trg_sa_arch, contexT__TRG__trg_sa_arch));
			}
		}
		return contexT__TRG__trg_sa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis basicGetCONTEXT__TRG__trg_sa_arch() {
		return contexT__TRG__trg_sa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__trg_sa_arch(SystemAnalysis newCONTEXT__TRG__trg_sa_arch) {
		SystemAnalysis oldCONTEXT__TRG__trg_sa_arch = contexT__TRG__trg_sa_arch;
		contexT__TRG__trg_sa_arch = newCONTEXT__TRG__trg_sa_arch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_TRG_TRG_SA_ARCH, oldCONTEXT__TRG__trg_sa_arch, contexT__TRG__trg_sa_arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponent getCREATE__TRG__trg_sys_component() {
		if (creatE__TRG__trg_sys_component != null && creatE__TRG__trg_sys_component.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_sys_component = (InternalEObject)creatE__TRG__trg_sys_component;
			creatE__TRG__trg_sys_component = (SystemComponent)eResolveProxy(oldCREATE__TRG__trg_sys_component);
			if (creatE__TRG__trg_sys_component != oldCREATE__TRG__trg_sys_component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_TRG_TRG_SYS_COMPONENT, oldCREATE__TRG__trg_sys_component, creatE__TRG__trg_sys_component));
			}
		}
		return creatE__TRG__trg_sys_component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponent basicGetCREATE__TRG__trg_sys_component() {
		return creatE__TRG__trg_sys_component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_sys_component(SystemComponent newCREATE__TRG__trg_sys_component) {
		SystemComponent oldCREATE__TRG__trg_sys_component = creatE__TRG__trg_sys_component;
		creatE__TRG__trg_sys_component = newCREATE__TRG__trg_sys_component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_TRG_TRG_SYS_COMPONENT, oldCREATE__TRG__trg_sys_component, creatE__TRG__trg_sys_component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part getCREATE__TRG__trg_sys_part() {
		if (creatE__TRG__trg_sys_part != null && creatE__TRG__trg_sys_part.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_sys_part = (InternalEObject)creatE__TRG__trg_sys_part;
			creatE__TRG__trg_sys_part = (Part)eResolveProxy(oldCREATE__TRG__trg_sys_part);
			if (creatE__TRG__trg_sys_part != oldCREATE__TRG__trg_sys_part) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_TRG_TRG_SYS_PART, oldCREATE__TRG__trg_sys_part, creatE__TRG__trg_sys_part));
			}
		}
		return creatE__TRG__trg_sys_part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetCREATE__TRG__trg_sys_part() {
		return creatE__TRG__trg_sys_part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_sys_part(Part newCREATE__TRG__trg_sys_part) {
		Part oldCREATE__TRG__trg_sys_part = creatE__TRG__trg_sys_part;
		creatE__TRG__trg_sys_part = newCREATE__TRG__trg_sys_part;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_TRG_TRG_SYS_PART, oldCREATE__TRG__trg_sys_part, creatE__TRG__trg_sys_part));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity2SystemComponent getCREATE__CORR__entity2component() {
		if (creatE__CORR__entity2component != null && creatE__CORR__entity2component.eIsProxy()) {
			InternalEObject oldCREATE__CORR__entity2component = (InternalEObject)creatE__CORR__entity2component;
			creatE__CORR__entity2component = (Entity2SystemComponent)eResolveProxy(oldCREATE__CORR__entity2component);
			if (creatE__CORR__entity2component != oldCREATE__CORR__entity2component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_CORR_ENTITY2COMPONENT, oldCREATE__CORR__entity2component, creatE__CORR__entity2component));
			}
		}
		return creatE__CORR__entity2component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity2SystemComponent basicGetCREATE__CORR__entity2component() {
		return creatE__CORR__entity2component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__entity2component(Entity2SystemComponent newCREATE__CORR__entity2component) {
		Entity2SystemComponent oldCREATE__CORR__entity2component = creatE__CORR__entity2component;
		creatE__CORR__entity2component = newCREATE__CORR__entity2component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_CORR_ENTITY2COMPONENT, oldCREATE__CORR__entity2component, creatE__CORR__entity2component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa getCONTEXT__CORR__oa2sa() {
		if (contexT__CORR__oa2sa != null && contexT__CORR__oa2sa.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__oa2sa = (InternalEObject)contexT__CORR__oa2sa;
			contexT__CORR__oa2sa = (Oa2Sa)eResolveProxy(oldCONTEXT__CORR__oa2sa);
			if (contexT__CORR__oa2sa != oldCONTEXT__CORR__oa2sa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_CORR_OA2SA, oldCONTEXT__CORR__oa2sa, contexT__CORR__oa2sa));
			}
		}
		return contexT__CORR__oa2sa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa basicGetCONTEXT__CORR__oa2sa() {
		return contexT__CORR__oa2sa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__oa2sa(Oa2Sa newCONTEXT__CORR__oa2sa) {
		Oa2Sa oldCONTEXT__CORR__oa2sa = contexT__CORR__oa2sa;
		contexT__CORR__oa2sa = newCONTEXT__CORR__oa2sa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_CORR_OA2SA, oldCONTEXT__CORR__oa2sa, contexT__CORR__oa2sa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OaPart2SaPart getCREATE__CORR__part2part() {
		if (creatE__CORR__part2part != null && creatE__CORR__part2part.eIsProxy()) {
			InternalEObject oldCREATE__CORR__part2part = (InternalEObject)creatE__CORR__part2part;
			creatE__CORR__part2part = (OaPart2SaPart)eResolveProxy(oldCREATE__CORR__part2part);
			if (creatE__CORR__part2part != oldCREATE__CORR__part2part) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_CORR_PART2PART, oldCREATE__CORR__part2part, creatE__CORR__part2part));
			}
		}
		return creatE__CORR__part2part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OaPart2SaPart basicGetCREATE__CORR__part2part() {
		return creatE__CORR__part2part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__part2part(OaPart2SaPart newCREATE__CORR__part2part) {
		OaPart2SaPart oldCREATE__CORR__part2part = creatE__CORR__part2part;
		creatE__CORR__part2part = newCREATE__CORR__part2part;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_CORR_PART2PART, oldCREATE__CORR__part2part, creatE__CORR__part2part));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_SRC_SRC_ENTITY_PKG:
				if (resolve) return getCONTEXT__SRC__src_entity_pkg();
				return basicGetCONTEXT__SRC__src_entity_pkg();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_SRC_SRC_OA_ARCH:
				if (resolve) return getCONTEXT__SRC__src_oa_arch();
				return basicGetCONTEXT__SRC__src_oa_arch();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_SRC_SRC_OA_ENTITY:
				if (resolve) return getCREATE__SRC__src_oa_entity();
				return basicGetCREATE__SRC__src_oa_entity();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_SRC_SRC_OA_PART:
				if (resolve) return getCREATE__SRC__src_oa_part();
				return basicGetCREATE__SRC__src_oa_part();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_TRG_TRG_COMPONENET_PKG:
				if (resolve) return getCONTEXT__TRG__trg_componenet_pkg();
				return basicGetCONTEXT__TRG__trg_componenet_pkg();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_TRG_TRG_SA_ARCH:
				if (resolve) return getCONTEXT__TRG__trg_sa_arch();
				return basicGetCONTEXT__TRG__trg_sa_arch();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_TRG_TRG_SYS_COMPONENT:
				if (resolve) return getCREATE__TRG__trg_sys_component();
				return basicGetCREATE__TRG__trg_sys_component();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_TRG_TRG_SYS_PART:
				if (resolve) return getCREATE__TRG__trg_sys_part();
				return basicGetCREATE__TRG__trg_sys_part();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_CORR_ENTITY2COMPONENT:
				if (resolve) return getCREATE__CORR__entity2component();
				return basicGetCREATE__CORR__entity2component();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_CORR_OA2SA:
				if (resolve) return getCONTEXT__CORR__oa2sa();
				return basicGetCONTEXT__CORR__oa2sa();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_CORR_PART2PART:
				if (resolve) return getCREATE__CORR__part2part();
				return basicGetCREATE__CORR__part2part();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_SRC_SRC_ENTITY_PKG:
				setCONTEXT__SRC__src_entity_pkg((EntityPkg)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_SRC_SRC_OA_ARCH:
				setCONTEXT__SRC__src_oa_arch((OperationalAnalysis)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_SRC_SRC_OA_ENTITY:
				setCREATE__SRC__src_oa_entity((Entity)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_SRC_SRC_OA_PART:
				setCREATE__SRC__src_oa_part((Part)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_TRG_TRG_COMPONENET_PKG:
				setCONTEXT__TRG__trg_componenet_pkg((SystemComponentPkg)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_TRG_TRG_SA_ARCH:
				setCONTEXT__TRG__trg_sa_arch((SystemAnalysis)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_TRG_TRG_SYS_COMPONENT:
				setCREATE__TRG__trg_sys_component((SystemComponent)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_TRG_TRG_SYS_PART:
				setCREATE__TRG__trg_sys_part((Part)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_CORR_ENTITY2COMPONENT:
				setCREATE__CORR__entity2component((Entity2SystemComponent)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_CORR_OA2SA:
				setCONTEXT__CORR__oa2sa((Oa2Sa)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_CORR_PART2PART:
				setCREATE__CORR__part2part((OaPart2SaPart)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_SRC_SRC_ENTITY_PKG:
				setCONTEXT__SRC__src_entity_pkg((EntityPkg)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_SRC_SRC_OA_ARCH:
				setCONTEXT__SRC__src_oa_arch((OperationalAnalysis)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_SRC_SRC_OA_ENTITY:
				setCREATE__SRC__src_oa_entity((Entity)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_SRC_SRC_OA_PART:
				setCREATE__SRC__src_oa_part((Part)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_TRG_TRG_COMPONENET_PKG:
				setCONTEXT__TRG__trg_componenet_pkg((SystemComponentPkg)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_TRG_TRG_SA_ARCH:
				setCONTEXT__TRG__trg_sa_arch((SystemAnalysis)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_TRG_TRG_SYS_COMPONENT:
				setCREATE__TRG__trg_sys_component((SystemComponent)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_TRG_TRG_SYS_PART:
				setCREATE__TRG__trg_sys_part((Part)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_CORR_ENTITY2COMPONENT:
				setCREATE__CORR__entity2component((Entity2SystemComponent)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_CORR_OA2SA:
				setCONTEXT__CORR__oa2sa((Oa2Sa)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_CORR_PART2PART:
				setCREATE__CORR__part2part((OaPart2SaPart)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_SRC_SRC_ENTITY_PKG:
				return contexT__SRC__src_entity_pkg != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_SRC_SRC_OA_ARCH:
				return contexT__SRC__src_oa_arch != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_SRC_SRC_OA_ENTITY:
				return creatE__SRC__src_oa_entity != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_SRC_SRC_OA_PART:
				return creatE__SRC__src_oa_part != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_TRG_TRG_COMPONENET_PKG:
				return contexT__TRG__trg_componenet_pkg != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_TRG_TRG_SA_ARCH:
				return contexT__TRG__trg_sa_arch != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_TRG_TRG_SYS_COMPONENT:
				return creatE__TRG__trg_sys_component != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_TRG_TRG_SYS_PART:
				return creatE__TRG__trg_sys_part != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_CORR_ENTITY2COMPONENT:
				return creatE__CORR__entity2component != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_CORR_OA2SA:
				return contexT__CORR__oa2sa != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_CORR_PART2PART:
				return creatE__CORR__part2part != null;
		}
		return super.eIsSet(featureID);
	}

} //Oa2Sa_transition_actors__MarkerImpl
