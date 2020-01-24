/**
 * 
 */
package sd.wahbi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sd.wahbi.data.User;
import sd.wahbi.data.UserRepository;
import sd.wahbi.dto.CommonRequest;
import sd.wahbi.dto.CommonResponse;
import sd.wahbi.dto.ListResponse;
import sd.wahbi.dto.UserDto;
import sd.wahbi.service.UserService;

/**
 * @author ahmedozy
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ModelMapper mapper;
	/* (non-Javadoc)
	 * @see sd.wahbi.service.UserService#getAllUsers()
	 */
	@Override
	public ListResponse getAllUsers() {
		ListResponse response = new ListResponse();
		List<User> users = userRepo.findAll();
		List<UserDto> userDtos = new ArrayList<UserDto>();
		users.forEach(user -> userDtos.add(mapper.map(user, UserDto.class)));
		response.setDtos(userDtos);
		response.setResponseCode(100);
		response.setResponseMessage("success");
		
		return response;
	}

	/* (non-Javadoc)
	 * @see sd.wahbi.service.UserService#getUserByUsername(sd.wahbi.dto.CommonRequest)
	 */
	@Override
	public CommonResponse getUserByUsername(CommonRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see sd.wahbi.service.UserService#saveUser(sd.wahbi.dto.CommonRequest)
	 */
	@Override
	public CommonResponse saveUser(CommonRequest request) {
		CommonResponse response = new CommonResponse();
		User user = mapper.map((UserDto)request.getDto(), User.class);
		User res = userRepo.save(user);
		UserDto userDto = mapper.map(res, UserDto.class);
		response.setResponseBean(userDto);
		response.setResponseCode(100);
		response.setResponseMessage("success");
		return response;
	}

	/* (non-Javadoc)
	 * @see sd.wahbi.service.UserService#updateUser(sd.wahbi.dto.CommonRequest)
	 */
	@Override
	public CommonResponse updateUser(CommonRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see sd.wahbi.service.UserService#deleteUser(sd.wahbi.dto.CommonRequest)
	 */
	@Override
	public CommonResponse deleteUser(CommonRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
