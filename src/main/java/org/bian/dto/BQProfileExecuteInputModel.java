package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProfileUpdateInputModelProfileInstanceRecord;
import org.bian.dto.BQReferenceExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQProfileExecuteInputModel
 */
public class BQProfileExecuteInputModel   {
  private String partyDirectoryEntryInstanceReference = null;

  private String profileInstanceReference = null;

  private BQProfileUpdateInputModelProfileInstanceRecord profileInstanceRecord = null;

  private Object profileExecuteActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Profile instance 
   * @return profileInstanceReference
  **/

  public String getProfileInstanceReference() {
    return profileInstanceReference;
  }

  public void setProfileInstanceReference(String profileInstanceReference) {
    this.profileInstanceReference = profileInstanceReference;
  }


  /**
   * Get profileInstanceRecord
   * @return profileInstanceRecord
  **/

  public BQProfileUpdateInputModelProfileInstanceRecord getProfileInstanceRecord() {
    return profileInstanceRecord;
  }

  public void setProfileInstanceRecord(BQProfileUpdateInputModelProfileInstanceRecord profileInstanceRecord) {
    this.profileInstanceRecord = profileInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return profileExecuteActionTaskRecord
  **/

  public Object getProfileExecuteActionTaskRecord() {
    return profileExecuteActionTaskRecord;
  }

  public void setProfileExecuteActionTaskRecord(Object profileExecuteActionTaskRecord) {
    this.profileExecuteActionTaskRecord = profileExecuteActionTaskRecord;
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

