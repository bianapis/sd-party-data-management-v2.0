package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReferenceRetrieveOutputModelReferenceInstanceAnalysis
 */
public class BQReferenceRetrieveOutputModelReferenceInstanceAnalysis   {
  private Object referenceInstanceAnalysisRecord = null;

  private String referenceInstanceAnalysisReportType = null;

  private String referenceInstanceAnalysisParameters = null;

  private Object referenceInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return referenceInstanceAnalysisRecord
  **/

  public Object getReferenceInstanceAnalysisRecord() {
    return referenceInstanceAnalysisRecord;
  }

  public void setReferenceInstanceAnalysisRecord(Object referenceInstanceAnalysisRecord) {
    this.referenceInstanceAnalysisRecord = referenceInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return referenceInstanceAnalysisReportType
  **/

  public String getReferenceInstanceAnalysisReportType() {
    return referenceInstanceAnalysisReportType;
  }

  public void setReferenceInstanceAnalysisReportType(String referenceInstanceAnalysisReportType) {
    this.referenceInstanceAnalysisReportType = referenceInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return referenceInstanceAnalysisParameters
  **/

  public String getReferenceInstanceAnalysisParameters() {
    return referenceInstanceAnalysisParameters;
  }

  public void setReferenceInstanceAnalysisParameters(String referenceInstanceAnalysisParameters) {
    this.referenceInstanceAnalysisParameters = referenceInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return referenceInstanceAnalysisReport
  **/

  public Object getReferenceInstanceAnalysisReport() {
    return referenceInstanceAnalysisReport;
  }

  public void setReferenceInstanceAnalysisReport(Object referenceInstanceAnalysisReport) {
    this.referenceInstanceAnalysisReport = referenceInstanceAnalysisReport;
  }


}

