package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyDirectoryEntryRegisterInputModelPartyDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryRegisterInputModel
 */
public class CRPartyDirectoryEntryRegisterInputModel   {
  private String partyDataManagementServicingSessionReference = null;

  private Object partyDirectoryEntryRegisterActionRecord = null;

  private String partyDirectoryEntryInstanceStatus = null;

  private CRPartyDirectoryEntryRegisterInputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Register service call input and output record 
   * @return partyDirectoryEntryRegisterActionRecord
  **/

  public Object getPartyDirectoryEntryRegisterActionRecord() {
    return partyDirectoryEntryRegisterActionRecord;
  }

  public void setPartyDirectoryEntryRegisterActionRecord(Object partyDirectoryEntryRegisterActionRecord) {
    this.partyDirectoryEntryRegisterActionRecord = partyDirectoryEntryRegisterActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Party Directory Entry instance (e.g. initialised, pending, active) 
   * @return partyDirectoryEntryInstanceStatus
  **/

  public String getPartyDirectoryEntryInstanceStatus() {
    return partyDirectoryEntryInstanceStatus;
  }

  public void setPartyDirectoryEntryInstanceStatus(String partyDirectoryEntryInstanceStatus) {
    this.partyDirectoryEntryInstanceStatus = partyDirectoryEntryInstanceStatus;
  }


  /**
   * Get partyDirectoryEntryInstanceRecord
   * @return partyDirectoryEntryInstanceRecord
  **/

  public CRPartyDirectoryEntryRegisterInputModelPartyDirectoryEntryInstanceRecord getPartyDirectoryEntryInstanceRecord() {
    return partyDirectoryEntryInstanceRecord;
  }

  public void setPartyDirectoryEntryInstanceRecord(CRPartyDirectoryEntryRegisterInputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord) {
    this.partyDirectoryEntryInstanceRecord = partyDirectoryEntryInstanceRecord;
  }


}

