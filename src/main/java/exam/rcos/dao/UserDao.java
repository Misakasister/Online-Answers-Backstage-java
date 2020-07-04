package exam.rcos.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import exam.rcos.object.Depart;
import exam.rcos.object.Goal;
import exam.rcos.object.Paper;
import exam.rcos.object.*;

@Repository
public interface UserDao {
	//测试类
	List<?> test();
	
	String userLogin(Map<?, ?> map);
	
	List<Depart> allDeparts();
	
	List<Paper> allPaper(Map<?,?> map);
	
	List<Goal> isAnswer(Map<?, ?> map);

	List<PaperInfo> getPaperInfo(Map<?, ?> map);
	
	PaperTitle paperTitle(Map<?, ?> map);
	
	void finishPaper(Map<?, ?> map);
	
	void insertAns(@Param("userId")String userId,@Param("quesId")String quesId,@Param("userAns")String userAns);

	List<ObjectGoal> objectGoal(Map<?, ?> map);
	
	void updateObjectQuesGoal(Map<?, ?> map);

	void updateGoal(Map<?, ?> map);
}
