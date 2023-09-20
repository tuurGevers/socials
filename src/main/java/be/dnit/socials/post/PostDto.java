package be.dnit.socials.post;

public class PostDto {
    private String title;
    private String content;
    private String imgUrl;
    private Integer userId;

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
