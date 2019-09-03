package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReferenceRetrieveOutputModelReferenceInstanceReport
 */
public class BQReferenceRetrieveOutputModelReferenceInstanceReport   {
  private Object referenceInstanceReportRecord = null;

  private String referenceInstanceReportType = null;

  private String referenceInstanceReportParameters = null;

  private Object referenceInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return referenceInstanceReportRecord
  **/

  public Object getReferenceInstanceReportRecord() {
    return referenceInstanceReportRecord;
  }

  public void setReferenceInstanceReportRecord(Object referenceInstanceReportRecord) {
    this.referenceInstanceReportRecord = referenceInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return referenceInstanceReportType
  **/

  public String getReferenceInstanceReportType() {
    return referenceInstanceReportType;
  }

  public void setReferenceInstanceReportType(String referenceInstanceReportType) {
    this.referenceInstanceReportType = referenceInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return referenceInstanceReportParameters
  **/

  public String getReferenceInstanceReportParameters() {
    return referenceInstanceReportParameters;
  }

  public void setReferenceInstanceReportParameters(String referenceInstanceReportParameters) {
    this.referenceInstanceReportParameters = referenceInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return referenceInstanceReport
  **/

  public Object getReferenceInstanceReport() {
    return referenceInstanceReport;
  }

  public void setReferenceInstanceReport(Object referenceInstanceReport) {
    this.referenceInstanceReport = referenceInstanceReport;
  }


}

