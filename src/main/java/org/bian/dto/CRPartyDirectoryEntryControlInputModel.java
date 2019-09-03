package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyDirectoryEntryControlInputModelPartyDirectoryEntryControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryControlInputModel
 */
public class CRPartyDirectoryEntryControlInputModel   {
  private String partyDataManagementServicingSessionReference = null;

  private String partyDirectoryEntryInstanceReference = null;

  private Object partyDirectoryEntryControlActionTaskRecord = null;

  private CRPartyDirectoryEntryControlInputModelPartyDirectoryEntryControlActionRequest partyDirectoryEntryControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return partyDirectoryEntryControlActionTaskRecord
  **/

  public Object getPartyDirectoryEntryControlActionTaskRecord() {
    return partyDirectoryEntryControlActionTaskRecord;
  }

  public void setPartyDirectoryEntryControlActionTaskRecord(Object partyDirectoryEntryControlActionTaskRecord) {
    this.partyDirectoryEntryControlActionTaskRecord = partyDirectoryEntryControlActionTaskRecord;
  }


  /**
   * Get partyDirectoryEntryControlActionRequest
   * @return partyDirectoryEntryControlActionRequest
  **/

  public CRPartyDirectoryEntryControlInputModelPartyDirectoryEntryControlActionRequest getPartyDirectoryEntryControlActionRequest() {
    return partyDirectoryEntryControlActionRequest;
  }

  public void setPartyDirectoryEntryControlActionRequest(CRPartyDirectoryEntryControlInputModelPartyDirectoryEntryControlActionRequest partyDirectoryEntryControlActionRequest) {
    this.partyDirectoryEntryControlActionRequest = partyDirectoryEntryControlActionRequest;
  }


}

