package com.simple.command;

public class MemberVO2 {
	
	private String id;
	private String pw;
	
	@Override
	public String toString() {
		return "MemberVO2 [id=" + id + ", pw=" + pw + "]";
	}

	public MemberVO2() {
		
	}
	
	public MemberVO2(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
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
	
	

}