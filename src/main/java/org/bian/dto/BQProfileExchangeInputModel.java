package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQProfileExchangeInputModel
 */
public class BQProfileExchangeInputModel   {
  private String partyDirectoryEntryInstanceReference = null;

  private String profileInstanceReference = null;

  private Object profileExchangeActionTaskRecord = null;

  private CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest profileExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return profileExchangeActionTaskRecord
  **/

  public Object getProfileExchangeActionTaskRecord() {
    return profileExchangeActionTaskRecord;
  }

  public void setProfileExchangeActionTaskRecord(Object profileExchangeActionTaskRecord) {
    this.profileExchangeActionTaskRecord = profileExchangeActionTaskRecord;
  }


  /**
   * Get profileExchangeActionRequest
   * @return profileExchangeActionRequest
  **/

  public CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest getProfileExchangeActionRequest() {
    return profileExchangeActionRequest;
  }

  public void setProfileExchangeActionRequest(CRPartyDirectoryEntryExchangeInputModelPartyDirectoryEntryExchangeActionRequest profileExchangeActionRequest) {
    this.profileExchangeActionRequest = profileExchangeActionRequest;
  }


}

