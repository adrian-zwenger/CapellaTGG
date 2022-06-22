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
package org.polarsys.capella.core.data.information.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.capella.core.data.information.AbstractInstance;
import org.polarsys.capella.core.data.information.InformationPackage;

import org.polarsys.capella.core.data.interaction.InstanceRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.information.impl.AbstractInstanceImpl#getRepresentingInstanceRoles <em>Representing Instance Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractInstanceImpl extends PropertyImpl implements AbstractInstance {
	/**
	 * The cached value of the '{@link #getRepresentingInstanceRoles() <em>Representing Instance Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentingInstanceRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceRole> representingInstanceRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.ABSTRACT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstanceRole> getRepresentingInstanceRoles() {
		if (representingInstanceRoles == null) {
			representingInstanceRoles = new EObjectResolvingEList<InstanceRole>(InstanceRole.class, this, InformationPackage.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES);
		}
		return representingInstanceRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InformationPackage.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES:
				return getRepresentingInstanceRoles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InformationPackage.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES:
				return representingInstanceRoles != null && !representingInstanceRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractInstanceImpl
