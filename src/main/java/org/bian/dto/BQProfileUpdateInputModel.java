package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProfileUpdateInputModelPartyDirectoryEntryInstanceRecord;
import org.bian.dto.BQProfileUpdateInputModelProfileInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProfileUpdateInputModel
 */
public class BQProfileUpdateInputModel   {
  private BQProfileUpdateInputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord = null;

  private String partyDirectoryEntryInstanceReference = null;

  private String profileInstanceReference = null;

  private BQProfileUpdateInputModelProfileInstanceRecord profileInstanceRecord = null;

  private Object profileUpdateActionTaskRecord = null;

  private String profileUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return profileUpdateActionRequest
  **/

  public String getProfileUpdateActionRequest() {
    return profileUpdateActionRequest;
  }

  public void setProfileUpdateActionRequest(String profileUpdateActionRequest) {
    this.profileUpdateActionRequest = profileUpdateActionRequest;
  }


}

