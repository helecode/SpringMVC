package S1122Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class S2HandlerInterceptorAdapt extends HandlerInterceptorAdapter{

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("HandlerInterceptorAdapter请求完全处理后被调用："+handler);
		super.afterCompletion(request, response, handler, ex);
	}


	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("HandlerInterceptorAdapter请求处理后返回结果前被调用："+handler);
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("HandlerInterceptorAdapter请求处理前被调用："+handler);
		return true;
	}
	
}
