package be.dnit.socials.post;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "post")
public class Post {

    public Post(String title, String content, String imgUrl, Integer userId) {
        this.title = title;
        this.content = content;
        this.imgUrl = imgUrl;
        this.userId = userId;
    }
    public Post() {
    }

    @Id
    @GeneratedValue
    private Integer id;

    private String title;
    private String content;
    private String imgUrl;
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Integer getUserId() {
        return userId;
    }

}
