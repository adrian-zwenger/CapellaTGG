package org.emoflon.ibex.tgg.run.oa2ctx_transistionactors.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.oa2ctx_transistionactors.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.polarsys.capella.core.data.capellacommon.impl.CapellacommonPackageImpl;
import org.polarsys.capella.core.data.capellacore.impl.CapellacorePackageImpl;
import org.polarsys.capella.core.data.capellamodeller.impl.CapellamodellerPackageImpl;
import org.polarsys.capella.core.data.cs.impl.CsPackageImpl;
import org.polarsys.capella.core.data.ctx.impl.CtxPackageImpl;
import org.polarsys.capella.core.data.epbs.impl.EpbsPackageImpl;
import org.polarsys.capella.core.data.fa.impl.FaPackageImpl;
import org.polarsys.capella.core.data.information.communication.impl.CommunicationPackageImpl;
import org.polarsys.capella.core.data.information.datatype.impl.DatatypePackageImpl;
import org.polarsys.capella.core.data.information.datavalue.impl.DatavaluePackageImpl;
import org.polarsys.capella.core.data.information.impl.InformationPackageImpl;
import org.polarsys.capella.core.data.interaction.impl.InteractionPackageImpl;
import org.polarsys.capella.core.data.la.impl.LaPackageImpl;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.oa.impl.OaPackageImpl;
import org.polarsys.capella.core.data.pa.deployment.impl.DeploymentPackageImpl;
import org.polarsys.capella.core.data.pa.impl.PaPackageImpl;
import org.polarsys.capella.core.data.requirement.impl.RequirementPackageImpl;
import org.polarsys.capella.core.data.sharedmodel.impl.SharedmodelPackageImpl;

import Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage;
import Oa2Ctx_TransistionActors.impl.Oa2Ctx_TransistionActorsPackageImpl;

public class HiPERegistrationHelper implements IRegistrationHelper {
	
	/** Create default options **/
	public final void setWorkspaceRootDirectory(ResourceSet resourceSet) throws IOException {
		final String root = "../";
		URI key = URI.createPlatformResourceURI("/", true);
		URI value = URI.createFileURI(new File(root).getCanonicalPath() + File.separatorChar);
		resourceSet.getURIConverter().getURIMap().put(key, value);
	}

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		
		// Set correct workspace root
		setWorkspaceRootDirectory(rs);
		
		// Load and register source and target metamodels
		EPackage laPack = null;
		EPackage paPack = null;
		EPackage oa2ctx_transistionactorsPack = null;
		
		if(laPack == null)
			laPack = LaPackageImpl.init();
		
		if(paPack == null)
			paPack = PaPackageImpl.init();
		
		if(oa2ctx_transistionactorsPack == null) {
			oa2ctx_transistionactorsPack = Oa2Ctx_TransistionActorsPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/Oa2Ctx_TransistionActors/model/Oa2Ctx_TransistionActors.ecore", Oa2Ctx_TransistionActorsPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/Oa2Ctx_TransistionActors/model/Oa2Ctx_TransistionActors.ecore", Oa2Ctx_TransistionActorsPackage.eINSTANCE);
		}
		
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/LogicalArchitecture.ecore", laPack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/LogicalArchitecture.ecore", laPack);
		
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/PhysicalArchitecture.ecore", paPack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/PhysicalArchitecture.ecore", paPack);

		EPackage epack = null;
		
		epack = OaPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/OperationalAnalysis.ecore", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/OperationalAnalysis.ecore",epack);
		
		epack = CapellamodellerPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/CapellaModeller.ecore", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/CapellaModeller.ecore", epack);
		
		epack = CapellacorePackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/CapellaCore.ecore", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/CapellaCore.ecore", epack);
		
		epack = DeploymentPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/PhysicalArchitecture.ecore#/deployment", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/PhysicalArchitecture.ecore#/deployment", epack);
		
		epack = EpbsPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/EPBSArchitecture.ecore", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/EPBSArchitecture.ecore", epack);
		
		epack = SharedmodelPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/SharedModel.ecore", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/SharedModel.ecore", epack);
		
		epack = RequirementPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/Requirement.ecore", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/Requirement.ecore", epack);
		
		epack = CapellacommonPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/CapellaCommon.ecore", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/CapellaCommon.ecore", epack);
		
		epack = InformationPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/Information.ecore", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/Information.ecore", epack);
		
		epack = CommunicationPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/Information.ecore#/communication", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/Information.ecore#/communication", epack);
		
		epack = DatatypePackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/Information.ecore#/datatype", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/Information.ecore#/datatype", epack);
		
		epack = DatavaluePackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/Information.ecore#/datavalue", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/Information.ecore#/datavalue", epack);
		
		epack = CsPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore", epack);
		
		epack = FaPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore", epack);
		
		epack = InteractionPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/Interaction.ecore", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/Interaction.ecore", epack);
		
		epack = CtxPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/ContextArchitecture.ecore", epack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/ContextArchitecture.ecore", epack);
		
//		rs.getPackageRegistry().put("platform:/resource/<<SRC_Project>>/model/<<SRC_Project>>.ecore", <<src_project>>Pack);
//	    rs.getPackageRegistry().put("platform:/plugin/<<SRC_Project>>/model/<<SRC_Project>>.ecore", <<src_project>>Pack);	
//	    rs.getPackageRegistry().put("http://www.polarsys.org/capella/core/oa/5.0.0", oaPack);
//			
//		rs.getPackageRegistry().put("platform:/resource/<<TRG_Project>>/model/<<TRG_Project>>.ecore", <<trg_project>>Pack);
//		rs.getPackageRegistry().put("platform:/plugin/<<TRG_Project>>/model/<<TRG_Project>>.ecore", <<trg_project>>Pack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("Oa2Ctx_TransistionActors");
		options.project.path("Oa2Ctx_TransistionActors");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
