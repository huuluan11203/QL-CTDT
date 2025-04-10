package com.qlcldt.backend.repository;

import com.qlcldt.backend.entity.HocPhan;
import com.qlcldt.backend.entity.KeHoachMonHom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface KeHoachMonHomRepository extends JpaRepository<KeHoachMonHom, Integer> {
    Optional<KeHoachMonHom> findByMaNhom(String maNhom);
    List<KeHoachMonHom> findByHocPhan(HocPhan hocPhan);
    List<KeHoachMonHom> findByNamHocAndHocKy(String namHoc, Integer hocKy);
    List<KeHoachMonHom> findByTrangThai(String trangThai);
    List<KeHoachMonHom> findByHocPhanIdAndNamHocAndHocKy(Integer hocPhanId, String namHoc, Integer hocKy);
}