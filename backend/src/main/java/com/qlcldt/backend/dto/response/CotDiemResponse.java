package com.qlcldt.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CotDiemResponse {
    private Integer id;
    private String tenCotDiem;
    private BigDecimal tyLePhanTram;
    private String hinhThuc;
}