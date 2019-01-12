package dao;
import java.util.List;
import pojo.User;

public interface UserMapper {
	
	List<User> getAllUser();
	void addUsers(User user);
}
