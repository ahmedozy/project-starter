/**
 * 
 */
package sd.wahbi.dto;

import java.util.List;

/**
 * @author ahmedozy
 *
 */
public class ListResponse extends CommonResponse {

	private List<? extends CommonDto> dtos;

	/**
	 * @return the dtos
	 */
	public List<? extends CommonDto> getDtos() {
		return dtos;
	}

	/**
	 * @param dtos the dtos to set
	 */
	public void setDtos(List<? extends CommonDto> dtos) {
		this.dtos = dtos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ListResponse [" + (dtos != null ? "dtos=" + dtos : "") + "]";
	}

	
	
	
}
