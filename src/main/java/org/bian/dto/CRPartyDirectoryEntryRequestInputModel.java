package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyDirectoryEntryRegisterOutputModelPartyDirectoryEntryInstanceRecord;
import org.bian.dto.CRPartyDirectoryEntryRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryRequestInputModel
 */
public class CRPartyDirectoryEntryRequestInputModel   {
  private String partyDataManagementServicingSessionReference = null;

  private String partyDirectoryEntryInstanceReference = null;

  private CRPartyDirectoryEntryRegisterOutputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord = null;

  private Object partyDirectoryEntryRequestActionTaskRecord = null;

  private CRPartyDirectoryEntryRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRPartyDirectoryEntryRegisterOutputModelPartyDirectoryEntryInstanceRecord getPartyDirectoryEntryInstanceRecord() {
    return partyDirectoryEntryInstanceRecord;
  }

  public void setPartyDirectoryEntryInstanceRecord(CRPartyDirectoryEntryRegisterOutputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord) {
    this.partyDirectoryEntryInstanceRecord = partyDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return partyDirectoryEntryRequestActionTaskRecord
  **/

  public Object getPartyDirectoryEntryRequestActionTaskRecord() {
    return partyDirectoryEntryRequestActionTaskRecord;
  }

  public void setPartyDirectoryEntryRequestActionTaskRecord(Object partyDirectoryEntryRequestActionTaskRecord) {
    this.partyDirectoryEntryRequestActionTaskRecord = partyDirectoryEntryRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRPartyDirectoryEntryRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRPartyDirectoryEntryRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

