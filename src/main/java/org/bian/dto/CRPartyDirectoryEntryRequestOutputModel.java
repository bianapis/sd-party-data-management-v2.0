package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyDirectoryEntryRegisterOutputModelPartyDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryRequestOutputModel
 */
public class CRPartyDirectoryEntryRequestOutputModel   {
  private CRPartyDirectoryEntryRegisterOutputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord = null;

  private String partyDirectoryEntryRequestActionTaskReference = null;

  private Object partyDirectoryEntryRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Party Directory Entry instance request service call 
   * @return partyDirectoryEntryRequestActionTaskReference
  **/

  public String getPartyDirectoryEntryRequestActionTaskReference() {
    return partyDirectoryEntryRequestActionTaskReference;
  }

  public void setPartyDirectoryEntryRequestActionTaskReference(String partyDirectoryEntryRequestActionTaskReference) {
    this.partyDirectoryEntryRequestActionTaskReference = partyDirectoryEntryRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

