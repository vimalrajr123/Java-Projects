package com.example.dbs.ibanking.service.impl;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.dbs.ibanking.model.User;
import com.example.dbs.ibanking.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)  //which runs the Mockito test classes
public class IBankingServiceImplTest {

	@Mock  //for all autowired
	UserRepository userRepository;
	
	@InjectMocks  // for which class we are writing the Junit
	UserServiceImpl ibankingServiceImpl;
	
	@Test   //Test Method
	void getUserByIdFailure() {
		
		//Optional<User> user = null;
		when(userRepository.findById(anyInt())).thenReturn(null);
		
		User result = ibankingServiceImpl.getUserById(1001); 
		Assert.assertNull(result);
		
	}
	
	@Test   //Test Method
	void createNewUserSuccess() {
		
		User user = new User("aaa","bbb",1000,1);
		when(userRepository.save(any())).thenReturn(user);
		
		User result = ibankingServiceImpl.createNewUser("aaa","bbb",1000,1); 
		Assert.assertNotNull(result);
		
	}
	
	@Test   //Test Method
	void getAllUsersSuccess() {
		
		List<User> users = new ArrayList<User>();
		when(userRepository.findAll()).thenReturn(users);
		
		List<User> result = ibankingServiceImpl.getAllUsers(); 
		Assert.assertNotNull(result);
		
	}
	
}
