package ie.atu.cicd_week6_project;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signUp")
    public List<User> newUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public List<User> delUser(@PathVariable int id){
        return userService.removeUser(id);
    }

    @PutMapping("/editProfile/{id}")
    public List<User> changeUser(@RequestBody User user, @PathVariable int id){
        return userService.editUser(user, id);
    }
}
