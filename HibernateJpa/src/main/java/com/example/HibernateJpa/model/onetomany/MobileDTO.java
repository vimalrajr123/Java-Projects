package com.example.HibernateJpa.model.onetomany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class MobileDTO {
	
	private int MobileId;
	private String Model;
	private int Number;

}
