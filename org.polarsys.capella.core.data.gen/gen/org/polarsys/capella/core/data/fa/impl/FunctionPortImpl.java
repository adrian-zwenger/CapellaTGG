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

import behavior.AbstractEvent;

import modellingcore.AbstractType;
import modellingcore.AbstractTypedElement;
import modellingcore.ModellingcorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.Type;
import org.polarsys.capella.core.data.capellacore.TypedElement;

import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.FunctionPort;

import org.polarsys.capella.core.data.information.impl.PortImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionPortImpl#getAbstractType <em>Abstract Type</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionPortImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionPortImpl#getAbstractTypedElements <em>Abstract Typed Elements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionPortImpl#getRepresentedComponentPort <em>Represented Component Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionPortImpl#getAllocatorComponentPorts <em>Allocator Component Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionPortImpl#getRealizedFunctionPorts <em>Realized Function Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.data.fa.impl.FunctionPortImpl#getRealizingFunctionPorts <em>Realizing Function Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("deprecation")
public abstract class FunctionPortImpl extends PortImpl implements FunctionPort {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getAbstractTypedElements() <em>Abstract Typed Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTypedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypedElement> abstractTypedElements;

	/**
	 * The cached value of the '{@link #getRepresentedComponentPort() <em>Represented Component Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedComponentPort()
	 * @deprecated See {@link org.polarsys.capella.core.data.fa.FunctionPort#getRepresentedComponentPort() model documentation} for details.
	 * @generated
	 * @ordered
	 */
	@Deprecated
	protected ComponentPort representedComponentPort;

	/**
	 * The cached value of the '{@link #getAllocatorComponentPorts() <em>Allocator Component Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatorComponentPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPort> allocatorComponentPorts;

	/**
	 * The cached value of the '{@link #getRealizedFunctionPorts() <em>Realized Function Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedFunctionPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPort> realizedFunctionPorts;

	/**
	 * The cached value of the '{@link #getRealizingFunctionPorts() <em>Realizing Function Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingFunctionPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPort> realizingFunctionPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTION_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractType getAbstractType() {
		if (abstractType != null && abstractType.eIsProxy()) {
			InternalEObject oldAbstractType = (InternalEObject)abstractType;
			abstractType = (AbstractType)eResolveProxy(oldAbstractType);
			if (abstractType != oldAbstractType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTION_PORT__ABSTRACT_TYPE, oldAbstractType, abstractType));
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
	@Override
	public void setAbstractType(AbstractType newAbstractType) {
		AbstractType oldAbstractType = abstractType;
		abstractType = newAbstractType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTION_PORT__ABSTRACT_TYPE, oldAbstractType, abstractType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTION_PORT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTypedElement> getAbstractTypedElements() {
		if (abstractTypedElements == null) {
			abstractTypedElements = new EObjectResolvingEList<AbstractTypedElement>(AbstractTypedElement.class, this, FaPackage.FUNCTION_PORT__ABSTRACT_TYPED_ELEMENTS);
		}
		return abstractTypedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated See {@link org.polarsys.capella.core.data.fa.FunctionPort#getRepresentedComponentPort() model documentation} for details.
	 * @generated
	 */
	@Deprecated
	@Override
	public ComponentPort getRepresentedComponentPort() {
		if (representedComponentPort != null && representedComponentPort.eIsProxy()) {
			InternalEObject oldRepresentedComponentPort = (InternalEObject)representedComponentPort;
			representedComponentPort = (ComponentPort)eResolveProxy(oldRepresentedComponentPort);
			if (representedComponentPort != oldRepresentedComponentPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTION_PORT__REPRESENTED_COMPONENT_PORT, oldRepresentedComponentPort, representedComponentPort));
			}
		}
		return representedComponentPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated See {@link org.polarsys.capella.core.data.fa.FunctionPort#getRepresentedComponentPort() model documentation} for details.
	 * @generated
	 */
	@Deprecated
	public ComponentPort basicGetRepresentedComponentPort() {
		return representedComponentPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated See {@link org.polarsys.capella.core.data.fa.FunctionPort#getRepresentedComponentPort() model documentation} for details.
	 * @generated
	 */
	@Deprecated
	@Override
	public void setRepresentedComponentPort(ComponentPort newRepresentedComponentPort) {
		ComponentPort oldRepresentedComponentPort = representedComponentPort;
		representedComponentPort = newRepresentedComponentPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTION_PORT__REPRESENTED_COMPONENT_PORT, oldRepresentedComponentPort, representedComponentPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentPort> getAllocatorComponentPorts() {
		if (allocatorComponentPorts == null) {
			allocatorComponentPorts = new EObjectWithInverseResolvingEList.ManyInverse<ComponentPort>(ComponentPort.class, this, FaPackage.FUNCTION_PORT__ALLOCATOR_COMPONENT_PORTS, FaPackage.COMPONENT_PORT__ALLOCATED_FUNCTION_PORTS);
		}
		return allocatorComponentPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionPort> getRealizedFunctionPorts() {
		if (realizedFunctionPorts == null) {
			realizedFunctionPorts = new EObjectResolvingEList<FunctionPort>(FunctionPort.class, this, FaPackage.FUNCTION_PORT__REALIZED_FUNCTION_PORTS);
		}
		return realizedFunctionPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionPort> getRealizingFunctionPorts() {
		if (realizingFunctionPorts == null) {
			realizingFunctionPorts = new EObjectResolvingEList<FunctionPort>(FunctionPort.class, this, FaPackage.FUNCTION_PORT__REALIZING_FUNCTION_PORTS);
		}
		return realizingFunctionPorts;
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
			case FaPackage.FUNCTION_PORT__ALLOCATOR_COMPONENT_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatorComponentPorts()).basicAdd(otherEnd, msgs);
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
			case FaPackage.FUNCTION_PORT__ALLOCATOR_COMPONENT_PORTS:
				return ((InternalEList<?>)getAllocatorComponentPorts()).basicRemove(otherEnd, msgs);
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
			case FaPackage.FUNCTION_PORT__ABSTRACT_TYPE:
				if (resolve) return getAbstractType();
				return basicGetAbstractType();
			case FaPackage.FUNCTION_PORT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FaPackage.FUNCTION_PORT__ABSTRACT_TYPED_ELEMENTS:
				return getAbstractTypedElements();
			case FaPackage.FUNCTION_PORT__REPRESENTED_COMPONENT_PORT:
				if (resolve) return getRepresentedComponentPort();
				return basicGetRepresentedComponentPort();
			case FaPackage.FUNCTION_PORT__ALLOCATOR_COMPONENT_PORTS:
				return getAllocatorComponentPorts();
			case FaPackage.FUNCTION_PORT__REALIZED_FUNCTION_PORTS:
				return getRealizedFunctionPorts();
			case FaPackage.FUNCTION_PORT__REALIZING_FUNCTION_PORTS:
				return getRealizingFunctionPorts();
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
			case FaPackage.FUNCTION_PORT__ABSTRACT_TYPE:
				setAbstractType((AbstractType)newValue);
				return;
			case FaPackage.FUNCTION_PORT__REPRESENTED_COMPONENT_PORT:
				setRepresentedComponentPort((ComponentPort)newValue);
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
			case FaPackage.FUNCTION_PORT__ABSTRACT_TYPE:
				setAbstractType((AbstractType)null);
				return;
			case FaPackage.FUNCTION_PORT__REPRESENTED_COMPONENT_PORT:
				setRepresentedComponentPort((ComponentPort)null);
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
			case FaPackage.FUNCTION_PORT__ABSTRACT_TYPE:
				return abstractType != null;
			case FaPackage.FUNCTION_PORT__TYPE:
				return type != null;
			case FaPackage.FUNCTION_PORT__ABSTRACT_TYPED_ELEMENTS:
				return abstractTypedElements != null && !abstractTypedElements.isEmpty();
			case FaPackage.FUNCTION_PORT__REPRESENTED_COMPONENT_PORT:
				return representedComponentPort != null;
			case FaPackage.FUNCTION_PORT__ALLOCATOR_COMPONENT_PORTS:
				return allocatorComponentPorts != null && !allocatorComponentPorts.isEmpty();
			case FaPackage.FUNCTION_PORT__REALIZED_FUNCTION_PORTS:
				return realizedFunctionPorts != null && !realizedFunctionPorts.isEmpty();
			case FaPackage.FUNCTION_PORT__REALIZING_FUNCTION_PORTS:
				return realizingFunctionPorts != null && !realizingFunctionPorts.isEmpty();
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
		if (baseClass == AbstractTypedElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTION_PORT__ABSTRACT_TYPE: return ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTION_PORT__TYPE: return CapellacorePackage.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTION_PORT__ABSTRACT_TYPED_ELEMENTS: return ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == AbstractTypedElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE: return FaPackage.FUNCTION_PORT__ABSTRACT_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.TYPED_ELEMENT__TYPE: return FaPackage.FUNCTION_PORT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS: return FaPackage.FUNCTION_PORT__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FunctionPortImpl
