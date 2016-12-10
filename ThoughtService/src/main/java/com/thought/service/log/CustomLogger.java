package com.thought.service.log;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.thought.service.constants.LogLevel;


@Component
public class CustomLogger {

	static final Logger logger = Logger.getLogger(CustomLogger.class);
	private static final StringBuffer LOG_MSG_APENDER = new StringBuffer(" :: ");

	
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
	
	
	private String getCustomizedLogMsg(String className, String methodName, String logMsg) {
		
		StringBuffer logMsgBuffer = new StringBuffer();
		
		logMsgBuffer.append(className).append(LOG_MSG_APENDER)
		.append(methodName).append(LOG_MSG_APENDER)
		.append(logMsg);
		
		return logMsgBuffer.toString();
	}
}
