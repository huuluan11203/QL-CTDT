package com.qlcldt.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeHoachMonHomResponse {
    private Integer id;
    private String maNhom;
    private HocPhanResponse hocPhan;
    private String namHoc;
    private Integer hocKy;
    private Integer soLuongSv;
    private LocalDate thoiGianBatDau;
    private LocalDate thoiGianKetThuc;
    private String trangThai;
    private List<PhanCongGiangDayResponse> phanCongGiangDays;
}