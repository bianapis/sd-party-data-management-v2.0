package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQAssociationsExchangeInputModel
 */
public class BQAssociationsExchangeInputModel   {
  private String partyDirectoryEntryInstanceReference = null;

  private String associationsInstanceReference = null;

  private Object associationsExchangeActionTaskRecord = null;

  private CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest associationsExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Party Directory Entry instance 
   * @return partyDirectoryEntryInstanceReference
  **/

  public String getPartyDirectoryEntryInstanceReference() {
    return partyDirectoryEntryInstanceReference;
  }

  public void setPartyDirectoryEntryInstanceReference(String partyDirectoryEntryInstanceReference) {
    this.partyDirectoryEntryInstanceReference = partyDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Associations instance 
   * @return associationsInstanceReference
  **/

  public String getAssociationsInstanceReference() {
    return associationsInstanceReference;
  }

  public void setAssociationsInstanceReference(String associationsInstanceReference) {
    this.associationsInstanceReference = associationsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return associationsExchangeActionTaskRecord
  **/

  public Object getAssociationsExchangeActionTaskRecord() {
    return associationsExchangeActionTaskRecord;
  }

  public void setAssociationsExchangeActionTaskRecord(Object associationsExchangeActionTaskRecord) {
    this.associationsExchangeActionTaskRecord = associationsExchangeActionTaskRecord;
  }


  /**
   * Get associationsExchangeActionRequest
   * @return associationsExchangeActionRequest
  **/

  public CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest getAssociationsExchangeActionRequest() {
    return associationsExchangeActionRequest;
  }

  public void setAssociationsExchangeActionRequest(CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest associationsExchangeActionRequest) {
    this.associationsExchangeActionRequest = associationsExchangeActionRequest;
  }


}

