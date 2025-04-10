package com.qlcldt.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThongTinChungRequest {
    private String maCtdt;
    private String tenCtdt;
    private String nganh;
    private String maNganh;
    private String khoaQuanLy;
    private String heDaoTao;
    private String trinhDo;
    private Integer tongTinChi;
    private String thoiGianDaoTao;
    private Integer namBanHanh;
    private String trangThai;
}