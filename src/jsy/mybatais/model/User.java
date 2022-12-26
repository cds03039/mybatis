package jsy.mybatais.model;

import java.io.Serializable;

public class User implements Serializable{
	private String userid;
	private String userName;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", userName=" + userName + "]";
	}

}
