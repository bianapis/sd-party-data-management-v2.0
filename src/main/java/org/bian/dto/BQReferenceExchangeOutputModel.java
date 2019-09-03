package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReferenceExchangeOutputModel
 */
public class BQReferenceExchangeOutputModel   {
  private String referenceExchangeActionTaskReference = null;

  private Object referenceExchangeActionTaskRecord = null;

  private String referenceExchangeActionResponse = null;

  private String referenceInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reference instance exchange service call 
   * @return referenceExchangeActionTaskReference
  **/

  public String getReferenceExchangeActionTaskReference() {
    return referenceExchangeActionTaskReference;
  }

  public void setReferenceExchangeActionTaskReference(String referenceExchangeActionTaskReference) {
    this.referenceExchangeActionTaskReference = referenceExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return referenceExchangeActionResponse
  **/

  public String getReferenceExchangeActionResponse() {
    return referenceExchangeActionResponse;
  }

  public void setReferenceExchangeActionResponse(String referenceExchangeActionResponse) {
    this.referenceExchangeActionResponse = referenceExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Reference instance (e.g. accepted, rejected, verified) 
   * @return referenceInstanceStatus
  **/

  public String getReferenceInstanceStatus() {
    return referenceInstanceStatus;
  }

  public void setReferenceInstanceStatus(String referenceInstanceStatus) {
    this.referenceInstanceStatus = referenceInstanceStatus;
  }


}

