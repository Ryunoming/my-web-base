package team.ryunosuke.web.ssm_web_base.beans;

public class SimpleBeanA {
	private final String BEAN_TYPE = "A";
	private String beanName;

	public String getType() {
		System.out.println("正在获取beanA的Type");
		return BEAN_TYPE;
	}
	
	public String getBeanName() {
		System.out.println("正在获取beanA的Name");
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
}
