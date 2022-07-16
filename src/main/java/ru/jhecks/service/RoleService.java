package ru.jhecks.service;

import ru.jhecks.model.Role;

import java.util.List;

public interface RoleService {
    void saveRole(Role role);
    Role getRole(String name);
    Role getRole(long id);
    List<Role> getAllRoles();
}
