/**
 */
package Oa2Ctx_TransistionActors.impl;

import Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage;
import Oa2Ctx_TransistionActors.OaPart2SaPart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.cs.Part;

import runtime.impl.CorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oa Part2 Sa Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.OaPart2SaPartImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.OaPart2SaPartImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OaPart2SaPartImpl extends CorrespondenceNodeImpl implements OaPart2SaPart {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Part source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Part target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OaPart2SaPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Oa2Ctx_TransistionActorsPackage.Literals.OA_PART2_SA_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Part)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA_PART2_SA_PART__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Part newSource) {
		Part oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA_PART2_SA_PART__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Part)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA_PART2_SA_PART__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Part newTarget) {
		Part oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA_PART2_SA_PART__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Oa2Ctx_TransistionActorsPackage.OA_PART2_SA_PART__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Oa2Ctx_TransistionActorsPackage.OA_PART2_SA_PART__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case Oa2Ctx_TransistionActorsPackage.OA_PART2_SA_PART__SOURCE:
				setSource((Part)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA_PART2_SA_PART__TARGET:
				setTarget((Part)newValue);
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
			case Oa2Ctx_TransistionActorsPackage.OA_PART2_SA_PART__SOURCE:
				setSource((Part)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA_PART2_SA_PART__TARGET:
				setTarget((Part)null);
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
			case Oa2Ctx_TransistionActorsPackage.OA_PART2_SA_PART__SOURCE:
				return source != null;
			case Oa2Ctx_TransistionActorsPackage.OA_PART2_SA_PART__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //OaPart2SaPartImpl
