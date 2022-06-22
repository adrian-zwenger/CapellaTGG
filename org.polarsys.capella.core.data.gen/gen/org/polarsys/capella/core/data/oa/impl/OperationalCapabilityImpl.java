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
package org.polarsys.capella.core.data.oa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.ctx.Capability;

import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.interaction.impl.AbstractCapabilityImpl;

import org.polarsys.capella.core.data.oa.CapabilityConfiguration;
import org.polarsys.capella.core.data.oa.ConceptCompliance;
import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.core.data.oa.EntityOperationalCapabilityInvolvement;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.oa.OperationalCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.OperationalCapabilityImpl#getCompliances <em>Compliances</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.OperationalCapabilityImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.OperationalCapabilityImpl#getOwnedEntityOperationalCapabilityInvolvements <em>Owned Entity Operational Capability Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.OperationalCapabilityImpl#getRealizingCapabilities <em>Realizing Capabilities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.oa.impl.OperationalCapabilityImpl#getInvolvedEntities <em>Involved Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalCapabilityImpl extends AbstractCapabilityImpl implements OperationalCapability {
	/**
	 * The cached value of the '{@link #getCompliances() <em>Compliances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliances()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptCompliance> compliances;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityConfiguration> configurations;

	/**
	 * The cached value of the '{@link #getOwnedEntityOperationalCapabilityInvolvements() <em>Owned Entity Operational Capability Involvements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEntityOperationalCapabilityInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityOperationalCapabilityInvolvement> ownedEntityOperationalCapabilityInvolvements;

	/**
	 * The cached value of the '{@link #getRealizingCapabilities() <em>Realizing Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> realizingCapabilities;

	/**
	 * The cached value of the '{@link #getInvolvedEntities() <em>Involved Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> involvedEntities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.OPERATIONAL_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConceptCompliance> getCompliances() {
		if (compliances == null) {
			compliances = new EObjectResolvingEList<ConceptCompliance>(ConceptCompliance.class, this, OaPackage.OPERATIONAL_CAPABILITY__COMPLIANCES);
		}
		return compliances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityConfiguration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectResolvingEList<CapabilityConfiguration>(CapabilityConfiguration.class, this, OaPackage.OPERATIONAL_CAPABILITY__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EntityOperationalCapabilityInvolvement> getOwnedEntityOperationalCapabilityInvolvements() {
		if (ownedEntityOperationalCapabilityInvolvements == null) {
			ownedEntityOperationalCapabilityInvolvements = new EObjectContainmentEList.Resolving<EntityOperationalCapabilityInvolvement>(EntityOperationalCapabilityInvolvement.class, this, OaPackage.OPERATIONAL_CAPABILITY__OWNED_ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENTS);
		}
		return ownedEntityOperationalCapabilityInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Capability> getRealizingCapabilities() {
		if (realizingCapabilities == null) {
			realizingCapabilities = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this, OaPackage.OPERATIONAL_CAPABILITY__REALIZING_CAPABILITIES, CtxPackage.CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES);
		}
		return realizingCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getInvolvedEntities() {
		if (involvedEntities == null) {
			involvedEntities = new EObjectResolvingEList<Entity>(Entity.class, this, OaPackage.OPERATIONAL_CAPABILITY__INVOLVED_ENTITIES);
		}
		return involvedEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OaPackage.OPERATIONAL_CAPABILITY__REALIZING_CAPABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizingCapabilities()).basicAdd(otherEnd, msgs);
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
			case OaPackage.OPERATIONAL_CAPABILITY__OWNED_ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENTS:
				return ((InternalEList<?>)getOwnedEntityOperationalCapabilityInvolvements()).basicRemove(otherEnd, msgs);
			case OaPackage.OPERATIONAL_CAPABILITY__REALIZING_CAPABILITIES:
				return ((InternalEList<?>)getRealizingCapabilities()).basicRemove(otherEnd, msgs);
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
			case OaPackage.OPERATIONAL_CAPABILITY__COMPLIANCES:
				return getCompliances();
			case OaPackage.OPERATIONAL_CAPABILITY__CONFIGURATIONS:
				return getConfigurations();
			case OaPackage.OPERATIONAL_CAPABILITY__OWNED_ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENTS:
				return getOwnedEntityOperationalCapabilityInvolvements();
			case OaPackage.OPERATIONAL_CAPABILITY__REALIZING_CAPABILITIES:
				return getRealizingCapabilities();
			case OaPackage.OPERATIONAL_CAPABILITY__INVOLVED_ENTITIES:
				return getInvolvedEntities();
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
			case OaPackage.OPERATIONAL_CAPABILITY__COMPLIANCES:
				getCompliances().clear();
				getCompliances().addAll((Collection<? extends ConceptCompliance>)newValue);
				return;
			case OaPackage.OPERATIONAL_CAPABILITY__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends CapabilityConfiguration>)newValue);
				return;
			case OaPackage.OPERATIONAL_CAPABILITY__OWNED_ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENTS:
				getOwnedEntityOperationalCapabilityInvolvements().clear();
				getOwnedEntityOperationalCapabilityInvolvements().addAll((Collection<? extends EntityOperationalCapabilityInvolvement>)newValue);
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
			case OaPackage.OPERATIONAL_CAPABILITY__COMPLIANCES:
				getCompliances().clear();
				return;
			case OaPackage.OPERATIONAL_CAPABILITY__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case OaPackage.OPERATIONAL_CAPABILITY__OWNED_ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENTS:
				getOwnedEntityOperationalCapabilityInvolvements().clear();
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
			case OaPackage.OPERATIONAL_CAPABILITY__COMPLIANCES:
				return compliances != null && !compliances.isEmpty();
			case OaPackage.OPERATIONAL_CAPABILITY__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case OaPackage.OPERATIONAL_CAPABILITY__OWNED_ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENTS:
				return ownedEntityOperationalCapabilityInvolvements != null && !ownedEntityOperationalCapabilityInvolvements.isEmpty();
			case OaPackage.OPERATIONAL_CAPABILITY__REALIZING_CAPABILITIES:
				return realizingCapabilities != null && !realizingCapabilities.isEmpty();
			case OaPackage.OPERATIONAL_CAPABILITY__INVOLVED_ENTITIES:
				return involvedEntities != null && !involvedEntities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalCapabilityImpl
