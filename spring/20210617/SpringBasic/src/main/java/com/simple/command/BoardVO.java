package com.simple.command;

public class BoardVO {

	public int bno;
	public String name;
	public String title;
	public String content;
	
	public BoardVO() {
		
	}

	public BoardVO(int bno, String name, String title, String content) {
		super();
		this.bno = bno;
		this.name = name;
		this.title = title;
		this.content = content;
	}
	
	
}
