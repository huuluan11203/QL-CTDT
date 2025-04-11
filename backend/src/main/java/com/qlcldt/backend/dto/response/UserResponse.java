package com.qlcldt.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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
    private LocalDate namSinh;
    private Boolean trangThai;
}