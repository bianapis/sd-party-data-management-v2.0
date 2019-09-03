package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReferenceExecuteInputModelReferenceInstanceRecord
 */
public class BQReferenceExecuteInputModelReferenceInstanceRecord   {
  private String legalEntityOfficialName = null;

  private String legalEntityType = null;

  private String sectorsofOperation = null;

  private String registeredAddress = null;

  private String headquartersLocation = null;

  private String dateofIncorporation = null;

  private String jurisdictionofIncorporation = null;

  private String registrationAuthority = null;

  private String primaryRegulator = null;

  private String taxReference = null;

  private String contactRole = null;

  private String contactAddressDetails = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The registered name of the entity 
   * @return legalEntityOfficialName
  **/

  public String getLegalEntityOfficialName() {
    return legalEntityOfficialName;
  }

  public void setLegalEntityOfficialName(String legalEntityOfficialName) {
    this.legalEntityOfficialName = legalEntityOfficialName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of legal entity (e.g. individual, Inc, Plc) 
   * @return legalEntityType
  **/

  public String getLegalEntityType() {
    return legalEntityType;
  }

  public void setLegalEntityType(String legalEntityType) {
    this.legalEntityType = legalEntityType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The sectors of operation (e.g. finance, Asia) 
   * @return sectorsofOperation
  **/

  public String getSectorsofOperation() {
    return sectorsofOperation;
  }

  public void setSectorsofOperation(String sectorsofOperation) {
    this.sectorsofOperation = sectorsofOperation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The registered address for the legal entity 
   * @return registeredAddress
  **/

  public String getRegisteredAddress() {
    return registeredAddress;
  }

  public void setRegisteredAddress(String registeredAddress) {
    this.registeredAddress = registeredAddress;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The location of the head office (and regional offices if appropriate) 
   * @return headquartersLocation
  **/

  public String getHeadquartersLocation() {
    return headquartersLocation;
  }

  public void setHeadquartersLocation(String headquartersLocation) {
    this.headquartersLocation = headquartersLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The date of incorporation (or dates when subsidiaries involved) 
   * @return dateofIncorporation
  **/

  public String getDateofIncorporation() {
    return dateofIncorporation;
  }

  public void setDateofIncorporation(String dateofIncorporation) {
    this.dateofIncorporation = dateofIncorporation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The jurisdiction governing the company 
   * @return jurisdictionofIncorporation
  **/

  public String getJurisdictionofIncorporation() {
    return jurisdictionofIncorporation;
  }

  public void setJurisdictionofIncorporation(String jurisdictionofIncorporation) {
    this.jurisdictionofIncorporation = jurisdictionofIncorporation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The associated legal or registration authority 
   * @return registrationAuthority
  **/

  public String getRegistrationAuthority() {
    return registrationAuthority;
  }

  public void setRegistrationAuthority(String registrationAuthority) {
    this.registrationAuthority = registrationAuthority;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The primary, and additional regulators as appropriate 
   * @return primaryRegulator
  **/

  public String getPrimaryRegulator() {
    return primaryRegulator;
  }

  public void setPrimaryRegulator(String primaryRegulator) {
    this.primaryRegulator = primaryRegulator;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference identifier linking the entity to appropriate tax authority 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The bank's contact role or roles established to maintain the relationship with the bank (e.g. CEO) 
   * @return contactRole
  **/

  public String getContactRole() {
    return contactRole;
  }

  public void setContactRole(String contactRole) {
    this.contactRole = contactRole;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The address of the bank's contact's within the entity 
   * @return contactAddressDetails
  **/

  public String getContactAddressDetails() {
    return contactAddressDetails;
  }

  public void setContactAddressDetails(String contactAddressDetails) {
    this.contactAddressDetails = contactAddressDetails;
  }


}

