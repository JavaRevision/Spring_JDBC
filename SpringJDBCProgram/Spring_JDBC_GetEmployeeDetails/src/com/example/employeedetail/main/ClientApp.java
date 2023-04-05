package com.example.employeedetail.main;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.example.employeedetail.service.DBOperationService;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext =

				new FileSystemXmlApplicationContext("src\\com\\example\\employeedetail\\config\\applicationContext.xml");

		DBOperationService dbOperationService = (DBOperationService) applicationContext.getBean("dbService");

		/* show AllEmployeeDetails */

		List<Map<String, Object>> list = dbOperationService.getAllEmployeeDetails();
		list.stream().collect(Collectors.toList()).forEach(System.out::println);

		/* show particular EmployeeDetails */

		Map<String, Object> empMap = dbOperationService.getEmployeeDetails(6);

		for (Map.Entry<String, Object> mapemp : empMap.entrySet()) {
			System.out.print(mapemp.getKey());
			System.out.println(mapemp.getValue());
		}

	}

}
