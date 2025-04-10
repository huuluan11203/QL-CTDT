package com.qlcldt.backend.repository;

import com.qlcldt.backend.entity.KhungChuongTrinh;
import com.qlcldt.backend.entity.ThongTinChung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface KhungChuongTrinhRepository extends JpaRepository<KhungChuongTrinh, Integer> {
    List<KhungChuongTrinh> findByThongTinChung(ThongTinChung thongTinChung);
    List<KhungChuongTrinh> findByThongTinChungId(Integer thongTinChungId);
    Optional<KhungChuongTrinh> findByMaNhom(String maNhom);
    Optional<KhungChuongTrinh> findByTenNhom(String tenNhom);
}