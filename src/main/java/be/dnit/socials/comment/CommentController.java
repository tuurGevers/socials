package be.dnit.socials.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {
    private final CommentRepo commentRepo;

    public CommentController(CommentRepo commentRepo) {
        this.commentRepo = commentRepo;
    }

    @GetMapping("/comment/findByPost/{postId}")
    public Iterable<Comment> findByPost(@PathVariable Integer postId){
        return commentRepo.findCommentsByPostId(postId);
    }

    @PostMapping("/comment/add")
    public Comment create(@RequestBody CommentDto comment) {
        System.out.println(comment.getContent());
        return commentRepo.save(new Comment(comment.getContent(), comment.getUserId(), comment.getPostId()));
    }
}
