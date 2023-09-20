package be.dnit.socials.likes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="likes")
public class Like {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;
    private Integer postId;

    public Like(Integer userId, Integer postId) {
        this.userId = userId;
        this.postId = postId;
    }

    public Like() {}

    public Integer getUserId() {
        return userId;
    }

    public Integer getFriendId() {
        return postId;
    }
}
