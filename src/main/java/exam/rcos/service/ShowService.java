package exam.rcos.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import exam.rcos.dao.UserDao;
import exam.rcos.object.Depart;
import exam.rcos.object.Paper;
import exam.rcos.object.UserLogin;
@Service
public class ShowService {
	@Autowired
	UserDao user_dao;
	
	public void test() {
		List<?> list=user_dao.test();
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
	
	//用户登陆验证密码
	public boolean userLogin(Map<String, String> map) {
		String password =user_dao.userLogin(map);
		return password.equals(map.get("password"));
	}
	
	//部门列表
	
	public List<Depart> allDeparts(){
		return user_dao.allDeparts();
	}
	
	//个人试卷列表
	
	public void allPaper(HttpSession session){
		System.out.println("____"+session.getAttribute("id"));
//		Map<String,String> map = new HashMap<String,String>();
//		map.put("id", session.getAttribute("id").toString());
//		return user_dao.allPaper(map);
	}
	
}
