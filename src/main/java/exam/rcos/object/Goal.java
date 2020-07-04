package exam.rcos.object;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Goal {
	@JsonProperty("FRESH_ID")
private String FRESH_ID;
	@JsonProperty("PAPER_ID")
private String PAPER_ID;
	@JsonProperty("OBJMARK")
private String OBJMARK;
	@JsonProperty("SUBMARK")
private String SUBMARK;
	/**
	 * @return the fRESH_ID
	 */
	public String getFRESH_ID() {
		return FRESH_ID;
	}
	/**
	 * @param fRESH_ID the fRESH_ID to set
	 */
	public void setFRESH_ID(String fRESH_ID) {
		FRESH_ID = fRESH_ID;
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
	 * @return the oBJMARK
	 */
	public String getOBJMARK() {
		return OBJMARK;
	}
	/**
	 * @param oBJMARK the oBJMARK to set
	 */
	public void setOBJMARK(String oBJMARK) {
		OBJMARK = oBJMARK;
	}
	/**
	 * @return the sUBMARK
	 */
	public String getSUBMARK() {
		return SUBMARK;
	}
	/**
	 * @param sUBMARK the sUBMARK to set
	 */
	public void setSUBMARK(String sUBMARK) {
		SUBMARK = sUBMARK;
	}
}
