package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryRetrieveInputModelPartyDirectoryEntryInstanceReportRecord
 */
public class CRPartyDirectoryEntryRetrieveInputModelPartyDirectoryEntryInstanceReportRecord   {
  private String partyDirectoryEntryInstanceReportReference = null;

  private String partyDirectoryEntryInstanceReportType = null;

  private String partyDirectoryEntryInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return partyDirectoryEntryInstanceReportReference
  **/

  public String getPartyDirectoryEntryInstanceReportReference() {
    return partyDirectoryEntryInstanceReportReference;
  }

  public void setPartyDirectoryEntryInstanceReportReference(String partyDirectoryEntryInstanceReportReference) {
    this.partyDirectoryEntryInstanceReportReference = partyDirectoryEntryInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return partyDirectoryEntryInstanceReportType
  **/

  public String getPartyDirectoryEntryInstanceReportType() {
    return partyDirectoryEntryInstanceReportType;
  }

  public void setPartyDirectoryEntryInstanceReportType(String partyDirectoryEntryInstanceReportType) {
    this.partyDirectoryEntryInstanceReportType = partyDirectoryEntryInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return partyDirectoryEntryInstanceReportParameters
  **/

  public String getPartyDirectoryEntryInstanceReportParameters() {
    return partyDirectoryEntryInstanceReportParameters;
  }

  public void setPartyDirectoryEntryInstanceReportParameters(String partyDirectoryEntryInstanceReportParameters) {
    this.partyDirectoryEntryInstanceReportParameters = partyDirectoryEntryInstanceReportParameters;
  }


}

