package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceAnalysis
 */
public class CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceAnalysis   {
  private String partyDirectoryEntryInstanceAnalysisData = null;

  private String partyDirectoryEntryInstanceAnalysisReportType = null;

  private Object partyDirectoryEntryInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return partyDirectoryEntryInstanceAnalysisData
  **/

  public String getPartyDirectoryEntryInstanceAnalysisData() {
    return partyDirectoryEntryInstanceAnalysisData;
  }

  public void setPartyDirectoryEntryInstanceAnalysisData(String partyDirectoryEntryInstanceAnalysisData) {
    this.partyDirectoryEntryInstanceAnalysisData = partyDirectoryEntryInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return partyDirectoryEntryInstanceAnalysisReportType
  **/

  public String getPartyDirectoryEntryInstanceAnalysisReportType() {
    return partyDirectoryEntryInstanceAnalysisReportType;
  }

  public void setPartyDirectoryEntryInstanceAnalysisReportType(String partyDirectoryEntryInstanceAnalysisReportType) {
    this.partyDirectoryEntryInstanceAnalysisReportType = partyDirectoryEntryInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return partyDirectoryEntryInstanceAnalysisReport
  **/

  public Object getPartyDirectoryEntryInstanceAnalysisReport() {
    return partyDirectoryEntryInstanceAnalysisReport;
  }

  public void setPartyDirectoryEntryInstanceAnalysisReport(Object partyDirectoryEntryInstanceAnalysisReport) {
    this.partyDirectoryEntryInstanceAnalysisReport = partyDirectoryEntryInstanceAnalysisReport;
  }


}

