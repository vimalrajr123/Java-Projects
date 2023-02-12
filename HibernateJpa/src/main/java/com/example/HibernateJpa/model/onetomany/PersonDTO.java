package com.example.HibernateJpa.model.onetomany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PersonDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int personId;
	private String personName;
	private int age;
	private List<MobileDTO> mobileDTOList;
	
}
