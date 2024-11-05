package ie.atu.cicd_week6_project;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {
    private final List<User> userList = new ArrayList<>();
    public List<User> addUser(User user) {
        try {
            // Insert a new record into the "users" table
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO User (UserId, UserName, UserEmail, UserPassword, UserBank, UserPortfolioValue) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, user.getUserId());
            stmt.setString(2, user.getUserName());
            stmt.setString(3, user.getUserEmail());
            stmt.setInt(4, user.getUserPassword());
            stmt.setString(5, user.getUserBank());
            stmt.setInt(6, user.getUserPortfolioValue());
            stmt.executeUpdate();
            System.out.println("Insert completed successfully.");
        } catch (SQLException ex) {
            System.out.println("Record insert failed.");
            ex.printStackTrace();
        }
        userList.add(user);
        return userList;
    }
    public List<User> removeUser(int id) {
        String DeleteSQL = "DELETE FROM User userservice WHERE userservice.UserId='"+id+"'";
        userList.removeIf(u -> u.getUserId() == id);
        return userList;
    }

    public List<User> editUser(User user, int id) {
        for(User u: userList) {
            if (u.getUserId() == id) {
                u.setUserPassword(user.getUserPassword());
                u.setUserName(user.getUserName());
                u.setUserBank(user.getUserBank());
            }
        }
        return userList;
    }
}