package S1119SpringMVCREST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class S2Annotation{
	@RequestMapping("/annotation")
	public String annotation(String name,Integer age,
			@RequestHeader(value="Connection")String Connection,@CookieValue("JSESSIONID")String JSESSIONID){
		System.out.println("name1:"+name+"--"+"age:"+age+"--Connection:"+Connection+"--JSESSIONID:"+JSESSIONID);
		return "/S1119REST/S4annotationSuccess";
		
	}
	
}
