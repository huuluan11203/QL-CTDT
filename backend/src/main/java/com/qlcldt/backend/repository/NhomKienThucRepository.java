package com.qlcldt.backend.repository;

import com.qlcldt.backend.entity.NhomKienThuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NhomKienThucRepository extends JpaRepository<NhomKienThuc, Integer> {
    Optional<NhomKienThuc> findByMaNhom(String maNhom);
    Optional<NhomKienThuc> findByTenNhom(String tenNhom);
    List<NhomKienThuc> findByTrangThai(String trangThai);
}