package MyPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDowImpl implements UserDao {

	@Override
	public boolean isVialidUser(String username, String password) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM users WHERE username = ? AND password = ?";
   	 try (Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {

           preparedStatement.setString(1, username);
           preparedStatement.setString(2, password);
           
           ResultSet resultSet = preparedStatement.executeQuery();
           System.out.println("query is running");
           return resultSet.next();
           
       } catch (SQLException e) {
           e.printStackTrace();
           return false;
       }
   }

	@Override
	public boolean addUser(User user) {
		String query = "insert into users values(?,?,?)";
		try (Connection connection = DBUtil.getConnection();
	            PreparedStatement preparedStatement = connection.prepareStatement(query)) {

	           preparedStatement.setString(1, user.getUsername());
	           preparedStatement.setString(2, user.getEmail());
	           preparedStatement.setString(3, user.getPassword());
	           
	           int rows = preparedStatement.executeUpdate();
	           return rows>0;
		} catch (SQLException e) {
	           e.printStackTrace();
	           return false;
	       }
	}
	}

	

	
