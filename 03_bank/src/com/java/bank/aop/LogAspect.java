package com.java.bank.aop;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {
	public static Logger logger 
	= Logger.getLogger(LogAspect.class.getName());
	
	public static final String logMsg = "LogMsg>>>>";
	public Object advice(ProceedingJoinPoint pjp) {
		Object obj = null;
		
		try {
			logger.info(logMsg+pjp.getTarget().getClass().getName()+"\t\t"+pjp.getSignature().getName());
			//Dao�� ������� ���ϵ� ������ jointPoint������ ������ �ִ�.
			//Object�� ������� �����⿡
			obj=pjp.proceed();
		} catch (Throwable e) {
			// TODO: handle exception
		}
		
		return obj;
	}
	
}
