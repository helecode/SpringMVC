package S1120CURD;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/*
 * @Repository注解用于将数据访问层 (DAO 层 ) 的类标识为 Spring Bean。
 * 具体只需将该注解标注在 DAO类上即可。
 * @Autowired表示被修饰的类需要注入对象,spring会扫描所有被@Autowired标注的类,
然后根据 类型 在ioc容器中找到匹配的类注入。
 */
@Repository
public class S3EmployeeDao {
	private static Map<Integer, S1Employee> employees = null;
	@Autowired
	private S4DepartmentDao departmentDao;
	private static Integer initId = 1006;
	static{
		employees = new HashMap<Integer, S1Employee>();
		employees.put(1001, new S1Employee(1001, "E-AA", "aa@163.com", 1, new S2Department(101, "D-AA")));
		employees.put(1002, new S1Employee(1002, "E-BB", "bb@163.com", 1, new S2Department(102, "D-BB")));
		employees.put(1003, new S1Employee(1003, "E-CC", "cc@163.com", 0, new S2Department(103, "D-CC")));
		employees.put(1004, new S1Employee(1004, "E-DD", "dd@163.com", 0, new S2Department(104, "D-DD")));
		employees.put(1005, new S1Employee(1005, "E-EE", "ee@163.com", 1, new S2Department(105, "D-EE")));
	}
	//保存员工信息
	public void save(S1Employee employee){
		if(employee.getId() == null){
			employee.setId(initId++);
		}
		employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
		employees.put(employee.getId(), employee);
	}
	//查询所有的员工
	public Collection<S1Employee> getAll(){
		return employees.values();
	}
	//根据编号查询员工信息
	public S1Employee get(Integer id){
		return employees.get(id);
	}
	//根据编号删除员工信息
	public void delete(Integer id){
		employees.remove(id);
	}
}
