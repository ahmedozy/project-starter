/**
 * 
 */
package sd.wahbi.dto;

import java.util.Collection;

/**
 * @author ahmedozy
 *
 */
public class RoleDto extends CommonDto{

	private Integer id;

	private String roleName;

	private Collection<PermissionDto> permissions;

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
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return the permissions
	 */
	public Collection<PermissionDto> getPermissions() {
		return permissions;
	}

	/**
	 * @param permissions the permissions to set
	 */
	public void setPermissions(Collection<PermissionDto> permissions) {
		this.permissions = permissions;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RoleDto [" + (id != null ? "id=" + id + ", " : "")
				+ (roleName != null ? "roleName=" + roleName + ", " : "")
				+ (permissions != null ? "permissions=" + permissions : "") + "]";
	}


}
