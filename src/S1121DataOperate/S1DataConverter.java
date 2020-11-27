package S1121DataOperate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import S1120CURD.S1Employee;
import S1120CURD.S4DepartmentDao;
public class S1DataConverter implements Converter<String,S1Employee>{
	@Autowired
	public S4DepartmentDao departmentDao;
	@Override
	public S1Employee convert(String emp) {
		System.out.println("进入类型转化器");
		String[] emps=emp.split("-");
		S1Employee employee=new S1Employee();
		employee.setLastName(emps[0]);
		employee.setEmail(emps[1]);
		employee.setGender(Integer.parseInt(emps[2]));
		employee.setDepartment(departmentDao.getDepartment(Integer.parseInt(emps[3])));
		return employee;
	}

}
