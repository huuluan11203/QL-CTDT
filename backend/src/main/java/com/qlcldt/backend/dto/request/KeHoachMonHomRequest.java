package com.qlcldt.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeHoachMonHomRequest {
    private String maNhom;
    private Integer hocPhanId;
    private String namHoc;
    private Integer hocKy;
    private Integer soLuongSv;
    private LocalDate thoiGianBatDau;
    private LocalDate thoiGianKetThuc;
    private String trangThai;
}