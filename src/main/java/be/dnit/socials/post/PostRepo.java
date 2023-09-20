package be.dnit.socials.post;

import org.springframework.data.repository.CrudRepository;

public interface PostRepo  extends CrudRepository<Post, Integer> {
    Post findPostById(int id);

    Iterable<Post> findPostsByUserId(int id);

}
