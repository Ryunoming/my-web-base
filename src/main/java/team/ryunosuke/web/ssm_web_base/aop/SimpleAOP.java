package team.ryunosuke.web.ssm_web_base.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SimpleAOP {
	
	@Before("execution(* team.ryunosuke.web.ssm_web_base.beans.*.*(..))")
	public void beforeClass(){
		System.out.println("Before bean class");
	}
	
	@After("execution(* team.ryunosuke.web.ssm_web_base.beans.*.*(..))")
	public void afterClass(){
		System.out.println("After bean class");
	}
}
