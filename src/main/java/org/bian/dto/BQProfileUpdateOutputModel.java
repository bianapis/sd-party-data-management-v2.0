package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProfileUpdateInputModelPartyDirectoryEntryInstanceRecord;
import org.bian.dto.BQProfileUpdateInputModelProfileInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProfileUpdateOutputModel
 */
public class BQProfileUpdateOutputModel   {
  private BQProfileUpdateInputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord = null;

  private BQProfileUpdateInputModelProfileInstanceRecord profileInstanceRecord = null;

  private String profileUpdateActionTaskReference = null;

  private Object profileUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get partyDirectoryEntryInstanceRecord
   * @return partyDirectoryEntryInstanceRecord
  **/

  public BQProfileUpdateInputModelPartyDirectoryEntryInstanceRecord getPartyDirectoryEntryInstanceRecord() {
    return partyDirectoryEntryInstanceRecord;
  }

  public void setPartyDirectoryEntryInstanceRecord(BQProfileUpdateInputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord) {
    this.partyDirectoryEntryInstanceRecord = partyDirectoryEntryInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return profileUpdateActionTaskReference
  **/

  public String getProfileUpdateActionTaskReference() {
    return profileUpdateActionTaskReference;
  }

  public void setProfileUpdateActionTaskReference(String profileUpdateActionTaskReference) {
    this.profileUpdateActionTaskReference = profileUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return profileUpdateActionTaskRecord
  **/

  public Object getProfileUpdateActionTaskRecord() {
    return profileUpdateActionTaskRecord;
  }

  public void setProfileUpdateActionTaskRecord(Object profileUpdateActionTaskRecord) {
    this.profileUpdateActionTaskRecord = profileUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

