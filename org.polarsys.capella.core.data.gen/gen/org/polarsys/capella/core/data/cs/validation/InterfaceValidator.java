/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.cs.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.ExchangeItemAllocation;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.cs.InterfaceAllocation;
import org.polarsys.capella.core.data.cs.InterfaceImplementation;
import org.polarsys.capella.core.data.cs.InterfaceUse;

import org.polarsys.capella.core.data.fa.ComponentPort;

import org.polarsys.capella.core.data.information.ExchangeItem;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.cs.Interface}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InterfaceValidator {
	boolean validate();

	boolean validateMechanism(String value);
	boolean validateStructural(boolean value);
	boolean validateImplementorComponents(EList<Component> value);
	boolean validateUserComponents(EList<Component> value);
	boolean validateInterfaceImplementations(EList<InterfaceImplementation> value);
	boolean validateInterfaceUses(EList<InterfaceUse> value);
	boolean validateProvisioningInterfaceAllocations(EList<InterfaceAllocation> value);
	boolean validateAllocatingInterfaces(EList<Interface> value);
	boolean validateAllocatingComponents(EList<Component> value);
	boolean validateExchangeItems(EList<ExchangeItem> value);
	boolean validateOwnedExchangeItemAllocations(EList<ExchangeItemAllocation> value);
	boolean validateRequiringComponents(EList<Component> value);
	boolean validateRequiringComponentPorts(EList<ComponentPort> value);
	boolean validateProvidingComponents(EList<Component> value);
	boolean validateProvidingComponentPorts(EList<ComponentPort> value);
	boolean validateRealizingLogicalInterfaces(EList<Interface> value);
	boolean validateRealizedContextInterfaces(EList<Interface> value);
	boolean validateRealizingPhysicalInterfaces(EList<Interface> value);
	boolean validateRealizedLogicalInterfaces(EList<Interface> value);
}