package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssociationsRetrieveOutputModelAssociationsInstanceReport
 */
public class BQAssociationsRetrieveOutputModelAssociationsInstanceReport   {
  private Object associationsInstanceReportRecord = null;

  private String associationsInstanceReportType = null;

  private String associationsInstanceReportParameters = null;

  private Object associationsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return associationsInstanceReportRecord
  **/

  public Object getAssociationsInstanceReportRecord() {
    return associationsInstanceReportRecord;
  }

  public void setAssociationsInstanceReportRecord(Object associationsInstanceReportRecord) {
    this.associationsInstanceReportRecord = associationsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return associationsInstanceReportType
  **/

  public String getAssociationsInstanceReportType() {
    return associationsInstanceReportType;
  }

  public void setAssociationsInstanceReportType(String associationsInstanceReportType) {
    this.associationsInstanceReportType = associationsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return associationsInstanceReportParameters
  **/

  public String getAssociationsInstanceReportParameters() {
    return associationsInstanceReportParameters;
  }

  public void setAssociationsInstanceReportParameters(String associationsInstanceReportParameters) {
    this.associationsInstanceReportParameters = associationsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return associationsInstanceReport
  **/

  public Object getAssociationsInstanceReport() {
    return associationsInstanceReport;
  }

  public void setAssociationsInstanceReport(Object associationsInstanceReport) {
    this.associationsInstanceReport = associationsInstanceReport;
  }


}

