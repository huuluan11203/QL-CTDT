package com.qlcldt.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhanCongGiangDayRequest {
    private Integer keHoachMonHomId;
    private Integer giangVienId;
    private String vaiTro;
    private Integer soTiet;
}