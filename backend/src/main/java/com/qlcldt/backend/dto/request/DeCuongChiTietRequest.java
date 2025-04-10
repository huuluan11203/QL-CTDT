package com.qlcldt.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeCuongChiTietRequest {
    private Integer hocPhanId;
    private String mucTieu;
    private String noiDung;
    private String phuongPhapGiangDay;
    private String phuongPhapDanhGia;
    private String taiLieuThamKhao;
    private String trangThai;
    private List<CotDiemRequest> cotDiems;
}