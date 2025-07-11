package com.yash.Electronic.store.repository;

import com.yash.Electronic.store.entites.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo  extends JpaRepository<Role, String> {
    Optional<Role> findByName(String name);
}
