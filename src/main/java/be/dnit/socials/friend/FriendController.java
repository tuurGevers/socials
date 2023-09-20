package be.dnit.socials.friend;

import org.springframework.web.bind.annotation.*;

@RestController
public class FriendController {

    private final FriendRepo friendRepo;

    public FriendController(FriendRepo friendRepo) {
        this.friendRepo = friendRepo;
    }

    @GetMapping("/friends/{user}")
    Iterable<Friend> getFriends(@PathVariable Integer user){
        Iterable<Friend> friends = friendRepo.findByUserOrFriend(user);
        friends.iterator().forEachRemaining(System.out::println);
        return friends;
    }

    @PostMapping("/friends/toggle")
    String toggleFriends(@RequestBody FriendDto dto){
        if(friendRepo.existsFriendByUserIdAndFriendId(dto.getUserId(), dto.getFriendId())){
            friendRepo.delete(friendRepo.findFriendsByUserIdAndFriendId(dto.getUserId(), dto.getFriendId()));
            return "friend removed";
        }else{
            friendRepo.save(new Friend(dto.getUserId(), dto.getFriendId()));
            return "friend added";
        }
    }

}
