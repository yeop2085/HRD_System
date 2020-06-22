package com.green.biz.information;

import java.sql.Date;

public class InformationVO {
	
	private int information_number;
	private String title;
	private String content;
	private Date regdate;
	
	public int getInformation_number() {
		return information_number;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public Date getRegdate() {
		return regdate;
	}
	
	public void setInformation_number(int information_number) {
		this.information_number = information_number;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	public String toString() {
		return "InformationVO [ information_number : " + information_number + 
				", title : " + title + ", content : " + content + ", regdage : " + regdate + " ]";
	}
	
}

