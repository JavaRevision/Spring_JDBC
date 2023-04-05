package com.example.insertemployee.service;

import com.example.insertemployee.inter.DBOperationDAO;

public class DBOperationService {

	private DBOperationDAO dao;

	public void setDao(DBOperationDAO dao) {
		this.dao = dao;
	}

	public String createEmployee(int no, String name, String job, long salary) {
		int result = dao.insert(no, name, job, salary);

		if (result == 0) {

			return result + " Employee not registred";
		} else {

			return result + " Employee is egistred ";
		}
	}

}
