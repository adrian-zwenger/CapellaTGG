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
package org.polarsys.capella.core.data.fa.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.core.data.capellacore.impl.AllocationImpl;

import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.AbstractFunctionalBlock;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.fa.FaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Functional Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentFunctionalAllocationImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.ComponentFunctionalAllocationImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentFunctionalAllocationImpl extends AllocationImpl implements ComponentFunctionalAllocation {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected AbstractFunction function;
	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected AbstractFunctionalBlock block;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentFunctionalAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.COMPONENT_FUNCTIONAL_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractFunction getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject)function;
			function = (AbstractFunction)eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunction basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(AbstractFunction newFunction, NotificationChain msgs) {
		AbstractFunction oldFunction = function;
		function = newFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__FUNCTION, oldFunction, newFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractFunctionalBlock getBlock() {
		if (block != null && block.eIsProxy()) {
			InternalEObject oldBlock = (InternalEObject)block;
			block = (AbstractFunctionalBlock)eResolveProxy(oldBlock);
			if (block != oldBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__BLOCK, oldBlock, block));
			}
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunctionalBlock basicGetBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(AbstractFunctionalBlock newBlock, NotificationChain msgs) {
		AbstractFunctionalBlock oldBlock = block;
		block = newBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__BLOCK, oldBlock, newBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__FUNCTION:
				if (function != null)
					msgs = ((InternalEObject)function).eInverseRemove(this, FaPackage.ABSTRACT_FUNCTION__COMPONENT_FUNCTIONAL_ALLOCATIONS, AbstractFunction.class, msgs);
				return basicSetFunction((AbstractFunction)otherEnd, msgs);
			case FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__BLOCK:
				if (block != null)
					msgs = ((InternalEObject)block).eInverseRemove(this, FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__FUNCTIONAL_ALLOCATIONS, AbstractFunctionalBlock.class, msgs);
				return basicSetBlock((AbstractFunctionalBlock)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__FUNCTION:
				return basicSetFunction(null, msgs);
			case FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__BLOCK:
				return basicSetBlock(null, msgs);
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
			case FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__BLOCK:
				if (resolve) return getBlock();
				return basicGetBlock();
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
			case FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__FUNCTION:
				return function != null;
			case FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__BLOCK:
				return block != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentFunctionalAllocationImpl
