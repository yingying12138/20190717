package com.sy.domain;

public class User {
	private Integer uid;
	private String uname;
	private String age;
	private String sex;
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer uid, String uname, String age, String sex, String password) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.age = age;
		this.sex = sex;
		this.password = password;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", age=" + age + ", sex=" + sex + ", password=" + password
				+ "]";
	}
	
}
