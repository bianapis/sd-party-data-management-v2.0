/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Catalog;

@BianRestController
public class PartyDataManagementApiController {

	@Autowired
	PartyDataManagementApiService service;
	
	@Catalog.Activate
	public BianResponse<SDPartyDataManagementActivateOutputModel> activate(@RequestBody BianRequest<SDPartyDataManagementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Catalog.Configure
	public BianResponse<SDPartyDataManagementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDPartyDataManagementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Control
	public BianResponse<CRPartyDirectoryEntryControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPartyDirectoryEntryControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("associations")
	@Catalog.Exchange
	public BianResponse<BQAssociationsExchangeOutputModel> exchangeAssociations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssociationsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeAssociations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("profile")
	@Catalog.Exchange
	public BianResponse<BQProfileExchangeOutputModel> exchangeProfile(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProfileExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeProfile(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("reference")
	@Catalog.Exchange
	public BianResponse<BQReferenceExchangeOutputModel> exchangeReference(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReferenceExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeReference(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Exchange
	public BianResponse<CRPartyDirectoryEntryExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPartyDirectoryEntryExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("associations")
	@Catalog.Execute
	public BianResponse<BQAssociationsExecuteOutputModel> executeAssociations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssociationsExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeAssociations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("profile")
	@Catalog.Execute
	public BianResponse<BQProfileExecuteOutputModel> executeProfile(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProfileExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeProfile(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("reference")
	@Catalog.Execute
	public BianResponse<BQReferenceExecuteOutputModel> executeReference(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReferenceExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeReference(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Feedback
	public BianResponse<SDPartyDataManagementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDPartyDataManagementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Register
	public BianResponse<CRPartyDirectoryEntryRegisterOutputModel> register(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRPartyDirectoryEntryRegisterInputModel> bianRequest) {
		return BianResponse.forSuccess(service.register(sdReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Request
	public BianResponse<CRPartyDirectoryEntryRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPartyDirectoryEntryRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Retrieve
	public BianResponse<CRPartyDirectoryEntryRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Catalog.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Catalog.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Catalog.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("associations")
	@Catalog.Retrieve
	public BianResponse<BQAssociationsRetrieveOutputModel> retrieveAssociations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssociations(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("profile")
	@Catalog.Retrieve
	public BianResponse<BQProfileRetrieveOutputModel> retrieveProfile(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProfile(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("reference")
	@Catalog.Retrieve
	public BianResponse<BQReferenceRetrieveOutputModel> retrieveReference(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReference(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Catalog.RetrieveSD
	public BianResponse<SDPartyDataManagementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Catalog.Update
	public BianResponse<CRPartyDirectoryEntryUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPartyDirectoryEntryUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("associations")
	@Catalog.Update
	public BianResponse<BQAssociationsUpdateOutputModel> updateAssociations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssociationsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAssociations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("profile")
	@Catalog.Update
	public BianResponse<BQProfileUpdateOutputModel> updateProfile(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProfileUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProfile(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("reference")
	@Catalog.Update
	public BianResponse<BQReferenceUpdateOutputModel> updateReference(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReferenceUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateReference(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
