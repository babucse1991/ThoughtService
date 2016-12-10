package com.thought.service.common.database;

import com.thought.service.model.ModelTemplate;


public abstract class PersistenceHandler {
	
	/**
	 * Method to implement the actual transaction controlled database operations
	 * @param model {@code ModelTemplate}
	 * 
	 * @throws Exception
	 */
	public abstract void save(ModelTemplate model) throws Exception;
	
	
}
