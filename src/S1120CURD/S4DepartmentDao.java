package S1120CURD;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

/*
 * @Repository注解用于将数据访问层 (DAO 层 ) 的类标识为 Spring Bean。
 * 具体只需将该注解标注在 DAO类上即可。
 *  * Spring 2.5 在 @Repository的基础上增加了功能类似的额外三个注解：@Component、@Service、@Constroller，
 * 它们分别用于软件系统的不同层次：
@Component 是一个泛化的概念，仅仅表示一个组件 (Bean),可以作用在任何层次。
      作用:把普通pojo实例化到spring容器中，
      相当于配置文件中的<bean id="" class=""/>
@Service 通常作用在业务层，但是目前该功能与 @Component相同。
@Constroller 通常作用在控制层，但是目前该功能与 @Component相同。
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
	//得到所有的部门信息
	public Collection<S2Department> getDepartments(){
		return departments.values();
	}
	//按编号查询部门信息
	public S2Department getDepartment(Integer id){
		return departments.get(id);
	}
	
	
}
