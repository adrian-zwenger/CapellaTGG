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
package org.polarsys.capella.core.data.interaction.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.core.data.interaction.AbstractFragment;
import org.polarsys.capella.core.data.interaction.FragmentEnd;
import org.polarsys.capella.core.data.interaction.InteractionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.interaction.impl.FragmentEndImpl#getAbstractFragment <em>Abstract Fragment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FragmentEndImpl extends InteractionFragmentImpl implements FragmentEnd {
	/**
	 * The cached value of the '{@link #getAbstractFragment() <em>Abstract Fragment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractFragment()
	 * @generated
	 * @ordered
	 */
	protected AbstractFragment abstractFragment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.FRAGMENT_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractFragment getAbstractFragment() {
		if (abstractFragment != null && abstractFragment.eIsProxy()) {
			InternalEObject oldAbstractFragment = (InternalEObject)abstractFragment;
			abstractFragment = (AbstractFragment)eResolveProxy(oldAbstractFragment);
			if (abstractFragment != oldAbstractFragment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.FRAGMENT_END__ABSTRACT_FRAGMENT, oldAbstractFragment, abstractFragment));
			}
		}
		return abstractFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFragment basicGetAbstractFragment() {
		return abstractFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.FRAGMENT_END__ABSTRACT_FRAGMENT:
				if (resolve) return getAbstractFragment();
				return basicGetAbstractFragment();
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
			case InteractionPackage.FRAGMENT_END__ABSTRACT_FRAGMENT:
				return abstractFragment != null;
		}
		return super.eIsSet(featureID);
	}

} //FragmentEndImpl
