package be.dnit.socials.friend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="friends")
public class Friend {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;
    private Integer friendId;


    public Friend(Integer userId, Integer friendId) {
        this.userId = userId;
        this.friendId = friendId;
    }
    public Friend() {}

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getFriendId() {
        return friendId;
    }
}
