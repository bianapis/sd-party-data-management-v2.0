package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProfileRetrieveInputModelProfileInstanceReport
 */
public class BQProfileRetrieveInputModelProfileInstanceReport   {
  private String profileInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return profileInstanceReportReference
  **/

  public String getProfileInstanceReportReference() {
    return profileInstanceReportReference;
  }

  public void setProfileInstanceReportReference(String profileInstanceReportReference) {
    this.profileInstanceReportReference = profileInstanceReportReference;
  }


}

