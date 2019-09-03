package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProfileRetrieveOutputModelProfileInstanceAnalysis
 */
public class BQProfileRetrieveOutputModelProfileInstanceAnalysis   {
  private Object profileInstanceAnalysisRecord = null;

  private String profileInstanceAnalysisReportType = null;

  private String profileInstanceAnalysisParameters = null;

  private Object profileInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return profileInstanceAnalysisRecord
  **/

  public Object getProfileInstanceAnalysisRecord() {
    return profileInstanceAnalysisRecord;
  }

  public void setProfileInstanceAnalysisRecord(Object profileInstanceAnalysisRecord) {
    this.profileInstanceAnalysisRecord = profileInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return profileInstanceAnalysisReportType
  **/

  public String getProfileInstanceAnalysisReportType() {
    return profileInstanceAnalysisReportType;
  }

  public void setProfileInstanceAnalysisReportType(String profileInstanceAnalysisReportType) {
    this.profileInstanceAnalysisReportType = profileInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return profileInstanceAnalysisParameters
  **/

  public String getProfileInstanceAnalysisParameters() {
    return profileInstanceAnalysisParameters;
  }

  public void setProfileInstanceAnalysisParameters(String profileInstanceAnalysisParameters) {
    this.profileInstanceAnalysisParameters = profileInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return profileInstanceAnalysisReport
  **/

  public Object getProfileInstanceAnalysisReport() {
    return profileInstanceAnalysisReport;
  }

  public void setProfileInstanceAnalysisReport(Object profileInstanceAnalysisReport) {
    this.profileInstanceAnalysisReport = profileInstanceAnalysisReport;
  }


}

