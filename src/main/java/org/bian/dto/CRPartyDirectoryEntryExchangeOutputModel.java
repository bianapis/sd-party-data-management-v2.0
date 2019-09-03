package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryExchangeOutputModel
 */
public class CRPartyDirectoryEntryExchangeOutputModel   {
  private String partyDirectoryEntryExchangeActionTaskReference = null;

  private Object partyDirectoryEntryExchangeActionTaskRecord = null;

  private String partyDirectoryEntryExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Party Directory Entry instance exchange service call 
   * @return partyDirectoryEntryExchangeActionTaskReference
  **/

  public String getPartyDirectoryEntryExchangeActionTaskReference() {
    return partyDirectoryEntryExchangeActionTaskReference;
  }

  public void setPartyDirectoryEntryExchangeActionTaskReference(String partyDirectoryEntryExchangeActionTaskReference) {
    this.partyDirectoryEntryExchangeActionTaskReference = partyDirectoryEntryExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return partyDirectoryEntryExchangeActionResponse
  **/

  public String getPartyDirectoryEntryExchangeActionResponse() {
    return partyDirectoryEntryExchangeActionResponse;
  }

  public void setPartyDirectoryEntryExchangeActionResponse(String partyDirectoryEntryExchangeActionResponse) {
    this.partyDirectoryEntryExchangeActionResponse = partyDirectoryEntryExchangeActionResponse;
  }


}

