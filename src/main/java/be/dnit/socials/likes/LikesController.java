package be.dnit.socials.likes;

import org.springframework.web.bind.annotation.*;

@RestController
public class LikesController {
    private final LikesRepo likesRepo;

    public LikesController(LikesRepo likesRepo) {
        this.likesRepo = likesRepo;
    }

    @GetMapping("/likes/{postId}")
    Integer likes(@PathVariable Integer postId) {
        return likesRepo.countLikesByPostId(postId);
    }

    @PostMapping("/like")
    Boolean like(@RequestBody LikesDto like) {
        if (likesRepo.existsLikesByUserIdAndPostId(like.getUserId(), like.getFriendId())) {
            likesRepo.delete(likesRepo.findByUserIdAndPostId(like.getUserId(), like.getFriendId()));
            return false;
        } else {
            likesRepo.save(new Like(like.getUserId(), like.getFriendId()));
            return true;
        }
    }
}
