package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryExchangeInputModel
 */
public class CRPartyDirectoryEntryExchangeInputModel   {
  private String partyDataManagementServicingSessionReference = null;

  private String partyDirectoryEntryInstanceReference = null;

  private Object partyDirectoryEntryExchangeActionTaskRecord = null;

  private CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest partyDirectoryEntryExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return partyDataManagementServicingSessionReference
  **/

  public String getPartyDataManagementServicingSessionReference() {
    return partyDataManagementServicingSessionReference;
  }

  public void setPartyDataManagementServicingSessionReference(String partyDataManagementServicingSessionReference) {
    this.partyDataManagementServicingSessionReference = partyDataManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Party Directory Entry instance 
   * @return partyDirectoryEntryInstanceReference
  **/

  public String getPartyDirectoryEntryInstanceReference() {
    return partyDirectoryEntryInstanceReference;
  }

  public void setPartyDirectoryEntryInstanceReference(String partyDirectoryEntryInstanceReference) {
    this.partyDirectoryEntryInstanceReference = partyDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return partyDirectoryEntryExchangeActionTaskRecord
  **/

  public Object getPartyDirectoryEntryExchangeActionTaskRecord() {
    return partyDirectoryEntryExchangeActionTaskRecord;
  }

  public void setPartyDirectoryEntryExchangeActionTaskRecord(Object partyDirectoryEntryExchangeActionTaskRecord) {
    this.partyDirectoryEntryExchangeActionTaskRecord = partyDirectoryEntryExchangeActionTaskRecord;
  }


  /**
   * Get partyDirectoryEntryExchangeActionRequest
   * @return partyDirectoryEntryExchangeActionRequest
  **/

  public CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest getPartyDirectoryEntryExchangeActionRequest() {
    return partyDirectoryEntryExchangeActionRequest;
  }

  public void setPartyDirectoryEntryExchangeActionRequest(CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest partyDirectoryEntryExchangeActionRequest) {
    this.partyDirectoryEntryExchangeActionRequest = partyDirectoryEntryExchangeActionRequest;
  }


}

