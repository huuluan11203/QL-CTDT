package com.qlcldt.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GiangVienRequest {
    private Integer userId;
    private String maGv;
    private String hoTen;
    private String boMon;
    private String khoa;
    private String trinhDo;
    private String chuyenMon;
    private String trangThai;
}