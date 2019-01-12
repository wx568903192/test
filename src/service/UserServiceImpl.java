package service;
import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.UserMapper;
import pojo.User;
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
	//service≤„“¿¿µDao≤„ µœ÷
	@Autowired
	@Qualifier("userMapper")
	private UserMapper userMapper;
		
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userMapper.getAllUser();
	}

	@Override
	public void addUsers(User user) {
		userMapper.addUsers(user);
		throw new RuntimeException();
	}
}
