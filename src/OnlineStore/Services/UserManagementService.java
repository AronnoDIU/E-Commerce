package OnlineStore.Services;

import java.util.List;

import OnlineStore.Enteties.User;

public interface UserManagementService {

	String registerUser(User user);

	List<User> getUsers();

	User getUserByEmail(String userEmail);

}
