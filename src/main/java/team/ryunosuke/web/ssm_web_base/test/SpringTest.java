package team.ryunosuke.web.ssm_web_base.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import team.ryunosuke.web.ssm_web_base.beans.SimpleBeanA;
import team.ryunosuke.web.ssm_web_base.beans.SimpleBeanB;

public class SpringTest {
	/*该类演示了Spring最基本的Bean管理功能及AOP特性*/
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//原生调用
		SimpleBeanA a = (SimpleBeanA) context.getBean("bean_a");
		System.out.println(a.getType()+":"+a.getBeanName());
		
		//AOP调用
		SimpleBeanB b = (SimpleBeanB) context.getBean("mySimpleBean");
		System.out.println(b.getType()+":"+b.getBeanName());
	}

}
