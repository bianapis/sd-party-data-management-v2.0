package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReferenceExecuteOutputModel
 */
public class BQReferenceExecuteOutputModel   {
  private String referenceExecuteActionTaskReference = null;

  private Object referenceExecuteActionTaskRecord = null;

  private String referenceExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reference instance execute service call 
   * @return referenceExecuteActionTaskReference
  **/

  public String getReferenceExecuteActionTaskReference() {
    return referenceExecuteActionTaskReference;
  }

  public void setReferenceExecuteActionTaskReference(String referenceExecuteActionTaskReference) {
    this.referenceExecuteActionTaskReference = referenceExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return referenceExecuteActionTaskRecord
  **/

  public Object getReferenceExecuteActionTaskRecord() {
    return referenceExecuteActionTaskRecord;
  }

  public void setReferenceExecuteActionTaskRecord(Object referenceExecuteActionTaskRecord) {
    this.referenceExecuteActionTaskRecord = referenceExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reference execute transaction/record 
   * @return referenceExecuteRecordReference
  **/

  public String getReferenceExecuteRecordReference() {
    return referenceExecuteRecordReference;
  }

  public void setReferenceExecuteRecordReference(String referenceExecuteRecordReference) {
    this.referenceExecuteRecordReference = referenceExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

