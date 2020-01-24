/**
 * 
 */
package sd.wahbi.dto;

/**
 * @author ahmedozy
 *
 */
public class UserDto extends CommonDto{
	private Integer id;
	
	private String username;
	
	private String password;
	
	private String password2;
	
	private UnitDto unit;
	
	private RoleDto role;

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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the password2
	 */
	public String getPassword2() {
		return password2;
	}

	/**
	 * @param password2 the password2 to set
	 */
	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	/**
	 * @return the unit
	 */
	public UnitDto getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(UnitDto unit) {
		this.unit = unit;
	}

	/**
	 * @return the role
	 */
	public RoleDto getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(RoleDto role) {
		this.role = role;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDto [" + (id != null ? "id=" + id + ", " : "")
				+ (username != null ? "username=" + username + ", " : "")
				+ (password != null ? "password=******, " : "")
				+ (password2 != null ? "password2=******, " : "")
				+ (unit != null ? "unit=" + unit + ", " : "") + (role != null ? "role=" + role : "") + "]";
	}
	
	
}
