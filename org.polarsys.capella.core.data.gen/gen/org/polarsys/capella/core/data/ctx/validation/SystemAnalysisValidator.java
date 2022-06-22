/**
 *
 * $Id$
 */
package org.polarsys.capella.core.data.ctx.validation;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.ctx.CapabilityPkg;
import org.polarsys.capella.core.data.ctx.MissionPkg;
import org.polarsys.capella.core.data.ctx.OperationalAnalysisRealization;
import org.polarsys.capella.core.data.ctx.SystemComponentPkg;
import org.polarsys.capella.core.data.ctx.SystemFunctionPkg;

import org.polarsys.capella.core.data.la.LogicalArchitecture;

import org.polarsys.capella.core.data.oa.OperationalAnalysis;

/**
 * A sample validator interface for {@link org.polarsys.capella.core.data.ctx.SystemAnalysis}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SystemAnalysisValidator {
	boolean validate();

	boolean validateOwnedSystemComponentPkg(SystemComponentPkg value);
	boolean validateOwnedMissionPkg(MissionPkg value);
	boolean validateContainedCapabilityPkg(CapabilityPkg value);
	boolean validateContainedSystemFunctionPkg(SystemFunctionPkg value);
	boolean validateOwnedOperationalAnalysisRealizations(EList<OperationalAnalysisRealization> value);
	boolean validateAllocatedOperationalAnalysisRealizations(EList<OperationalAnalysisRealization> value);
	boolean validateAllocatedOperationalAnalyses(EList<OperationalAnalysis> value);
	boolean validateAllocatingLogicalArchitectures(EList<LogicalArchitecture> value);
}