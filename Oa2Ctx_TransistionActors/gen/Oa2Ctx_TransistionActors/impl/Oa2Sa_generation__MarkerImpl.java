/**
 */
package Oa2Ctx_TransistionActors.impl;

import Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage;
import Oa2Ctx_TransistionActors.Oa2Sa;
import Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.cs.Part;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.ctx.SystemComponentPkg;

import org.polarsys.capella.core.data.oa.EntityPkg;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oa2 Sa generation Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_generation__MarkerImpl#getCREATE__SRC__src_entity_pkg <em>CREATE SRC src entity pkg</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_generation__MarkerImpl#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_generation__MarkerImpl#getCREATE__TRG__trg_sa_arch <em>CREATE TRG trg sa arch</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_generation__MarkerImpl#getCREATE__TRG__trg_system_as_component <em>CREATE TRG trg system as component</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_generation__MarkerImpl#getCREATE__TRG__trg_system_as_part <em>CREATE TRG trg system as part</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_generation__MarkerImpl#getCREATE__TRG__trg_system_component_pkg <em>CREATE TRG trg system component pkg</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2Sa_generation__MarkerImpl#getCREATE__CORR__new_oa2sa <em>CREATE CORR new oa2sa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Oa2Sa_generation__MarkerImpl extends TGGRuleApplicationImpl implements Oa2Sa_generation__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__src_entity_pkg() <em>CREATE SRC src entity pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__src_entity_pkg()
	 * @generated
	 * @ordered
	 */
	protected EntityPkg creatE__SRC__src_entity_pkg;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__src_oa_arch() <em>CREATE SRC src oa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__src_oa_arch()
	 * @generated
	 * @ordered
	 */
	protected OperationalAnalysis creatE__SRC__src_oa_arch;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_sa_arch() <em>CREATE TRG trg sa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_sa_arch()
	 * @generated
	 * @ordered
	 */
	protected SystemAnalysis creatE__TRG__trg_sa_arch;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_system_as_component() <em>CREATE TRG trg system as component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_system_as_component()
	 * @generated
	 * @ordered
	 */
	protected SystemComponent creatE__TRG__trg_system_as_component;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_system_as_part() <em>CREATE TRG trg system as part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_system_as_part()
	 * @generated
	 * @ordered
	 */
	protected Part creatE__TRG__trg_system_as_part;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_system_component_pkg() <em>CREATE TRG trg system component pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_system_component_pkg()
	 * @generated
	 * @ordered
	 */
	protected SystemComponentPkg creatE__TRG__trg_system_component_pkg;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__new_oa2sa() <em>CREATE CORR new oa2sa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__new_oa2sa()
	 * @generated
	 * @ordered
	 */
	protected Oa2Sa creatE__CORR__new_oa2sa;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Oa2Sa_generation__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Oa2Ctx_TransistionActorsPackage.Literals.OA2_SA_GENERATION_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPkg getCREATE__SRC__src_entity_pkg() {
		if (creatE__SRC__src_entity_pkg != null && creatE__SRC__src_entity_pkg.eIsProxy()) {
			InternalEObject oldCREATE__SRC__src_entity_pkg = (InternalEObject)creatE__SRC__src_entity_pkg;
			creatE__SRC__src_entity_pkg = (EntityPkg)eResolveProxy(oldCREATE__SRC__src_entity_pkg);
			if (creatE__SRC__src_entity_pkg != oldCREATE__SRC__src_entity_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_ENTITY_PKG, oldCREATE__SRC__src_entity_pkg, creatE__SRC__src_entity_pkg));
			}
		}
		return creatE__SRC__src_entity_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPkg basicGetCREATE__SRC__src_entity_pkg() {
		return creatE__SRC__src_entity_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__src_entity_pkg(EntityPkg newCREATE__SRC__src_entity_pkg) {
		EntityPkg oldCREATE__SRC__src_entity_pkg = creatE__SRC__src_entity_pkg;
		creatE__SRC__src_entity_pkg = newCREATE__SRC__src_entity_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_ENTITY_PKG, oldCREATE__SRC__src_entity_pkg, creatE__SRC__src_entity_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis getCREATE__SRC__src_oa_arch() {
		if (creatE__SRC__src_oa_arch != null && creatE__SRC__src_oa_arch.eIsProxy()) {
			InternalEObject oldCREATE__SRC__src_oa_arch = (InternalEObject)creatE__SRC__src_oa_arch;
			creatE__SRC__src_oa_arch = (OperationalAnalysis)eResolveProxy(oldCREATE__SRC__src_oa_arch);
			if (creatE__SRC__src_oa_arch != oldCREATE__SRC__src_oa_arch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH, oldCREATE__SRC__src_oa_arch, creatE__SRC__src_oa_arch));
			}
		}
		return creatE__SRC__src_oa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis basicGetCREATE__SRC__src_oa_arch() {
		return creatE__SRC__src_oa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__src_oa_arch(OperationalAnalysis newCREATE__SRC__src_oa_arch) {
		OperationalAnalysis oldCREATE__SRC__src_oa_arch = creatE__SRC__src_oa_arch;
		creatE__SRC__src_oa_arch = newCREATE__SRC__src_oa_arch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH, oldCREATE__SRC__src_oa_arch, creatE__SRC__src_oa_arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis getCREATE__TRG__trg_sa_arch() {
		if (creatE__TRG__trg_sa_arch != null && creatE__TRG__trg_sa_arch.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_sa_arch = (InternalEObject)creatE__TRG__trg_sa_arch;
			creatE__TRG__trg_sa_arch = (SystemAnalysis)eResolveProxy(oldCREATE__TRG__trg_sa_arch);
			if (creatE__TRG__trg_sa_arch != oldCREATE__TRG__trg_sa_arch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH, oldCREATE__TRG__trg_sa_arch, creatE__TRG__trg_sa_arch));
			}
		}
		return creatE__TRG__trg_sa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis basicGetCREATE__TRG__trg_sa_arch() {
		return creatE__TRG__trg_sa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_sa_arch(SystemAnalysis newCREATE__TRG__trg_sa_arch) {
		SystemAnalysis oldCREATE__TRG__trg_sa_arch = creatE__TRG__trg_sa_arch;
		creatE__TRG__trg_sa_arch = newCREATE__TRG__trg_sa_arch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH, oldCREATE__TRG__trg_sa_arch, creatE__TRG__trg_sa_arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponent getCREATE__TRG__trg_system_as_component() {
		if (creatE__TRG__trg_system_as_component != null && creatE__TRG__trg_system_as_component.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_system_as_component = (InternalEObject)creatE__TRG__trg_system_as_component;
			creatE__TRG__trg_system_as_component = (SystemComponent)eResolveProxy(oldCREATE__TRG__trg_system_as_component);
			if (creatE__TRG__trg_system_as_component != oldCREATE__TRG__trg_system_as_component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_AS_COMPONENT, oldCREATE__TRG__trg_system_as_component, creatE__TRG__trg_system_as_component));
			}
		}
		return creatE__TRG__trg_system_as_component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponent basicGetCREATE__TRG__trg_system_as_component() {
		return creatE__TRG__trg_system_as_component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_system_as_component(SystemComponent newCREATE__TRG__trg_system_as_component) {
		SystemComponent oldCREATE__TRG__trg_system_as_component = creatE__TRG__trg_system_as_component;
		creatE__TRG__trg_system_as_component = newCREATE__TRG__trg_system_as_component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_AS_COMPONENT, oldCREATE__TRG__trg_system_as_component, creatE__TRG__trg_system_as_component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part getCREATE__TRG__trg_system_as_part() {
		if (creatE__TRG__trg_system_as_part != null && creatE__TRG__trg_system_as_part.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_system_as_part = (InternalEObject)creatE__TRG__trg_system_as_part;
			creatE__TRG__trg_system_as_part = (Part)eResolveProxy(oldCREATE__TRG__trg_system_as_part);
			if (creatE__TRG__trg_system_as_part != oldCREATE__TRG__trg_system_as_part) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_AS_PART, oldCREATE__TRG__trg_system_as_part, creatE__TRG__trg_system_as_part));
			}
		}
		return creatE__TRG__trg_system_as_part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetCREATE__TRG__trg_system_as_part() {
		return creatE__TRG__trg_system_as_part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_system_as_part(Part newCREATE__TRG__trg_system_as_part) {
		Part oldCREATE__TRG__trg_system_as_part = creatE__TRG__trg_system_as_part;
		creatE__TRG__trg_system_as_part = newCREATE__TRG__trg_system_as_part;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_AS_PART, oldCREATE__TRG__trg_system_as_part, creatE__TRG__trg_system_as_part));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentPkg getCREATE__TRG__trg_system_component_pkg() {
		if (creatE__TRG__trg_system_component_pkg != null && creatE__TRG__trg_system_component_pkg.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_system_component_pkg = (InternalEObject)creatE__TRG__trg_system_component_pkg;
			creatE__TRG__trg_system_component_pkg = (SystemComponentPkg)eResolveProxy(oldCREATE__TRG__trg_system_component_pkg);
			if (creatE__TRG__trg_system_component_pkg != oldCREATE__TRG__trg_system_component_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_COMPONENT_PKG, oldCREATE__TRG__trg_system_component_pkg, creatE__TRG__trg_system_component_pkg));
			}
		}
		return creatE__TRG__trg_system_component_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentPkg basicGetCREATE__TRG__trg_system_component_pkg() {
		return creatE__TRG__trg_system_component_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_system_component_pkg(SystemComponentPkg newCREATE__TRG__trg_system_component_pkg) {
		SystemComponentPkg oldCREATE__TRG__trg_system_component_pkg = creatE__TRG__trg_system_component_pkg;
		creatE__TRG__trg_system_component_pkg = newCREATE__TRG__trg_system_component_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_COMPONENT_PKG, oldCREATE__TRG__trg_system_component_pkg, creatE__TRG__trg_system_component_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa getCREATE__CORR__new_oa2sa() {
		if (creatE__CORR__new_oa2sa != null && creatE__CORR__new_oa2sa.eIsProxy()) {
			InternalEObject oldCREATE__CORR__new_oa2sa = (InternalEObject)creatE__CORR__new_oa2sa;
			creatE__CORR__new_oa2sa = (Oa2Sa)eResolveProxy(oldCREATE__CORR__new_oa2sa);
			if (creatE__CORR__new_oa2sa != oldCREATE__CORR__new_oa2sa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA, oldCREATE__CORR__new_oa2sa, creatE__CORR__new_oa2sa));
			}
		}
		return creatE__CORR__new_oa2sa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa basicGetCREATE__CORR__new_oa2sa() {
		return creatE__CORR__new_oa2sa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__new_oa2sa(Oa2Sa newCREATE__CORR__new_oa2sa) {
		Oa2Sa oldCREATE__CORR__new_oa2sa = creatE__CORR__new_oa2sa;
		creatE__CORR__new_oa2sa = newCREATE__CORR__new_oa2sa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA, oldCREATE__CORR__new_oa2sa, creatE__CORR__new_oa2sa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_ENTITY_PKG:
				if (resolve) return getCREATE__SRC__src_entity_pkg();
				return basicGetCREATE__SRC__src_entity_pkg();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH:
				if (resolve) return getCREATE__SRC__src_oa_arch();
				return basicGetCREATE__SRC__src_oa_arch();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH:
				if (resolve) return getCREATE__TRG__trg_sa_arch();
				return basicGetCREATE__TRG__trg_sa_arch();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_AS_COMPONENT:
				if (resolve) return getCREATE__TRG__trg_system_as_component();
				return basicGetCREATE__TRG__trg_system_as_component();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_AS_PART:
				if (resolve) return getCREATE__TRG__trg_system_as_part();
				return basicGetCREATE__TRG__trg_system_as_part();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_COMPONENT_PKG:
				if (resolve) return getCREATE__TRG__trg_system_component_pkg();
				return basicGetCREATE__TRG__trg_system_component_pkg();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA:
				if (resolve) return getCREATE__CORR__new_oa2sa();
				return basicGetCREATE__CORR__new_oa2sa();
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
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_ENTITY_PKG:
				setCREATE__SRC__src_entity_pkg((EntityPkg)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH:
				setCREATE__SRC__src_oa_arch((OperationalAnalysis)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH:
				setCREATE__TRG__trg_sa_arch((SystemAnalysis)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_AS_COMPONENT:
				setCREATE__TRG__trg_system_as_component((SystemComponent)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_AS_PART:
				setCREATE__TRG__trg_system_as_part((Part)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_COMPONENT_PKG:
				setCREATE__TRG__trg_system_component_pkg((SystemComponentPkg)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA:
				setCREATE__CORR__new_oa2sa((Oa2Sa)newValue);
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
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_ENTITY_PKG:
				setCREATE__SRC__src_entity_pkg((EntityPkg)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH:
				setCREATE__SRC__src_oa_arch((OperationalAnalysis)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH:
				setCREATE__TRG__trg_sa_arch((SystemAnalysis)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_AS_COMPONENT:
				setCREATE__TRG__trg_system_as_component((SystemComponent)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_AS_PART:
				setCREATE__TRG__trg_system_as_part((Part)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_COMPONENT_PKG:
				setCREATE__TRG__trg_system_component_pkg((SystemComponentPkg)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA:
				setCREATE__CORR__new_oa2sa((Oa2Sa)null);
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
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_ENTITY_PKG:
				return creatE__SRC__src_entity_pkg != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH:
				return creatE__SRC__src_oa_arch != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH:
				return creatE__TRG__trg_sa_arch != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_AS_COMPONENT:
				return creatE__TRG__trg_system_as_component != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_AS_PART:
				return creatE__TRG__trg_system_as_part != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_COMPONENT_PKG:
				return creatE__TRG__trg_system_component_pkg != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA:
				return creatE__CORR__new_oa2sa != null;
		}
		return super.eIsSet(featureID);
	}

} //Oa2Sa_generation__MarkerImpl
