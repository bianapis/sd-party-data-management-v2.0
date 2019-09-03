package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProfileExecuteOutputModel
 */
public class BQProfileExecuteOutputModel   {
  private String profileExecuteActionTaskReference = null;

  private Object profileExecuteActionTaskRecord = null;

  private String profileExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Profile instance execute service call 
   * @return profileExecuteActionTaskReference
  **/

  public String getProfileExecuteActionTaskReference() {
    return profileExecuteActionTaskReference;
  }

  public void setProfileExecuteActionTaskReference(String profileExecuteActionTaskReference) {
    this.profileExecuteActionTaskReference = profileExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return profileExecuteActionTaskRecord
  **/

  public Object getProfileExecuteActionTaskRecord() {
    return profileExecuteActionTaskRecord;
  }

  public void setProfileExecuteActionTaskRecord(Object profileExecuteActionTaskRecord) {
    this.profileExecuteActionTaskRecord = profileExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Profile execute transaction/record 
   * @return profileExecuteRecordReference
  **/

  public String getProfileExecuteRecordReference() {
    return profileExecuteRecordReference;
  }

  public void setProfileExecuteRecordReference(String profileExecuteRecordReference) {
    this.profileExecuteRecordReference = profileExecuteRecordReference;
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

