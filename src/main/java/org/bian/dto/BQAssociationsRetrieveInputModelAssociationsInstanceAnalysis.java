package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssociationsRetrieveInputModelAssociationsInstanceAnalysis
 */
public class BQAssociationsRetrieveInputModelAssociationsInstanceAnalysis   {
  private String associationsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return associationsInstanceAnalysisReference
  **/

  public String getAssociationsInstanceAnalysisReference() {
    return associationsInstanceAnalysisReference;
  }

  public void setAssociationsInstanceAnalysisReference(String associationsInstanceAnalysisReference) {
    this.associationsInstanceAnalysisReference = associationsInstanceAnalysisReference;
  }


}

