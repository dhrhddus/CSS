package com.simple.controller;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//필요스팩 - junit4.12이상, spring-test라이브라러.
@RunWith(SpringJUnit4ClassRunner.class)//was의 가동없이 클래스를 실행시켜줍니다.
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml")//해당파일을 스프링설정파일로참조
public class DatabaseTEST {
	
	@Autowired
	private DataSource dataSource;
	
	@Test //해당메서드를 실행
	public void test() {
		try {
			Connection conn = dataSource.getConnection();
			
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
