package exam.rcos.object;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Depart {
@JsonProperty("DEPART_ID")
private String DEPART_ID;
@JsonProperty("DEPART_NAME")
private String DEPART_NAME;
/**
 * @return the dEPART_ID
 */
public String getDEPART_ID() {
	return DEPART_ID;
}
/**
 * @param dEPART_ID the dEPART_ID to set
 */
public void setDEPART_ID(String dEPART_ID) {
	DEPART_ID = dEPART_ID;
}
/**
 * @return the dEPART_NAME
 */
public String getDEPART_NAME() {
	return DEPART_NAME;
}
/**
 * @param dEPART_NAME the dEPART_NAME to set
 */
public void setDEPART_NAME(String dEPART_NAME) {
	DEPART_NAME = dEPART_NAME;
}

}
