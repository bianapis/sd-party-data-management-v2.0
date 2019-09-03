package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReferenceUpdateInputModelPartyDirectoryEntryInstanceRecord;
import org.bian.dto.BQReferenceUpdateInputModelReferenceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReferenceUpdateInputModel
 */
public class BQReferenceUpdateInputModel   {
  private BQReferenceUpdateInputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord = null;

  private String partyDirectoryEntryInstanceReference = null;

  private String referenceInstanceReference = null;

  private BQReferenceUpdateInputModelReferenceInstanceRecord referenceInstanceRecord = null;

  private Object referenceUpdateActionTaskRecord = null;

  private String referenceUpdateActionRequest = null;


  /**
   * Get partyDirectoryEntryInstanceRecord
   * @return partyDirectoryEntryInstanceRecord
  **/

  public BQReferenceUpdateInputModelPartyDirectoryEntryInstanceRecord getPartyDirectoryEntryInstanceRecord() {
    return partyDirectoryEntryInstanceRecord;
  }

  public void setPartyDirectoryEntryInstanceRecord(BQReferenceUpdateInputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord) {
    this.partyDirectoryEntryInstanceRecord = partyDirectoryEntryInstanceRecord;
  }


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
   * Get referenceInstanceRecord
   * @return referenceInstanceRecord
  **/

  public BQReferenceUpdateInputModelReferenceInstanceRecord getReferenceInstanceRecord() {
    return referenceInstanceRecord;
  }

  public void setReferenceInstanceRecord(BQReferenceUpdateInputModelReferenceInstanceRecord referenceInstanceRecord) {
    this.referenceInstanceRecord = referenceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return referenceUpdateActionTaskRecord
  **/

  public Object getReferenceUpdateActionTaskRecord() {
    return referenceUpdateActionTaskRecord;
  }

  public void setReferenceUpdateActionTaskRecord(Object referenceUpdateActionTaskRecord) {
    this.referenceUpdateActionTaskRecord = referenceUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return referenceUpdateActionRequest
  **/

  public String getReferenceUpdateActionRequest() {
    return referenceUpdateActionRequest;
  }

  public void setReferenceUpdateActionRequest(String referenceUpdateActionRequest) {
    this.referenceUpdateActionRequest = referenceUpdateActionRequest;
  }


}

