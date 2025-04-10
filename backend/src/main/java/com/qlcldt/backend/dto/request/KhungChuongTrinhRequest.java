package com.qlcldt.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KhungChuongTrinhRequest {
    private Integer thongTinChungId;
    private String maNhom;
    private String tenNhom;
    private Integer soTinChiToiThieu;
}