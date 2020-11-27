package S1123Exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
//@Component
public class S3HandlerExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object obj, Exception exception) {
		System.out.println("HandlerExceptionResolver“Ï≥£¥¶¿Ì");
		ModelAndView mv=new ModelAndView();
		mv.addObject("exception", exception);
		mv.setViewName("/S1123exception/S2exceptionHandlerFail");
		return mv;
	}

}
