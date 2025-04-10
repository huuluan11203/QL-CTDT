package com.qlcldt.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CotDiemRequest {
    private Integer deCuongChiTietId;
    private String tenCotDiem;
    private BigDecimal tyLePhanTram;
    private String hinhThuc;
}