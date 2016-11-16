package com.thought.service.common.database;

import com.thought.service.model.ModelTemplate;


/**
 * Top level persistence handling support {@code abstract} class. The implementing classes can add the request 
 * specfic persistence tasks by overriding the available methods appropriately.
 *
 */
public abstract class PersistenceHandler {
	
	/**
	 * Method to implement the actual transaction controlled database operations
	 * @param model {@code ModelTemplate}
	 * 
	 * @throws Exception
	 */
	public abstract void save(ModelTemplate model) throws Exception;
	
	
}
