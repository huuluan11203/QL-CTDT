package com.qlcldt.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeHoachDayHocRequest {
    private Integer thongTinChungId;
    private Integer hocPhanId;
    private Integer hocKy;
    private Integer namHoc;
}