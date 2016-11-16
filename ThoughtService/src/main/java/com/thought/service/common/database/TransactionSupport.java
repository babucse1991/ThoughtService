package com.thought.service.common.database;

import com.thought.service.model.ModelTemplate;


/**
 * Implementation class of the {@code TransactionTemplate} interface - used by Spring {@code TransactionProxyFactoryBean} to create proxy class 
 * 
 */
public class TransactionSupport implements TransactionTemplate {
	
	
	/**
	 * Method to handle execution  of the transaction controlled database operations, using the appropriate implementation 
	 * class of the {@code PersistenceHandler}. The operations within this method are transaction controlled/enabled using 
	 * org.springframework.transaction.interceptor.TransactionProxyFactoryBean
	 * 
	 * @param persistanceHandler {@code PersistenceHandler}
	 * @param model {@code ModelTemplate}
	 * 
	 * @throws Exception
	 */
	public void save(PersistenceHandler persistanceHandler, ModelTemplate model) throws Exception {
		persistanceHandler.save(model);
	}
	
	

}
