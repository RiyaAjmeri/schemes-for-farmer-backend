package com.lti.test;

import com.lti.dao.GenericDao;
import com.lti.entity.Farmer;
import com.lti.entity.User;

public class Test{

	@org.junit.Test
	public void addUser() {
		
		User user= new User();
		user.setEmail("surendra@gmail.com");
		user.setPassword("suren680");
		user.setName("surendra");
		user.setContactNo(7710385);
		user.setAddress("mumbai");
		user.setPinCode(401208);
		user.setAccountNo(487835);
		user.setIfscCode("d343jdd");
		user.setArea("mumbai");
		user.setCity("mumbai");
		user.setState("MH");
		GenericDao dao = new GenericDao();
		dao.save(user);
	}
	
	@org.junit.Test
	public void addFarmer() {
		GenericDao dao=new GenericDao();
		Farmer farmer= new Farmer();
		User user=(User) dao.fetchById(User.class,1);
		farmer.setUser(user);
		dao.save(farmer);
	}
	
	
}
