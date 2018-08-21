package team.ryunosuke.web.ssm_web_base.beans;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("服务器已调用用户验证");
		request.setCharacterEncoding("UTF-8");
		String url = request.getServletPath();
		System.out.println("post URL：" + url);
		if (!url.equals("")) {
			// 判斷是否已登录
			String loginend = (String) request.getSession().getAttribute(
					"loginend");
			if (loginend == null) {
				// 無session則是未登录狀態
				System.out.println(">>>未登录，請重新登录<<<");
				response.sendRedirect("./login.jsp");
				return false;
			}
		}
		return true;
	}

}
