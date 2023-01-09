package com.example.dbs.ibanking.controller;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.dbs.ibanking.helper.IbankHelper;
import com.example.dbs.ibanking.service.UserService;


@RunWith(MockitoJUnitRunner.class) 
public class IBankingControllerTest {
	
	@Mock
	UserService ibankingService;
	
	@Mock
	IbankHelper ibankHelper;
	
	@InjectMocks
	UserController controller;
	

}
