package com.pro.bean;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pro.serviceDao.*;
@Entity
@Table(name="customer")

public class CustomerProfileDao implements Serializable {

	 private static final long serialVersionUID = -723583058586873479L;
	 
	 @Id
	 @GeneratedValue(strategy= GenerationType.AUTO)
	 @Column(name = "custid")
	 private Integer custid;
	 
	 @Column(name="DOB")
	 private String DOB;
	 
	 @Column(name="sex")
	 private String sex;
	 
	 @Column(name="maritalStatus")
	 private String maritalStatus;
	 
	 
	 

}
