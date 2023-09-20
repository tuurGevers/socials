package be.dnit.socials.comment;

public class CommentDto {
    private String content;
    private Integer userId;
    private Integer postId;

    public String getContent() {
        return content;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }
}
