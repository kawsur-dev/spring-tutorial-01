package dev.rest;

import dev.domain.UserAddress;
import dev.domain.UserDetail;
import dev.service.UserAddressService;
import dev.service.UserDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAddressRestController {

    private UserAddressService userAddressService;

    public UserAddressRestController(UserAddressService userAddressService) {
        this.userAddressService = userAddressService;
    }

    @GetMapping("/users/address")
    public List<UserAddress> getUsers() {
        return userAddressService.getAll();
    }
}
