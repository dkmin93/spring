package com.simple.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {

	//Printer 객체가 생성될 때 @Autowired에 의해서 적합한 빈 객체가 자동으로 주입된다
	//@Autowired는 객체를 탐지할 때 타입으로 먼저 찾고 타입이 없으면 이름으로 찾는다.
	
	//생성자, 세터, 멤버변수에 @Autowired를 적용할 수 있다.
	
	//@Resource 어노테이션 같은 역할을 한다
	//@Inject	어노테이션 같은 역할을 한다
	
	@Autowired(required = false) // Autowired 뒤에 (required = false)가 붙으면 반드시 필요하지는 않다는 뜻
	@Qualifier("doc1") //적합한 빈 이름으로 강제 연결을 한다. Qualifier는 항상 AutoWired와 같이 쓰인다. 
	private Document document;
	
	public Printer() {
	}

	//생성자
	public Printer(Document document) {
		this.document = document;
	}

	//게터 세터
	
	public Document getDocument() {
		return document;
	}
	
	public void setDocument(Document document) {
		this.document = document;
	}
	
	
	
}
