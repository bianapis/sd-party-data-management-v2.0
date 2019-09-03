package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReferenceRetrieveInputModelReferenceInstanceAnalysis;
import org.bian.dto.BQReferenceRetrieveInputModelReferenceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReferenceRetrieveInputModel
 */
public class BQReferenceRetrieveInputModel   {
  private Object referenceRetrieveActionTaskRecord = null;

  private String referenceRetrieveActionRequest = null;

  private BQReferenceRetrieveInputModelReferenceInstanceReport referenceInstanceReport = null;

  private BQReferenceRetrieveInputModelReferenceInstanceAnalysis referenceInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return referenceRetrieveActionRequest
  **/

  public String getReferenceRetrieveActionRequest() {
    return referenceRetrieveActionRequest;
  }

  public void setReferenceRetrieveActionRequest(String referenceRetrieveActionRequest) {
    this.referenceRetrieveActionRequest = referenceRetrieveActionRequest;
  }


  /**
   * Get referenceInstanceReport
   * @return referenceInstanceReport
  **/

  public BQReferenceRetrieveInputModelReferenceInstanceReport getReferenceInstanceReport() {
    return referenceInstanceReport;
  }

  public void setReferenceInstanceReport(BQReferenceRetrieveInputModelReferenceInstanceReport referenceInstanceReport) {
    this.referenceInstanceReport = referenceInstanceReport;
  }


  /**
   * Get referenceInstanceAnalysis
   * @return referenceInstanceAnalysis
  **/

  public BQReferenceRetrieveInputModelReferenceInstanceAnalysis getReferenceInstanceAnalysis() {
    return referenceInstanceAnalysis;
  }

  public void setReferenceInstanceAnalysis(BQReferenceRetrieveInputModelReferenceInstanceAnalysis referenceInstanceAnalysis) {
    this.referenceInstanceAnalysis = referenceInstanceAnalysis;
  }


}

