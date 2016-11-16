package com.thought.service.log;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.thought.service.constants.LogLevel;


@Component
public class CustomLogger {

	static final Logger logger = Logger.getLogger(CustomLogger.class);
	private static final StringBuffer LOG_MSG_APENDER = new StringBuffer(" :: ");

	/**
	 * Used to log the message without user details
	 * 
	 * @param logLevel {@code Enum LogLevel}
	 * @param className The name of the java class for which the message is being logged 
	 * @param methodName The name of the method for which the message is being logged
	 * @param logMsg The logging message
	 */
	public void logMsgWithoutUserDetails(LogLevel logLevel, String className, String methodName, String logMsg) {
		
		StringBuffer logMsgBuffer = new StringBuffer();
		logMsgBuffer.append(className).append(LOG_MSG_APENDER)
		.append(methodName).append(LOG_MSG_APENDER)
		.append(logMsg);
		
		logMsg = logMsgBuffer.toString();
		
		switch (logLevel) {
		  case TRACE:
			 logger.trace(logMsg);
			 break;
	      case DEBUG:
	    	  logger.debug(logMsg);
	    	  break;
	      case INFO:
	    	  logger.info(logMsg);
	    	  break;
	      case WARN:
	    	  logger.warn(logMsg);
	      case ERROR:
	    	  logger.error(logMsg);
	    	  break;
	      case FATAL:
	    	  logger.fatal(logMsg);
	      default:
	    	  logger.error(logMsg);
	    	  break;
	    }
	}
	
	/**
	 * The custom method to perform the actual logging, using the underlying logging library
	 * 
	 * @param logLevel {@code Enum LogLevel}
	 * @param className The name of the java class for which the message is being logged 
	 * @param methodName The name of the method for which the message is being logged
	 * @param logMsg The logging message
	 * 
	 */
	public void log(LogLevel logLevel, String className, String methodName, String logMsg) {
		
		switch (logLevel) {
		
		  case TRACE:
			 logger.trace(getCustomizedLogMsg(className, methodName, logMsg));
			 break;
	      case DEBUG:
	    	  logger.debug(getCustomizedLogMsg(className, methodName, logMsg));
	    	  break;
	      case INFO:
	    	  logger.info(getCustomizedLogMsg(className, methodName, logMsg));
	    	  break;
	      case WARN:
	    	  logger.warn(getCustomizedLogMsg(className, methodName, logMsg));
	      case ERROR:
	    	  logger.error(getCustomizedLogMsg(className, methodName, logMsg));
	    	  break;
	      case FATAL:
	    	  logger.fatal(getCustomizedLogMsg(className, methodName, logMsg));
	      default:
	    	  logger.error(getCustomizedLogMsg(className, methodName, logMsg));
	    	  break;
	    }
		
	}
	
	/**
	 * The method to build the logging message in a customized format <br>
	 * (<b>Format</b> - commitID :: UniqueTransactionID :: className :: methodName :: logMessage)
	 * 
	 * @param logLevel {@code Enum LogLevel}
	 * @param className The name of the java class for which the message is being logged 
	 * @param methodName The name of the method for which the message is being logged
	 * @param logMsg The logging message
	 * 
	 * @return void
	 */
	private String getCustomizedLogMsg(String className, String methodName, String logMsg) {
		
		StringBuffer logMsgBuffer = new StringBuffer();
		
		logMsgBuffer.append(className).append(LOG_MSG_APENDER)
		.append(methodName).append(LOG_MSG_APENDER)
		.append(logMsg);
		
		return logMsgBuffer.toString();
	}
}
