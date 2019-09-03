package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPartyDataManagementRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord;

import javax.validation.Valid;
  
/**
 * SDPartyDataManagementRetrieveOutputModelServiceDomainOfferedService
 */
public class SDPartyDataManagementRetrieveOutputModelServiceDomainOfferedService   {
  private String serviceDomainServiceReference = null;

  private SDPartyDataManagementRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return serviceDomainServiceReference
  **/

  public String getServiceDomainServiceReference() {
    return serviceDomainServiceReference;
  }

  public void setServiceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
  }


  /**
   * Get serviceDomainServiceRecord
   * @return serviceDomainServiceRecord
  **/

  public SDPartyDataManagementRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord getServiceDomainServiceRecord() {
    return serviceDomainServiceRecord;
  }

  public void setServiceDomainServiceRecord(SDPartyDataManagementRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceRecord) {
    this.serviceDomainServiceRecord = serviceDomainServiceRecord;
  }


}

