package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssociationsExecuteInputModelAssociationsInstanceRecord
 */
public class BQAssociationsExecuteInputModelAssociationsInstanceRecord   {
  private String legalEntityAssociationReference = null;

  private String legalEntityAssociationType = null;

  private String legalEntityAssociationObligation = null;

  private String parentLegalEntityReference = null;

  private String subsidiaryLegalEntityReference = null;

  private String shareholdingProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info:  Reference to the associated entity (e.g. company or individual) 
   * @return legalEntityAssociationReference
  **/

  public String getLegalEntityAssociationReference() {
    return legalEntityAssociationReference;
  }

  public void setLegalEntityAssociationReference(String legalEntityAssociationReference) {
    this.legalEntityAssociationReference = legalEntityAssociationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Nature or type of association (e.g. corporate or familial) 
   * @return legalEntityAssociationType
  **/

  public String getLegalEntityAssociationType() {
    return legalEntityAssociationType;
  }

  public void setLegalEntityAssociationType(String legalEntityAssociationType) {
    this.legalEntityAssociationType = legalEntityAssociationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the association and applicable obligations (e.g. shareholder, director, guardian, guarantor) 
   * @return legalEntityAssociationObligation
  **/

  public String getLegalEntityAssociationObligation() {
    return legalEntityAssociationObligation;
  }

  public void setLegalEntityAssociationObligation(String legalEntityAssociationObligation) {
    this.legalEntityAssociationObligation = legalEntityAssociationObligation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference the parent entity if applicable  
   * @return parentLegalEntityReference
  **/

  public String getParentLegalEntityReference() {
    return parentLegalEntityReference;
  }

  public void setParentLegalEntityReference(String parentLegalEntityReference) {
    this.parentLegalEntityReference = parentLegalEntityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference the subsidiary entity if applicable  
   * @return subsidiaryLegalEntityReference
  **/

  public String getSubsidiaryLegalEntityReference() {
    return subsidiaryLegalEntityReference;
  }

  public void setSubsidiaryLegalEntityReference(String subsidiaryLegalEntityReference) {
    this.subsidiaryLegalEntityReference = subsidiaryLegalEntityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: List of major shareholders and shareholdings of significance 
   * @return shareholdingProfile
  **/

  public String getShareholdingProfile() {
    return shareholdingProfile;
  }

  public void setShareholdingProfile(String shareholdingProfile) {
    this.shareholdingProfile = shareholdingProfile;
  }


}

