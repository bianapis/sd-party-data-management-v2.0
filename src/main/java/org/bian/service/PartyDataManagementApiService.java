/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PartyDataManagementApiService {

	SDPartyDataManagementActivateOutputModel activate(SDPartyDataManagementActivateInputModel request);
	
	SDPartyDataManagementConfigureOutputModel configure(String sdReferenceId, SDPartyDataManagementConfigureInputModel request);
	
	CRPartyDirectoryEntryControlOutputModel control(String sdReferenceId, String crReferenceId, CRPartyDirectoryEntryControlInputModel request);
	
	BQAssociationsExchangeOutputModel exchangeAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssociationsExchangeInputModel request);
	
	BQProfileExchangeOutputModel exchangeProfile(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProfileExchangeInputModel request);
	
	BQReferenceExchangeOutputModel exchangeReference(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReferenceExchangeInputModel request);
	
	CRPartyDirectoryEntryExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRPartyDirectoryEntryExchangeInputModel request);
	
	BQAssociationsExecuteOutputModel executeAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssociationsExecuteInputModel request);
	
	BQProfileExecuteOutputModel executeProfile(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProfileExecuteInputModel request);
	
	BQReferenceExecuteOutputModel executeReference(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReferenceExecuteInputModel request);
	
	SDPartyDataManagementFeedbackOutputModel feedback(String sdReferenceId, SDPartyDataManagementFeedbackInputModel request);
	
	CRPartyDirectoryEntryRegisterOutputModel register(String sdReferenceId, CRPartyDirectoryEntryRegisterInputModel request);
	
	CRPartyDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRPartyDirectoryEntryRequestInputModel request);
	
	CRPartyDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAssociationsRetrieveOutputModel retrieveAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProfileRetrieveOutputModel retrieveProfile(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQReferenceRetrieveOutputModel retrieveReference(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDPartyDataManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRPartyDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPartyDirectoryEntryUpdateInputModel request);
	
	BQAssociationsUpdateOutputModel updateAssociations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssociationsUpdateInputModel request);
	
	BQProfileUpdateOutputModel updateProfile(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProfileUpdateInputModel request);
	
	BQReferenceUpdateOutputModel updateReference(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReferenceUpdateInputModel request);
	
}
