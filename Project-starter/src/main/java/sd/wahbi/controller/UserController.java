/**
 * 
 */
package sd.wahbi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sd.wahbi.dto.CommonRequest;
import sd.wahbi.dto.CommonResponse;
import sd.wahbi.dto.ListResponse;
import sd.wahbi.dto.UserDto;
import sd.wahbi.service.UserService;

/**
 * @author ahmedozy
 *
 */
@RestController("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/all")
	public ListResponse getAllUsers() {
		ListResponse response = userService.getAllUsers();
		System.out.println(response);
		return response;
	}
	
	@PostMapping("/save")
	public CommonResponse saveUser(@RequestBody UserDto user) {
		CommonRequest request = new CommonRequest();
		request.setDto(user);
		System.out.println("controller user ..." + user);
		CommonResponse response = userService.saveUser(request);
		return response;
	}
	
}
