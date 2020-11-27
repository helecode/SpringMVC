package S1123Exception;

import java.io.File;
import java.io.FileNotFoundException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



import S1120CURD.S1Employee;

@Controller
@RequestMapping("/exception")
public class S1ExceptionHandler {

	@RequestMapping("/exceptioHandler")
	public String exceptionHandler(){
	//	int i=Integer.parseInt("XXX");
	//	int a1=12/0;//ArithmeticException
		int a[]=new int[5];
		S1Employee employee=null;
		employee.setId(3);//NullPointerException
		System.out.println("exceptionHandlerexceptionHandler");
		System.out.println("exceptionHandlerexceptionHandler:"+a[10]);//ArrayIndexOutOfBoundsException
		
		System.out.println("exceptionHandlerexceptionHandler:"+(12/0) );
		return "/0711exception/exceptionHandlerSuccess";
	}
	//处理指定异常类
	@ExceptionHandler(value={java.lang.NumberFormatException.class} )
	public ModelAndView arrayIndexOutOfBoundsException(Exception exception){
		System.out.println("局部异常捕捉："+exception);
		ModelAndView mv=new ModelAndView();
		mv.addObject("exception",exception);
		mv.setViewName("/S1123exception/S2exceptionHandlerFail");
		
		return mv;
	}
//	//处理所有异常
//	@ExceptionHandler
//	public ModelAndView exceptionHandler(Exception exception){
//		System.out.println("arrayIndexOutOfBoundsException");
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("exception",exception);
//		mv.setViewName("/0711exception/02exceptionHandlerFail");
//		return mv;
//	}
	
}
