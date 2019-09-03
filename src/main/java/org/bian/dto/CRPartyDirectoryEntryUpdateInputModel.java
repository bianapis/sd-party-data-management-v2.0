package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyDirectoryEntryUpdateInputModelPartyDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryUpdateInputModel
 */
public class CRPartyDirectoryEntryUpdateInputModel   {
  private String partyDataManagementServicingSessionReference = null;

  private String partyDirectoryEntryInstanceReference = null;

  private CRPartyDirectoryEntryUpdateInputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord = null;

  private Object partyDirectoryEntryUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get partyDirectoryEntryInstanceRecord
   * @return partyDirectoryEntryInstanceRecord
  **/

  public CRPartyDirectoryEntryUpdateInputModelPartyDirectoryEntryInstanceRecord getPartyDirectoryEntryInstanceRecord() {
    return partyDirectoryEntryInstanceRecord;
  }

  public void setPartyDirectoryEntryInstanceRecord(CRPartyDirectoryEntryUpdateInputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord) {
    this.partyDirectoryEntryInstanceRecord = partyDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return partyDirectoryEntryUpdateActionTaskRecord
  **/

  public Object getPartyDirectoryEntryUpdateActionTaskRecord() {
    return partyDirectoryEntryUpdateActionTaskRecord;
  }

  public void setPartyDirectoryEntryUpdateActionTaskRecord(Object partyDirectoryEntryUpdateActionTaskRecord) {
    this.partyDirectoryEntryUpdateActionTaskRecord = partyDirectoryEntryUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

