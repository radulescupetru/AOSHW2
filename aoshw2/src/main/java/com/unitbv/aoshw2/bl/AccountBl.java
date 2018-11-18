package com.unitbv.aoshw2.bl;

import java.util.ArrayList;

import com.unitbv.aoshw2.dal.AccountDal;
import com.unitbv.aoshw2.dao.Person;

public class AccountBl {
	private static final String persistanceUnitName = "dbSource";
	private AccountDal accountDal;
	
	public AccountBl() {
		accountDal  = new AccountDal(persistanceUnitName);
	}
	
	public void insert(Person person) {
		if (person != null) {
			accountDal.insert(person);
		}
	}


	public void update(Person person,Person newPerson) {
		if (person != null) {
			accountDal.update(person,newPerson);
		}
	}


	public ArrayList<Person> getAll() {
			return accountDal.getAll();
	}

	public void delete(Person person) {
		if (person != null) {
			accountDal.delete(person);
		}
	}
}
