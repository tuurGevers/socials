package be.dnit.socials.comment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment {


    @Id
    @GeneratedValue
    private Integer id;

    private String Content;
    private Integer userId;
    private Integer postId;

    public Comment(String content, Integer userId, Integer postId) {
        Content = content;
        this.userId = userId;
        this.postId = postId;
    }

    public Comment() {

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return Content;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getPostId() {
        return postId;
    }
}
