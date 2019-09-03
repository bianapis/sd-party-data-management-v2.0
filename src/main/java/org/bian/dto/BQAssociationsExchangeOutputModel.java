package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssociationsExchangeOutputModel
 */
public class BQAssociationsExchangeOutputModel   {
  private String associationsExchangeActionTaskReference = null;

  private Object associationsExchangeActionTaskRecord = null;

  private String associationsExchangeActionResponse = null;

  private String associationsInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Associations instance exchange service call 
   * @return associationsExchangeActionTaskReference
  **/

  public String getAssociationsExchangeActionTaskReference() {
    return associationsExchangeActionTaskReference;
  }

  public void setAssociationsExchangeActionTaskReference(String associationsExchangeActionTaskReference) {
    this.associationsExchangeActionTaskReference = associationsExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return associationsExchangeActionResponse
  **/

  public String getAssociationsExchangeActionResponse() {
    return associationsExchangeActionResponse;
  }

  public void setAssociationsExchangeActionResponse(String associationsExchangeActionResponse) {
    this.associationsExchangeActionResponse = associationsExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Associations instance (e.g. accepted, rejected, verified) 
   * @return associationsInstanceStatus
  **/

  public String getAssociationsInstanceStatus() {
    return associationsInstanceStatus;
  }

  public void setAssociationsInstanceStatus(String associationsInstanceStatus) {
    this.associationsInstanceStatus = associationsInstanceStatus;
  }


}

