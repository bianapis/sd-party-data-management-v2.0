package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReferenceRetrieveInputModelReferenceInstanceAnalysis
 */
public class BQReferenceRetrieveInputModelReferenceInstanceAnalysis   {
  private String referenceInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return referenceInstanceAnalysisReference
  **/

  public String getReferenceInstanceAnalysisReference() {
    return referenceInstanceAnalysisReference;
  }

  public void setReferenceInstanceAnalysisReference(String referenceInstanceAnalysisReference) {
    this.referenceInstanceAnalysisReference = referenceInstanceAnalysisReference;
  }


}

