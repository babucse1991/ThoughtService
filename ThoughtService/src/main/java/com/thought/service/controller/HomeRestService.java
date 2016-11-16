package com.thought.service.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thought.service.common.database.TransactionTemplate;
import com.thought.service.constants.LogLevel;
import com.thought.service.dao.HomeDAO;
import com.thought.service.database.HomePersistenceHandler;
import com.thought.service.log.CustomLogger;
import com.thought.service.model.HomeModel;

@RestController
public class HomeRestService {

	@Autowired
	private TransactionTemplate transactionTemplate;
	
	@Autowired
	CustomLogger customLogger;
	
	@Autowired
	HomeDAO homeDAO;
	
	@Autowired
	HomePersistenceHandler homePersistenceHandler;
	
	@RequestMapping(value={"/home"}, method=RequestMethod.GET, produces = "application/json")
	public Object getHomeDetails(HttpServletRequest request, HttpServletResponse  response) {
	
		customLogger.log(LogLevel.INFO, "HomeRestService", "getHomeDetails", "home has been initiated");
		
		return homeDAO.getHomeDetails();

	}
	
	@RequestMapping(value={"/home"}, method=RequestMethod.POST, produces = "application/json")
	public Object createHomeDetails(HttpServletRequest request, HttpServletResponse  response,  @RequestBody HomeModel model) throws Exception {
	
		transactionTemplate.save(homePersistenceHandler, model);
		
		return true;

	}
}
