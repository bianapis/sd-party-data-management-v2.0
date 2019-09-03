package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyDirectoryEntryRegisterOutputModelPartyDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryRegisterOutputModel
 */
public class CRPartyDirectoryEntryRegisterOutputModel   {
  private String partyDirectoryEntryInstanceReference = null;

  private String partyDirectoryEntryRegisterActionReference = null;

  private Object partyDirectoryEntryRegisterActionRecord = null;

  private String partyDirectoryEntryInstanceStatus = null;

  private CRPartyDirectoryEntryRegisterOutputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Party Directory Entry instance 
   * @return partyDirectoryEntryInstanceReference
  **/

  public String getPartyDirectoryEntryInstanceReference() {
    return partyDirectoryEntryInstanceReference;
  }

  public void setPartyDirectoryEntryInstanceReference(String partyDirectoryEntryInstanceReference) {
    this.partyDirectoryEntryInstanceReference = partyDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Register service call 
   * @return partyDirectoryEntryRegisterActionReference
  **/

  public String getPartyDirectoryEntryRegisterActionReference() {
    return partyDirectoryEntryRegisterActionReference;
  }

  public void setPartyDirectoryEntryRegisterActionReference(String partyDirectoryEntryRegisterActionReference) {
    this.partyDirectoryEntryRegisterActionReference = partyDirectoryEntryRegisterActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Register service call input and output record 
   * @return partyDirectoryEntryRegisterActionRecord
  **/

  public Object getPartyDirectoryEntryRegisterActionRecord() {
    return partyDirectoryEntryRegisterActionRecord;
  }

  public void setPartyDirectoryEntryRegisterActionRecord(Object partyDirectoryEntryRegisterActionRecord) {
    this.partyDirectoryEntryRegisterActionRecord = partyDirectoryEntryRegisterActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Party Directory Entry instance (e.g. initialised, pending, active) 
   * @return partyDirectoryEntryInstanceStatus
  **/

  public String getPartyDirectoryEntryInstanceStatus() {
    return partyDirectoryEntryInstanceStatus;
  }

  public void setPartyDirectoryEntryInstanceStatus(String partyDirectoryEntryInstanceStatus) {
    this.partyDirectoryEntryInstanceStatus = partyDirectoryEntryInstanceStatus;
  }


  /**
   * Get partyDirectoryEntryInstanceRecord
   * @return partyDirectoryEntryInstanceRecord
  **/

  public CRPartyDirectoryEntryRegisterOutputModelPartyDirectoryEntryInstanceRecord getPartyDirectoryEntryInstanceRecord() {
    return partyDirectoryEntryInstanceRecord;
  }

  public void setPartyDirectoryEntryInstanceRecord(CRPartyDirectoryEntryRegisterOutputModelPartyDirectoryEntryInstanceRecord partyDirectoryEntryInstanceRecord) {
    this.partyDirectoryEntryInstanceRecord = partyDirectoryEntryInstanceRecord;
  }


}

