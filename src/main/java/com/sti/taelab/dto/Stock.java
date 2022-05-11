package com.sti.taelab.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*
CREATE TABLE IF NOT EXISTS `taelab`.`stock` (
  `stocktId` INT NOT NULL,
  `symbol` VARCHAR(45) NOT NULL,
  `company` VARCHAR(45) NOT NULL,
  `exchange` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `currency` VARCHAR(45) NOT NULL,
  `sector` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`stocktId`),
  UNIQUE INDEX `assetId_UNIQUE` (`stocktId` ASC) VISIBLE,
  UNIQUE INDEX `symbol_UNIQUE` (`symbol` ASC) VISIBLE)
ENGINE = InnoDB;
*/

@ApiModel(value = "Stock (주식 종목 정보)", description = "종목 번호, 종묙 표기, 회사명, 거래소, 국가, 통화, 영역을 가진 Domain Class")
public class Stock {
	@ApiModelProperty(value = "종목 번호")
	private int stocktId;
	@ApiModelProperty(value = "종목 표기")
	private String symbol;
	@ApiModelProperty(value = "회사명")
	private String company;
	@ApiModelProperty(value = "거래소")
	private String exchange;
	@ApiModelProperty(value = "국가")
	private String country;
	@ApiModelProperty(value = "통화")
	private String currency;
	@ApiModelProperty(value = "영역")
	private String sector;

	public int getStocktId() {
		return stocktId;
	}

	public void setStocktId(int stocktId) {
		this.stocktId = stocktId;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	@Override
	public String toString() {
		return "Stock [stocktId=" + stocktId + ", symbol=" + symbol + ", company=" + company + ", exchange=" + exchange
				+ ", country=" + country + ", currency=" + currency + ", sector=" + sector + "]";
	}
}
