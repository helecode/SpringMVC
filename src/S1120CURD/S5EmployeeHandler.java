package S1120CURD;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class S5EmployeeHandler {
	@Autowired
	public S4DepartmentDao departmentDao;
	@Autowired
	public S3EmployeeDao employeeDao;
	@RequestMapping("/displayEmployee")
	public String displayEmployee(HttpServletRequest request,Map<String,Object> map){
		System.out.println("displayEmployee进入控制类");
		map.put("employeeList", employeeDao.getAll());
		return "/S1120CURD/S2displayEmployeeSuccess";
	}
	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam("id")Integer id,HttpServletRequest request,Map<String,Object> map){
		System.out.println("displayEmployee进入控制类");
		employeeDao.delete(id);
		map.put("employeeList", employeeDao.getAll());
		return "redirect:/employee/displayEmployee";
	}
	@RequestMapping("/selectEmployee")
	public String selectEmployee(@RequestParam("id")Integer id,HttpServletRequest request,Map<String,Object> map){
		System.out.println("selectEmployee进入控制类");
		map.put("employee", employeeDao.get(id));
		map.put("employeeList", employeeDao.getAll());
		return "/S1120CURD/S2displayEmployeeSuccess";
	}
	@RequestMapping("/updateEmployee")
	public String updateEmployee(S1Employee employee,HttpServletRequest request,Map<String,Object> map){
		System.out.println("updateEmployee进入控制类："+employee);
		employeeDao.save(employee);
		map.put("employeeList", employeeDao.getAll());
		return "forward:/S1120CURD/S2displayEmployeeSuccess.jsp";
	}
	
}
