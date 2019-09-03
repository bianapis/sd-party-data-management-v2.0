package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssociationsExecuteInputModelAssociationsInstanceRecord;
import org.bian.dto.BQReferenceExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQAssociationsExecuteInputModel
 */
public class BQAssociationsExecuteInputModel   {
  private String partyDirectoryEntryInstanceReference = null;

  private String associationsInstanceReference = null;

  private BQAssociationsExecuteInputModelAssociationsInstanceRecord associationsInstanceRecord = null;

  private Object associationsExecuteActionTaskRecord = null;

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
   * Get associationsInstanceRecord
   * @return associationsInstanceRecord
  **/

  public BQAssociationsExecuteInputModelAssociationsInstanceRecord getAssociationsInstanceRecord() {
    return associationsInstanceRecord;
  }

  public void setAssociationsInstanceRecord(BQAssociationsExecuteInputModelAssociationsInstanceRecord associationsInstanceRecord) {
    this.associationsInstanceRecord = associationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return associationsExecuteActionTaskRecord
  **/

  public Object getAssociationsExecuteActionTaskRecord() {
    return associationsExecuteActionTaskRecord;
  }

  public void setAssociationsExecuteActionTaskRecord(Object associationsExecuteActionTaskRecord) {
    this.associationsExecuteActionTaskRecord = associationsExecuteActionTaskRecord;
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

