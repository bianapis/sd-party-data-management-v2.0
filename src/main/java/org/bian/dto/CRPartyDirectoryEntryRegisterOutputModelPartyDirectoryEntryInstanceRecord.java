package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyDirectoryEntryRegisterInputModelPartyDirectoryEntryInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * CRPartyDirectoryEntryRegisterOutputModelPartyDirectoryEntryInstanceRecord
 */
public class CRPartyDirectoryEntryRegisterOutputModelPartyDirectoryEntryInstanceRecord   {
  private CRPartyDirectoryEntryRegisterInputModelPartyDirectoryEntryInstanceRecordDateType dateType = null;


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

