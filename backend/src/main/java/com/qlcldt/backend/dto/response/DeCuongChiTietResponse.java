package com.qlcldt.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeCuongChiTietResponse {
    private Integer id;
    private HocPhanResponse hocPhan;
    private String mucTieu;
    private String noiDung;
    private String phuongPhapGiangDay;
    private String phuongPhapDanhGia;
    private String taiLieuThamKhao;
    private String trangThai;
    private List<CotDiemResponse> cotDiems;
}