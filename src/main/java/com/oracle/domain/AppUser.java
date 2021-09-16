package com.oracle.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedStoredProcedureQuery(name="specificUser",procedureName="GETALLUSERS",
parameters= {@StoredProcedureParameter(mode=ParameterMode.IN,name="uid",type = int.class)})
public class AppUser {

    // "customer_seq" is Oracle sequence name.
    @Id
    Long id;
    
    String name;
    
    String email;

    @Column(name = "CREATED_DATE")
    Date date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

    
}
