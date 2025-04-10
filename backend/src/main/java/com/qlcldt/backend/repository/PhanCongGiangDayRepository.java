package com.qlcldt.backend.repository;

import com.qlcldt.backend.entity.GiangVien;
import com.qlcldt.backend.entity.KeHoachMonHom;
import com.qlcldt.backend.entity.PhanCongGiangDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhanCongGiangDayRepository extends JpaRepository<PhanCongGiangDay, Integer> {
    List<PhanCongGiangDay> findByKeHoachMonHom(KeHoachMonHom keHoachMonHom);
    List<PhanCongGiangDay> findByGiangVien(GiangVien giangVien);
    List<PhanCongGiangDay> findByVaiTro(String vaiTro);
    List<PhanCongGiangDay> findByKeHoachMonHomIdAndGiangVienId(Integer keHoachMonHomId, Integer giangVienId);
}
