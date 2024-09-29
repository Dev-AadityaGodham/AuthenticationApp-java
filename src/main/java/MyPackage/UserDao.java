package MyPackage;

public interface UserDao {

	boolean isVialidUser(String username, String password);

	boolean addUser(User user);

}
