package user.process;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import user.entity.UserEntityInterface;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
	//가상객체
	@Mock
	UserEntityInterface ud;
	
	//가상객체를 사용하는 객체
	@InjectMocks
	UserService userservice;
	
	@Test
	public void test(){
		//UserService us = new UserService();
		int count = userservice.findAllUsersCount();
		
		assertEquals(count,1);
		
		Mockito.verify(ud,Mockito.timeout(1)).selectAllUserCount();
	}
}
