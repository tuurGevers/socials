package be.dnit.socials.friend;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FriendRepo extends CrudRepository<Friend, Integer> {
        @Query("SELECT f FROM Friend f WHERE f.userId = :id OR f.friendId = :id")
        Iterable<Friend> findByUserOrFriend(@Param("id") Integer id);

        Boolean existsFriendByUserIdAndFriendId(Integer userId, Integer friendId);
        Friend findFriendsByUserIdAndFriendId(Integer userId, Integer friendId);

}
