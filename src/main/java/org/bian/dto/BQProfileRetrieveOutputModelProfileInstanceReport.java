package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProfileRetrieveOutputModelProfileInstanceReport
 */
public class BQProfileRetrieveOutputModelProfileInstanceReport   {
  private Object profileInstanceReportRecord = null;

  private String profileInstanceReportType = null;

  private String profileInstanceReportParameters = null;

  private Object profileInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return profileInstanceReportRecord
  **/

  public Object getProfileInstanceReportRecord() {
    return profileInstanceReportRecord;
  }

  public void setProfileInstanceReportRecord(Object profileInstanceReportRecord) {
    this.profileInstanceReportRecord = profileInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return profileInstanceReportType
  **/

  public String getProfileInstanceReportType() {
    return profileInstanceReportType;
  }

  public void setProfileInstanceReportType(String profileInstanceReportType) {
    this.profileInstanceReportType = profileInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return profileInstanceReportParameters
  **/

  public String getProfileInstanceReportParameters() {
    return profileInstanceReportParameters;
  }

  public void setProfileInstanceReportParameters(String profileInstanceReportParameters) {
    this.profileInstanceReportParameters = profileInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return profileInstanceReport
  **/

  public Object getProfileInstanceReport() {
    return profileInstanceReport;
  }

  public void setProfileInstanceReport(Object profileInstanceReport) {
    this.profileInstanceReport = profileInstanceReport;
  }


}

