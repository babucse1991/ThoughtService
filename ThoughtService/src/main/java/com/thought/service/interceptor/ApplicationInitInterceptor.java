package com.thought.service.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.thought.service.constants.LogLevel;
import com.thought.service.log.CustomLogger;



/**
 * Intercepter class implementing Spring's {@code HandlerInterceptor} to validate the request and to set the 
 * initialization objects/attributes in session scope.
 * 
 */
public class ApplicationInitInterceptor implements HandlerInterceptor {

	

	@Autowired
	CustomLogger customLogger;

	/**
	 * This method is to set the application and user information in the session scope and to check if the HTTP request is valid
	 * 
	 * @param request	{@code HttpServletRequest}
	 * @param response	{@code HttpServletResponse}
	 * @param handler The handler that handles the HTTP request 
	 * 
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		try {
			if (request != null) {
				return true;
			} else {
				throw new Exception("Invalid http request.. HttpServletRequest object not available");			
			}
		} catch (Exception exception) {
			customLogger.log(LogLevel.ERROR, "ApplicationInitInterceptor", "preHandle", exception.getMessage());
			return false;
		}
	}
	

	/**
	 * Unimplemented method.
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {}

	/**
	 * Unimplemented method.
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)	throws Exception {}

}
