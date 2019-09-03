package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReferenceRetrieveOutputModelPartyDirectoryEntryInstanceRecord;
import org.bian.dto.BQReferenceRetrieveOutputModelReferenceInstanceAnalysis;
import org.bian.dto.BQReferenceRetrieveOutputModelReferenceInstanceRecord;
import org.bian.dto.BQReferenceRetrieveOutputModelReferenceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReferenceRetrieveOutputModel
 */
public class BQReferenceRetrieveOutputModel   {
  private BQReferenceRetrieveOutputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord = null;

  private BQReferenceRetrieveOutputModelReferenceInstanceRecord referenceInstanceRecord = null;

  private String referenceRetrieveActionTaskReference = null;

  private Object referenceRetrieveActionTaskRecord = null;

  private String referenceRetrieveActionResponse = null;

  private BQReferenceRetrieveOutputModelReferenceInstanceReport referenceInstanceReport = null;

  private BQReferenceRetrieveOutputModelReferenceInstanceAnalysis referenceInstanceAnalysis = null;


  /**
   * Get partyDirectoryEntryInstanceRecord
   * @return partyDirectoryEntryInstanceRecord
  **/

  public BQReferenceRetrieveOutputModelPartyDirectoryEntryInstanceRecord getPartyDirectoryEntryInstanceRecord() {
    return partyDirectoryEntryInstanceRecord;
  }

  public void setPartyDirectoryEntryInstanceRecord(BQReferenceRetrieveOutputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord) {
    this.partyDirectoryEntryInstanceRecord = partyDirectoryEntryInstanceRecord;
  }


  /**
   * Get referenceInstanceRecord
   * @return referenceInstanceRecord
  **/

  public BQReferenceRetrieveOutputModelReferenceInstanceRecord getReferenceInstanceRecord() {
    return referenceInstanceRecord;
  }

  public void setReferenceInstanceRecord(BQReferenceRetrieveOutputModelReferenceInstanceRecord referenceInstanceRecord) {
    this.referenceInstanceRecord = referenceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reference instance retrieve service call 
   * @return referenceRetrieveActionTaskReference
  **/

  public String getReferenceRetrieveActionTaskReference() {
    return referenceRetrieveActionTaskReference;
  }

  public void setReferenceRetrieveActionTaskReference(String referenceRetrieveActionTaskReference) {
    this.referenceRetrieveActionTaskReference = referenceRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return referenceRetrieveActionTaskRecord
  **/

  public Object getReferenceRetrieveActionTaskRecord() {
    return referenceRetrieveActionTaskRecord;
  }

  public void setReferenceRetrieveActionTaskRecord(Object referenceRetrieveActionTaskRecord) {
    this.referenceRetrieveActionTaskRecord = referenceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return referenceRetrieveActionResponse
  **/

  public String getReferenceRetrieveActionResponse() {
    return referenceRetrieveActionResponse;
  }

  public void setReferenceRetrieveActionResponse(String referenceRetrieveActionResponse) {
    this.referenceRetrieveActionResponse = referenceRetrieveActionResponse;
  }


  /**
   * Get referenceInstanceReport
   * @return referenceInstanceReport
  **/

  public BQReferenceRetrieveOutputModelReferenceInstanceReport getReferenceInstanceReport() {
    return referenceInstanceReport;
  }

  public void setReferenceInstanceReport(BQReferenceRetrieveOutputModelReferenceInstanceReport referenceInstanceReport) {
    this.referenceInstanceReport = referenceInstanceReport;
  }


  /**
   * Get referenceInstanceAnalysis
   * @return referenceInstanceAnalysis
  **/

  public BQReferenceRetrieveOutputModelReferenceInstanceAnalysis getReferenceInstanceAnalysis() {
    return referenceInstanceAnalysis;
  }

  public void setReferenceInstanceAnalysis(BQReferenceRetrieveOutputModelReferenceInstanceAnalysis referenceInstanceAnalysis) {
    this.referenceInstanceAnalysis = referenceInstanceAnalysis;
  }


}

