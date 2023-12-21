package dev.rest;

import dev.domain.User;
import dev.domain.UserDetail;
import dev.service.UserDetailService;
import dev.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserDetailRestController {

    private UserDetailService userDetailService;

    public UserDetailRestController(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    @GetMapping("/users/detail")
    public List<UserDetail> getUsers() {
        return userDetailService.getAll();
    }
}
