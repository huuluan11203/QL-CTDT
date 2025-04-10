package com.qlcldt.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KhungChuongTrinhNhomKienThucResponse {
    private Integer id;
    private NhomKienThucResponse nhomKienThuc;
    private Integer soTinChiBatBuoc;
    private Integer soTinChiTuChon;
}