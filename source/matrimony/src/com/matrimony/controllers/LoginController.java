package com.matrimony.controllers;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.matrimony.controllers.helpers.LoginControllerHelper.LoginDetails;
import com.matrimony.exceptions.ResultNotFoundException;
import com.matrimony.hibernate.Hibernate;
import com.matrimony.model.UserCredentialsModel;

@RestController
public class LoginController {

	private Logger logger = LogManager.getLogger(LoginController.class);

	/**
	 * Validate using Login Details
	 * 
	 * @param loginDetails
	 * @return
	 */

	public ResponseEntity<Boolean> validate(@RequestParam LoginDetails loginDetails) {
		logger.info("LoginController.validate called.");

		if (loginDetails == null || loginDetails.emailId == null || loginDetails.emailId.isEmpty()
				|| loginDetails.password == null || loginDetails.password.isEmpty()) {
			logger.debug("invalid login details.");
			return new ResponseEntity<>(false, HttpStatus.UNAUTHORIZED);
		}

		Session session = null;
		String actualPwd = null;
		try {
			session = Hibernate.sessionFactory.getCurrentSession();
			actualPwd = new UserCredentialsModel().getPasswordUsingEmailId(session, loginDetails.emailId);

			// If password matches
			if (loginDetails.password.equals(actualPwd)) {
				logger.debug("login details are valid. login successful.");
				return new ResponseEntity<>(true, HttpStatus.OK);
			}

			logger.debug("email id or password is not correct.");
			return new ResponseEntity<>(false, HttpStatus.UNAUTHORIZED);

		} catch (ResultNotFoundException ex) {

			logger.debug("No such email id exists!");
			return new ResponseEntity<>(false, HttpStatus.UNAUTHORIZED);
		} finally {

			if (session != null) {
				session.close();
			}
		}

	}
	
	
}
