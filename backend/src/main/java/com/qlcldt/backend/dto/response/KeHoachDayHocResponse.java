package com.qlcldt.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeHoachDayHocResponse {
    private Integer id;
    private ThongTinChungResponse thongTinChung;
    private HocPhanResponse hocPhan;
    private Integer hocKy;
    private Integer namHoc;
}
