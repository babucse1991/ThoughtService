package com.thought.service.database;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.thought.service.common.database.PersistenceHandler;
import com.thought.service.controller.LoginUser;
import com.thought.service.model.HomeModel;
import com.thought.service.model.ModelTemplate;

@Service("homePersistenceHandler")
public class HomePersistenceHandler extends PersistenceHandler {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void save(ModelTemplate model) throws Exception {

		HomeModel hmodel = (HomeModel) model;
		LoginUser user = hmodel.getUseList().get(0);
		entityManager.persist(user);
		
		
		System.out.println("Came for save data..");
		
	}

}
