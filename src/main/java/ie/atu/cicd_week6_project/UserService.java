package ie.atu.cicd_week6_project;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {
    private final List<User> userList = new ArrayList<>();
    public List<User> addUser(User user) {
        userList.add(user);
        return userList;
    }
    public List<User> removeUser(int id) {
        userList.removeIf(u -> u.getId() == id);
        return userList;
    }

    public List<User> editUser(User user, int id) {
        for(User u: userList) {
            if (u.getId() == id) {
                u.setPassword(user.getPassword());
                u.setUserName(user.getUserName());
                u.setBankDetails(user.getBankDetails());
            }
        }
        return userList;
    }
}
