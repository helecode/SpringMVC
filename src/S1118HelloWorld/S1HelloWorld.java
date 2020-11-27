package S1118HelloWorld;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/he")

public class S1HelloWorld {

	@RequestMapping(value="/helloWorld",method=RequestMethod.GET,headers="Accept-Language" )
	public String helloWorld(){
		System.out.println("helloWorldhelloWorld");
		return "S1118HelloWorld/S2HelloWorldSuccess";
	}
	@RequestMapping(value="/params",method=RequestMethod.GET,params={"name","age=10"},headers="Accept-Language" )
	public String params(){
		System.out.println("paramsparamsparams");
		return "S1118HelloWorld/S2HelloWorldSuccess";
	}
	@RequestMapping(value="/a*/url")
	public String url(){
		System.out.println("urlurlurl");
		return "S1118HelloWorld/S2HelloWorldSuccess";
	}
	@RequestMapping(value="pathVariable/{name},{age}")
	public String pathVariable(@PathVariable("name") String name,@PathVariable("age") int age){
		System.out.println("pathVariable:"+name+"---"+age);
		return "S1118HelloWorld/S2HelloWorldSuccess";
	}
	@RequestMapping("commonPublic")
	public String commonPublic(@RequestParam("name")String name,@RequestParam("age")int age){
		System.out.println("pathVariable:"+name+"---"+age);
		return "S1118HelloWorld/S2HelloWorldSuccess";
	}
}
