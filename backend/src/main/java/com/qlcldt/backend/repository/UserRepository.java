package com.qlcldt.backend.repository;

import com.qlcldt.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    List<User> findByVaiTro(String vaiTro);
    List<User> findByTrangThai(Boolean trangThai);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}