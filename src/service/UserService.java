package service;
import pojo.User;
import java.util.*;

public interface UserService {
	List<User> getAllUser();
	void addUsers(User user);
}
