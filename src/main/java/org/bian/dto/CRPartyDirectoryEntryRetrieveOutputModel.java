package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceRecord;
import org.bian.dto.CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryRetrieveOutputModel
 */
public class CRPartyDirectoryEntryRetrieveOutputModel   {
  private CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord = null;

  private String partyDirectoryEntryRetrieveActionTaskReference = null;

  private Object partyDirectoryEntryRetrieveActionTaskRecord = null;

  private String partyDirectoryEntryRetrieveActionResponse = null;

  private CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceReportRecord partyDirectoryEntryInstanceReportRecord = null;

  private CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceAnalysis partyDirectoryEntryInstanceAnalysis = null;


  /**
   * Get partyDirectoryEntryInstanceRecord
   * @return partyDirectoryEntryInstanceRecord
  **/

  public CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceRecord getPartyDirectoryEntryInstanceRecord() {
    return partyDirectoryEntryInstanceRecord;
  }

  public void setPartyDirectoryEntryInstanceRecord(CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord) {
    this.partyDirectoryEntryInstanceRecord = partyDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Party Directory Entry instance retrieve service call 
   * @return partyDirectoryEntryRetrieveActionTaskReference
  **/

  public String getPartyDirectoryEntryRetrieveActionTaskReference() {
    return partyDirectoryEntryRetrieveActionTaskReference;
  }

  public void setPartyDirectoryEntryRetrieveActionTaskReference(String partyDirectoryEntryRetrieveActionTaskReference) {
    this.partyDirectoryEntryRetrieveActionTaskReference = partyDirectoryEntryRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return partyDirectoryEntryRetrieveActionResponse
  **/

  public String getPartyDirectoryEntryRetrieveActionResponse() {
    return partyDirectoryEntryRetrieveActionResponse;
  }

  public void setPartyDirectoryEntryRetrieveActionResponse(String partyDirectoryEntryRetrieveActionResponse) {
    this.partyDirectoryEntryRetrieveActionResponse = partyDirectoryEntryRetrieveActionResponse;
  }


  /**
   * Get partyDirectoryEntryInstanceReportRecord
   * @return partyDirectoryEntryInstanceReportRecord
  **/

  public CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceReportRecord getPartyDirectoryEntryInstanceReportRecord() {
    return partyDirectoryEntryInstanceReportRecord;
  }

  public void setPartyDirectoryEntryInstanceReportRecord(CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceReportRecord partyDirectoryEntryInstanceReportRecord) {
    this.partyDirectoryEntryInstanceReportRecord = partyDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get partyDirectoryEntryInstanceAnalysis
   * @return partyDirectoryEntryInstanceAnalysis
  **/

  public CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceAnalysis getPartyDirectoryEntryInstanceAnalysis() {
    return partyDirectoryEntryInstanceAnalysis;
  }

  public void setPartyDirectoryEntryInstanceAnalysis(CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceAnalysis partyDirectoryEntryInstanceAnalysis) {
    this.partyDirectoryEntryInstanceAnalysis = partyDirectoryEntryInstanceAnalysis;
  }


}

