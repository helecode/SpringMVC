package S1120CURD;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/*
 * @Repositoryע�����ڽ����ݷ��ʲ� (DAO �� ) �����ʶΪ Spring Bean��
 * ����ֻ�轫��ע���ע�� DAO���ϼ��ɡ�
 * @Autowired��ʾ�����ε�����Ҫע�����,spring��ɨ�����б�@Autowired��ע����,
Ȼ����� ���� ��ioc�������ҵ�ƥ�����ע�롣
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
	//����Ա����Ϣ
	public void save(S1Employee employee){
		if(employee.getId() == null){
			employee.setId(initId++);
		}
		employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
		employees.put(employee.getId(), employee);
	}
	//��ѯ���е�Ա��
	public Collection<S1Employee> getAll(){
		return employees.values();
	}
	//���ݱ�Ų�ѯԱ����Ϣ
	public S1Employee get(Integer id){
		return employees.get(id);
	}
	//���ݱ��ɾ��Ա����Ϣ
	public void delete(Integer id){
		employees.remove(id);
	}
}
