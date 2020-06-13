package exam.rcos.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import exam.rcos.object.Depart;
import exam.rcos.object.Paper;
import exam.rcos.object.UserLogin;

@Repository
public interface UserDao {
	//测试类
	List<?> test();
	
	String userLogin(Map<?, ?> map);
	
	List<Depart> allDeparts();
	
	List<Paper> allPaper(Map<?,?> map);
}
