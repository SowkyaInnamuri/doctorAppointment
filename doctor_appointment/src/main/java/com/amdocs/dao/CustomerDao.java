package com.amdocs.dao;

import com.amdocs.model.Customer;


import com.amdocs.model.Appointment;
public interface CustomerDao {

	void insert(Customer user);
	Customer findById(String email) ;

}

