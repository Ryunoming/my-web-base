package team.ryunosuke.web.ssm_web_base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import team.ryunosuke.web.ssm_web_base.pojo.SimplePojo;

@Controller
public class SimpleController {

	@RequestMapping("/demo")
	public String controllerDemo(String name)
	{
		System.out.println(name + "控制器已成功生效");
		return "demo.jsp?name="+name;
	}
	
	/*模型驱动-控制器方法*/
	@RequestMapping("/demo2")
	public String controllerDemo2(SimplePojo s)
	{
		System.out.println(s.getName() + "控制器已成功生效");
		return "demo.jsp?name="+s.getName();
	}
	
	/*ServletAPI-控制器方法*/
	@RequestMapping("/demo3")
	public String controllerDemo3(HttpServletRequest request,HttpServletResponse response,HttpSession session)
	{
		System.out.println(request.getParameter("name") + "控制器已成功生效");
		return "demo.jsp?name="+request.getParameter("name");
	}

}
