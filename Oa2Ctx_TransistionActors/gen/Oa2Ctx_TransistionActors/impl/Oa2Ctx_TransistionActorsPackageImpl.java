/**
 */
package Oa2Ctx_TransistionActors.impl;

import Oa2Ctx_TransistionActors.Entity2SystemComponent;
import Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsFactory;
import Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage;
import Oa2Ctx_TransistionActors.Oa2Sa;
import Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker;
import Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker;
import Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker;
import Oa2Ctx_TransistionActors.OaPart2SaPart;

import behavior.BehaviorPackage;

import modellingcore.ModellingcorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.capella.common.data.activity.ActivityPackage;

import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;

import org.polarsys.capella.core.data.cs.CsPackage;

import org.polarsys.capella.core.data.ctx.CtxPackage;

import org.polarsys.capella.core.data.epbs.EpbsPackage;

import org.polarsys.capella.core.data.fa.FaPackage;

import org.polarsys.capella.core.data.information.InformationPackage;

import org.polarsys.capella.core.data.information.communication.CommunicationPackage;

import org.polarsys.capella.core.data.information.datatype.DatatypePackage;

import org.polarsys.capella.core.data.information.datavalue.DatavaluePackage;

import org.polarsys.capella.core.data.interaction.InteractionPackage;

import org.polarsys.capella.core.data.la.LaPackage;

import org.polarsys.capella.core.data.oa.OaPackage;

import org.polarsys.capella.core.data.pa.PaPackage;

import org.polarsys.capella.core.data.pa.deployment.DeploymentPackage;

import org.polarsys.capella.core.data.requirement.RequirementPackage;

import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;

import org.polarsys.kitalpha.emde.model.EmdePackage;

import runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Oa2Ctx_TransistionActorsPackageImpl extends EPackageImpl implements Oa2Ctx_TransistionActorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oa2SaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entity2SystemComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oaPart2SaPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oa2Sa_generation__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oa2Sa_transition_actors__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oa2Sa_transition_actors_recursively__MarkerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Oa2Ctx_TransistionActorsPackageImpl() {
		super(eNS_URI, Oa2Ctx_TransistionActorsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Oa2Ctx_TransistionActorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Oa2Ctx_TransistionActorsPackage init() {
		if (isInited) return (Oa2Ctx_TransistionActorsPackage)EPackage.Registry.INSTANCE.getEPackage(Oa2Ctx_TransistionActorsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOa2Ctx_TransistionActorsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Oa2Ctx_TransistionActorsPackageImpl theOa2Ctx_TransistionActorsPackage = registeredOa2Ctx_TransistionActorsPackage instanceof Oa2Ctx_TransistionActorsPackageImpl ? (Oa2Ctx_TransistionActorsPackageImpl)registeredOa2Ctx_TransistionActorsPackage : new Oa2Ctx_TransistionActorsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CapellamodellerPackage.eINSTANCE.eClass();
		CapellamodellerPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();
		CapellamodellerPackage.eINSTANCE.eClass();
		OaPackage.eINSTANCE.eClass();
		CtxPackage.eINSTANCE.eClass();
		CsPackage.eINSTANCE.eClass();
		CapellacorePackage.eINSTANCE.eClass();
		EmdePackage.eINSTANCE.eClass();
		ModellingcorePackage.eINSTANCE.eClass();
		LaPackage.eINSTANCE.eClass();
		PaPackage.eINSTANCE.eClass();
		EpbsPackage.eINSTANCE.eClass();
		SharedmodelPackage.eINSTANCE.eClass();
		FaPackage.eINSTANCE.eClass();
		InformationPackage.eINSTANCE.eClass();
		ActivityPackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();
		CapellacommonPackage.eINSTANCE.eClass();
		InteractionPackage.eINSTANCE.eClass();
		CommunicationPackage.eINSTANCE.eClass();
		RequirementPackage.eINSTANCE.eClass();
		DeploymentPackage.eINSTANCE.eClass();
		DatavaluePackage.eINSTANCE.eClass();
		DatatypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOa2Ctx_TransistionActorsPackage.createPackageContents();

		// Initialize created meta-data
		theOa2Ctx_TransistionActorsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOa2Ctx_TransistionActorsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Oa2Ctx_TransistionActorsPackage.eNS_URI, theOa2Ctx_TransistionActorsPackage);
		return theOa2Ctx_TransistionActorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOa2Sa() {
		return oa2SaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_Source() {
		return (EReference)oa2SaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_Target() {
		return (EReference)oa2SaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity2SystemComponent() {
		return entity2SystemComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity2SystemComponent_Source() {
		return (EReference)entity2SystemComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity2SystemComponent_Target() {
		return (EReference)entity2SystemComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOaPart2SaPart() {
		return oaPart2SaPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOaPart2SaPart_Source() {
		return (EReference)oaPart2SaPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOaPart2SaPart_Target() {
		return (EReference)oaPart2SaPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOa2Sa_generation__Marker() {
		return oa2Sa_generation__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_generation__Marker_CREATE__SRC__src_entity_pkg() {
		return (EReference)oa2Sa_generation__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_generation__Marker_CREATE__SRC__src_oa_arch() {
		return (EReference)oa2Sa_generation__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_generation__Marker_CREATE__TRG__trg_sa_arch() {
		return (EReference)oa2Sa_generation__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_generation__Marker_CREATE__TRG__trg_system_as_component() {
		return (EReference)oa2Sa_generation__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_generation__Marker_CREATE__TRG__trg_system_as_part() {
		return (EReference)oa2Sa_generation__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_generation__Marker_CREATE__TRG__trg_system_component_pkg() {
		return (EReference)oa2Sa_generation__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_generation__Marker_CREATE__CORR__new_oa2sa() {
		return (EReference)oa2Sa_generation__MarkerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOa2Sa_transition_actors__Marker() {
		return oa2Sa_transition_actors__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors__Marker_CONTEXT__SRC__src_entity_pkg() {
		return (EReference)oa2Sa_transition_actors__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors__Marker_CONTEXT__SRC__src_oa_arch() {
		return (EReference)oa2Sa_transition_actors__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors__Marker_CREATE__SRC__src_oa_entity() {
		return (EReference)oa2Sa_transition_actors__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors__Marker_CREATE__SRC__src_oa_part() {
		return (EReference)oa2Sa_transition_actors__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors__Marker_CONTEXT__TRG__trg_componenet_pkg() {
		return (EReference)oa2Sa_transition_actors__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors__Marker_CONTEXT__TRG__trg_sa_arch() {
		return (EReference)oa2Sa_transition_actors__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors__Marker_CREATE__TRG__trg_sys_component() {
		return (EReference)oa2Sa_transition_actors__MarkerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors__Marker_CREATE__TRG__trg_sys_part() {
		return (EReference)oa2Sa_transition_actors__MarkerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors__Marker_CREATE__CORR__entity2component() {
		return (EReference)oa2Sa_transition_actors__MarkerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors__Marker_CONTEXT__CORR__oa2sa() {
		return (EReference)oa2Sa_transition_actors__MarkerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors__Marker_CREATE__CORR__part2part() {
		return (EReference)oa2Sa_transition_actors__MarkerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOa2Sa_transition_actors_recursively__Marker() {
		return oa2Sa_transition_actors_recursively__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors_recursively__Marker_CREATE__SRC__src_operational_entity() {
		return (EReference)oa2Sa_transition_actors_recursively__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors_recursively__Marker_CREATE__SRC__src_operational_part() {
		return (EReference)oa2Sa_transition_actors_recursively__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors_recursively__Marker_CONTEXT__SRC__src_top_level_entity() {
		return (EReference)oa2Sa_transition_actors_recursively__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors_recursively__Marker_CONTEXT__TRG__trg_sa_arch() {
		return (EReference)oa2Sa_transition_actors_recursively__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors_recursively__Marker_CREATE__TRG__trg_system_component() {
		return (EReference)oa2Sa_transition_actors_recursively__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors_recursively__Marker_CONTEXT__TRG__trg_system_component_pkg() {
		return (EReference)oa2Sa_transition_actors_recursively__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors_recursively__Marker_CREATE__TRG__trg_system_part() {
		return (EReference)oa2Sa_transition_actors_recursively__MarkerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors_recursively__Marker_CREATE__CORR__OaEntity2SaSysComponent() {
		return (EReference)oa2Sa_transition_actors_recursively__MarkerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_transition_actors_recursively__Marker_CREATE__CORR__part2part() {
		return (EReference)oa2Sa_transition_actors_recursively__MarkerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Ctx_TransistionActorsFactory getOa2Ctx_TransistionActorsFactory() {
		return (Oa2Ctx_TransistionActorsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		oa2SaEClass = createEClass(OA2_SA);
		createEReference(oa2SaEClass, OA2_SA__SOURCE);
		createEReference(oa2SaEClass, OA2_SA__TARGET);

		entity2SystemComponentEClass = createEClass(ENTITY2_SYSTEM_COMPONENT);
		createEReference(entity2SystemComponentEClass, ENTITY2_SYSTEM_COMPONENT__SOURCE);
		createEReference(entity2SystemComponentEClass, ENTITY2_SYSTEM_COMPONENT__TARGET);

		oaPart2SaPartEClass = createEClass(OA_PART2_SA_PART);
		createEReference(oaPart2SaPartEClass, OA_PART2_SA_PART__SOURCE);
		createEReference(oaPart2SaPartEClass, OA_PART2_SA_PART__TARGET);

		oa2Sa_generation__MarkerEClass = createEClass(OA2_SA_GENERATION_MARKER);
		createEReference(oa2Sa_generation__MarkerEClass, OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_ENTITY_PKG);
		createEReference(oa2Sa_generation__MarkerEClass, OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH);
		createEReference(oa2Sa_generation__MarkerEClass, OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH);
		createEReference(oa2Sa_generation__MarkerEClass, OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_AS_COMPONENT);
		createEReference(oa2Sa_generation__MarkerEClass, OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_AS_PART);
		createEReference(oa2Sa_generation__MarkerEClass, OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SYSTEM_COMPONENT_PKG);
		createEReference(oa2Sa_generation__MarkerEClass, OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA);

		oa2Sa_transition_actors__MarkerEClass = createEClass(OA2_SA_TRANSITION_ACTORS_MARKER);
		createEReference(oa2Sa_transition_actors__MarkerEClass, OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_SRC_SRC_ENTITY_PKG);
		createEReference(oa2Sa_transition_actors__MarkerEClass, OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_SRC_SRC_OA_ARCH);
		createEReference(oa2Sa_transition_actors__MarkerEClass, OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_SRC_SRC_OA_ENTITY);
		createEReference(oa2Sa_transition_actors__MarkerEClass, OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_SRC_SRC_OA_PART);
		createEReference(oa2Sa_transition_actors__MarkerEClass, OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_TRG_TRG_COMPONENET_PKG);
		createEReference(oa2Sa_transition_actors__MarkerEClass, OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_TRG_TRG_SA_ARCH);
		createEReference(oa2Sa_transition_actors__MarkerEClass, OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_TRG_TRG_SYS_COMPONENT);
		createEReference(oa2Sa_transition_actors__MarkerEClass, OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_TRG_TRG_SYS_PART);
		createEReference(oa2Sa_transition_actors__MarkerEClass, OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_CORR_ENTITY2COMPONENT);
		createEReference(oa2Sa_transition_actors__MarkerEClass, OA2_SA_TRANSITION_ACTORS_MARKER__CONTEXT_CORR_OA2SA);
		createEReference(oa2Sa_transition_actors__MarkerEClass, OA2_SA_TRANSITION_ACTORS_MARKER__CREATE_CORR_PART2PART);

		oa2Sa_transition_actors_recursively__MarkerEClass = createEClass(OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER);
		createEReference(oa2Sa_transition_actors_recursively__MarkerEClass, OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_SRC_SRC_OPERATIONAL_ENTITY);
		createEReference(oa2Sa_transition_actors_recursively__MarkerEClass, OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_SRC_SRC_OPERATIONAL_PART);
		createEReference(oa2Sa_transition_actors_recursively__MarkerEClass, OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_SRC_SRC_TOP_LEVEL_ENTITY);
		createEReference(oa2Sa_transition_actors_recursively__MarkerEClass, OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_TRG_TRG_SA_ARCH);
		createEReference(oa2Sa_transition_actors_recursively__MarkerEClass, OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_TRG_TRG_SYSTEM_COMPONENT);
		createEReference(oa2Sa_transition_actors_recursively__MarkerEClass, OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_TRG_TRG_SYSTEM_COMPONENT_PKG);
		createEReference(oa2Sa_transition_actors_recursively__MarkerEClass, OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_TRG_TRG_SYSTEM_PART);
		createEReference(oa2Sa_transition_actors_recursively__MarkerEClass, OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_CORR_OA_ENTITY2_SA_SYS_COMPONENT);
		createEReference(oa2Sa_transition_actors_recursively__MarkerEClass, OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_CORR_PART2PART);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);
		OaPackage theOaPackage = (OaPackage)EPackage.Registry.INSTANCE.getEPackage(OaPackage.eNS_URI);
		CtxPackage theCtxPackage = (CtxPackage)EPackage.Registry.INSTANCE.getEPackage(CtxPackage.eNS_URI);
		CsPackage theCsPackage = (CsPackage)EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		oa2SaEClass.getESuperTypes().add(theRuntimePackage.getCorrespondenceNode());
		entity2SystemComponentEClass.getESuperTypes().add(theRuntimePackage.getCorrespondenceNode());
		oaPart2SaPartEClass.getESuperTypes().add(theRuntimePackage.getCorrespondenceNode());
		oa2Sa_generation__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		oa2Sa_transition_actors__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		oa2Sa_transition_actors_recursively__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());

		// Initialize classes, features, and operations; add parameters
		initEClass(oa2SaEClass, Oa2Sa.class, "Oa2Sa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOa2Sa_Source(), theOaPackage.getOperationalAnalysis(), null, "source", null, 0, 1, Oa2Sa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_Target(), theCtxPackage.getSystemAnalysis(), null, "target", null, 0, 1, Oa2Sa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entity2SystemComponentEClass, Entity2SystemComponent.class, "Entity2SystemComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity2SystemComponent_Source(), theOaPackage.getEntity(), null, "source", null, 0, 1, Entity2SystemComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity2SystemComponent_Target(), theCtxPackage.getSystemComponent(), null, "target", null, 0, 1, Entity2SystemComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oaPart2SaPartEClass, OaPart2SaPart.class, "OaPart2SaPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOaPart2SaPart_Source(), theCsPackage.getPart(), null, "source", null, 0, 1, OaPart2SaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOaPart2SaPart_Target(), theCsPackage.getPart(), null, "target", null, 0, 1, OaPart2SaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oa2Sa_generation__MarkerEClass, Oa2Sa_generation__Marker.class, "Oa2Sa_generation__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOa2Sa_generation__Marker_CREATE__SRC__src_entity_pkg(), theOaPackage.getEntityPkg(), null, "CREATE__SRC__src_entity_pkg", null, 1, 1, Oa2Sa_generation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_generation__Marker_CREATE__SRC__src_oa_arch(), theOaPackage.getOperationalAnalysis(), null, "CREATE__SRC__src_oa_arch", null, 1, 1, Oa2Sa_generation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_generation__Marker_CREATE__TRG__trg_sa_arch(), theCtxPackage.getSystemAnalysis(), null, "CREATE__TRG__trg_sa_arch", null, 1, 1, Oa2Sa_generation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_generation__Marker_CREATE__TRG__trg_system_as_component(), theCtxPackage.getSystemComponent(), null, "CREATE__TRG__trg_system_as_component", null, 1, 1, Oa2Sa_generation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_generation__Marker_CREATE__TRG__trg_system_as_part(), theCsPackage.getPart(), null, "CREATE__TRG__trg_system_as_part", null, 1, 1, Oa2Sa_generation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_generation__Marker_CREATE__TRG__trg_system_component_pkg(), theCtxPackage.getSystemComponentPkg(), null, "CREATE__TRG__trg_system_component_pkg", null, 1, 1, Oa2Sa_generation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_generation__Marker_CREATE__CORR__new_oa2sa(), this.getOa2Sa(), null, "CREATE__CORR__new_oa2sa", null, 1, 1, Oa2Sa_generation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oa2Sa_transition_actors__MarkerEClass, Oa2Sa_transition_actors__Marker.class, "Oa2Sa_transition_actors__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOa2Sa_transition_actors__Marker_CONTEXT__SRC__src_entity_pkg(), theOaPackage.getEntityPkg(), null, "CONTEXT__SRC__src_entity_pkg", null, 1, 1, Oa2Sa_transition_actors__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors__Marker_CONTEXT__SRC__src_oa_arch(), theOaPackage.getOperationalAnalysis(), null, "CONTEXT__SRC__src_oa_arch", null, 1, 1, Oa2Sa_transition_actors__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors__Marker_CREATE__SRC__src_oa_entity(), theOaPackage.getEntity(), null, "CREATE__SRC__src_oa_entity", null, 1, 1, Oa2Sa_transition_actors__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors__Marker_CREATE__SRC__src_oa_part(), theCsPackage.getPart(), null, "CREATE__SRC__src_oa_part", null, 1, 1, Oa2Sa_transition_actors__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors__Marker_CONTEXT__TRG__trg_componenet_pkg(), theCtxPackage.getSystemComponentPkg(), null, "CONTEXT__TRG__trg_componenet_pkg", null, 1, 1, Oa2Sa_transition_actors__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors__Marker_CONTEXT__TRG__trg_sa_arch(), theCtxPackage.getSystemAnalysis(), null, "CONTEXT__TRG__trg_sa_arch", null, 1, 1, Oa2Sa_transition_actors__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors__Marker_CREATE__TRG__trg_sys_component(), theCtxPackage.getSystemComponent(), null, "CREATE__TRG__trg_sys_component", null, 1, 1, Oa2Sa_transition_actors__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors__Marker_CREATE__TRG__trg_sys_part(), theCsPackage.getPart(), null, "CREATE__TRG__trg_sys_part", null, 1, 1, Oa2Sa_transition_actors__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors__Marker_CREATE__CORR__entity2component(), this.getEntity2SystemComponent(), null, "CREATE__CORR__entity2component", null, 1, 1, Oa2Sa_transition_actors__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors__Marker_CONTEXT__CORR__oa2sa(), this.getOa2Sa(), null, "CONTEXT__CORR__oa2sa", null, 1, 1, Oa2Sa_transition_actors__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors__Marker_CREATE__CORR__part2part(), this.getOaPart2SaPart(), null, "CREATE__CORR__part2part", null, 1, 1, Oa2Sa_transition_actors__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oa2Sa_transition_actors_recursively__MarkerEClass, Oa2Sa_transition_actors_recursively__Marker.class, "Oa2Sa_transition_actors_recursively__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOa2Sa_transition_actors_recursively__Marker_CREATE__SRC__src_operational_entity(), theOaPackage.getEntity(), null, "CREATE__SRC__src_operational_entity", null, 1, 1, Oa2Sa_transition_actors_recursively__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors_recursively__Marker_CREATE__SRC__src_operational_part(), theCsPackage.getPart(), null, "CREATE__SRC__src_operational_part", null, 1, 1, Oa2Sa_transition_actors_recursively__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors_recursively__Marker_CONTEXT__SRC__src_top_level_entity(), theOaPackage.getEntity(), null, "CONTEXT__SRC__src_top_level_entity", null, 1, 1, Oa2Sa_transition_actors_recursively__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors_recursively__Marker_CONTEXT__TRG__trg_sa_arch(), theCtxPackage.getSystemAnalysis(), null, "CONTEXT__TRG__trg_sa_arch", null, 1, 1, Oa2Sa_transition_actors_recursively__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors_recursively__Marker_CREATE__TRG__trg_system_component(), theCtxPackage.getSystemComponent(), null, "CREATE__TRG__trg_system_component", null, 1, 1, Oa2Sa_transition_actors_recursively__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors_recursively__Marker_CONTEXT__TRG__trg_system_component_pkg(), theCtxPackage.getSystemComponentPkg(), null, "CONTEXT__TRG__trg_system_component_pkg", null, 1, 1, Oa2Sa_transition_actors_recursively__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors_recursively__Marker_CREATE__TRG__trg_system_part(), theCsPackage.getPart(), null, "CREATE__TRG__trg_system_part", null, 1, 1, Oa2Sa_transition_actors_recursively__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors_recursively__Marker_CREATE__CORR__OaEntity2SaSysComponent(), this.getEntity2SystemComponent(), null, "CREATE__CORR__OaEntity2SaSysComponent", null, 1, 1, Oa2Sa_transition_actors_recursively__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_transition_actors_recursively__Marker_CREATE__CORR__part2part(), this.getOaPart2SaPart(), null, "CREATE__CORR__part2part", null, 1, 1, Oa2Sa_transition_actors_recursively__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Oa2Ctx_TransistionActorsPackageImpl
