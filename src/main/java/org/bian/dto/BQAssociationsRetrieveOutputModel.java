package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssociationsRetrieveOutputModelAssociationsInstanceAnalysis;
import org.bian.dto.BQAssociationsRetrieveOutputModelAssociationsInstanceRecord;
import org.bian.dto.BQAssociationsRetrieveOutputModelAssociationsInstanceReport;
import org.bian.dto.BQAssociationsRetrieveOutputModelPartyDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssociationsRetrieveOutputModel
 */
public class BQAssociationsRetrieveOutputModel   {
  private BQAssociationsRetrieveOutputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord = null;

  private BQAssociationsRetrieveOutputModelAssociationsInstanceRecord associationsInstanceRecord = null;

  private String associationsRetrieveActionTaskReference = null;

  private Object associationsRetrieveActionTaskRecord = null;

  private String associationsRetrieveActionResponse = null;

  private BQAssociationsRetrieveOutputModelAssociationsInstanceReport associationsInstanceReport = null;

  private BQAssociationsRetrieveOutputModelAssociationsInstanceAnalysis associationsInstanceAnalysis = null;


  /**
   * Get partyDirectoryEntryInstanceRecord
   * @return partyDirectoryEntryInstanceRecord
  **/

  public BQAssociationsRetrieveOutputModelPartyDirectoryEntryInstanceRecord getPartyDirectoryEntryInstanceRecord() {
    return partyDirectoryEntryInstanceRecord;
  }

  public void setPartyDirectoryEntryInstanceRecord(BQAssociationsRetrieveOutputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord) {
    this.partyDirectoryEntryInstanceRecord = partyDirectoryEntryInstanceRecord;
  }


  /**
   * Get associationsInstanceRecord
   * @return associationsInstanceRecord
  **/

  public BQAssociationsRetrieveOutputModelAssociationsInstanceRecord getAssociationsInstanceRecord() {
    return associationsInstanceRecord;
  }

  public void setAssociationsInstanceRecord(BQAssociationsRetrieveOutputModelAssociationsInstanceRecord associationsInstanceRecord) {
    this.associationsInstanceRecord = associationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Associations instance retrieve service call 
   * @return associationsRetrieveActionTaskReference
  **/

  public String getAssociationsRetrieveActionTaskReference() {
    return associationsRetrieveActionTaskReference;
  }

  public void setAssociationsRetrieveActionTaskReference(String associationsRetrieveActionTaskReference) {
    this.associationsRetrieveActionTaskReference = associationsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return associationsRetrieveActionTaskRecord
  **/

  public Object getAssociationsRetrieveActionTaskRecord() {
    return associationsRetrieveActionTaskRecord;
  }

  public void setAssociationsRetrieveActionTaskRecord(Object associationsRetrieveActionTaskRecord) {
    this.associationsRetrieveActionTaskRecord = associationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return associationsRetrieveActionResponse
  **/

  public String getAssociationsRetrieveActionResponse() {
    return associationsRetrieveActionResponse;
  }

  public void setAssociationsRetrieveActionResponse(String associationsRetrieveActionResponse) {
    this.associationsRetrieveActionResponse = associationsRetrieveActionResponse;
  }


  /**
   * Get associationsInstanceReport
   * @return associationsInstanceReport
  **/

  public BQAssociationsRetrieveOutputModelAssociationsInstanceReport getAssociationsInstanceReport() {
    return associationsInstanceReport;
  }

  public void setAssociationsInstanceReport(BQAssociationsRetrieveOutputModelAssociationsInstanceReport associationsInstanceReport) {
    this.associationsInstanceReport = associationsInstanceReport;
  }


  /**
   * Get associationsInstanceAnalysis
   * @return associationsInstanceAnalysis
  **/

  public BQAssociationsRetrieveOutputModelAssociationsInstanceAnalysis getAssociationsInstanceAnalysis() {
    return associationsInstanceAnalysis;
  }

  public void setAssociationsInstanceAnalysis(BQAssociationsRetrieveOutputModelAssociationsInstanceAnalysis associationsInstanceAnalysis) {
    this.associationsInstanceAnalysis = associationsInstanceAnalysis;
  }


}

