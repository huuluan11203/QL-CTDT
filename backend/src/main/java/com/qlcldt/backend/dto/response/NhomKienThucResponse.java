package com.qlcldt.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NhomKienThucResponse {
    private Integer id;
    private String maNhom;
    private String tenNhom;
    private String trangThai;
}