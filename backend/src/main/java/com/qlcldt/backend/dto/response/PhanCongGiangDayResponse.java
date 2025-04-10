package com.qlcldt.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhanCongGiangDayResponse {
    private Integer id;
    private GiangVienResponse giangVien;
    private String vaiTro;
    private Integer soTiet;
}