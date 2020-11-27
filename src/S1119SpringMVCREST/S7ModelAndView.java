package S1119SpringMVCREST;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("modelAndView")
@SessionAttributes(value={"name"},types={Date.class})
public class S7ModelAndView {
	@RequestMapping("/map")
	public String map(Map<String,Object> map){
		map.put("msg", "map");
		return "/S1119REST/S10ModelAndViewSuccess";
	}
	
	@RequestMapping("/model")
	public String model(Model model){
		model.addAttribute("msg", "model");
		return "/S1119REST/S10ModelAndViewSuccess";
	}
	
	@RequestMapping("/modelMap")
	public String modelMap(ModelMap modelMap){
		modelMap.addAttribute("msg", "modelMap");
		return "/S1119REST/S10ModelAndViewSuccess";
	}
	@RequestMapping("/MV")
	public ModelAndView MV(@ModelAttribute("user")S3UserPojo user,Map<String,Object> map){
		ModelAndView mv=new ModelAndView();
		user.setUname("eeee"); 
		mv.addObject("name", "nameValue");
		mv.setViewName("/S1119REST/S10ModelAndViewSuccess");
		Map<String,Object> mapA=new HashMap<String,Object>();
		mapA.put("mapa", "mapa");
		
		map.put("date", new Date());
		mv.addAllObjects(mapA);
		
		return mv;
	}
}
