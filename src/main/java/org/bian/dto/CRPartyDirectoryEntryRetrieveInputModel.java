package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyDirectoryEntryRetrieveInputModelPartyDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRPartyDirectoryEntryRetrieveInputModelPartyDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryRetrieveInputModel
 */
public class CRPartyDirectoryEntryRetrieveInputModel   {
  private Object partyDirectoryEntryRetrieveActionTaskRecord = null;

  private String partyDirectoryEntryRetrieveActionRequest = null;

  private CRPartyDirectoryEntryRetrieveInputModelPartyDirectoryEntryInstanceReportRecord partyDirectoryEntryInstanceReportRecord = null;

  private CRPartyDirectoryEntryRetrieveInputModelPartyDirectoryEntryInstanceAnalysis partyDirectoryEntryInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return partyDirectoryEntryRetrieveActionTaskRecord
  **/

  public Object getPartyDirectoryEntryRetrieveActionTaskRecord() {
    return partyDirectoryEntryRetrieveActionTaskRecord;
  }

  public void setPartyDirectoryEntryRetrieveActionTaskRecord(Object partyDirectoryEntryRetrieveActionTaskRecord) {
    this.partyDirectoryEntryRetrieveActionTaskRecord = partyDirectoryEntryRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return partyDirectoryEntryRetrieveActionRequest
  **/

  public String getPartyDirectoryEntryRetrieveActionRequest() {
    return partyDirectoryEntryRetrieveActionRequest;
  }

  public void setPartyDirectoryEntryRetrieveActionRequest(String partyDirectoryEntryRetrieveActionRequest) {
    this.partyDirectoryEntryRetrieveActionRequest = partyDirectoryEntryRetrieveActionRequest;
  }


  /**
   * Get partyDirectoryEntryInstanceReportRecord
   * @return partyDirectoryEntryInstanceReportRecord
  **/

  public CRPartyDirectoryEntryRetrieveInputModelPartyDirectoryEntryInstanceReportRecord getPartyDirectoryEntryInstanceReportRecord() {
    return partyDirectoryEntryInstanceReportRecord;
  }

  public void setPartyDirectoryEntryInstanceReportRecord(CRPartyDirectoryEntryRetrieveInputModelPartyDirectoryEntryInstanceReportRecord partyDirectoryEntryInstanceReportRecord) {
    this.partyDirectoryEntryInstanceReportRecord = partyDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get partyDirectoryEntryInstanceAnalysis
   * @return partyDirectoryEntryInstanceAnalysis
  **/

  public CRPartyDirectoryEntryRetrieveInputModelPartyDirectoryEntryInstanceAnalysis getPartyDirectoryEntryInstanceAnalysis() {
    return partyDirectoryEntryInstanceAnalysis;
  }

  public void setPartyDirectoryEntryInstanceAnalysis(CRPartyDirectoryEntryRetrieveInputModelPartyDirectoryEntryInstanceAnalysis partyDirectoryEntryInstanceAnalysis) {
    this.partyDirectoryEntryInstanceAnalysis = partyDirectoryEntryInstanceAnalysis;
  }


}

