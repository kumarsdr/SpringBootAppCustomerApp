package com.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Data
public class Customer implements Serializable {

	
	@GeneratedValue
	@Id
	private Integer custId;
	private String custCode;
	private String custName;
	private String custType;
	private String note;
}
