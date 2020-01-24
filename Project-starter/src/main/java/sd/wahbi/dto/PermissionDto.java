/**
 * 
 */
package sd.wahbi.dto;


/**
 * @author ahmedozy
 *
 */
public class PermissionDto extends CommonDto{

	private Integer id;

	private String permissionName;

	private String description;

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
	 * @return the permissionName
	 */
	public String getPermissionName() {
		return permissionName;
	}

	/**
	 * @param permissionName the permissionName to set
	 */
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PermissionDto [" + (id != null ? "id=" + id + ", " : "")
				+ (permissionName != null ? "permissionName=" + permissionName + ", " : "")
				+ (description != null ? "description=" + description : "") + "]";
	}


}
