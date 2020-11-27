package S1119SpringMVCREST;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/servlet")
public class S6Servlet {
	@RequestMapping("servletAPI")
	public String servletAPI(S3UserPojo user,HttpServletRequest request,HttpServletResponse response,HttpSession session){
		
		System.out.println("user:"+user);
		System.out.println("request:"+request);
		System.out.println("response:"+response);
		System.out.println("session:"+session);
		user.setUname("uname");
		session.setAttribute("uname", user.getUname());
		request.setAttribute("userr", user);
		return "/S1119REST/S8ServletSuccess";
	}
}
