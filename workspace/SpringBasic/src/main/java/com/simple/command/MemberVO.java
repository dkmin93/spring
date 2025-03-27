package com.simple.command;

import java.util.ArrayList;

public class MemberVO { //DTO랑 똑같은 것

	private String id;
	private String pw;
	private String name;
	private ArrayList<String> inter;
	private String nick;
	private String birth;
	private String email;
	private String year;
	private String month;
	private String day;
	private String msg;
	
	

	

	

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", inter=" + inter + ", nick=" + nick
				+ ", birth=" + birth + ", email=" + email + ", year=" + year + ", month=" + month + ", day=" + day
				+ ", msg=" + msg + "]";
	}

	public MemberVO() {
		
	}

	public MemberVO(String id, String pw, String name, ArrayList<String> inter, String nick, String birth) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.inter = inter;
		this.nick = nick;
		this.birth = birth;
		this.email = email;
		this.year = year;
		this.month = month;
		this.day = day;
		this.msg = msg;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getInter() {
		return inter;
	}

	public void setInter(ArrayList<String> inter) {
		this.inter = inter;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	
	
	
	
	
}