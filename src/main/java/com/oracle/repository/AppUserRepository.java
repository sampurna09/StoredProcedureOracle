package com.oracle.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;





@Repository
public class AppUserRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public String getSpecificeName(String input) {
		StoredProcedureQuery proc =  entityManager.createStoredProcedureQuery("GETALLUSERS");
				proc.registerStoredProcedureParameter("uemail", String.class, ParameterMode.IN).setParameter("uemail", input);
				proc.registerStoredProcedureParameter("uname", String.class, ParameterMode.OUT).execute();
				proc.execute();
				String name = (String) proc.getOutputParameterValue("uname");
		 return name;
		
		
	}
	
	
}
