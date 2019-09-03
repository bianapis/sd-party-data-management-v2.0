package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssociationsUpdateInputModelAssociationsInstanceRecord;
import org.bian.dto.BQAssociationsUpdateInputModelPartyDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssociationsUpdateOutputModel
 */
public class BQAssociationsUpdateOutputModel   {
  private BQAssociationsUpdateInputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord = null;

  private BQAssociationsUpdateInputModelAssociationsInstanceRecord associationsInstanceRecord = null;

  private String associationsUpdateActionTaskReference = null;

  private Object associationsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get partyDirectoryEntryInstanceRecord
   * @return partyDirectoryEntryInstanceRecord
  **/

  public BQAssociationsUpdateInputModelPartyDirectoryEntryInstanceRecord getPartyDirectoryEntryInstanceRecord() {
    return partyDirectoryEntryInstanceRecord;
  }

  public void setPartyDirectoryEntryInstanceRecord(BQAssociationsUpdateInputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord) {
    this.partyDirectoryEntryInstanceRecord = partyDirectoryEntryInstanceRecord;
  }


  /**
   * Get associationsInstanceRecord
   * @return associationsInstanceRecord
  **/

  public BQAssociationsUpdateInputModelAssociationsInstanceRecord getAssociationsInstanceRecord() {
    return associationsInstanceRecord;
  }

  public void setAssociationsInstanceRecord(BQAssociationsUpdateInputModelAssociationsInstanceRecord associationsInstanceRecord) {
    this.associationsInstanceRecord = associationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return associationsUpdateActionTaskReference
  **/

  public String getAssociationsUpdateActionTaskReference() {
    return associationsUpdateActionTaskReference;
  }

  public void setAssociationsUpdateActionTaskReference(String associationsUpdateActionTaskReference) {
    this.associationsUpdateActionTaskReference = associationsUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return associationsUpdateActionTaskRecord
  **/

  public Object getAssociationsUpdateActionTaskRecord() {
    return associationsUpdateActionTaskRecord;
  }

  public void setAssociationsUpdateActionTaskRecord(Object associationsUpdateActionTaskRecord) {
    this.associationsUpdateActionTaskRecord = associationsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

