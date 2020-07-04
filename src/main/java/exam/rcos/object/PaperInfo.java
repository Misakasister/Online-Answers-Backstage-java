package exam.rcos.object;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class PaperInfo {
	@JsonProperty("QUES_ID")
	private String QUES_ID;
	@JsonProperty("PAPER_ID")
	private String PAPER_ID;
	@JsonProperty("QUES_TYPE")
	private String QUES_TYPE;
	@JsonProperty("QUES_MAX")
	private String QUES_MAX;
	@JsonProperty("QUES_CONTENT")
	private String QUES_CONTENT;
	@JsonProperty("A")
	private String A;
	@JsonProperty("B")
	private String B;
	@JsonProperty("C")
	private String C;
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
	 * @return the pAPER_ID
	 */
	public String getPAPER_ID() {
		return PAPER_ID;
	}
	/**
	 * @param pAPER_ID the pAPER_ID to set
	 */
	public void setPAPER_ID(String pAPER_ID) {
		PAPER_ID = pAPER_ID;
	}
	/**
	 * @return the qUES_TYPE
	 */
	public String getQUES_TYPE() {
		return QUES_TYPE;
	}
	/**
	 * @param qUES_TYPE the qUES_TYPE to set
	 */
	public void setQUES_TYPE(String qUES_TYPE) {
		QUES_TYPE = qUES_TYPE;
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
	/**
	 * @return the qUES_CONTENT
	 */
	public String getQUES_CONTENT() {
		return QUES_CONTENT;
	}
	/**
	 * @param qUES_CONTENT the qUES_CONTENT to set
	 */
	public void setQUES_CONTENT(String qUES_CONTENT) {
		QUES_CONTENT = qUES_CONTENT;
	}
	/**
	 * @return the a
	 */
	public String getA() {
		return A;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(String a) {
		A = a;
	}
	/**
	 * @return the b
	 */
	public String getB() {
		return B;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(String b) {
		B = b;
	}
	/**
	 * @return the c
	 */
	public String getC() {
		return C;
	}
	/**
	 * @param c the c to set
	 */
	public void setC(String c) {
		C = c;
	}
	/**
	 * @return the d
	 */
	public String getD() {
		return D;
	}
	/**
	 * @param d the d to set
	 */
	public void setD(String d) {
		D = d;
	}
	/**
	 * @return the iMAGE
	 */
	public String getIMAGE() {
		return IMAGE;
	}
	/**
	 * @param iMAGE the iMAGE to set
	 */
	public void setIMAGE(String iMAGE) {
		IMAGE = iMAGE;
	}
	@JsonProperty("D")
	private String D;
	@JsonProperty("IMAGE")
	private String IMAGE;
}
