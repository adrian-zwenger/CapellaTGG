/**
 */
package re.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import re.CompliancyDefinitionPkg;
import re.RePackage;
import re.RecCatalog;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rec Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link re.impl.RecCatalogImpl#getOwnedCompliancyDefinitionPkg <em>Owned Compliancy Definition Pkg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecCatalogImpl extends CatalogElementPkgImpl implements RecCatalog {
	/**
	 * The cached value of the '{@link #getOwnedCompliancyDefinitionPkg() <em>Owned Compliancy Definition Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCompliancyDefinitionPkg()
	 * @generated
	 * @ordered
	 */
	protected CompliancyDefinitionPkg ownedCompliancyDefinitionPkg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RePackage.Literals.REC_CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompliancyDefinitionPkg getOwnedCompliancyDefinitionPkg() {
		return ownedCompliancyDefinitionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedCompliancyDefinitionPkg(CompliancyDefinitionPkg newOwnedCompliancyDefinitionPkg, NotificationChain msgs) {
		CompliancyDefinitionPkg oldOwnedCompliancyDefinitionPkg = ownedCompliancyDefinitionPkg;
		ownedCompliancyDefinitionPkg = newOwnedCompliancyDefinitionPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RePackage.REC_CATALOG__OWNED_COMPLIANCY_DEFINITION_PKG, oldOwnedCompliancyDefinitionPkg, newOwnedCompliancyDefinitionPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedCompliancyDefinitionPkg(CompliancyDefinitionPkg newOwnedCompliancyDefinitionPkg) {
		if (newOwnedCompliancyDefinitionPkg != ownedCompliancyDefinitionPkg) {
			NotificationChain msgs = null;
			if (ownedCompliancyDefinitionPkg != null)
				msgs = ((InternalEObject)ownedCompliancyDefinitionPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RePackage.REC_CATALOG__OWNED_COMPLIANCY_DEFINITION_PKG, null, msgs);
			if (newOwnedCompliancyDefinitionPkg != null)
				msgs = ((InternalEObject)newOwnedCompliancyDefinitionPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RePackage.REC_CATALOG__OWNED_COMPLIANCY_DEFINITION_PKG, null, msgs);
			msgs = basicSetOwnedCompliancyDefinitionPkg(newOwnedCompliancyDefinitionPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RePackage.REC_CATALOG__OWNED_COMPLIANCY_DEFINITION_PKG, newOwnedCompliancyDefinitionPkg, newOwnedCompliancyDefinitionPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RePackage.REC_CATALOG__OWNED_COMPLIANCY_DEFINITION_PKG:
				return basicSetOwnedCompliancyDefinitionPkg(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RePackage.REC_CATALOG__OWNED_COMPLIANCY_DEFINITION_PKG:
				return getOwnedCompliancyDefinitionPkg();
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
			case RePackage.REC_CATALOG__OWNED_COMPLIANCY_DEFINITION_PKG:
				setOwnedCompliancyDefinitionPkg((CompliancyDefinitionPkg)newValue);
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
			case RePackage.REC_CATALOG__OWNED_COMPLIANCY_DEFINITION_PKG:
				setOwnedCompliancyDefinitionPkg((CompliancyDefinitionPkg)null);
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
			case RePackage.REC_CATALOG__OWNED_COMPLIANCY_DEFINITION_PKG:
				return ownedCompliancyDefinitionPkg != null;
		}
		return super.eIsSet(featureID);
	}

} //RecCatalogImpl
