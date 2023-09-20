package be.dnit.socials.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
    User findUserById(Integer id);
}
