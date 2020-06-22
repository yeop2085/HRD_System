package com.green.biz.hrdAdmin;

public class HrdAdminVO {
	
	private String hrd_admin_id;
	private String hrd_admin_pwd;
	private String hrd_admin_name;
	private String hrd_admin_phone;
	private String hrd_admin_live;
	private String hrd_image;
	
	public String getHrd_admin_id() {
		return hrd_admin_id;
	}
	
	public String getHrd_admin_pwd() {
		return hrd_admin_pwd;
	}
	
	public String getHrd_admin_name() {
		return hrd_admin_name;
	}
	
	public String getHrd_admin_phone() {
		return hrd_admin_phone;
	}
	
	public String getHrd_admin_live() {
		return hrd_admin_live;
	}
	
	public String getHrd_image() {
		return hrd_image;
	}
	
	public void setHrd_admin_id(String hrd_admin_id) {
		this.hrd_admin_id = hrd_admin_id;
	}
	
	public void setHrd_admin_pwd(String hrd_admin_pwd) {
		this.hrd_admin_pwd = hrd_admin_pwd;
	}
	
	public void setHrd_admin_name(String hrd_admin_name) {
		this.hrd_admin_name = hrd_admin_name;
	}
	
	public void setHrd_admin_phone(String hrd_admin_phone) {
		this.hrd_admin_phone = hrd_admin_phone;
	}
	
	public void setHrd_admin_live(String hrd_admin_live) {
		this.hrd_admin_live = hrd_admin_live;
	}
	
	public void setHrd_image(String hrd_image) {
		this.hrd_image = hrd_image;
	}
	
	public String toString() {
		return "HrdAdminVO [hrd_admin_id : " + hrd_admin_id + ", hrd_admin_pwd : " + hrd_admin_pwd + 
				", hrd_admin_name : " + hrd_admin_name + ", hrd_admin_phone : " + hrd_admin_phone + 
				", hrd_admin_live : " + hrd_admin_live + ", hrd_image : " + hrd_image + " ]";
	}
	
}


