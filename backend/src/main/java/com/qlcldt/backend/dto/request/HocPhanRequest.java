package com.qlcldt.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HocPhanRequest {
    private String maHp;
    private String tenHp;
    private Integer soTinChi;
    private Integer soTietLyThuyet;
    private Integer soTietThucHanh;
    private Integer khungChuongTrinhId;
    private String loaiHp;
    private String hocPhanTienQuyet;
}
