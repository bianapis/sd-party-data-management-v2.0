package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProfileUpdateInputModelProfileInstanceRecord
 */
public class BQProfileUpdateInputModelProfileInstanceRecord   {
  private String organizationCapitalization = null;

  private String organizationDebtLevel = null;

  private String organizationEconomicIntent = null;

  private String organizationGrowthRate = null;

  private String organizationProfitabilityStocks = null;

  private String organizationRevenueTurnover = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The estimated capitalization of the entity 
   * @return organizationCapitalization
  **/

  public String getOrganizationCapitalization() {
    return organizationCapitalization;
  }

  public void setOrganizationCapitalization(String organizationCapitalization) {
    this.organizationCapitalization = organizationCapitalization;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The estimated debt level for the entity 
   * @return organizationDebtLevel
  **/

  public String getOrganizationDebtLevel() {
    return organizationDebtLevel;
  }

  public void setOrganizationDebtLevel(String organizationDebtLevel) {
    this.organizationDebtLevel = organizationDebtLevel;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The projected economic performance for the entity 
   * @return organizationEconomicIntent
  **/

  public String getOrganizationEconomicIntent() {
    return organizationEconomicIntent;
  }

  public void setOrganizationEconomicIntent(String organizationEconomicIntent) {
    this.organizationEconomicIntent = organizationEconomicIntent;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Past and projected growth rates 
   * @return organizationGrowthRate
  **/

  public String getOrganizationGrowthRate() {
    return organizationGrowthRate;
  }

  public void setOrganizationGrowthRate(String organizationGrowthRate) {
    this.organizationGrowthRate = organizationGrowthRate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Analysis of past performance (a summary description) 
   * @return organizationProfitabilityStocks
  **/

  public String getOrganizationProfitabilityStocks() {
    return organizationProfitabilityStocks;
  }

  public void setOrganizationProfitabilityStocks(String organizationProfitabilityStocks) {
    this.organizationProfitabilityStocks = organizationProfitabilityStocks;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of revenues, production volumes and staff turnover a summary description) 
   * @return organizationRevenueTurnover
  **/

  public String getOrganizationRevenueTurnover() {
    return organizationRevenueTurnover;
  }

  public void setOrganizationRevenueTurnover(String organizationRevenueTurnover) {
    this.organizationRevenueTurnover = organizationRevenueTurnover;
  }


}

