import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
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
import org.polarsys.capella.core.data.oa.impl.OaPackageImpl;
import org.polarsys.capella.core.data.pa.deployment.impl.DeploymentPackageImpl;
import org.polarsys.capella.core.data.pa.impl.PaPackageImpl;
import org.polarsys.capella.core.data.requirement.impl.RequirementPackageImpl;
import org.polarsys.capella.core.data.sharedmodel.impl.SharedmodelPackageImpl;

import generator.SaGenerator;

public class CreateSourceModel {
	public static void main(String[] args) {
		EPackage epack = null;		
		epack = OaPackageImpl.init();
		epack = CapellamodellerPackageImpl.init();
		epack = CapellacorePackageImpl.init();
		epack = DeploymentPackageImpl.init();
		epack = EpbsPackageImpl.init();
		epack = SharedmodelPackageImpl.init();
		epack = RequirementPackageImpl.init();
		epack = CapellacommonPackageImpl.init();
		epack = InformationPackageImpl.init();
		epack = CommunicationPackageImpl.init();
		epack = DatatypePackageImpl.init();
		epack = DatavaluePackageImpl.init();
		epack = CsPackageImpl.init();
		epack = FaPackageImpl.init();
		epack = InteractionPackageImpl.init();
		epack = CtxPackageImpl.init();
		epack = LaPackageImpl.init();
		epack = PaPackageImpl.init();
		
		SaGenerator gen = new SaGenerator(2, 2, 2);
		
		
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = 
				resSet.createResource(
					URI.createURI("instances/test_source.xmi")
				);

		resource.getContents().add(gen.model);

		try {
		    resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {

		    e.printStackTrace();
		}
		System.out.println("Element count: "+ gen.element_count);
	}
}
