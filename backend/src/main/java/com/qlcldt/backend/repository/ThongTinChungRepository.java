package com.qlcldt.backend.repository;

import com.qlcldt.backend.entity.ThongTinChung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ThongTinChungRepository extends JpaRepository<ThongTinChung, Integer> {
    Optional<ThongTinChung> findByMaCtdt(String maCtdt);
    List<ThongTinChung> findByNganh(String nganh);
    List<ThongTinChung> findByMaNganh(String maNganh);
    List<ThongTinChung> findByKhoaQuanLy(String khoaQuanLy);
    List<ThongTinChung> findByHeDaoTao(String heDaoTao);
    List<ThongTinChung> findByTrinhDo(String trinhDo);
    List<ThongTinChung> findByNamBanHanh(Integer namBanHanh);
    List<ThongTinChung> findByTrangThai(String trangThai);
}