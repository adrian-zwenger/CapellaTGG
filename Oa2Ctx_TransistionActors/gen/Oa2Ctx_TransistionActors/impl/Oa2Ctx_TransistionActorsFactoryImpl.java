/**
 */
package Oa2Ctx_TransistionActors.impl;

import Oa2Ctx_TransistionActors.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Oa2Ctx_TransistionActorsFactoryImpl extends EFactoryImpl implements Oa2Ctx_TransistionActorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Oa2Ctx_TransistionActorsFactory init() {
		try {
			Oa2Ctx_TransistionActorsFactory theOa2Ctx_TransistionActorsFactory = (Oa2Ctx_TransistionActorsFactory)EPackage.Registry.INSTANCE.getEFactory(Oa2Ctx_TransistionActorsPackage.eNS_URI);
			if (theOa2Ctx_TransistionActorsFactory != null) {
				return theOa2Ctx_TransistionActorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Oa2Ctx_TransistionActorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Ctx_TransistionActorsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Oa2Ctx_TransistionActorsPackage.OA2_SA: return createOa2Sa();
			case Oa2Ctx_TransistionActorsPackage.ENTITY2_SYSTEM_COMPONENT: return createEntity2SystemComponent();
			case Oa2Ctx_TransistionActorsPackage.OA_PART2_SA_PART: return createOaPart2SaPart();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER: return createOa2Sa_generation__Marker();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER: return createOa2Sa_transition_actors__Marker();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER: return createOa2Sa_transition_actors_recursively__Marker();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa createOa2Sa() {
		Oa2SaImpl oa2Sa = new Oa2SaImpl();
		return oa2Sa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity2SystemComponent createEntity2SystemComponent() {
		Entity2SystemComponentImpl entity2SystemComponent = new Entity2SystemComponentImpl();
		return entity2SystemComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OaPart2SaPart createOaPart2SaPart() {
		OaPart2SaPartImpl oaPart2SaPart = new OaPart2SaPartImpl();
		return oaPart2SaPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa_generation__Marker createOa2Sa_generation__Marker() {
		Oa2Sa_generation__MarkerImpl oa2Sa_generation__Marker = new Oa2Sa_generation__MarkerImpl();
		return oa2Sa_generation__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa_transition_actors__Marker createOa2Sa_transition_actors__Marker() {
		Oa2Sa_transition_actors__MarkerImpl oa2Sa_transition_actors__Marker = new Oa2Sa_transition_actors__MarkerImpl();
		return oa2Sa_transition_actors__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa_transition_actors_recursively__Marker createOa2Sa_transition_actors_recursively__Marker() {
		Oa2Sa_transition_actors_recursively__MarkerImpl oa2Sa_transition_actors_recursively__Marker = new Oa2Sa_transition_actors_recursively__MarkerImpl();
		return oa2Sa_transition_actors_recursively__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Ctx_TransistionActorsPackage getOa2Ctx_TransistionActorsPackage() {
		return (Oa2Ctx_TransistionActorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Oa2Ctx_TransistionActorsPackage getPackage() {
		return Oa2Ctx_TransistionActorsPackage.eINSTANCE;
	}

} //Oa2Ctx_TransistionActorsFactoryImpl
