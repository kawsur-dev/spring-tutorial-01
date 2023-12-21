package dev.rest;

import dev.domain.Role;
import dev.domain.User;
import dev.service.RoleService;
import dev.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleRestController {

    private RoleService roleService;

    public RoleRestController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/roles")
    public List<Role> getRoles() {
        return roleService.getAll();
    }

    @PostMapping("/roles")
    public String createUser(@RequestBody Role role) {
        roleService.create(role);
        return "Successful";
    }
}
