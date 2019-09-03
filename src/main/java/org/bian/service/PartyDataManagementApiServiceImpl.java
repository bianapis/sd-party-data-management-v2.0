/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PartyDataManagementApiServiceImpl implements PartyDataManagementApiService {

	public SDPartyDataManagementActivateOutputModel activate(SDPartyDataManagementActivateInputModel request){
		return JsonReader.read("activate-SDPartyDataManagementActivateOutputModel.json",new TypeReference<SDPartyDataManagementActivateOutputModel>(){});
	}
	
	public SDPartyDataManagementConfigureOutputModel configure(String sdReferenceId, SDPartyDataManagementConfigureInputModel request){
		return JsonReader.read("configure-SDPartyDataManagementConfigureOutputModel.json",new TypeReference<SDPartyDataManagementConfigureOutputModel>(){});
	}
	
	public CRPartyDirectoryEntryControlOutputModel control(String sdReferenceId, String crReferenceId, CRPartyDirectoryEntryControlInputModel request){
		return JsonReader.read("control-CRPartyDirectoryEntryControlOutputModel.json",new TypeReference<CRPartyDirectoryEntryControlOutputModel>(){});
	}
	
	public BQAssociationsExchangeOutputModel exchangeAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssociationsExchangeInputModel request){
		return JsonReader.read("exchange-BQAssociationsExchangeOutputModel.json",new TypeReference<BQAssociationsExchangeOutputModel>(){});
	}
	
	public BQProfileExchangeOutputModel exchangeProfile(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProfileExchangeInputModel request){
		return JsonReader.read("exchange-BQProfileExchangeOutputModel.json",new TypeReference<BQProfileExchangeOutputModel>(){});
	}
	
	public BQReferenceExchangeOutputModel exchangeReference(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReferenceExchangeInputModel request){
		return JsonReader.read("exchange-BQReferenceExchangeOutputModel.json",new TypeReference<BQReferenceExchangeOutputModel>(){});
	}
	
	public CRPartyDirectoryEntryExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRPartyDirectoryEntryExchangeInputModel request){
		return JsonReader.read("exchange-CRPartyDirectoryEntryExchangeOutputModel.json",new TypeReference<CRPartyDirectoryEntryExchangeOutputModel>(){});
	}
	
	public BQAssociationsExecuteOutputModel executeAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssociationsExecuteInputModel request){
		return JsonReader.read("execute-BQAssociationsExecuteOutputModel.json",new TypeReference<BQAssociationsExecuteOutputModel>(){});
	}
	
	public BQProfileExecuteOutputModel executeProfile(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProfileExecuteInputModel request){
		return JsonReader.read("execute-BQProfileExecuteOutputModel.json",new TypeReference<BQProfileExecuteOutputModel>(){});
	}
	
	public BQReferenceExecuteOutputModel executeReference(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReferenceExecuteInputModel request){
		return JsonReader.read("execute-BQReferenceExecuteOutputModel.json",new TypeReference<BQReferenceExecuteOutputModel>(){});
	}
	
	public SDPartyDataManagementFeedbackOutputModel feedback(String sdReferenceId, SDPartyDataManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDPartyDataManagementFeedbackOutputModel.json",new TypeReference<SDPartyDataManagementFeedbackOutputModel>(){});
	}
	
	public CRPartyDirectoryEntryRegisterOutputModel register(String sdReferenceId, CRPartyDirectoryEntryRegisterInputModel request){
		return JsonReader.read("register-CRPartyDirectoryEntryRegisterOutputModel.json",new TypeReference<CRPartyDirectoryEntryRegisterOutputModel>(){});
	}
	
	public CRPartyDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRPartyDirectoryEntryRequestInputModel request){
		return JsonReader.read("request-CRPartyDirectoryEntryRequestOutputModel.json",new TypeReference<CRPartyDirectoryEntryRequestOutputModel>(){});
	}
	
	public CRPartyDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRPartyDirectoryEntryRetrieveOutputModel.json",new TypeReference<CRPartyDirectoryEntryRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAssociationsRetrieveOutputModel retrieveAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAssociationsRetrieveOutputModel.json",new TypeReference<BQAssociationsRetrieveOutputModel>(){});
	}
	
	public BQProfileRetrieveOutputModel retrieveProfile(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProfileRetrieveOutputModel.json",new TypeReference<BQProfileRetrieveOutputModel>(){});
	}
	
	public BQReferenceRetrieveOutputModel retrieveReference(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQReferenceRetrieveOutputModel.json",new TypeReference<BQReferenceRetrieveOutputModel>(){});
	}
	
	public SDPartyDataManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDPartyDataManagementRetrieveOutputModel.json",new TypeReference<SDPartyDataManagementRetrieveOutputModel>(){});
	}
	
	public CRPartyDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPartyDirectoryEntryUpdateInputModel request){
		return JsonReader.read("update-CRPartyDirectoryEntryUpdateOutputModel.json",new TypeReference<CRPartyDirectoryEntryUpdateOutputModel>(){});
	}
	
	public BQAssociationsUpdateOutputModel updateAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssociationsUpdateInputModel request){
		return JsonReader.read("update-BQAssociationsUpdateOutputModel.json",new TypeReference<BQAssociationsUpdateOutputModel>(){});
	}
	
	public BQProfileUpdateOutputModel updateProfile(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProfileUpdateInputModel request){
		return JsonReader.read("update-BQProfileUpdateOutputModel.json",new TypeReference<BQProfileUpdateOutputModel>(){});
	}
	
	public BQReferenceUpdateOutputModel updateReference(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReferenceUpdateInputModel request){
		return JsonReader.read("update-BQReferenceUpdateOutputModel.json",new TypeReference<BQReferenceUpdateOutputModel>(){});
	}
	
}
