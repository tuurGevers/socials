package be.dnit.socials.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @PostMapping("/add")
    public String createUser(@RequestParam String firstName, @RequestParam String lastName) {
        User user = new User(firstName, lastName);
        User result = userRepo.save(user);
        return String.format("User %s created successfully", result.getId());
    }

    @GetMapping("/list")
    public Iterable<User> listUsers() {
        return userRepo.findAll();
    }

    @GetMapping("find/{id}")
    public User findUser(@PathVariable Integer id) {
        return userRepo.findUserById(id);
    }

}
