package com.qlcldt.backend.repository;

import com.qlcldt.backend.entity.KhungChuongTrinh;
import com.qlcldt.backend.entity.KhungChuongTrinhNhomKienThuc;
import com.qlcldt.backend.entity.NhomKienThuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KhungChuongTrinhNhomKienThucRepository extends JpaRepository<KhungChuongTrinhNhomKienThuc, Integer> {
    List<KhungChuongTrinhNhomKienThuc> findByKhungChuongTrinh(KhungChuongTrinh khungChuongTrinh);
    List<KhungChuongTrinhNhomKienThuc> findByNhomKienThuc(NhomKienThuc nhomKienThuc);
    List<KhungChuongTrinhNhomKienThuc> findByKhungChuongTrinhIdAndNhomKienThucId(Integer khungChuongTrinhId, Integer nhomKienThucId);
}