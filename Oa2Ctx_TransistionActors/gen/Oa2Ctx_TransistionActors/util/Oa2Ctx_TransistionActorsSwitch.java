/**
 */
package Oa2Ctx_TransistionActors.util;

import Oa2Ctx_TransistionActors.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import runtime.CorrespondenceNode;
import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage
 * @generated
 */
public class Oa2Ctx_TransistionActorsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Oa2Ctx_TransistionActorsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Ctx_TransistionActorsSwitch() {
		if (modelPackage == null) {
			modelPackage = Oa2Ctx_TransistionActorsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Oa2Ctx_TransistionActorsPackage.OA2_SA: {
				Oa2Sa oa2Sa = (Oa2Sa)theEObject;
				T result = caseOa2Sa(oa2Sa);
				if (result == null) result = caseCorrespondenceNode(oa2Sa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Oa2Ctx_TransistionActorsPackage.ENTITY2_SYSTEM_COMPONENT: {
				Entity2SystemComponent entity2SystemComponent = (Entity2SystemComponent)theEObject;
				T result = caseEntity2SystemComponent(entity2SystemComponent);
				if (result == null) result = caseCorrespondenceNode(entity2SystemComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Oa2Ctx_TransistionActorsPackage.OA_PART2_SA_PART: {
				OaPart2SaPart oaPart2SaPart = (OaPart2SaPart)theEObject;
				T result = caseOaPart2SaPart(oaPart2SaPart);
				if (result == null) result = caseCorrespondenceNode(oaPart2SaPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_GENERATION_MARKER: {
				Oa2Sa_generation__Marker oa2Sa_generation__Marker = (Oa2Sa_generation__Marker)theEObject;
				T result = caseOa2Sa_generation__Marker(oa2Sa_generation__Marker);
				if (result == null) result = caseTGGRuleApplication(oa2Sa_generation__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_MARKER: {
				Oa2Sa_transition_actors__Marker oa2Sa_transition_actors__Marker = (Oa2Sa_transition_actors__Marker)theEObject;
				T result = caseOa2Sa_transition_actors__Marker(oa2Sa_transition_actors__Marker);
				if (result == null) result = caseTGGRuleApplication(oa2Sa_transition_actors__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Oa2Ctx_TransistionActorsPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER: {
				Oa2Sa_transition_actors_recursively__Marker oa2Sa_transition_actors_recursively__Marker = (Oa2Sa_transition_actors_recursively__Marker)theEObject;
				T result = caseOa2Sa_transition_actors_recursively__Marker(oa2Sa_transition_actors_recursively__Marker);
				if (result == null) result = caseTGGRuleApplication(oa2Sa_transition_actors_recursively__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oa2 Sa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oa2 Sa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOa2Sa(Oa2Sa object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity2 System Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity2 System Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity2SystemComponent(Entity2SystemComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oa Part2 Sa Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oa Part2 Sa Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOaPart2SaPart(OaPart2SaPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oa2 Sa generation Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oa2 Sa generation Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOa2Sa_generation__Marker(Oa2Sa_generation__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oa2 Sa transition actors Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oa2 Sa transition actors Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOa2Sa_transition_actors__Marker(Oa2Sa_transition_actors__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oa2 Sa transition actors recursively Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oa2 Sa transition actors recursively Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOa2Sa_transition_actors_recursively__Marker(Oa2Sa_transition_actors_recursively__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correspondence Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correspondence Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrespondenceNode(CorrespondenceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGG Rule Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGG Rule Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGGRuleApplication(TGGRuleApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Oa2Ctx_TransistionActorsSwitch
