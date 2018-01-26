import com.stone.ApplicationServer;
import com.stone.entity.Department;
import com.stone.entity.Employee;
import com.stone.entity.Product;
import com.stone.mapper.DeptMapper;
import com.stone.mapper.EmpMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationServer.class)
public class DTest {

	@Autowired
	EmpMapper empMapper;

	/*@Autowired
	DeptMapper deptMapper;
	@Test
	public void contextLoads() throws Exception {
		Department d1 = new Department();
		d1.setDeptName("yafa");
		deptMapper.save(d1);
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setEmpName("stone");
		e1.setDept(d1);
		e2.setEmpName("lucy");
		e2.setDept(d1);
		empMapper.save(e1);
		empMapper.save(e2);

	}*/


	@Test
	public void test1(){
		Employee emp = empMapper.selectOne(7L);
		System.out.println("emp: "+emp.getClass());

	}

	@Test
	public void test2(){
		List<Employee> employees = empMapper.selectAll();
		for (Employee employee : employees) {
			System.out.println("employee:"+employee);
		}
	}
}
