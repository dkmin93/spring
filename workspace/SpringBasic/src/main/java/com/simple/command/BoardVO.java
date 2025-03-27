package com.simple.command;

public class BoardVO {

	private String name;
	private String title;
	private String content;
	private String memo;
	
	public BoardVO() {
		
	}

	@Override
	public String toString() {
		return "BoardVO [name=" + name + ", title=" + title + ", content=" + content + ", memo=" + memo + "]";
	}



	public BoardVO(String name, String title, String content, String memo) {
		super();
		this.name = name;
		this.title = title;
		this.content = content;
		this.memo = memo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
