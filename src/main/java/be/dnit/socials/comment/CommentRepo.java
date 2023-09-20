package be.dnit.socials.comment;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepo extends CrudRepository<Comment, Integer> {
        Iterable<Comment> findCommentsByPostId(Integer postID);
}
