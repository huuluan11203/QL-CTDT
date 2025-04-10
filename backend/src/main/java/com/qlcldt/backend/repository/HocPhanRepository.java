package com.qlcldt.backend.repository;

import com.qlcldt.backend.entity.HocPhan;
import com.qlcldt.backend.entity.KhungChuongTrinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HocPhanRepository extends JpaRepository<HocPhan, Integer> {
    Optional<HocPhan> findByMaHp(String maHp);
    List<HocPhan> findByKhungChuongTrinh(KhungChuongTrinh khungChuongTrinh);
    List<HocPhan> findByLoaiHp(String loaiHp);
    List<HocPhan> findBySoTinChi(Integer soTinChi);
}