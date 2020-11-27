package S1123Exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ControllerAdvice
@RequestMapping("controlleradviceExceptionHandler")
public class S2ControlleradviceExceptionHandler {
	@ExceptionHandler(value={java.lang.ArithmeticException.class,})
	public ModelAndView ArithmeticExceptionHandler(Exception exception){
		System.out.println("全局算术异常捕捉："+exception);
		ModelAndView mv=new ModelAndView();
		mv.addObject("exception", exception);
		mv.setViewName("S1123exception/S2exceptionHandlerFail");
		return mv;
	}
	
}
