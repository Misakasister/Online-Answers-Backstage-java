package exam.rcos.object;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

public class ObjectGoal {
private String QUES_ID;
private String ANS;
private String QUES_MAX;
/**
 * @return the qUES_ID
 */
public String getQUES_ID() {
	return QUES_ID;
}
/**
 * @param qUES_ID the qUES_ID to set
 */
public void setQUES_ID(String qUES_ID) {
	QUES_ID = qUES_ID;
}
/**
 * @return the aNS
 */
public String getANS() {
	return ANS;
}
/**
 * @param aNS the aNS to set
 */
public void setANS(String aNS) {
	ANS = aNS;
}
/**
 * @return the qUES_MAX
 */
public String getQUES_MAX() {
	return QUES_MAX;
}
/**
 * @param qUES_MAX the qUES_MAX to set
 */
public void setQUES_MAX(String qUES_MAX) {
	QUES_MAX = qUES_MAX;
}

}
