package Oa2Ctx_TransistionActors.modelgen.hipe.engine.actor;

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
		type2addConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemComponentPkg(), obj -> {
			org.polarsys.capella.core.data.ctx.SystemComponentPkg _systemcomponentpkg = (org.polarsys.capella.core.data.ctx.SystemComponentPkg) obj;
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_object").tell(new ObjectAdded<org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, _systemcomponentpkg), getSelf());
		});
		type2addConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getEntityPkg(), obj -> {
			org.polarsys.capella.core.data.oa.EntityPkg _entitypkg = (org.polarsys.capella.core.data.oa.EntityPkg) obj;
			incUtil.newMessage();
			name2actor.get("EntityPkg_object").tell(new ObjectAdded<org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, _entitypkg), getSelf());
		});
		type2addConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getOperationalAnalysis(), obj -> {
			org.polarsys.capella.core.data.oa.OperationalAnalysis _operationalanalysis = (org.polarsys.capella.core.data.oa.OperationalAnalysis) obj;
			incUtil.newMessage();
			name2actor.get("OperationalAnalysis_object").tell(new ObjectAdded<org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil, _operationalanalysis), getSelf());
		});
		type2addConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemAnalysis(), obj -> {
			org.polarsys.capella.core.data.ctx.SystemAnalysis _systemanalysis = (org.polarsys.capella.core.data.ctx.SystemAnalysis) obj;
			incUtil.newMessage();
			name2actor.get("SystemAnalysis_object").tell(new ObjectAdded<org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil, _systemanalysis), getSelf());
		});
		type2addConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa(), obj -> {
			Oa2Ctx_TransistionActors.Oa2Sa _oa2sa = (Oa2Ctx_TransistionActors.Oa2Sa) obj;
			incUtil.newMessage();
			name2actor.get("Oa2Sa_object").tell(new ObjectAdded<Oa2Ctx_TransistionActors.Oa2Sa>(incUtil, _oa2sa), getSelf());
		});
		type2addConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getEntity(), obj -> {
			org.polarsys.capella.core.data.oa.Entity _entity = (org.polarsys.capella.core.data.oa.Entity) obj;
			incUtil.newMessage();
			name2actor.get("Entity_object").tell(new ObjectAdded<org.polarsys.capella.core.data.oa.Entity>(incUtil, _entity), getSelf());
		});
	}
	
	private void initializeSet() {
		feature2setConsumer.put(modellingcore.ModellingcorePackage.eINSTANCE.getAbstractNamedElement_Name(), notification -> {
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.EntityPkg) {
				incUtil.newMessage();
				name2actor.get("EntityPkg_object").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.ctx.SystemAnalysis) {
				incUtil.newMessage();
				name2actor.get("SystemAnalysis_object").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg) {
				incUtil.newMessage();
				name2actor.get("SystemComponentPkg_object").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.Entity) {
				incUtil.newMessage();
				name2actor.get("Entity_object").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.polarsys.capella.core.data.oa.OperationalAnalysis) {
				incUtil.newMessage();
				name2actor.get("OperationalAnalysis_object").tell(new AttributeChanged<modellingcore.AbstractNamedElement>(incUtil, (modellingcore.AbstractNamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__GEN_1_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_target_SystemAnalysis"), getSelf());
		});
		feature2addEdgeConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemAnalysis_OwnedSystemComponentPkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemAnalysis_ownedSystemComponentPkg_0_reference").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil,(org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__GEN_1_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil,(org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getNewValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
		});
		feature2addEdgeConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getOperationalAnalysis_OwnedEntityPkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__GEN_1_localSearch").tell(new ReferenceAdded<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil,(org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getNewValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
		});
		feature2addEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__GEN_1_localSearch").tell(new ReferenceAdded<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil,(Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNewValue(), "Oa2Ctx_TransistionActors.Oa2Sa_source_OperationalAnalysis"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__GEN_1_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_target_SystemAnalysis"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE.getSystemAnalysis_OwnedSystemComponentPkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemAnalysis_ownedSystemComponentPkg_0_reference").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__GEN_1_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.ctx.SystemAnalysis, org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (org.polarsys.capella.core.data.ctx.SystemAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.ctx.SystemComponentPkg) notification.getOldValue(), "org.polarsys.capella.core.data.ctx.SystemAnalysis_ownedSystemComponentPkg_SystemComponentPkg"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE.getOperationalAnalysis_OwnedEntityPkg(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__GEN_1_localSearch").tell(new ReferenceDeleted<org.polarsys.capella.core.data.oa.OperationalAnalysis, org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getNotifier(), (org.polarsys.capella.core.data.oa.EntityPkg) notification.getOldValue(), "org.polarsys.capella.core.data.oa.OperationalAnalysis_ownedEntityPkg_EntityPkg"), getSelf());
		});
		feature2removeEdgeConsumer.put(Oa2Ctx_TransistionActors.Oa2Ctx_TransistionActorsPackage.eINSTANCE.getOa2Sa_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_transition_actors__GEN_1_localSearch").tell(new ReferenceDeleted<Oa2Ctx_TransistionActors.Oa2Sa, org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa) notification.getNotifier(), (org.polarsys.capella.core.data.oa.OperationalAnalysis) notification.getOldValue(), "Oa2Ctx_TransistionActors.Oa2Sa_source_OperationalAnalysis"), getSelf());
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
		if (node instanceof org.polarsys.capella.core.data.ctx.SystemComponentPkg) {
			incUtil.newMessage();
			name2actor.get("SystemComponentPkg_object").tell(new ObjectDeleted<org.polarsys.capella.core.data.ctx.SystemComponentPkg>(incUtil, (org.polarsys.capella.core.data.ctx.SystemComponentPkg) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.ctx.SystemAnalysis) {
			incUtil.newMessage();
			name2actor.get("SystemAnalysis_object").tell(new ObjectDeleted<org.polarsys.capella.core.data.ctx.SystemAnalysis>(incUtil, (org.polarsys.capella.core.data.ctx.SystemAnalysis) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.oa.EntityPkg) {
			incUtil.newMessage();
			name2actor.get("EntityPkg_object").tell(new ObjectDeleted<org.polarsys.capella.core.data.oa.EntityPkg>(incUtil, (org.polarsys.capella.core.data.oa.EntityPkg) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.oa.OperationalAnalysis) {
			incUtil.newMessage();
			name2actor.get("OperationalAnalysis_object").tell(new ObjectDeleted<org.polarsys.capella.core.data.oa.OperationalAnalysis>(incUtil, (org.polarsys.capella.core.data.oa.OperationalAnalysis) node), getSelf());
		}
		if (node instanceof org.polarsys.capella.core.data.oa.Entity) {
			incUtil.newMessage();
			name2actor.get("Entity_object").tell(new ObjectDeleted<org.polarsys.capella.core.data.oa.Entity>(incUtil, (org.polarsys.capella.core.data.oa.Entity) node), getSelf());
		}
		if (node instanceof Oa2Ctx_TransistionActors.Oa2Sa) {
			incUtil.newMessage();
			name2actor.get("Oa2Sa_object").tell(new ObjectDeleted<Oa2Ctx_TransistionActors.Oa2Sa>(incUtil, (Oa2Ctx_TransistionActors.Oa2Sa) node), getSelf());
		}
	}
}

