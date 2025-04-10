package com.qlcldt.backend.repository;

import com.qlcldt.backend.entity.DeCuongChiTiet;
import com.qlcldt.backend.entity.HocPhan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeCuongChiTietRepository extends JpaRepository<DeCuongChiTiet, Integer> {
    List<DeCuongChiTiet> findByHocPhan(HocPhan hocPhan);
    Optional<DeCuongChiTiet> findByHocPhanId(Integer hocPhanId);
    List<DeCuongChiTiet> findByTrangThai(String trangThai);
}