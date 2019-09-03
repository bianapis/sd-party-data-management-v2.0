package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssociationsExecuteOutputModel
 */
public class BQAssociationsExecuteOutputModel   {
  private String associationsExecuteActionTaskReference = null;

  private Object associationsExecuteActionTaskRecord = null;

  private String associationsExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Associations instance execute service call 
   * @return associationsExecuteActionTaskReference
  **/

  public String getAssociationsExecuteActionTaskReference() {
    return associationsExecuteActionTaskReference;
  }

  public void setAssociationsExecuteActionTaskReference(String associationsExecuteActionTaskReference) {
    this.associationsExecuteActionTaskReference = associationsExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return associationsExecuteActionTaskRecord
  **/

  public Object getAssociationsExecuteActionTaskRecord() {
    return associationsExecuteActionTaskRecord;
  }

  public void setAssociationsExecuteActionTaskRecord(Object associationsExecuteActionTaskRecord) {
    this.associationsExecuteActionTaskRecord = associationsExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Associations execute transaction/record 
   * @return associationsExecuteRecordReference
  **/

  public String getAssociationsExecuteRecordReference() {
    return associationsExecuteRecordReference;
  }

  public void setAssociationsExecuteRecordReference(String associationsExecuteRecordReference) {
    this.associationsExecuteRecordReference = associationsExecuteRecordReference;
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

