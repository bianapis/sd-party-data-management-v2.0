package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProfileRetrieveOutputModelPartyDirectoryEntryInstanceRecord;
import org.bian.dto.BQProfileRetrieveOutputModelProfileInstanceAnalysis;
import org.bian.dto.BQProfileRetrieveOutputModelProfileInstanceReport;
import org.bian.dto.BQProfileUpdateInputModelProfileInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProfileRetrieveOutputModel
 */
public class BQProfileRetrieveOutputModel   {
  private BQProfileRetrieveOutputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord = null;

  private BQProfileUpdateInputModelProfileInstanceRecord profileInstanceRecord = null;

  private String profileRetrieveActionTaskReference = null;

  private Object profileRetrieveActionTaskRecord = null;

  private String profileRetrieveActionResponse = null;

  private BQProfileRetrieveOutputModelProfileInstanceReport profileInstanceReport = null;

  private BQProfileRetrieveOutputModelProfileInstanceAnalysis profileInstanceAnalysis = null;


  /**
   * Get partyDirectoryEntryInstanceRecord
   * @return partyDirectoryEntryInstanceRecord
  **/

  public BQProfileRetrieveOutputModelPartyDirectoryEntryInstanceRecord getPartyDirectoryEntryInstanceRecord() {
    return partyDirectoryEntryInstanceRecord;
  }

  public void setPartyDirectoryEntryInstanceRecord(BQProfileRetrieveOutputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord) {
    this.partyDirectoryEntryInstanceRecord = partyDirectoryEntryInstanceRecord;
  }


  /**
   * Get profileInstanceRecord
   * @return profileInstanceRecord
  **/

  public BQProfileUpdateInputModelProfileInstanceRecord getProfileInstanceRecord() {
    return profileInstanceRecord;
  }

  public void setProfileInstanceRecord(BQProfileUpdateInputModelProfileInstanceRecord profileInstanceRecord) {
    this.profileInstanceRecord = profileInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Profile instance retrieve service call 
   * @return profileRetrieveActionTaskReference
  **/

  public String getProfileRetrieveActionTaskReference() {
    return profileRetrieveActionTaskReference;
  }

  public void setProfileRetrieveActionTaskReference(String profileRetrieveActionTaskReference) {
    this.profileRetrieveActionTaskReference = profileRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return profileRetrieveActionTaskRecord
  **/

  public Object getProfileRetrieveActionTaskRecord() {
    return profileRetrieveActionTaskRecord;
  }

  public void setProfileRetrieveActionTaskRecord(Object profileRetrieveActionTaskRecord) {
    this.profileRetrieveActionTaskRecord = profileRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return profileRetrieveActionResponse
  **/

  public String getProfileRetrieveActionResponse() {
    return profileRetrieveActionResponse;
  }

  public void setProfileRetrieveActionResponse(String profileRetrieveActionResponse) {
    this.profileRetrieveActionResponse = profileRetrieveActionResponse;
  }


  /**
   * Get profileInstanceReport
   * @return profileInstanceReport
  **/

  public BQProfileRetrieveOutputModelProfileInstanceReport getProfileInstanceReport() {
    return profileInstanceReport;
  }

  public void setProfileInstanceReport(BQProfileRetrieveOutputModelProfileInstanceReport profileInstanceReport) {
    this.profileInstanceReport = profileInstanceReport;
  }


  /**
   * Get profileInstanceAnalysis
   * @return profileInstanceAnalysis
  **/

  public BQProfileRetrieveOutputModelProfileInstanceAnalysis getProfileInstanceAnalysis() {
    return profileInstanceAnalysis;
  }

  public void setProfileInstanceAnalysis(BQProfileRetrieveOutputModelProfileInstanceAnalysis profileInstanceAnalysis) {
    this.profileInstanceAnalysis = profileInstanceAnalysis;
  }


}

