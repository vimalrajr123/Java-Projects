package com.dbs.bank.ibanking.controller;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.dbs.bank.ibanking.Helper.IbankHelper;
import com.dbs.bank.ibanking.service.IbankingService;


@RunWith(MockitoJUnitRunner.class) 
public class IBankingControllerTest {
	
	@Mock
	IbankingService ibankingService;
	
	@Mock
	IbankHelper ibankHelper;
	
	@InjectMocks
	IbankController controller;
	

}
