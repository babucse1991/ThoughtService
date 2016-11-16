package com.thought.service.database;

import org.springframework.stereotype.Service;

import com.thought.service.common.database.PersistenceHandler;
import com.thought.service.model.ModelTemplate;

@Service("homePersistenceHandler")
public class HomePersistenceHandler extends PersistenceHandler {

	@Override
	public void save(ModelTemplate model) throws Exception {

		System.out.println("Came for save data..");
		
	}

}
