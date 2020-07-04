package exam.rcos.control;

import java.io.StreamCorruptedException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import exam.rcos.object.Anss;
import exam.rcos.object.Depart;
import exam.rcos.object.Paper;
import exam.rcos.object.PaperTitle;
import exam.rcos.object.UserLogin;
import exam.rcos.service.ShowService;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class ShowControl {
	@Autowired
	ShowService showService;
	 
	//登录
	@RequestMapping(value="login")
	@ResponseBody
	public String loginUser(@RequestBody Map<String, String> map,HttpSession session) {
		if(showService.userLogin(map)) {
			session.setAttribute("userid", map.get("id"));;
			return "登录成功";
		}else {
			return "error";
		}
	}
	
	//部门列表
	@RequestMapping(value="depart")
	@ResponseBody
	public List<Depart> allDeparts(){
		return showService.allDeparts();
	}
	
	//试卷列表==>针对每个用户都不同
	@RequestMapping(value="paper")
	@ResponseBody
	public List<Paper> allPaper(HttpSession session){
		return showService.allPaper(session);
	}
	
	//试卷信息==>根据试卷id获取
		@RequestMapping(value="paperinfo")
		@ResponseBody
	 public List paperInfo(@RequestBody Map<String, String> map,HttpSession session){	
		    return showService.paperInfo(map,session);
	}
		//试卷标题==>根据试卷id获取
		@RequestMapping(value="papertitle")
		@ResponseBody
		public PaperTitle paperTitle(@RequestBody Map<String, String> map,HttpSession session) {
			return showService.paperTitle(map,session);
		}
		
		//提交试题
		@RequestMapping(value="subans")
		@ResponseBody
		public String subAns(@RequestBody Anss ans,HttpSession session) {
			return showService.handleAns(ans,session);
		}
}
