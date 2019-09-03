package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyDirectoryEntryRegisterInputModelPartyDirectoryEntryInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceRecord
 */
public class CRPartyDirectoryEntryRetrieveOutputModelPartyDirectoryEntryInstanceRecord   {
  private String legalEntityReference = null;

  private String customerReference = null;

  private CRPartyDirectoryEntryRegisterInputModelPartyDirectoryEntryInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the legal entity that is the subject of the entry 
   * @return legalEntityReference
  **/

  public String getLegalEntityReference() {
    return legalEntityReference;
  }

  public void setLegalEntityReference(String legalEntityReference) {
    this.legalEntityReference = legalEntityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer (one or more linked by role to the legal entity) 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRPartyDirectoryEntryRegisterInputModelPartyDirectoryEntryInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRPartyDirectoryEntryRegisterInputModelPartyDirectoryEntryInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

