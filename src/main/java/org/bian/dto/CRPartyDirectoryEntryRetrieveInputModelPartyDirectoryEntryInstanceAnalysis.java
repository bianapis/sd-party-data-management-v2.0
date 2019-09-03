package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryRetrieveInputModelPartyDirectoryEntryInstanceAnalysis
 */
public class CRPartyDirectoryEntryRetrieveInputModelPartyDirectoryEntryInstanceAnalysis   {
  private String partyDirectoryEntryInstanceAnalysisReference = null;

  private String partyDirectoryEntryInstanceAnalysisReportType = null;

  private String partyDirectoryEntryInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return partyDirectoryEntryInstanceAnalysisReference
  **/

  public String getPartyDirectoryEntryInstanceAnalysisReference() {
    return partyDirectoryEntryInstanceAnalysisReference;
  }

  public void setPartyDirectoryEntryInstanceAnalysisReference(String partyDirectoryEntryInstanceAnalysisReference) {
    this.partyDirectoryEntryInstanceAnalysisReference = partyDirectoryEntryInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return partyDirectoryEntryInstanceAnalysisParameters
  **/

  public String getPartyDirectoryEntryInstanceAnalysisParameters() {
    return partyDirectoryEntryInstanceAnalysisParameters;
  }

  public void setPartyDirectoryEntryInstanceAnalysisParameters(String partyDirectoryEntryInstanceAnalysisParameters) {
    this.partyDirectoryEntryInstanceAnalysisParameters = partyDirectoryEntryInstanceAnalysisParameters;
  }


}

