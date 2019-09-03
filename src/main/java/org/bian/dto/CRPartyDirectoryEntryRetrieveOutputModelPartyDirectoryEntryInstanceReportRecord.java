package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceReportRecord
 */
public class CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceReportRecord   {
  private String partyDirectoryEntryInstanceReportData = null;

  private String partyDirectoryEntryInstanceReportType = null;

  private Object partyDirectoryEntryInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return partyDirectoryEntryInstanceReportData
  **/

  public String getPartyDirectoryEntryInstanceReportData() {
    return partyDirectoryEntryInstanceReportData;
  }

  public void setPartyDirectoryEntryInstanceReportData(String partyDirectoryEntryInstanceReportData) {
    this.partyDirectoryEntryInstanceReportData = partyDirectoryEntryInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return partyDirectoryEntryInstanceReport
  **/

  public Object getPartyDirectoryEntryInstanceReport() {
    return partyDirectoryEntryInstanceReport;
  }

  public void setPartyDirectoryEntryInstanceReport(Object partyDirectoryEntryInstanceReport) {
    this.partyDirectoryEntryInstanceReport = partyDirectoryEntryInstanceReport;
  }


}

