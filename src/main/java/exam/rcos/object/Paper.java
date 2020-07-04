package exam.rcos.object;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Paper {
	//DEPART_NAME,paper_info.PAPER_ID,PAPER_NAME,START_TIME,END_TIME,SET_TIME
	@JsonProperty("PAPER_ID")
	private String PAPER_ID;
	@JsonProperty("PAPER_NAME")
	private String PAPER_NAME;
	@JsonProperty("START_TIME")
	private String START_TIME;
	@JsonProperty("END_TIME")
	private String END_TIME;
	@JsonProperty("SET_TIME")
	private String SET_TIME;
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
	 * @return the pAPER_NANE
	 */
	public String getPAPER_NAME() {
		return PAPER_NAME;
	}
	/**
	 * @param pAPER_NANE the pAPER_NANE to set
	 */
	public void setPAPER_NAME(String pAPER_NAME) {
		PAPER_NAME = pAPER_NAME;
	}
	/**
	 * @return the sTART_TIME
	 */
	public String getSTART_TIME() {
		return START_TIME;
	}
	/**
	 * @param sTART_TIME the sTART_TIME to set
	 */
	public void setSTART_TIME(String sTART_TIME) {
		START_TIME = sTART_TIME;
	}
	/**
	 * @return the eND_TIME
	 */
	public String getEND_TIME() {
		return END_TIME;
	}
	/**
	 * @param eND_TIME the eND_TIME to set
	 */
	public void setEND_TIME(String eND_TIME) {
		END_TIME = eND_TIME;
	}
	/**
	 * @return the sET_TIME
	 */
	public String getSET_TIME() {
		return SET_TIME;
	}
	/**
	 * @param sET_TIME the sET_TIME to set
	 */
	public void setSET_TIME(String sET_TIME) {
		SET_TIME = sET_TIME;
	}
	
}
