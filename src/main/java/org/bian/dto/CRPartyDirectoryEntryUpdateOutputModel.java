package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyDirectoryEntryUpdateInputModelPartyDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryUpdateOutputModel
 */
public class CRPartyDirectoryEntryUpdateOutputModel   {
  private CRPartyDirectoryEntryUpdateInputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord = null;

  private String partyDirectoryEntryUpdateActionTaskReference = null;

  private Object partyDirectoryEntryUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get partyDirectoryEntryInstanceRecord
   * @return partyDirectoryEntryInstanceRecord
  **/

  public CRPartyDirectoryEntryUpdateInputModelPartyDirectoryEntryInstanceRecord getPartyDirectoryEntryInstanceRecord() {
    return partyDirectoryEntryInstanceRecord;
  }

  public void setPartyDirectoryEntryInstanceRecord(CRPartyDirectoryEntryUpdateInputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord) {
    this.partyDirectoryEntryInstanceRecord = partyDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return partyDirectoryEntryUpdateActionTaskReference
  **/

  public String getPartyDirectoryEntryUpdateActionTaskReference() {
    return partyDirectoryEntryUpdateActionTaskReference;
  }

  public void setPartyDirectoryEntryUpdateActionTaskReference(String partyDirectoryEntryUpdateActionTaskReference) {
    this.partyDirectoryEntryUpdateActionTaskReference = partyDirectoryEntryUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return partyDirectoryEntryUpdateActionTaskRecord
  **/

  public Object getPartyDirectoryEntryUpdateActionTaskRecord() {
    return partyDirectoryEntryUpdateActionTaskRecord;
  }

  public void setPartyDirectoryEntryUpdateActionTaskRecord(Object partyDirectoryEntryUpdateActionTaskRecord) {
    this.partyDirectoryEntryUpdateActionTaskRecord = partyDirectoryEntryUpdateActionTaskRecord;
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

