package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReferenceExecuteInputModelExecuteRecordType;
import org.bian.dto.BQReferenceExecuteInputModelReferenceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReferenceExecuteInputModel
 */
public class BQReferenceExecuteInputModel   {
  private String partyDirectoryEntryInstanceReference = null;

  private String referenceInstanceReference = null;

  private BQReferenceExecuteInputModelReferenceInstanceRecord referenceInstanceRecord = null;

  private Object referenceExecuteActionTaskRecord = null;

  private BQReferenceExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public BQReferenceExecuteInputModelReferenceInstanceRecord getReferenceInstanceRecord() {
    return referenceInstanceRecord;
  }

  public void setReferenceInstanceRecord(BQReferenceExecuteInputModelReferenceInstanceRecord referenceInstanceRecord) {
    this.referenceInstanceRecord = referenceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return referenceExecuteActionTaskRecord
  **/

  public Object getReferenceExecuteActionTaskRecord() {
    return referenceExecuteActionTaskRecord;
  }

  public void setReferenceExecuteActionTaskRecord(Object referenceExecuteActionTaskRecord) {
    this.referenceExecuteActionTaskRecord = referenceExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQReferenceExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQReferenceExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

