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
import exam.rcos.object.Goal;
import exam.rcos.object.Paper;
import exam.rcos.object.*;
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
	
	public List<Paper> allPaper(HttpSession session){
		if(session.getAttribute("userid")==null){
			return null;
		}
		Map<String,String> map = new HashMap<String,String>();
		map.put("id", session.getAttribute("userid").toString());
		return user_dao.allPaper(map);
	}
	
	//试卷信息
	
	public List paperInfo(Map<String, String> map, HttpSession session){
		if(session.getAttribute("userid")==null){
			return null;
		}
		//先判断是否做过该试卷了
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("id", session.getAttribute("userid").toString());
		map2.put("paper_id", map.get("paper_Id"));
		System.out.println(map2.get("paper_id"));
		List<Goal> list = user_dao.isAnswer(map2);
		if(list.size()!=0) {
			System.out.println(map2.get("id")+"已经做过该试卷了，试卷id"+map2.get("paper_id"));
			return null;
		}
		//请求试题详细信息
		List<PaperInfo> info = user_dao.getPaperInfo(map2); 
		return info;
	}
	
	
	//试卷头部信息
	
	public PaperTitle paperTitle(Map<String, String> map, HttpSession session) {
		if(session.getAttribute("userid")==null){
			return null;
		}
		return user_dao.paperTitle(map);
	}
	
	//处理提交的答案
	public String handleAns(Anss ans,HttpSession session) {
		if(session.getAttribute("userid")==null){
			return "error";
		}
		String userId=session.getAttribute("userid").toString();
		String paperId=ans.getPaperId();
		//将考生回答试卷了插入表
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("userId", userId);
		map1.put("paperId", paperId);
//		user_dao.finishPaper(map1);
		//将回答内容插入回答表
		for(int i = 0; i < ans.getAnswer().getObject().size();i++) {
			String answer = ans.getAnswer().getObject().get(i).getAns().toString();
			String quesId = ans.getAnswer().getObject().get(i).getTitleId().toString();
			Map<String, String> map2 = new HashMap<String, String>();
			map2.put("userId", userId);
			map2.put("quesId", quesId);
//			map2.put("userAns", answer);
			user_dao.insertAns(userId,quesId,answer);
		}
		for(int i = 0; i < ans.getAnswer().getSubject().size();i++) {
			String answer = ans.getAnswer().getSubject().get(i).getAns().toString();
			String quesId = ans.getAnswer().getSubject().get(i).getTitleId().toString();
			Map<String, String> map2 = new HashMap<String, String>();
			map2.put("userId", userId);
			map2.put("quesId", quesId);
			user_dao.insertAns(userId,quesId,answer);
		}
		
		//判断客观题得分
		int total=0;
		List<ObjectGoal> objectGoal = user_dao.objectGoal(map1);
		for(int i = 0; i < ans.getAnswer().getObject().size();i++) {
			for(int j = 0; j < objectGoal.size();j++) {		
				if(objectGoal.get(j).getQUES_ID().toString().equals(ans.getAnswer().getObject().get(i).getTitleId().toString())) {
					if(objectGoal.get(j).getANS().toString().equals(ans.getAnswer().getObject().get(i).getAns().toString())) {
						String ansMark = objectGoal.get(j).getQUES_MAX().toString();
						String quesId=objectGoal.get(j).getQUES_ID().toString();
						Map<String, String> map3 = new HashMap<String, String>();
						map3.put("goal", ansMark);
						map3.put("quesId", quesId);
						map3.put("userId", userId);
						user_dao.updateObjectQuesGoal(map3);
						total+=Integer.valueOf(ansMark);
					}else {
						String quesId=objectGoal.get(j).getQUES_ID().toString();
						Map<String, String> map3 = new HashMap<String, String>();
						map3.put("goal", "0");
						map3.put("quesId", quesId);
						map3.put("userId", userId);
						user_dao.updateObjectQuesGoal(map3);
					}
				}
				break;
			}
		}
		
		// 插入客观题总成绩给Goal表
		Map<String, String> map4 = new HashMap<String, String>();
		map4.put("total", String.valueOf(total));
		map4.put("paperId", paperId);
		map4.put("userId", userId);
		user_dao.updateGoal(map4);
		return "提交成功";
		
	}
}
