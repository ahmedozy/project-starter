/**
 * 
 */
package sd.wahbi.dto;

/**
 * @author ahmedozy
 *
 */
public class CommonResponse {

	private Integer responseCode;
	private String responseMessage;
	private CommonDto responseBean;
	/**
	 * @return the responseCode
	 */
	public Integer getResponseCode() {
		return responseCode;
	}
	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	/**
	 * @return the responseMessage
	 */
	public String getResponseMessage() {
		return responseMessage;
	}
	/**
	 * @param responseMessage the responseMessage to set
	 */
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	/**
	 * @return the responseBean
	 */
	public CommonDto getResponseBean() {
		return responseBean;
	}
	/**
	 * @param responseBean the responseBean to set
	 */
	public void setResponseBean(CommonDto responseBean) {
		this.responseBean = responseBean;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommonResponse [" + (responseCode != null ? "responseCode=" + responseCode + ", " : "")
				+ (responseMessage != null ? "responseMessage=" + responseMessage + ", " : "")
				+ (responseBean != null ? "responseBean=" + responseBean : "") + "]";
	}
	
	
}
