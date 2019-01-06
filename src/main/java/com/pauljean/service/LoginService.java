package com.pauljean.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pauljean.dao.LoginDao;

@Service
public class LoginService {
	
	Logger log=LoggerFactory.getLogger(LoginService.class);
	
	@Autowired
	LoginDao loginDao;
	
	
	public void loginService() {
		
		log.info("wellcome in login service !!!");
		
	}

}
