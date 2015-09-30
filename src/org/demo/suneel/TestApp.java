package org.demo.suneel;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	
	public static void main(String[] args) {
		
		ApplicationContext apcon =new ClassPathXmlApplicationContext("spring.xml");
		
		QuestionsDAO qd=(QuestionsDAO)apcon.getBean("dao");
		
		Questions q =new Questions();
		
		q.setId(1);
		
		q.setText("what is java");	
		
	}

}
