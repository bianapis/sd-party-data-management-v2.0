package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQReferenceExchangeInputModel
 */
public class BQReferenceExchangeInputModel   {
  private String partyDirectoryEntryInstanceReference = null;

  private String referenceInstanceReference = null;

  private Object referenceExchangeActionTaskRecord = null;

  private CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest referenceExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reference instance 
   * @return referenceInstanceReference
  **/

  public String getReferenceInstanceReference() {
    return referenceInstanceReference;
  }

  public void setReferenceInstanceReference(String referenceInstanceReference) {
    this.referenceInstanceReference = referenceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return referenceExchangeActionTaskRecord
  **/

  public Object getReferenceExchangeActionTaskRecord() {
    return referenceExchangeActionTaskRecord;
  }

  public void setReferenceExchangeActionTaskRecord(Object referenceExchangeActionTaskRecord) {
    this.referenceExchangeActionTaskRecord = referenceExchangeActionTaskRecord;
  }


  /**
   * Get referenceExchangeActionRequest
   * @return referenceExchangeActionRequest
  **/

  public CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest getReferenceExchangeActionRequest() {
    return referenceExchangeActionRequest;
  }

  public void setReferenceExchangeActionRequest(CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest referenceExchangeActionRequest) {
    this.referenceExchangeActionRequest = referenceExchangeActionRequest;
  }


}

