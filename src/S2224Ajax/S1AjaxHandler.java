package S2224Ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ajax")
public class S1AjaxHandler {
	@ResponseBody
	@RequestMapping("/ajaxS")
	public boolean ajaxS(String uname){
		System.out.println("uname:"+uname);
		return true;
	}
}
