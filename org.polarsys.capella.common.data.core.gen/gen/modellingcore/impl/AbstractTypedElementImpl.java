/**
 */
package modellingcore.impl;

import modellingcore.AbstractType;
import modellingcore.AbstractTypedElement;
import modellingcore.ModellingcorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modellingcore.impl.AbstractTypedElementImpl#getAbstractType <em>Abstract Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTypedElementImpl extends AbstractNamedElementImpl implements AbstractTypedElement {
	/**
	 * The cached value of the '{@link #getAbstractType() <em>Abstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractType()
	 * @generated
	 * @ordered
	 */
	protected AbstractType abstractType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModellingcorePackage.Literals.ABSTRACT_TYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType getAbstractType() {
		if (abstractType != null && abstractType.eIsProxy()) {
			InternalEObject oldAbstractType = (InternalEObject)abstractType;
			abstractType = (AbstractType)eResolveProxy(oldAbstractType);
			if (abstractType != oldAbstractType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE, oldAbstractType, abstractType));
			}
		}
		return abstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType basicGetAbstractType() {
		return abstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractType(AbstractType newAbstractType) {
		AbstractType oldAbstractType = abstractType;
		abstractType = newAbstractType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE, oldAbstractType, abstractType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE:
				if (resolve) return getAbstractType();
				return basicGetAbstractType();
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
			case ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE:
				setAbstractType((AbstractType)newValue);
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
			case ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE:
				setAbstractType((AbstractType)null);
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
			case ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE:
				return abstractType != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractTypedElementImpl
