package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProfileExchangeOutputModel
 */
public class BQProfileExchangeOutputModel   {
  private String profileExchangeActionTaskReference = null;

  private Object profileExchangeActionTaskRecord = null;

  private String profileExchangeActionResponse = null;

  private String profileInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Profile instance exchange service call 
   * @return profileExchangeActionTaskReference
  **/

  public String getProfileExchangeActionTaskReference() {
    return profileExchangeActionTaskReference;
  }

  public void setProfileExchangeActionTaskReference(String profileExchangeActionTaskReference) {
    this.profileExchangeActionTaskReference = profileExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return profileExchangeActionResponse
  **/

  public String getProfileExchangeActionResponse() {
    return profileExchangeActionResponse;
  }

  public void setProfileExchangeActionResponse(String profileExchangeActionResponse) {
    this.profileExchangeActionResponse = profileExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Profile instance (e.g. accepted, rejected, verified) 
   * @return profileInstanceStatus
  **/

  public String getProfileInstanceStatus() {
    return profileInstanceStatus;
  }

  public void setProfileInstanceStatus(String profileInstanceStatus) {
    this.profileInstanceStatus = profileInstanceStatus;
  }


}

