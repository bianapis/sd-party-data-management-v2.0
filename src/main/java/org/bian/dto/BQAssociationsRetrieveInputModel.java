package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssociationsRetrieveInputModelAssociationsInstanceAnalysis;
import org.bian.dto.BQAssociationsRetrieveInputModelAssociationsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAssociationsRetrieveInputModel
 */
public class BQAssociationsRetrieveInputModel   {
  private Object associationsRetrieveActionTaskRecord = null;

  private String associationsRetrieveActionRequest = null;

  private BQAssociationsRetrieveInputModelAssociationsInstanceReport associationsInstanceReport = null;

  private BQAssociationsRetrieveInputModelAssociationsInstanceAnalysis associationsInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return associationsRetrieveActionRequest
  **/

  public String getAssociationsRetrieveActionRequest() {
    return associationsRetrieveActionRequest;
  }

  public void setAssociationsRetrieveActionRequest(String associationsRetrieveActionRequest) {
    this.associationsRetrieveActionRequest = associationsRetrieveActionRequest;
  }


  /**
   * Get associationsInstanceReport
   * @return associationsInstanceReport
  **/

  public BQAssociationsRetrieveInputModelAssociationsInstanceReport getAssociationsInstanceReport() {
    return associationsInstanceReport;
  }

  public void setAssociationsInstanceReport(BQAssociationsRetrieveInputModelAssociationsInstanceReport associationsInstanceReport) {
    this.associationsInstanceReport = associationsInstanceReport;
  }


  /**
   * Get associationsInstanceAnalysis
   * @return associationsInstanceAnalysis
  **/

  public BQAssociationsRetrieveInputModelAssociationsInstanceAnalysis getAssociationsInstanceAnalysis() {
    return associationsInstanceAnalysis;
  }

  public void setAssociationsInstanceAnalysis(BQAssociationsRetrieveInputModelAssociationsInstanceAnalysis associationsInstanceAnalysis) {
    this.associationsInstanceAnalysis = associationsInstanceAnalysis;
  }


}

