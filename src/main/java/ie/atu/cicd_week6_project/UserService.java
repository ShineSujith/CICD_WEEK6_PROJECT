package ie.atu.cicd_week6_project;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserService {
    private List<Users> usersList = new ArrayList<>();
    public List<Users> addUser(Users users) {
        usersList.add(users);
        return usersList;
    }
}
