/**
 * 
 */
package sd.wahbi.dto;

/**
 * @author ahmedozy
 *
 */
public class UnitDto extends CommonDto{

private Integer id;
	
	private String unitName;
	
	private UnitDto parent;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the unitName
	 */
	public String getUnitName() {
		return unitName;
	}

	/**
	 * @param unitName the unitName to set
	 */
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	/**
	 * @return the parent
	 */
	public UnitDto getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(UnitDto parent) {
		this.parent = parent;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UnitDto [" + (id != null ? "id=" + id + ", " : "") + (unitName != null ? "unitName=" + unitName : "")
				+ "]";
	}
	
	
}
