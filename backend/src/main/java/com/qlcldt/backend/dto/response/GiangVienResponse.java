package com.qlcldt.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GiangVienResponse {
    private Integer id;
    private UserResponse user;
    private String maGv;
    private String hoTen;
    private String boMon;
    private String khoa;
    private String trinhDo;
    private String chuyenMon;
    private String trangThai;
}