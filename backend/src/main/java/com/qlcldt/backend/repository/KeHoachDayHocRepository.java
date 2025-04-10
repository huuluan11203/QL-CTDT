package com.qlcldt.backend.repository;

import com.qlcldt.backend.entity.HocPhan;
import com.qlcldt.backend.entity.KeHoachDayHoc;
import com.qlcldt.backend.entity.ThongTinChung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KeHoachDayHocRepository extends JpaRepository<KeHoachDayHoc, Integer> {
    List<KeHoachDayHoc> findByThongTinChung(ThongTinChung thongTinChung);
    List<KeHoachDayHoc> findByHocPhan(HocPhan hocPhan);
    List<KeHoachDayHoc> findByHocKyAndNamHoc(Integer hocKy, Integer namHoc);
    List<KeHoachDayHoc> findByThongTinChungIdAndHocKy(Integer thongTinChungId, Integer hocKy);
}