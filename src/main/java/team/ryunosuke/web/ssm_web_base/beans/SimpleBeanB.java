package team.ryunosuke.web.ssm_web_base.beans;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

/*通过注解方式管理Bean，括号内为BeanID，可不写，则使用首字母小写类名作为BeanID*/
@Component("mySimpleBean")
public class SimpleBeanB {
	private final String BEAN_TYPE = "B";
	private String beanName = "defaultName";

	/*Spring可快速配置复杂类,若使用注解方式则需要在复杂类Set方法前加resource注解（如下）*/
	private SimpleBeanA bean;
	
	public SimpleBeanA getBean() {
		return bean;
	}

	@Resource
	public void setBean(SimpleBeanA bean) {
		this.bean = bean;
	}

	public String getType() {
		System.out.println("正在获取beanB的Type");
		return BEAN_TYPE;
	}
	
	public String getBeanName() {
		System.out.println("正在获取beanB的Name");
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
}
