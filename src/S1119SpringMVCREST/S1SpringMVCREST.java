package S1119SpringMVCREST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("REST")
public class S1SpringMVCREST {
	@RequestMapping(value="/rest/{id}",method=RequestMethod.GET)
	public String get(){
		System.out.println("getget");
		return "S1119REST/S2RESTSUCCESS";
	}
	@RequestMapping(value="/rest",method=RequestMethod.POST)
	public String post(){
		System.out.println("postpostpost:");
		return "S1119REST/S2RESTSUCCESS";
	}
	@RequestMapping(value="/rest/{id}",method=RequestMethod.PUT)
	public String put(){
		System.out.println("putputput");
		return "S1119REST/S2RESTSUCCESS";
	}
	@RequestMapping(value="/rest/{id}",method=RequestMethod.DELETE)
	public String delete(){
		System.out.println("deletedelete");
		return "S1119REST/S2RESTSUCCESS";
	}
}
