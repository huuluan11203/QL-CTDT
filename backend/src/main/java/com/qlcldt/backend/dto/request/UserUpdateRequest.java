package com.qlcldt.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateRequest {
    private String password;
    private String hoTen;
    private String email;
    private String soDienThoai;
    private String vaiTro;
    private LocalDate namSinh;
    private Boolean trangThai;
}