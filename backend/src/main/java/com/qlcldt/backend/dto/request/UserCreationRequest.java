package com.qlcldt.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCreationRequest {
    private String username;
    private String password;
    private String hoTen;
    private String email;
    private String soDienThoai;
    private String vaiTro;
    private Integer namSinh;
    private Boolean trangThai;
}