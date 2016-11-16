package com.thought.service.common.database;

import com.thought.service.model.ModelTemplate;



public interface TransactionTemplate {
	
	/**
	 * Method to handle execution of the transaction controlled database operations
	 * 
	 * @param model {@code ModelTemplate}
	 * 
	 * @throws Exception
	 */
	public void save(PersistenceHandler persistanceHandler, ModelTemplate model) throws Exception;
		
}
