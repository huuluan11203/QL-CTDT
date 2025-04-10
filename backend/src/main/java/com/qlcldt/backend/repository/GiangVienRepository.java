package com.qlcldt.backend.repository;

import com.qlcldt.backend.entity.GiangVien;
import com.qlcldt.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GiangVienRepository extends JpaRepository<GiangVien, Integer> {
    Optional<GiangVien> findByMaGv(String maGv);
    Optional<GiangVien> findByUser(User user);
    List<GiangVien> findByBoMon(String boMon);
    List<GiangVien> findByKhoa(String khoa);
    List<GiangVien> findByTrangThai(String trangThai);
}
