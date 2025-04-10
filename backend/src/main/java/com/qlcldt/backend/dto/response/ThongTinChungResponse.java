package com.qlcldt.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThongTinChungResponse {
    private Integer id;
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
