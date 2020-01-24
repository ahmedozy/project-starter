/**
 * 
 */
package sd.wahbi.dto;

/**
 * @author ahmedozy
 *
 */
public class CommonRequest {

	private CommonDto dto;

	/**
	 * @return the dto
	 */
	public CommonDto getDto() {
		return dto;
	}

	/**
	 * @param dto the dto to set
	 */
	public void setDto(CommonDto dto) {
		this.dto = dto;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommonRequest [" + (dto != null ? "dto=" + dto : "") + "]";
	}
	
	// add here some paging stuff
	
	
}
