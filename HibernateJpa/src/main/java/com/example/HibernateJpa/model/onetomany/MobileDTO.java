package com.example.HibernateJpa.model.onetomany;


import java.io.Serializable;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
 public class MobileDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int mobileId;
	private String model;
	private int number;

}
