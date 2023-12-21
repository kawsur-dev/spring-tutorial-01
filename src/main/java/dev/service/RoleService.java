package dev.service;

import dev.domain.Role;
import dev.domain.UserAddress;
import dev.repository.RoleRepository;
import dev.repository.UserAddressRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RoleService {

    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public void create(Role role) {
        roleRepository.create(role);
    }

    public List<Role> getAll() {
        return roleRepository.getAll();
    }
}
