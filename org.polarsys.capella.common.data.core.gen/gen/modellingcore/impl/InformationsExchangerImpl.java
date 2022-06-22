/**
 */
package modellingcore.impl;

import java.util.Collection;
import modellingcore.AbstractInformationFlow;
import modellingcore.InformationsExchanger;
import modellingcore.ModellingcorePackage;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Informations Exchanger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modellingcore.impl.InformationsExchangerImpl#getIncomingInformationFlows <em>Incoming Information Flows</em>}</li>
 *   <li>{@link modellingcore.impl.InformationsExchangerImpl#getOutgoingInformationFlows <em>Outgoing Information Flows</em>}</li>
 *   <li>{@link modellingcore.impl.InformationsExchangerImpl#getInformationFlows <em>Information Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InformationsExchangerImpl extends ModelElementImpl implements InformationsExchanger {
	/**
	 * The cached value of the '{@link #getIncomingInformationFlows() <em>Incoming Information Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingInformationFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInformationFlow> incomingInformationFlows;
	/**
	 * The cached value of the '{@link #getOutgoingInformationFlows() <em>Outgoing Information Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingInformationFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInformationFlow> outgoingInformationFlows;
	/**
	 * The cached value of the '{@link #getInformationFlows() <em>Information Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInformationFlow> informationFlows;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationsExchangerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModellingcorePackage.Literals.INFORMATIONS_EXCHANGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInformationFlow> getIncomingInformationFlows() {
		if (incomingInformationFlows == null) {
			incomingInformationFlows = new EObjectResolvingEList<AbstractInformationFlow>(AbstractInformationFlow.class, this, ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS);
		}
		return incomingInformationFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInformationFlow> getOutgoingInformationFlows() {
		if (outgoingInformationFlows == null) {
			outgoingInformationFlows = new EObjectResolvingEList<AbstractInformationFlow>(AbstractInformationFlow.class, this, ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS);
		}
		return outgoingInformationFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInformationFlow> getInformationFlows() {
		if (informationFlows == null) {
			informationFlows = new EObjectResolvingEList<AbstractInformationFlow>(AbstractInformationFlow.class, this, ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS);
		}
		return informationFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS:
				return getIncomingInformationFlows();
			case ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS:
				return getOutgoingInformationFlows();
			case ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS:
				return getInformationFlows();
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
			case ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS:
				getIncomingInformationFlows().clear();
				getIncomingInformationFlows().addAll((Collection<? extends AbstractInformationFlow>)newValue);
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
			case ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS:
				getIncomingInformationFlows().clear();
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
			case ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS:
				return incomingInformationFlows != null && !incomingInformationFlows.isEmpty();
			case ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS:
				return outgoingInformationFlows != null && !outgoingInformationFlows.isEmpty();
			case ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS:
				return informationFlows != null && !informationFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InformationsExchangerImpl
