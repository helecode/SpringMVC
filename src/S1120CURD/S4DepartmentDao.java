package S1120CURD;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

/*
 * @Repositoryע�����ڽ����ݷ��ʲ� (DAO �� ) �����ʶΪ Spring Bean��
 * ����ֻ�轫��ע���ע�� DAO���ϼ��ɡ�
 *  * Spring 2.5 �� @Repository�Ļ����������˹������ƵĶ�������ע�⣺@Component��@Service��@Constroller��
 * ���Ƿֱ��������ϵͳ�Ĳ�ͬ��Σ�
@Component ��һ�������ĸ��������ʾһ����� (Bean),�����������κβ�Ρ�
      ����:����ͨpojoʵ������spring�����У�
      �൱�������ļ��е�<bean id="" class=""/>
@Service ͨ��������ҵ��㣬����Ŀǰ�ù����� @Component��ͬ��
@Constroller ͨ�������ڿ��Ʋ㣬����Ŀǰ�ù����� @Component��ͬ��
 */
@Repository
public class S4DepartmentDao {
	private static Map<Integer, S2Department> departments = null;
	static{
		departments = new HashMap <Integer, S2Department>();
		departments.put(101, new S2Department(101, "D-AA"));
		departments.put(102, new S2Department(102, "D-BB"));
		departments.put(103, new S2Department(103, "D-CC"));
		departments.put(104, new S2Department(104, "D-DD"));
		departments.put(105, new S2Department(105, "D-EE"));
	}
	//�õ����еĲ�����Ϣ
	public Collection<S2Department> getDepartments(){
		return departments.values();
	}
	//����Ų�ѯ������Ϣ
	public S2Department getDepartment(Integer id){
		return departments.get(id);
	}
	
	
}
