/**
 * 
 */
package sd.wahbi.service;

import sd.wahbi.dto.CommonRequest;
import sd.wahbi.dto.CommonResponse;
import sd.wahbi.dto.ListResponse;

/**
 * @author ahmedozy
 *
 */
public interface RoleService {
	public ListResponse getAllRoles();
	public CommonResponse saveRole(CommonRequest request);
	public CommonResponse updateRole(CommonRequest request);
	public CommonResponse deleteRole(CommonRequest request);

}
