package com.sti.taelab.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*
CREATE TABLE IF NOT EXISTS `taelab`.`news` (
  `newsId` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `subtitle` VARCHAR(45) NULL,
  `content` TEXT NULL,
  `categoryId` INT NOT NULL,
  `region` VARCHAR(45) NOT NULL,
  `url` VARCHAR(100) NULL,
  `regdate` TIMESTAMP NULL DEFAULT now(),
  PRIMARY KEY (`newsId`),
  INDEX `fk_news_category1_idx` (`categoryId` ASC) VISIBLE,
  CONSTRAINT `fk_news_category1`
    FOREIGN KEY (`categoryId`)
    REFERENCES `taelab`.`category` (`categoryId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
*/

@ApiModel(value = "News (국내외 뉴스)", description = "뉴스 번호, 제목, 부제, 내용, 카테고리, 지역, 작성 날짜를 가진 Domain Class")
public class News {

	@ApiModelProperty(value = "뉴스 번호")
	private int newsId;
	@ApiModelProperty(value = "제목")
	private String title;
	@ApiModelProperty(value = "부제")
	private String subtitle;
	@ApiModelProperty(value = "내용")
	private String content;
	@ApiModelProperty(value = "카테고리")
	private String category;
	@ApiModelProperty(value = "지역")
	private String region;
	@ApiModelProperty(value = "작성 날짜")
	private String regdate;

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", title=" + title + ", subtitle=" + subtitle + ", content=" + content
				+ ", category=" + category + ", region=" + region + ", regdate=" + regdate + "]";
	}
}
