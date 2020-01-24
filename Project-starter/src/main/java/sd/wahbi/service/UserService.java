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
public interface UserService {

	public ListResponse getAllUsers();
	public CommonResponse getUserByUsername(CommonRequest request);
	public CommonResponse saveUser(CommonRequest request);
	public CommonResponse updateUser(CommonRequest request);
	public CommonResponse deleteUser(CommonRequest request);
}
