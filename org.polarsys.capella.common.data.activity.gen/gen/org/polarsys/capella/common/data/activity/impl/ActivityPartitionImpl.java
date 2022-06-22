/**
 *  Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *  Contributors:
 *     Thales - initial API and implementation
 */
package org.polarsys.capella.common.data.activity.impl;

import modellingcore.AbstractNamedElement;
import modellingcore.AbstractType;
import modellingcore.ModellingcorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.capella.common.data.activity.ActivityPackage;
import org.polarsys.capella.common.data.activity.ActivityPartition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.common.data.activity.impl.ActivityPartitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.capella.common.data.activity.impl.ActivityPartitionImpl#isIsDimension <em>Is Dimension</em>}</li>
 *   <li>{@link org.polarsys.capella.common.data.activity.impl.ActivityPartitionImpl#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link org.polarsys.capella.common.data.activity.impl.ActivityPartitionImpl#getRepresentedElement <em>Represented Element</em>}</li>
 *   <li>{@link org.polarsys.capella.common.data.activity.impl.ActivityPartitionImpl#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link org.polarsys.capella.common.data.activity.impl.ActivityPartitionImpl#getSubPartitions <em>Sub Partitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityPartitionImpl extends ActivityGroupImpl implements ActivityPartition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDimension()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIMENSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDimension()
	 * @generated
	 * @ordered
	 */
	protected boolean isDimension = IS_DIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean isExternal = IS_EXTERNAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepresentedElement() <em>Represented Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedElement()
	 * @generated
	 * @ordered
	 */
	protected AbstractType representedElement;

	/**
	 * The cached value of the '{@link #getSuperPartition() <em>Super Partition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperPartition()
	 * @generated
	 * @ordered
	 */
	protected ActivityPartition superPartition;

	/**
	 * The cached value of the '{@link #getSubPartitions() <em>Sub Partitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPartitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> subPartitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ACTIVITY_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_PARTITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDimension() {
		return isDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDimension(boolean newIsDimension) {
		boolean oldIsDimension = isDimension;
		isDimension = newIsDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_PARTITION__IS_DIMENSION, oldIsDimension, isDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsExternal() {
		return isExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsExternal(boolean newIsExternal) {
		boolean oldIsExternal = isExternal;
		isExternal = newIsExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_PARTITION__IS_EXTERNAL, oldIsExternal, isExternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractType getRepresentedElement() {
		if (representedElement != null && representedElement.eIsProxy()) {
			InternalEObject oldRepresentedElement = (InternalEObject)representedElement;
			representedElement = (AbstractType)eResolveProxy(oldRepresentedElement);
			if (representedElement != oldRepresentedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ACTIVITY_PARTITION__REPRESENTED_ELEMENT, oldRepresentedElement, representedElement));
			}
		}
		return representedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType basicGetRepresentedElement() {
		return representedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepresentedElement(AbstractType newRepresentedElement) {
		AbstractType oldRepresentedElement = representedElement;
		representedElement = newRepresentedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_PARTITION__REPRESENTED_ELEMENT, oldRepresentedElement, representedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityPartition getSuperPartition() {
		if (superPartition != null && superPartition.eIsProxy()) {
			InternalEObject oldSuperPartition = (InternalEObject)superPartition;
			superPartition = (ActivityPartition)eResolveProxy(oldSuperPartition);
			if (superPartition != oldSuperPartition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ACTIVITY_PARTITION__SUPER_PARTITION, oldSuperPartition, superPartition));
			}
		}
		return superPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition basicGetSuperPartition() {
		return superPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityPartition> getSubPartitions() {
		if (subPartitions == null) {
			subPartitions = new EObjectResolvingEList<ActivityPartition>(ActivityPartition.class, this, ActivityPackage.ACTIVITY_PARTITION__SUB_PARTITIONS);
		}
		return subPartitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityPackage.ACTIVITY_PARTITION__NAME:
				return getName();
			case ActivityPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				return isIsDimension();
			case ActivityPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				return isIsExternal();
			case ActivityPackage.ACTIVITY_PARTITION__REPRESENTED_ELEMENT:
				if (resolve) return getRepresentedElement();
				return basicGetRepresentedElement();
			case ActivityPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				if (resolve) return getSuperPartition();
				return basicGetSuperPartition();
			case ActivityPackage.ACTIVITY_PARTITION__SUB_PARTITIONS:
				return getSubPartitions();
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
			case ActivityPackage.ACTIVITY_PARTITION__NAME:
				setName((String)newValue);
				return;
			case ActivityPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				setIsDimension((Boolean)newValue);
				return;
			case ActivityPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				setIsExternal((Boolean)newValue);
				return;
			case ActivityPackage.ACTIVITY_PARTITION__REPRESENTED_ELEMENT:
				setRepresentedElement((AbstractType)newValue);
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
			case ActivityPackage.ACTIVITY_PARTITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActivityPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				setIsDimension(IS_DIMENSION_EDEFAULT);
				return;
			case ActivityPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				setIsExternal(IS_EXTERNAL_EDEFAULT);
				return;
			case ActivityPackage.ACTIVITY_PARTITION__REPRESENTED_ELEMENT:
				setRepresentedElement((AbstractType)null);
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
			case ActivityPackage.ACTIVITY_PARTITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActivityPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				return isDimension != IS_DIMENSION_EDEFAULT;
			case ActivityPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				return isExternal != IS_EXTERNAL_EDEFAULT;
			case ActivityPackage.ACTIVITY_PARTITION__REPRESENTED_ELEMENT:
				return representedElement != null;
			case ActivityPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				return superPartition != null;
			case ActivityPackage.ACTIVITY_PARTITION__SUB_PARTITIONS:
				return subPartitions != null && !subPartitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractNamedElement.class) {
			switch (derivedFeatureID) {
				case ActivityPackage.ACTIVITY_PARTITION__NAME: return ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractNamedElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME: return ActivityPackage.ACTIVITY_PARTITION__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", isDimension: "); //$NON-NLS-1$
		result.append(isDimension);
		result.append(", isExternal: "); //$NON-NLS-1$
		result.append(isExternal);
		result.append(')');
		return result.toString();
	}

} //ActivityPartitionImpl
