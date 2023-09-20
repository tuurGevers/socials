package be.dnit.socials.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    @Autowired
    private PostRepo postRepo;

    @GetMapping("/posts")
    public Iterable<Post> getPosts() {
        return postRepo.findAll();
    }

    @GetMapping("/posts/findByUser/{id}")
    public Iterable<Post> getPostsByUser(@PathVariable int id) {
        return postRepo.findPostsByUserId(id);
    }

    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable int id) {
        return postRepo.findPostById(id);
    }

    @PostMapping("/post/add")
    public Post createPost(@RequestBody PostDto dto){
        return postRepo.save(new Post(dto.getTitle(),dto.getContent(), dto.getImgUrl(), dto.getUserId()));
    }
}
