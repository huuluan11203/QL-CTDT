package com.qlcldt.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HocPhanResponse {
    private Integer id;
    private String maHp;
    private String tenHp;
    private Integer soTinChi;
    private Integer soTietLyThuyet;
    private Integer soTietThucHanh;
    private KhungChuongTrinhResponse khungChuongTrinh;
    private String loaiHp;
    private String hocPhanTienQuyet;
}