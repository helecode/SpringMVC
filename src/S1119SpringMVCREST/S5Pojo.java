package S1119SpringMVCREST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pojo")
public class S5Pojo {
	
	@RequestMapping("/userPojo")
	public String userPojo(S3UserPojo user){
		System.out.println("sssssssss");
		System.out.println(user.toString());
		return "/0708REST/06PojoSuccess";
	}
}
