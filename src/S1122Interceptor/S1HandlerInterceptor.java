package S1122Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class S1HandlerInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception e)
			throws Exception {
		System.out.println("HandlerInterceptorÀ¹½ØÆ÷Ö´ÐÐÍê±Ï:"+handler);	
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView MV) throws Exception {
		System.out.println("HandlerInterceptorÀ¹½ØÆ÷Ö´ÐÐ:"+handler);
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
			System.out.println("HandlerInterceptorÀ¹½ØÆ÷×¼±¸:"+handler);
		return true;
	}

}
