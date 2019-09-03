package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryControlOutputModel
 */
public class CRPartyDirectoryEntryControlOutputModel   {
  private String partyDirectoryEntryControlActionTaskReference = null;

  private Object partyDirectoryEntryControlActionTaskRecord = null;

  private String partyDirectoryEntryControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Party Directory Entry instance control processing service call 
   * @return partyDirectoryEntryControlActionTaskReference
  **/

  public String getPartyDirectoryEntryControlActionTaskReference() {
    return partyDirectoryEntryControlActionTaskReference;
  }

  public void setPartyDirectoryEntryControlActionTaskReference(String partyDirectoryEntryControlActionTaskReference) {
    this.partyDirectoryEntryControlActionTaskReference = partyDirectoryEntryControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return partyDirectoryEntryControlActionResponse
  **/

  public String getPartyDirectoryEntryControlActionResponse() {
    return partyDirectoryEntryControlActionResponse;
  }

  public void setPartyDirectoryEntryControlActionResponse(String partyDirectoryEntryControlActionResponse) {
    this.partyDirectoryEntryControlActionResponse = partyDirectoryEntryControlActionResponse;
  }


}

