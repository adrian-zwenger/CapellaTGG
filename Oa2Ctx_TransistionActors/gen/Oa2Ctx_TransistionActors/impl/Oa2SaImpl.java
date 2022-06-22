/**
 */
package Oa2Ctx_TransistionActors.impl;

import Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage;
import Oa2Ctx_TransistionActors.Oa2Sa;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.data.oa.OperationalAnalysis;

import runtime.impl.CorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oa2 Sa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2SaImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Oa2Ctx_TransistionActors.impl.Oa2SaImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Oa2SaImpl extends CorrespondenceNodeImpl implements Oa2Sa {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OperationalAnalysis source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected SystemAnalysis target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Oa2SaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Oa2Ctx_TransistionActorsPackage.Literals.OA2_SA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (OperationalAnalysis)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OperationalAnalysis newSource) {
		OperationalAnalysis oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (SystemAnalysis)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2Ctx_TransistionActorsPackage.OA2_SA__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(SystemAnalysis newTarget) {
		SystemAnalysis oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2Ctx_TransistionActorsPackage.OA2_SA__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Oa2Ctx_TransistionActorsPackage.OA2_SA__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Oa2Ctx_TransistionActorsPackage.OA2_SA__TARGET:
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
			case Oa2Ctx_TransistionActorsPackage.OA2_SA__SOURCE:
				setSource((OperationalAnalysis)newValue);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA__TARGET:
				setTarget((SystemAnalysis)newValue);
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
			case Oa2Ctx_TransistionActorsPackage.OA2_SA__SOURCE:
				setSource((OperationalAnalysis)null);
				return;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA__TARGET:
				setTarget((SystemAnalysis)null);
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
			case Oa2Ctx_TransistionActorsPackage.OA2_SA__SOURCE:
				return source != null;
			case Oa2Ctx_TransistionActorsPackage.OA2_SA__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //Oa2SaImpl
