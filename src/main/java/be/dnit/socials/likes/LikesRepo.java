package be.dnit.socials.likes;

import org.springframework.data.repository.CrudRepository;

public interface LikesRepo extends CrudRepository<Like, Integer> {
    Boolean existsLikesByUserIdAndPostId(Integer userId, Integer postId);

    Integer countLikesByPostId(Integer postId);

    Like findByUserIdAndPostId(Integer userId, Integer postId);
}
