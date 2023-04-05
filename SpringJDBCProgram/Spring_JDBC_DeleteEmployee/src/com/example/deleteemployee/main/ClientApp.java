package com.example.deleteemployee.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.example.deleteemployee.service.DBOperationService;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext =

				new FileSystemXmlApplicationContext(
						"src\\com\\example\\deleteemployee\\config\\applicationContext.xml");

		DBOperationService dbOperationService = (DBOperationService) applicationContext.getBean("dbService");

		System.out.println(dbOperationService.removeEmployeeDetails(17));

	}

}
