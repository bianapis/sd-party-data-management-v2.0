package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProfileRetrieveInputModelProfileInstanceAnalysis;
import org.bian.dto.BQProfileRetrieveInputModelProfileInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProfileRetrieveInputModel
 */
public class BQProfileRetrieveInputModel   {
  private Object profileRetrieveActionTaskRecord = null;

  private String profileRetrieveActionRequest = null;

  private BQProfileRetrieveInputModelProfileInstanceReport profileInstanceReport = null;

  private BQProfileRetrieveInputModelProfileInstanceAnalysis profileInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return profileRetrieveActionRequest
  **/

  public String getProfileRetrieveActionRequest() {
    return profileRetrieveActionRequest;
  }

  public void setProfileRetrieveActionRequest(String profileRetrieveActionRequest) {
    this.profileRetrieveActionRequest = profileRetrieveActionRequest;
  }


  /**
   * Get profileInstanceReport
   * @return profileInstanceReport
  **/

  public BQProfileRetrieveInputModelProfileInstanceReport getProfileInstanceReport() {
    return profileInstanceReport;
  }

  public void setProfileInstanceReport(BQProfileRetrieveInputModelProfileInstanceReport profileInstanceReport) {
    this.profileInstanceReport = profileInstanceReport;
  }


  /**
   * Get profileInstanceAnalysis
   * @return profileInstanceAnalysis
  **/

  public BQProfileRetrieveInputModelProfileInstanceAnalysis getProfileInstanceAnalysis() {
    return profileInstanceAnalysis;
  }

  public void setProfileInstanceAnalysis(BQProfileRetrieveInputModelProfileInstanceAnalysis profileInstanceAnalysis) {
    this.profileInstanceAnalysis = profileInstanceAnalysis;
  }


}

