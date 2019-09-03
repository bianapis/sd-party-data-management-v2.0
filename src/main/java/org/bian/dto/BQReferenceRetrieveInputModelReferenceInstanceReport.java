package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReferenceRetrieveInputModelReferenceInstanceReport
 */
public class BQReferenceRetrieveInputModelReferenceInstanceReport   {
  private String referenceInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return referenceInstanceReportReference
  **/

  public String getReferenceInstanceReportReference() {
    return referenceInstanceReportReference;
  }

  public void setReferenceInstanceReportReference(String referenceInstanceReportReference) {
    this.referenceInstanceReportReference = referenceInstanceReportReference;
  }


}

