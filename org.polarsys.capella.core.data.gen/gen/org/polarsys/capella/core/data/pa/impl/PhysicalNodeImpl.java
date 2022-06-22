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
package org.polarsys.capella.core.data.pa.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.pa.PhysicalNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.pa.impl.PhysicalNodeImpl#getSubPhysicalNodes <em>Sub Physical Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalNodeImpl extends PhysicalComponentImpl implements PhysicalNode {
	/**
	 * The cached value of the '{@link #getSubPhysicalNodes() <em>Sub Physical Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPhysicalNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalNode> subPhysicalNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.PHYSICAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalNode> getSubPhysicalNodes() {
		if (subPhysicalNodes == null) {
			subPhysicalNodes = new EObjectResolvingEList<PhysicalNode>(PhysicalNode.class, this, PaPackage.PHYSICAL_NODE__SUB_PHYSICAL_NODES);
		}
		return subPhysicalNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaPackage.PHYSICAL_NODE__SUB_PHYSICAL_NODES:
				return getSubPhysicalNodes();
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
			case PaPackage.PHYSICAL_NODE__SUB_PHYSICAL_NODES:
				return subPhysicalNodes != null && !subPhysicalNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalNodeImpl
