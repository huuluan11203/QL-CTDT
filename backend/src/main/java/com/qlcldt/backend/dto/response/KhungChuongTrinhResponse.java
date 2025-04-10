package com.qlcldt.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KhungChuongTrinhResponse {
    private Integer id;
    private ThongTinChungResponse thongTinChung;
    private String maNhom;
    private String tenNhom;
    private Integer soTinChiToiThieu;
    private List<KhungChuongTrinhNhomKienThucResponse> nhomKienThucs;
}
