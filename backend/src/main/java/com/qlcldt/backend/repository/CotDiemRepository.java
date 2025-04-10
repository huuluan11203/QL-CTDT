package com.qlcldt.backend.repository;

import com.qlcldt.backend.entity.CotDiem;
import com.qlcldt.backend.entity.DeCuongChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CotDiemRepository extends JpaRepository<CotDiem, Integer> {
    List<CotDiem> findByDeCuongChiTiet(DeCuongChiTiet deCuongChiTiet);
    List<CotDiem> findByDeCuongChiTietId(Integer deCuongId);
}