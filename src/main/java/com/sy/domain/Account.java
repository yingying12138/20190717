package com.sy.domain;

public class Account {
	private Integer id;
	private String name;
	private Float money;
	private Integer u_id;
	//一个账户对应一个用户
	private User user;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(Integer id, String name, Float money, Integer u_id, User user) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
		this.u_id = u_id;
		this.user = user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getMoney() {
		return money;
	}
	public void setMoney(Float money) {
		this.money = money;
	}
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", money=" + money + ", u_id=" + u_id + ", user=" + user + "]";
	}
		
}
