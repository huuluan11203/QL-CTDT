package com.qlcldt.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KhungChuongTrinhNhomKienThucRequest {
    private Integer khungChuongTrinhId;
    private Integer nhomKienThucId;
    private Integer soTinChiBatBuoc;
    private Integer soTinChiTuChon;
}