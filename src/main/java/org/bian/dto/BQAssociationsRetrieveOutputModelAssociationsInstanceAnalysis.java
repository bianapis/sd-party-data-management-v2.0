package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssociationsRetrieveOutputModelAssociationsInstanceAnalysis
 */
public class BQAssociationsRetrieveOutputModelAssociationsInstanceAnalysis   {
  private Object associationsInstanceAnalysisRecord = null;

  private String associationsInstanceAnalysisReportType = null;

  private String associationsInstanceAnalysisParameters = null;

  private Object associationsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return associationsInstanceAnalysisRecord
  **/

  public Object getAssociationsInstanceAnalysisRecord() {
    return associationsInstanceAnalysisRecord;
  }

  public void setAssociationsInstanceAnalysisRecord(Object associationsInstanceAnalysisRecord) {
    this.associationsInstanceAnalysisRecord = associationsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return associationsInstanceAnalysisReportType
  **/

  public String getAssociationsInstanceAnalysisReportType() {
    return associationsInstanceAnalysisReportType;
  }

  public void setAssociationsInstanceAnalysisReportType(String associationsInstanceAnalysisReportType) {
    this.associationsInstanceAnalysisReportType = associationsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return associationsInstanceAnalysisParameters
  **/

  public String getAssociationsInstanceAnalysisParameters() {
    return associationsInstanceAnalysisParameters;
  }

  public void setAssociationsInstanceAnalysisParameters(String associationsInstanceAnalysisParameters) {
    this.associationsInstanceAnalysisParameters = associationsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return associationsInstanceAnalysisReport
  **/

  public Object getAssociationsInstanceAnalysisReport() {
    return associationsInstanceAnalysisReport;
  }

  public void setAssociationsInstanceAnalysisReport(Object associationsInstanceAnalysisReport) {
    this.associationsInstanceAnalysisReport = associationsInstanceAnalysisReport;
  }


}

