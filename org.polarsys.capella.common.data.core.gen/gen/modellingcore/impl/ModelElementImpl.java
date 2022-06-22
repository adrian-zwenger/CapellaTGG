/**
 */
package modellingcore.impl;

import java.util.Collection;

import modellingcore.AbstractConstraint;
import modellingcore.ModelElement;
import modellingcore.ModellingcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.emde.model.impl.ExtensibleElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modellingcore.impl.ModelElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link modellingcore.impl.ModelElementImpl#getSid <em>Sid</em>}</li>
 *   <li>{@link modellingcore.impl.ModelElementImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link modellingcore.impl.ModelElementImpl#getOwnedConstraints <em>Owned Constraints</em>}</li>
 *   <li>{@link modellingcore.impl.ModelElementImpl#getOwnedMigratedElements <em>Owned Migrated Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends ExtensibleElementImpl implements ModelElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSid() <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSid()
	 * @generated
	 * @ordered
	 */
	protected static final String SID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSid() <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSid()
	 * @generated
	 * @ordered
	 */
	protected String sid = SID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConstraint> constraints;

	/**
	 * The cached value of the '{@link #getOwnedConstraints() <em>Owned Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConstraint> ownedConstraints;

	/**
	 * The cached value of the '{@link #getOwnedMigratedElements() <em>Owned Migrated Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMigratedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> ownedMigratedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModellingcorePackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModellingcorePackage.MODEL_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSid() {
		return sid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSid(String newSid) {
		String oldSid = sid;
		sid = newSid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModellingcorePackage.MODEL_ELEMENT__SID, oldSid, sid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectResolvingEList<AbstractConstraint>(AbstractConstraint.class, this, ModellingcorePackage.MODEL_ELEMENT__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConstraint> getOwnedConstraints() {
		if (ownedConstraints == null) {
			ownedConstraints = new EObjectContainmentEList<AbstractConstraint>(AbstractConstraint.class, this, ModellingcorePackage.MODEL_ELEMENT__OWNED_CONSTRAINTS);
		}
		return ownedConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getOwnedMigratedElements() {
		if (ownedMigratedElements == null) {
			ownedMigratedElements = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, ModellingcorePackage.MODEL_ELEMENT__OWNED_MIGRATED_ELEMENTS);
		}
		return ownedMigratedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModellingcorePackage.MODEL_ELEMENT__OWNED_CONSTRAINTS:
				return ((InternalEList<?>)getOwnedConstraints()).basicRemove(otherEnd, msgs);
			case ModellingcorePackage.MODEL_ELEMENT__OWNED_MIGRATED_ELEMENTS:
				return ((InternalEList<?>)getOwnedMigratedElements()).basicRemove(otherEnd, msgs);
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
			case ModellingcorePackage.MODEL_ELEMENT__ID:
				return getId();
			case ModellingcorePackage.MODEL_ELEMENT__SID:
				return getSid();
			case ModellingcorePackage.MODEL_ELEMENT__CONSTRAINTS:
				return getConstraints();
			case ModellingcorePackage.MODEL_ELEMENT__OWNED_CONSTRAINTS:
				return getOwnedConstraints();
			case ModellingcorePackage.MODEL_ELEMENT__OWNED_MIGRATED_ELEMENTS:
				return getOwnedMigratedElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModellingcorePackage.MODEL_ELEMENT__ID:
				setId((String)newValue);
				return;
			case ModellingcorePackage.MODEL_ELEMENT__SID:
				setSid((String)newValue);
				return;
			case ModellingcorePackage.MODEL_ELEMENT__OWNED_CONSTRAINTS:
				getOwnedConstraints().clear();
				getOwnedConstraints().addAll((Collection<? extends AbstractConstraint>)newValue);
				return;
			case ModellingcorePackage.MODEL_ELEMENT__OWNED_MIGRATED_ELEMENTS:
				getOwnedMigratedElements().clear();
				getOwnedMigratedElements().addAll((Collection<? extends ModelElement>)newValue);
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
			case ModellingcorePackage.MODEL_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case ModellingcorePackage.MODEL_ELEMENT__SID:
				setSid(SID_EDEFAULT);
				return;
			case ModellingcorePackage.MODEL_ELEMENT__OWNED_CONSTRAINTS:
				getOwnedConstraints().clear();
				return;
			case ModellingcorePackage.MODEL_ELEMENT__OWNED_MIGRATED_ELEMENTS:
				getOwnedMigratedElements().clear();
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
			case ModellingcorePackage.MODEL_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ModellingcorePackage.MODEL_ELEMENT__SID:
				return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
			case ModellingcorePackage.MODEL_ELEMENT__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case ModellingcorePackage.MODEL_ELEMENT__OWNED_CONSTRAINTS:
				return ownedConstraints != null && !ownedConstraints.isEmpty();
			case ModellingcorePackage.MODEL_ELEMENT__OWNED_MIGRATED_ELEMENTS:
				return ownedMigratedElements != null && !ownedMigratedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", sid: ");
		result.append(sid);
		result.append(')');
		return result.toString();
	}

} //ModelElementImpl
