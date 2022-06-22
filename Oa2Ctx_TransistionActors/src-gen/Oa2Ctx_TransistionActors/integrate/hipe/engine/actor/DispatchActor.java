package Oa2Ctx_TransistionActors.integrate.hipe.engine.actor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.stream.ActorMaterializer;
import akka.stream.javadsl.*;
import static akka.pattern.Patterns.ask;

import hipe.engine.util.HiPEMultiUtil;
import hipe.engine.util.IncUtil;
import hipe.engine.message.NewInput;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.input.ObjectAdded;
import hipe.engine.message.input.ObjectDeleted;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;		
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.input.NotificationContainer;

import hipe.generic.actor.junction.util.HiPEConfig;

public class DispatchActor extends AbstractActor {
	
	private int counter = 0;
	public long time = 0;
				
	private Map<String, ActorRef> name2actor;
	
	private Map<Object, Consumer<Object>> type2addConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2setConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2addEdgeConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2removeEdgeConsumer = HiPEMultiUtil.createMap();
	
	private IncUtil incUtil;
	
	private ActorMaterializer materializer;
	
	public DispatchActor(Map<String, ActorRef> name2actor, IncUtil incUtil) {
		this.name2actor = name2actor;
		this.incUtil = incUtil;
		
		initializeAdd();
		initializeSet();
		initializeAddEdge();
		initializeRemoveEdge();
	
		materializer = ActorMaterializer.create(getContext());
	}
	
	private void initializeAdd() {
		type2addConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemAnalysis(), obj -> {
			org.polarsys.capella.core.data.ctx.SystemAnalysis _systemanalysis = (org.polarsys.capella.core.data.ctx.SystemAnalysis) obj;
			incUtil.newMessage();
			name2actor.get("SystemAnalysis_object_SP0").tell(new ObjectAdded<org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil, _systemanalysis), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemAnalysis_object_SP1").tell(new ObjectAdded<org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil, _systemanalysis), getSelf());
		});
		type2addConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getComponentPkg(), obj -> {
			org.polarsys.capella.core.data.cs.ComponentPkg _componentpkg = (org.polarsys.capella.core.data.cs.ComponentPkg) obj;
			incUtil.newMessage();
			name2actor.get("ComponentPkg_object").tell(new ObjectAdded<org.polarsys.capella.core.data.cs.ComponentPkg>(incUtil, _componentpkg), getSelf());
		});
		type2addConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker(), obj -> {
			Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker _oa2sa_transition_actors__marker = (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) obj;
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__Marker_object").tell(new ObjectAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker>(incUtil, _oa2sa_transition_actors__marker), getSelf());
		});
		type2addConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemComponentPkg(), obj -> {
			org.polarsys.capella.core.data.ctx.SystemComponentPkg _systemcomponentpkg = (org.polarsys.capella.core.data.ctx.SystemComponentPkg) obj;
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_object_SP0").tell(new ObjectAdded<org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, _systemcomponentpkg), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_object_SP1").tell(new ObjectAdded<org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, _systemcomponentpkg), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_object_SP2").tell(new ObjectAdded<org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, _systemcomponentpkg), getSelf());
			incUtil.newMessage();
			name2actor.get("ComponentPkg_object").tell(new ObjectAdded<org.polarsys.capella.core.data.cs.ComponentPkg>(incUtil, _systemcomponentpkg), getSelf());
		});
		type2addConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getEntity2SystemComponent(), obj -> {
			Oa2Ctx_TransistionActors.Entity2SystemComponent _entity2systemcomponent = (Oa2Ctx_TransistionActors.Entity2SystemComponent) obj;
			incUtil.newMessage();
			name2actor.get("Entity2SystemComponent_object").tell(new ObjectAdded<Oa2Ctx_TransistionActors.Entity2SystemComponent>(incUtil, _entity2systemcomponent), getSelf());
		});
		type2addConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getEntityPkg(), obj -> {
			org.polarsys.capella.core.data.oa.EntityPkg _entitypkg = (org.polarsys.capella.core.data.oa.EntityPkg) obj;
			incUtil.newMessage();
			name2actor.get("EntityPkg_object_SP0").tell(new ObjectAdded<org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, _entitypkg), getSelf());
			incUtil.newMessage();
			name2actor.get("EntityPkg_object_SP1").tell(new ObjectAdded<org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, _entitypkg), getSelf());
			incUtil.newMessage();
			name2actor.get("ComponentPkg_object").tell(new ObjectAdded<org.polarsys.capella.core.data.cs.ComponentPkg>(incUtil, _entitypkg), getSelf());
		});
		type2addConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa(), obj -> {
			Oa2Ctx_TransistionActors.Oa2Sa _oa2sa = (Oa2Ctx_TransistionActors.Oa2Sa) obj;
			incUtil.newMessage();
			name2actor.get("Oa2Sa_object").tell(new ObjectAdded<Oa2Ctx_TransistionActors.Oa2Sa>(incUtil, _oa2sa), getSelf());
		});
		type2addConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker(), obj -> {
			Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker _oa2sa_generation__marker = (Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) obj;
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__Marker_object").tell(new ObjectAdded<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker>(incUtil, _oa2sa_generation__marker), getSelf());
		});
		type2addConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getPart(), obj -> {
			org.polarsys.capella.core.data.cs.Part _part = (org.polarsys.capella.core.data.cs.Part) obj;
			incUtil.newMessage();
			name2actor.get("Part_object_SP0").tell(new ObjectAdded<org.polarsys.capella.core.data.cs.Part>(incUtil, _part), getSelf());
			incUtil.newMessage();
			name2actor.get("Part_object_SP1").tell(new ObjectAdded<org.polarsys.capella.core.data.cs.Part>(incUtil, _part), getSelf());
			incUtil.newMessage();
			name2actor.get("Part_object_SP2").tell(new ObjectAdded<org.polarsys.capella.core.data.cs.Part>(incUtil, _part), getSelf());
			incUtil.newMessage();
			name2actor.get("Part_object_SP3").tell(new ObjectAdded<org.polarsys.capella.core.data.cs.Part>(incUtil, _part), getSelf());
		});
		type2addConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker(), obj -> {
			Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker _oa2sa_transition_actors_recursively__marker = (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) obj;
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__Marker_object").tell(new ObjectAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker>(incUtil, _oa2sa_transition_actors_recursively__marker), getSelf());
		});
		type2addConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemComponent(), obj -> {
			org.polarsys.capella.core.data.ctx.SystemComponent _systemcomponent = (org.polarsys.capella.core.data.ctx.SystemComponent) obj;
			incUtil.newMessage();
			name2actor.get("SystemComponent_object_SP0").tell(new ObjectAdded<org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil, _systemcomponent), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemComponent_object_SP1").tell(new ObjectAdded<org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil, _systemcomponent), getSelf());
		});
		type2addConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getEntity(), obj -> {
			org.polarsys.capella.core.data.oa.Entity _entity = (org.polarsys.capella.core.data.oa.Entity) obj;
			incUtil.newMessage();
			name2actor.get("Entity_object_SP0").tell(new ObjectAdded<org.polarsys.capella.core.data.oa.Entity>(incUtil, _entity), getSelf());
			incUtil.newMessage();
			name2actor.get("Entity_object_SP1").tell(new ObjectAdded<org.polarsys.capella.core.data.oa.Entity>(incUtil, _entity), getSelf());
			incUtil.newMessage();
			name2actor.get("Entity_object_SP2").tell(new ObjectAdded<org.polarsys.capella.core.data.oa.Entity>(incUtil, _entity), getSelf());
		});
		type2addConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getOperationalAnalysis(), obj -> {
			org.polarsys.capella.core.data.oa.OperationalAnalysis _operationalanalysis = (org.polarsys.capella.core.data.oa.OperationalAnalysis) obj;
			incUtil.newMessage();
			name2actor.get("OperationalAnalysis_object_SP0").tell(new ObjectAdded<org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil, _operationalanalysis), getSelf());
			incUtil.newMessage();
			name2actor.get("OperationalAnalysis_object_SP1").tell(new ObjectAdded<org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil, _operationalanalysis), getSelf());
		});
		type2addConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOaPart2SaPart(), obj -> {
			Oa2Ctx_TransistionActors.OaPart2SaPart _oapart2sapart = (Oa2Ctx_TransistionActors.OaPart2SaPart) obj;
			incUtil.newMessage();
			name2actor.get("OaPart2SaPart_object").tell(new ObjectAdded<Oa2Ctx_TransistionActors.OaPart2SaPart>(incUtil, _oapart2sapart), getSelf());
		});
	}
	
	private void initializeSet() {
		feature2setConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getAbstractNamedElement_Name(), notification -> {
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.EntityPkg) {
				incUtil.newMessage();
				name2actor.get("EntityPkg_object_SP1").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg) {
				incUtil.newMessage();
				name2actor.get("SystemComponentPkg_object_SP0").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg) {
				incUtil.newMessage();
				name2actor.get("SystemComponentPkg_object_SP1").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.Entity) {
				incUtil.newMessage();
				name2actor.get("Entity_object_SP0").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.ctx.SystemComponent) {
				incUtil.newMessage();
				name2actor.get("SystemComponent_object_SP1").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.cs.Part) {
				incUtil.newMessage();
				name2actor.get("Part_object_SP3").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.Entity) {
				incUtil.newMessage();
				name2actor.get("Entity_object_SP2").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.cs.Part) {
				incUtil.newMessage();
				name2actor.get("Part_object_SP2").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.ctx.SystemAnalysis) {
				incUtil.newMessage();
				name2actor.get("SystemAnalysis_object_SP0").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg) {
				incUtil.newMessage();
				name2actor.get("SystemComponentPkg_object_SP2").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.Entity) {
				incUtil.newMessage();
				name2actor.get("Entity_object_SP1").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.OperationalAnalysis) {
				incUtil.newMessage();
				name2actor.get("OperationalAnalysis_object_SP0").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.ctx.SystemComponent) {
				incUtil.newMessage();
				name2actor.get("SystemComponent_object_SP0").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.EntityPkg) {
				incUtil.newMessage();
				name2actor.get("EntityPkg_object_SP0").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.OperationalAnalysis) {
				incUtil.newMessage();
				name2actor.get("OperationalAnalysis_object_SP1").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.ctx.SystemAnalysis) {
				incUtil.newMessage();
				name2actor.get("SystemAnalysis_object_SP1").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.cs.ComponentPkg) {
				incUtil.newMessage();
				name2actor.get("ComponentPkg_object").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.cs.Part) {
				incUtil.newMessage();
				name2actor.get("Part_object_SP1").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.cs.Part) {
				incUtil.newMessage();
				name2actor.get("Part_object_SP0").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getComponent_Human(), notification -> {
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.Entity) {
				incUtil.newMessage();
				name2actor.get("Entity_object_SP1").tell(new AttributeChanged<org.polarsys.capella.core.data.cs.Component>(incUtil, (org.polarsys.capella.core.data.cs.Component) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.ctx.SystemComponent) {
				incUtil.newMessage();
				name2actor.get("SystemComponent_object_SP0").tell(new AttributeChanged<org.polarsys.capella.core.data.cs.Component>(incUtil, (org.polarsys.capella.core.data.cs.Component) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.Entity) {
				incUtil.newMessage();
				name2actor.get("Entity_object_SP0").tell(new AttributeChanged<org.polarsys.capella.core.data.cs.Component>(incUtil, (org.polarsys.capella.core.data.cs.Component) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.ctx.SystemComponent) {
				incUtil.newMessage();
				name2actor.get("SystemComponent_object_SP1").tell(new AttributeChanged<org.polarsys.capella.core.data.cs.Component>(incUtil, (org.polarsys.capella.core.data.cs.Component) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.Entity) {
				incUtil.newMessage();
				name2actor.get("Entity_object_SP2").tell(new AttributeChanged<org.polarsys.capella.core.data.cs.Component>(incUtil, (org.polarsys.capella.core.data.cs.Component) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getComponent_Actor(), notification -> {
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.Entity) {
				incUtil.newMessage();
				name2actor.get("Entity_object_SP1").tell(new AttributeChanged<org.polarsys.capella.core.data.cs.Component>(incUtil, (org.polarsys.capella.core.data.cs.Component) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.ctx.SystemComponent) {
				incUtil.newMessage();
				name2actor.get("SystemComponent_object_SP0").tell(new AttributeChanged<org.polarsys.capella.core.data.cs.Component>(incUtil, (org.polarsys.capella.core.data.cs.Component) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.Entity) {
				incUtil.newMessage();
				name2actor.get("Entity_object_SP0").tell(new AttributeChanged<org.polarsys.capella.core.data.cs.Component>(incUtil, (org.polarsys.capella.core.data.cs.Component) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.ctx.SystemComponent) {
				incUtil.newMessage();
				name2actor.get("SystemComponent_object_SP1").tell(new AttributeChanged<org.polarsys.capella.core.data.cs.Component>(incUtil, (org.polarsys.capella.core.data.cs.Component) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.Entity) {
				incUtil.newMessage();
				name2actor.get("Entity_object_SP2").tell(new AttributeChanged<org.polarsys.capella.core.data.cs.Component>(incUtil, (org.polarsys.capella.core.data.cs.Component) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CREATE__SRC__src_oa_part(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.cs.Part>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CREATE__SRC__src_oa_part_Part"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getEntity2SystemComponent_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Entity2SystemComponent, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil,(Oa2Ctx_TransistionActors.Entity2SystemComponent) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getNewValue(), "Oa2Ctx_TransistionActors.Entity2SystemComponent_target_SystemComponent"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Entity2SystemComponent, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil,(Oa2Ctx_TransistionActors.Entity2SystemComponent) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getNewValue(), "Oa2Ctx_TransistionActors.Entity2SystemComponent_target_SystemComponent"), getSelf());
		});
		feature2addEdgeConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemComponentPkg_OwnedSystemComponents(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_ownedSystemComponents_0_reference").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemComponentPkg, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil,(org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemComponentPkg_ownedSystemComponents_SystemComponent"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_ownedSystemComponents_1_reference").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemComponentPkg, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil,(org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemComponentPkg_ownedSystemComponents_SystemComponent"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__TRG_5_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemComponentPkg, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil,(org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemComponentPkg_ownedSystemComponents_SystemComponent"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__TRG_39_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemComponentPkg, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil,(org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemComponentPkg_ownedSystemComponents_SystemComponent"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemComponentPkg, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil,(org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemComponentPkg_ownedSystemComponents_SystemComponent"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__TRG_74_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemComponentPkg, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil,(org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemComponentPkg_ownedSystemComponents_SystemComponent"), getSelf());
		});
		feature2addEdgeConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getComponentPkg_OwnedParts(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_ownedParts_0_reference").tell(new ReferenceAdded<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil,(org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_ownedParts_1_reference").tell(new ReferenceAdded<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil,(org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__TRG_5_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil,(org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__TRG_39_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil,(org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil,(org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil,(org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__SRC_61_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil,(org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__TRG_74_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil,(org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively_src_operational_part_ownedParts_incoming_SRC__FILTER_NAC_SRC_84_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil,(org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CREATE__TRG__trg_system_component(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CREATE__TRG__trg_system_component_SystemComponent"), getSelf());
		});
		feature2addEdgeConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getAbstractTypedElement_AbstractType(), notification -> {
			incUtil.newMessage();
			name2actor.get("Part_abstractType_0_reference").tell(new ReferenceAdded<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil,(modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getNewValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Part_abstractType_1_reference").tell(new ReferenceAdded<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil,(modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getNewValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Part_abstractType_2_reference").tell(new ReferenceAdded<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil,(modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getNewValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__TRG_5_localSearch").tell(new ReferenceAdded<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil,(modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getNewValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__TRG_39_localSearch").tell(new ReferenceAdded<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil,(modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getNewValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceAdded<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil,(modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getNewValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceAdded<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil,(modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getNewValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__SRC_61_localSearch").tell(new ReferenceAdded<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil,(modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getNewValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__TRG_74_localSearch").tell(new ReferenceAdded<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil,(modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getNewValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__SRC_109_localSearch").tell(new ReferenceAdded<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil,(modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getNewValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
		});
		feature2addEdgeConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getEntityPkg_OwnedEntities(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.oa.EntityPkg, org.polarsys.capella.core.data.oa.Entity>(incUtil,(org.polarsys.capella.core.data.oa.EntityPkg) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getNewValue(), "org.polarsys.capella.core.data.oa.EntityPkg_ownedEntities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__SRC_61_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.oa.EntityPkg, org.polarsys.capella.core.data.oa.Entity>(incUtil,(org.polarsys.capella.core.data.oa.EntityPkg) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getNewValue(), "org.polarsys.capella.core.data.oa.EntityPkg_ownedEntities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_81_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.oa.EntityPkg, org.polarsys.capella.core.data.oa.Entity>(incUtil,(org.polarsys.capella.core.data.oa.EntityPkg) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getNewValue(), "org.polarsys.capella.core.data.oa.EntityPkg_ownedEntities_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getClassifier_OwnedFeatures(), notification -> {
			incUtil.newMessage();
			name2actor.get("Entity_ownedFeatures_0_reference").tell(new ReferenceAdded<org.polarsys.capella.core.data.capellacore.Classifier, org.polarsys.capella.core.data.capellacore.Feature>(incUtil,(org.polarsys.capella.core.data.capellacore.Classifier) notification.getNotifier(), (org.polarsys.capella.core.data.capellacore.Feature) notification.getNewValue(), "org.polarsys.capella.core.data.capellacore.Classifier_ownedFeatures_Feature"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__SRC_109_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.capellacore.Classifier, org.polarsys.capella.core.data.capellacore.Feature>(incUtil,(org.polarsys.capella.core.data.capellacore.Classifier) notification.getNotifier(), (org.polarsys.capella.core.data.capellacore.Feature) notification.getNewValue(), "org.polarsys.capella.core.data.capellacore.Classifier_ownedFeatures_Feature"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker_CREATE__TRG__trg_system_as_component(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker_CREATE__TRG__trg_system_as_component_SystemComponent"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CREATE__CORR__entity2component(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, Oa2Ctx_TransistionActors.Entity2SystemComponent>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (Oa2Ctx_TransistionActors.Entity2SystemComponent) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CREATE__CORR__entity2component_Entity2SystemComponent"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CONTEXT__CORR__oa2sa(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, Oa2Ctx_TransistionActors.Oa2Sa>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (Oa2Ctx_TransistionActors.Oa2Sa) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CONTEXT__CORR__oa2sa_Oa2Sa"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CONTEXT__TRG__trg_sa_arch(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CONTEXT__TRG__trg_sa_arch_SystemAnalysis"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker_CREATE__TRG__trg_system_as_part(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker, org.polarsys.capella.core.data.cs.Part>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker_CREATE__TRG__trg_system_as_part_Part"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker_CREATE__SRC__src_entity_pkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker_CREATE__SRC__src_entity_pkg_EntityPkg"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_source_OperationalAnalysis"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__BWD_44_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_source_OperationalAnalysis"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_source_OperationalAnalysis"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__FWD_66_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_source_OperationalAnalysis"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CONTEXT__TRG__trg_componenet_pkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CONTEXT__TRG__trg_componenet_pkg_SystemComponentPkg"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CONTEXT__SRC__src_top_level_entity(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, org.polarsys.capella.core.data.oa.Entity>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CONTEXT__SRC__src_top_level_entity_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemAnalysis_OwnedSystemComponentPkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemAnalysis_ownedSystemComponentPkg_0_reference").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil,(org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG_1_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil,(org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG_1_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil,(org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__TRG_5_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil,(org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__TRG_39_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil,(org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil,(org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__FWD_66_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil,(org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__TRG_74_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil,(org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CREATE__TRG__trg_system_part(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, org.polarsys.capella.core.data.cs.Part>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CREATE__TRG__trg_system_part_Part"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CONTEXT__TRG__trg_sa_arch(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CONTEXT__TRG__trg_sa_arch_SystemAnalysis"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CREATE__CORR__part2part(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, Oa2Ctx_TransistionActors.OaPart2SaPart>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (Oa2Ctx_TransistionActors.OaPart2SaPart) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CREATE__CORR__part2part_OaPart2SaPart"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_target_SystemAnalysis"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__BWD_44_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_target_SystemAnalysis"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_target_SystemAnalysis"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__FWD_66_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_target_SystemAnalysis"), getSelf());
		});
		feature2addEdgeConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getOperationalAnalysis_OwnedEntityPkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("OperationalAnalysis_ownedEntityPkg_0_reference").tell(new ReferenceAdded<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil,(org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getNewValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_11_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil,(org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getNewValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_11_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil,(org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getNewValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__SRC_32_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil,(org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getNewValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__BWD_44_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil,(org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getNewValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil,(org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getNewValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__SRC_61_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil,(org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getNewValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker_CREATE__CORR__new_oa2sa(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker, Oa2Ctx_TransistionActors.Oa2Sa>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) notification.getNotifier(), (Oa2Ctx_TransistionActors.Oa2Sa) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker_CREATE__CORR__new_oa2sa_Oa2Sa"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CREATE__TRG__trg_sys_component(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CREATE__TRG__trg_sys_component_SystemComponent"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CREATE__SRC__src_operational_part(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, org.polarsys.capella.core.data.cs.Part>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CREATE__SRC__src_operational_part_Part"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker_CREATE__SRC__src_oa_arch(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker, org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker_CREATE__SRC__src_oa_arch_OperationalAnalysis"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOaPart2SaPart_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.OaPart2SaPart, org.polarsys.capella.core.data.cs.Part>(incUtil,(Oa2Ctx_TransistionActors.OaPart2SaPart) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "Oa2Ctx_TransistionActors.OaPart2SaPart_target_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.OaPart2SaPart, org.polarsys.capella.core.data.cs.Part>(incUtil,(Oa2Ctx_TransistionActors.OaPart2SaPart) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "Oa2Ctx_TransistionActors.OaPart2SaPart_target_Part"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CREATE__TRG__trg_sys_part(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.cs.Part>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CREATE__TRG__trg_sys_part_Part"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CONTEXT__SRC__src_entity_pkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CONTEXT__SRC__src_entity_pkg_EntityPkg"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CREATE__CORR__part2part(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, Oa2Ctx_TransistionActors.OaPart2SaPart>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (Oa2Ctx_TransistionActors.OaPart2SaPart) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CREATE__CORR__part2part_OaPart2SaPart"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker_CREATE__TRG__trg_system_component_pkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker_CREATE__TRG__trg_system_component_pkg_SystemComponentPkg"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CREATE__SRC__src_operational_entity(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, org.polarsys.capella.core.data.oa.Entity>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CREATE__SRC__src_operational_entity_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOaPart2SaPart_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.OaPart2SaPart, org.polarsys.capella.core.data.cs.Part>(incUtil,(Oa2Ctx_TransistionActors.OaPart2SaPart) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "Oa2Ctx_TransistionActors.OaPart2SaPart_source_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.OaPart2SaPart, org.polarsys.capella.core.data.cs.Part>(incUtil,(Oa2Ctx_TransistionActors.OaPart2SaPart) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getNewValue(), "Oa2Ctx_TransistionActors.OaPart2SaPart_source_Part"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getEntity2SystemComponent_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Entity2SystemComponent, org.polarsys.capella.core.data.oa.Entity>(incUtil,(Oa2Ctx_TransistionActors.Entity2SystemComponent) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getNewValue(), "Oa2Ctx_TransistionActors.Entity2SystemComponent_source_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Entity2SystemComponent, org.polarsys.capella.core.data.oa.Entity>(incUtil,(Oa2Ctx_TransistionActors.Entity2SystemComponent) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getNewValue(), "Oa2Ctx_TransistionActors.Entity2SystemComponent_source_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CONTEXT__TRG__trg_system_component_pkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CONTEXT__TRG__trg_system_component_pkg_SystemComponentPkg"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CREATE__CORR__OaEntity2SaSysComponent(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, Oa2Ctx_TransistionActors.Entity2SystemComponent>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (Oa2Ctx_TransistionActors.Entity2SystemComponent) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CREATE__CORR__OaEntity2SaSysComponent_Entity2SystemComponent"), getSelf());
		});
		feature2addEdgeConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getEntity_OwnedEntities(), notification -> {
			incUtil.newMessage();
			name2actor.get("Entity_ownedEntities_0_reference").tell(new ReferenceAdded<org.polarsys.capella.core.data.oa.Entity, org.polarsys.capella.core.data.oa.Entity>(incUtil,(org.polarsys.capella.core.data.oa.Entity) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getNewValue(), "org.polarsys.capella.core.data.oa.Entity_ownedEntities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_src_oa_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_48_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.oa.Entity, org.polarsys.capella.core.data.oa.Entity>(incUtil,(org.polarsys.capella.core.data.oa.Entity) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getNewValue(), "org.polarsys.capella.core.data.oa.Entity_ownedEntities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__SRC_109_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.oa.Entity, org.polarsys.capella.core.data.oa.Entity>(incUtil,(org.polarsys.capella.core.data.oa.Entity) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getNewValue(), "org.polarsys.capella.core.data.oa.Entity_ownedEntities_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CREATE__SRC__src_oa_entity(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.oa.Entity>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CREATE__SRC__src_oa_entity_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker_CREATE__TRG__trg_sa_arch(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker_CREATE__TRG__trg_sa_arch_SystemAnalysis"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CONTEXT__SRC__src_oa_arch(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CONTEXT__SRC__src_oa_arch_OperationalAnalysis"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CREATE__SRC__src_oa_part(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.cs.Part>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CREATE__SRC__src_oa_part_Part"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getEntity2SystemComponent_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Entity2SystemComponent, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil, (Oa2Ctx_TransistionActors.Entity2SystemComponent) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getOldValue(), "Oa2Ctx_TransistionActors.Entity2SystemComponent_target_SystemComponent"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Entity2SystemComponent, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil, (Oa2Ctx_TransistionActors.Entity2SystemComponent) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getOldValue(), "Oa2Ctx_TransistionActors.Entity2SystemComponent_target_SystemComponent"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemComponentPkg_OwnedSystemComponents(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_ownedSystemComponents_0_reference").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemComponentPkg, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil, (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemComponentPkg_ownedSystemComponents_SystemComponent"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_ownedSystemComponents_1_reference").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemComponentPkg, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil, (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemComponentPkg_ownedSystemComponents_SystemComponent"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__TRG_5_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemComponentPkg, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil, (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemComponentPkg_ownedSystemComponents_SystemComponent"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__TRG_39_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemComponentPkg, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil, (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemComponentPkg_ownedSystemComponents_SystemComponent"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemComponentPkg, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil, (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemComponentPkg_ownedSystemComponents_SystemComponent"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__TRG_74_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemComponentPkg, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil, (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemComponentPkg_ownedSystemComponents_SystemComponent"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE.getComponentPkg_OwnedParts(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_ownedParts_0_reference").tell(new ReferenceDeleted<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil, (org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_ownedParts_1_reference").tell(new ReferenceDeleted<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil, (org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__TRG_5_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil, (org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__TRG_39_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil, (org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil, (org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil, (org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__SRC_61_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil, (org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__TRG_74_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil, (org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively_src_operational_part_ownedParts_incoming_SRC__FILTER_NAC_SRC_84_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.cs.ComponentPkg, org.polarsys.capella.core.data.cs.Part>(incUtil, (org.polarsys.capella.core.data.cs.ComponentPkg) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "org.polarsys.capella.core.data.cs.ComponentPkg_ownedParts_Part"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CREATE__TRG__trg_system_component(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CREATE__TRG__trg_system_component_SystemComponent"), getSelf());
		});
		feature2removeEdgeConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getAbstractTypedElement_AbstractType(), notification -> {
			incUtil.newMessage();
			name2actor.get("Part_abstractType_0_reference").tell(new ReferenceDeleted<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil, (modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getOldValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Part_abstractType_1_reference").tell(new ReferenceDeleted<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil, (modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getOldValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Part_abstractType_2_reference").tell(new ReferenceDeleted<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil, (modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getOldValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__TRG_5_localSearch").tell(new ReferenceDeleted<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil, (modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getOldValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__TRG_39_localSearch").tell(new ReferenceDeleted<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil, (modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getOldValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceDeleted<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil, (modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getOldValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceDeleted<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil, (modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getOldValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__SRC_61_localSearch").tell(new ReferenceDeleted<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil, (modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getOldValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__TRG_74_localSearch").tell(new ReferenceDeleted<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil, (modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getOldValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__SRC_109_localSearch").tell(new ReferenceDeleted<modellingcore.AbstractTypedElement, modellingcore.AbstractType>(incUtil, (modellingcore.AbstractTypedElement) notification.getNotifier(), (modellingcore.AbstractType) notification.getOldValue(), "modellingcore.AbstractTypedElement_abstractType_AbstractType"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getEntityPkg_OwnedEntities(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.oa.EntityPkg, org.polarsys.capella.core.data.oa.Entity>(incUtil, (org.polarsys.capella.core.data.oa.EntityPkg) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getOldValue(), "org.polarsys.capella.core.data.oa.EntityPkg_ownedEntities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__SRC_61_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.oa.EntityPkg, org.polarsys.capella.core.data.oa.Entity>(incUtil, (org.polarsys.capella.core.data.oa.EntityPkg) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getOldValue(), "org.polarsys.capella.core.data.oa.EntityPkg_ownedEntities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively_src_operational_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_81_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.oa.EntityPkg, org.polarsys.capella.core.data.oa.Entity>(incUtil, (org.polarsys.capella.core.data.oa.EntityPkg) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getOldValue(), "org.polarsys.capella.core.data.oa.EntityPkg_ownedEntities_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE.getClassifier_OwnedFeatures(), notification -> {
			incUtil.newMessage();
			name2actor.get("Entity_ownedFeatures_0_reference").tell(new ReferenceDeleted<org.polarsys.capella.core.data.capellacore.Classifier, org.polarsys.capella.core.data.capellacore.Feature>(incUtil, (org.polarsys.capella.core.data.capellacore.Classifier) notification.getNotifier(), (org.polarsys.capella.core.data.capellacore.Feature) notification.getOldValue(), "org.polarsys.capella.core.data.capellacore.Classifier_ownedFeatures_Feature"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__SRC_109_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.capellacore.Classifier, org.polarsys.capella.core.data.capellacore.Feature>(incUtil, (org.polarsys.capella.core.data.capellacore.Classifier) notification.getNotifier(), (org.polarsys.capella.core.data.capellacore.Feature) notification.getOldValue(), "org.polarsys.capella.core.data.capellacore.Classifier_ownedFeatures_Feature"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker_CREATE__TRG__trg_system_as_component(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker_CREATE__TRG__trg_system_as_component_SystemComponent"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CREATE__CORR__entity2component(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, Oa2Ctx_TransistionActors.Entity2SystemComponent>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (Oa2Ctx_TransistionActors.Entity2SystemComponent) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CREATE__CORR__entity2component_Entity2SystemComponent"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CONTEXT__CORR__oa2sa(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, Oa2Ctx_TransistionActors.Oa2Sa>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (Oa2Ctx_TransistionActors.Oa2Sa) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CONTEXT__CORR__oa2sa_Oa2Sa"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CONTEXT__TRG__trg_sa_arch(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CONTEXT__TRG__trg_sa_arch_SystemAnalysis"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker_CREATE__TRG__trg_system_as_part(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker, org.polarsys.capella.core.data.cs.Part>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker_CREATE__TRG__trg_system_as_part_Part"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker_CREATE__SRC__src_entity_pkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker_CREATE__SRC__src_entity_pkg_EntityPkg"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_source_OperationalAnalysis"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__BWD_44_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_source_OperationalAnalysis"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_source_OperationalAnalysis"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__FWD_66_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_source_OperationalAnalysis"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CONTEXT__TRG__trg_componenet_pkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CONTEXT__TRG__trg_componenet_pkg_SystemComponentPkg"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CONTEXT__SRC__src_top_level_entity(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, org.polarsys.capella.core.data.oa.Entity>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CONTEXT__SRC__src_top_level_entity_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemAnalysis_OwnedSystemComponentPkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemAnalysis_ownedSystemComponentPkg_0_reference").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG_1_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation_trg_sa_arch_ownedSystemComponentPkg_outgoing_TRG__FILTER_NAC_TRG_1_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__TRG_5_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__TRG_39_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__FWD_66_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__TRG_74_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CREATE__TRG__trg_system_part(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, org.polarsys.capella.core.data.cs.Part>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CREATE__TRG__trg_system_part_Part"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CONTEXT__TRG__trg_sa_arch(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CONTEXT__TRG__trg_sa_arch_SystemAnalysis"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CREATE__CORR__part2part(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, Oa2Ctx_TransistionActors.OaPart2SaPart>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (Oa2Ctx_TransistionActors.OaPart2SaPart) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CREATE__CORR__part2part_OaPart2SaPart"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_target_SystemAnalysis"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__BWD_44_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_target_SystemAnalysis"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_target_SystemAnalysis"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__FWD_66_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_target_SystemAnalysis"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getOperationalAnalysis_OwnedEntityPkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("OperationalAnalysis_ownedEntityPkg_0_reference").tell(new ReferenceDeleted<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getOldValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_11_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getOldValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation_src_oa_arch_ownedEntityPkg_outgoing_SRC__FILTER_NAC_SRC_11_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getOldValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__SRC_32_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getOldValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__BWD_44_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getOldValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CC_51_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getOldValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__SRC_61_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getOldValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker_CREATE__CORR__new_oa2sa(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker, Oa2Ctx_TransistionActors.Oa2Sa>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) notification.getNotifier(), (Oa2Ctx_TransistionActors.Oa2Sa) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker_CREATE__CORR__new_oa2sa_Oa2Sa"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CREATE__TRG__trg_sys_component(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponent) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CREATE__TRG__trg_sys_component_SystemComponent"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CREATE__SRC__src_operational_part(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, org.polarsys.capella.core.data.cs.Part>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CREATE__SRC__src_operational_part_Part"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker_CREATE__SRC__src_oa_arch(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker, org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker_CREATE__SRC__src_oa_arch_OperationalAnalysis"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOaPart2SaPart_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.OaPart2SaPart, org.polarsys.capella.core.data.cs.Part>(incUtil, (Oa2Ctx_TransistionActors.OaPart2SaPart) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "Oa2Ctx_TransistionActors.OaPart2SaPart_target_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.OaPart2SaPart, org.polarsys.capella.core.data.cs.Part>(incUtil, (Oa2Ctx_TransistionActors.OaPart2SaPart) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "Oa2Ctx_TransistionActors.OaPart2SaPart_target_Part"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CREATE__TRG__trg_sys_part(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.cs.Part>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CREATE__TRG__trg_sys_part_Part"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CONTEXT__SRC__src_entity_pkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CONTEXT__SRC__src_entity_pkg_EntityPkg"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CREATE__CORR__part2part(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, Oa2Ctx_TransistionActors.OaPart2SaPart>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (Oa2Ctx_TransistionActors.OaPart2SaPart) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CREATE__CORR__part2part_OaPart2SaPart"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker_CREATE__TRG__trg_system_component_pkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker_CREATE__TRG__trg_system_component_pkg_SystemComponentPkg"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CREATE__SRC__src_operational_entity(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, org.polarsys.capella.core.data.oa.Entity>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CREATE__SRC__src_operational_entity_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOaPart2SaPart_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.OaPart2SaPart, org.polarsys.capella.core.data.cs.Part>(incUtil, (Oa2Ctx_TransistionActors.OaPart2SaPart) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "Oa2Ctx_TransistionActors.OaPart2SaPart_source_Part"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.OaPart2SaPart, org.polarsys.capella.core.data.cs.Part>(incUtil, (Oa2Ctx_TransistionActors.OaPart2SaPart) notification.getNotifier(), (org.polarsys.capella.core.data.cs.Part) notification.getOldValue(), "Oa2Ctx_TransistionActors.OaPart2SaPart_source_Part"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getEntity2SystemComponent_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Entity2SystemComponent, org.polarsys.capella.core.data.oa.Entity>(incUtil, (Oa2Ctx_TransistionActors.Entity2SystemComponent) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getOldValue(), "Oa2Ctx_TransistionActors.Entity2SystemComponent_source_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Entity2SystemComponent, org.polarsys.capella.core.data.oa.Entity>(incUtil, (Oa2Ctx_TransistionActors.Entity2SystemComponent) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getOldValue(), "Oa2Ctx_TransistionActors.Entity2SystemComponent_source_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CONTEXT__TRG__trg_system_component_pkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CONTEXT__TRG__trg_system_component_pkg_SystemComponentPkg"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors_recursively__Marker_CREATE__CORR__OaEntity2SaSysComponent(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker, Oa2Ctx_TransistionActors.Entity2SystemComponent>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) notification.getNotifier(), (Oa2Ctx_TransistionActors.Entity2SystemComponent) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker_CREATE__CORR__OaEntity2SaSysComponent_Entity2SystemComponent"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getEntity_OwnedEntities(), notification -> {
			incUtil.newMessage();
			name2actor.get("Entity_ownedEntities_0_reference").tell(new ReferenceDeleted<org.polarsys.capella.core.data.oa.Entity, org.polarsys.capella.core.data.oa.Entity>(incUtil, (org.polarsys.capella.core.data.oa.Entity) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getOldValue(), "org.polarsys.capella.core.data.oa.Entity_ownedEntities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_src_oa_entity_ownedEntities_incoming_SRC__FILTER_NAC_SRC_48_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.oa.Entity, org.polarsys.capella.core.data.oa.Entity>(incUtil, (org.polarsys.capella.core.data.oa.Entity) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getOldValue(), "org.polarsys.capella.core.data.oa.Entity_ownedEntities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__SRC_109_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.oa.Entity, org.polarsys.capella.core.data.oa.Entity>(incUtil, (org.polarsys.capella.core.data.oa.Entity) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getOldValue(), "org.polarsys.capella.core.data.oa.Entity_ownedEntities_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CREATE__SRC__src_oa_entity(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.oa.Entity>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.oa.Entity) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CREATE__SRC__src_oa_entity_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_generation__Marker_CREATE__TRG__trg_sa_arch(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__CONSISTENCY_36_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker_CREATE__TRG__trg_sa_arch_SystemAnalysis"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_transition_actors__Marker_CONTEXT__SRC__src_oa_arch(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__CONSISTENCY_70_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker, org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) notification.getNotifier(), (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker_CONTEXT__SRC__src_oa_arch_OperationalAnalysis"), getSelf());
		});
	}

	@Override
	public void preStart() throws Exception {
		super.preStart();
	}

	@Override
	public void postStop() throws Exception {
		if(HiPEConfig.logWorkloadActivated) {
			DecimalFormat df = new DecimalFormat("0.#####");
	        df.setMaximumFractionDigits(5);
			System.err.println("DispatchNode" + ";"  + counter + ";" + df.format((double) time / (double) (1000 * 1000 * 1000)));
		}
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder() //
				.match(NotificationContainer.class, this::handleNotificationContainer)
				.match(NoMoreInput.class, this::sendFinished) //
				.build();
	}

	private void sendFinished(NoMoreInput m) {
		incUtil.allMessagesInserted();
	}
	
	private void handleNotificationContainer(NotificationContainer nc) {
		counter++;
		long tic = System.nanoTime();
		nc.notifications.parallelStream().forEach(this::handleNotification);
		time += System.nanoTime() - tic;
	}
	
	private void handleNotification(Notification notification) {
		switch (notification.getEventType()) {
		case Notification.ADD:
			handleAdd(notification);
			break;
		case Notification.REMOVE:
			handleRemove(notification);
			break;
		case Notification.REMOVING_ADAPTER:
			handleRemoveAdapter(notification);
			break;	
		case Notification.SET:
			handleSet(notification);
			break;
		}
	}

	private void handleAdd(Notification notification) {
		if(notification.getFeature() == null) 
			handleAddedNode(notification.getNewValue());
		else
			handleAddedEdge(notification);
	}

	private void handleAddedNode(Object node) {
		if(node == null) 
			return;
			
		EObject obj = (EObject) node;
		if(type2addConsumer.containsKey(obj.eClass())) {
			type2addConsumer.get(obj.eClass()).accept(node);
		}
	}
	
	private void handleSet(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2setConsumer.containsKey(feature)) {
			feature2setConsumer.get(feature).accept(notification);
		}
	}

	private void handleAddedEdge(Notification notification) {
		//check for self-edges
		if(notification.getNotifier().equals(notification.getNewValue()))
			handleAddedNode(notification.getNewValue());
					
		Object feature = notification.getFeature();
		if(feature2addEdgeConsumer.containsKey(feature)) {
			feature2addEdgeConsumer.get(feature).accept(notification);
		}
	}

	private void handleRemove(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2removeEdgeConsumer.containsKey(feature)) {
			feature2removeEdgeConsumer.get(feature).accept(notification);
		}
	}
	
	private void handleRemoveAdapter(Notification notification) {
		Object node = notification.getNotifier();
		if (node instanceof Oa2Ctx_TransistionActors.Oa2Sa) {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_object").tell(new ObjectDeleted<Oa2Ctx_TransistionActors.Oa2Sa>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa) node), getSelf());
		}
		if (node instanceof Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_generation__Marker_object").tell(new ObjectDeleted<Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_generation__Marker) node), getSelf());
		}
		if (node instanceof Oa2Ctx_TransistionActors.Entity2SystemComponent) {
			incUtil.newMessage();
			name2actor.get("Entity2SystemComponent_object").tell(new ObjectDeleted<Oa2Ctx_TransistionActors.Entity2SystemComponent>(incUtil, (Oa2Ctx_TransistionActors.Entity2SystemComponent) node), getSelf());
		}
		if (node instanceof Oa2Ctx_TransistionActors.OaPart2SaPart) {
			incUtil.newMessage();
			name2actor.get("OaPart2SaPart_object").tell(new ObjectDeleted<Oa2Ctx_TransistionActors.OaPart2SaPart>(incUtil, (Oa2Ctx_TransistionActors.OaPart2SaPart) node), getSelf());
		}
		if (node instanceof Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__Marker_object").tell(new ObjectDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors__Marker) node), getSelf());
		}
		if (node instanceof Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors_recursively__Marker_object").tell(new ObjectDeleted<Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa_transition_actors_recursively__Marker) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.cs.ComponentPkg) {
			incUtil.newMessage();
			name2actor.get("ComponentPkg_object").tell(new ObjectDeleted<org.polarsys.capella.core.data.cs.ComponentPkg>(incUtil, (org.polarsys.capella.core.data.cs.ComponentPkg) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.cs.Part) {
			incUtil.newMessage();
			name2actor.get("Part_object_SP0").tell(new ObjectDeleted<org.polarsys.capella.core.data.cs.Part>(incUtil, (org.polarsys.capella.core.data.cs.Part) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.cs.Part) {
			incUtil.newMessage();
			name2actor.get("Part_object_SP1").tell(new ObjectDeleted<org.polarsys.capella.core.data.cs.Part>(incUtil, (org.polarsys.capella.core.data.cs.Part) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.cs.Part) {
			incUtil.newMessage();
			name2actor.get("Part_object_SP2").tell(new ObjectDeleted<org.polarsys.capella.core.data.cs.Part>(incUtil, (org.polarsys.capella.core.data.cs.Part) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.cs.Part) {
			incUtil.newMessage();
			name2actor.get("Part_object_SP3").tell(new ObjectDeleted<org.polarsys.capella.core.data.cs.Part>(incUtil, (org.polarsys.capella.core.data.cs.Part) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.oa.OperationalAnalysis) {
			incUtil.newMessage();
			name2actor.get("OperationalAnalysis_object_SP0").tell(new ObjectDeleted<org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil, (org.polarsys.capella.core.data.oa.OperationalAnalysis) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.oa.OperationalAnalysis) {
			incUtil.newMessage();
			name2actor.get("OperationalAnalysis_object_SP1").tell(new ObjectDeleted<org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil, (org.polarsys.capella.core.data.oa.OperationalAnalysis) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.oa.EntityPkg) {
			incUtil.newMessage();
			name2actor.get("EntityPkg_object_SP0").tell(new ObjectDeleted<org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, (org.polarsys.capella.core.data.oa.EntityPkg) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.oa.EntityPkg) {
			incUtil.newMessage();
			name2actor.get("EntityPkg_object_SP1").tell(new ObjectDeleted<org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, (org.polarsys.capella.core.data.oa.EntityPkg) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.oa.Entity) {
			incUtil.newMessage();
			name2actor.get("Entity_object_SP0").tell(new ObjectDeleted<org.polarsys.capella.core.data.oa.Entity>(incUtil, (org.polarsys.capella.core.data.oa.Entity) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.oa.Entity) {
			incUtil.newMessage();
			name2actor.get("Entity_object_SP1").tell(new ObjectDeleted<org.polarsys.capella.core.data.oa.Entity>(incUtil, (org.polarsys.capella.core.data.oa.Entity) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.oa.Entity) {
			incUtil.newMessage();
			name2actor.get("Entity_object_SP2").tell(new ObjectDeleted<org.polarsys.capella.core.data.oa.Entity>(incUtil, (org.polarsys.capella.core.data.oa.Entity) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.ctx.SystemAnalysis) {
			incUtil.newMessage();
			name2actor.get("SystemAnalysis_object_SP0").tell(new ObjectDeleted<org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil, (org.polarsys.capella.core.data.ctx.SystemAnalysis) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.ctx.SystemAnalysis) {
			incUtil.newMessage();
			name2actor.get("SystemAnalysis_object_SP1").tell(new ObjectDeleted<org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil, (org.polarsys.capella.core.data.ctx.SystemAnalysis) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.ctx.SystemComponent) {
			incUtil.newMessage();
			name2actor.get("SystemComponent_object_SP0").tell(new ObjectDeleted<org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil, (org.polarsys.capella.core.data.ctx.SystemComponent) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.ctx.SystemComponent) {
			incUtil.newMessage();
			name2actor.get("SystemComponent_object_SP1").tell(new ObjectDeleted<org.polarsys.capella.core.data.ctx.SystemComponent>(incUtil, (org.polarsys.capella.core.data.ctx.SystemComponent) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg) {
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_object_SP0").tell(new ObjectDeleted<org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (org.polarsys.capella.core.data.ctx.SystemComponentPkg) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg) {
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_object_SP1").tell(new ObjectDeleted<org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (org.polarsys.capella.core.data.ctx.SystemComponentPkg) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg) {
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_object_SP2").tell(new ObjectDeleted<org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (org.polarsys.capella.core.data.ctx.SystemComponentPkg) node), getSelf());
		}
	}
}

