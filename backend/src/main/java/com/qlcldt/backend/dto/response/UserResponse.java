package com.qlcldt.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Integer id;
    private String username;
    private String hoTen;
    private String email;
    private String soDienThoai;
    private String vaiTro;
    private Integer namSinh;
    private Boolean trangThai;
}