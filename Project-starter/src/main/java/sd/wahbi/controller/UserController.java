/**
 * 
 */
package sd.wahbi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import sd.wahbi.dto.CommonRequest;
import sd.wahbi.dto.CommonResponse;
import sd.wahbi.dto.ListResponse;
import sd.wahbi.dto.UserDto;
import sd.wahbi.service.UserService;

/**
 * @author ahmedozy
 *
 */
@Controller("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/all")
	public ListResponse getAllUsers() {
		ListResponse response = userService.getAllUsers();
		return response;
	}
	
	public CommonResponse saveUser(UserDto user) {
		CommonRequest request = new CommonRequest();
		request.setDto(user);
		CommonResponse response = userService.saveUser(request);
		return response;
	}
	
}
