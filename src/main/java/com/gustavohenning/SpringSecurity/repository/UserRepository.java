package com.gustavohenning.SpringSecurity.repository;

import com.gustavohenning.SpringSecurity.entity.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, Long> {

    Optional<ApplicationUser> findUserByUsername(String name);
}
