package com.qlcldt.backend.controller;

import com.qlcldt.backend.dto.request.PhanCongGiangDayRequest;
import com.qlcldt.backend.dto.response.ApiResponse;
import com.qlcldt.backend.dto.response.PhanCongGiangDayResponse;
import com.qlcldt.backend.service.PhanCongGiangDayService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phan-cong-giang-day")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PhanCongGiangDayController {
    PhanCongGiangDayService phanCongGiangDayService;

    @PostMapping
    ApiResponse<PhanCongGiangDayResponse> createPhanCongGiangDay(@RequestBody @Valid PhanCongGiangDayRequest request) {
        return ApiResponse.<PhanCongGiangDayResponse>builder()
                .result(phanCongGiangDayService.createPhanCongGiangDay(request))
                .build();
    }

    @GetMapping("/{id}")
    ApiResponse<PhanCongGiangDayResponse> getPhanCongGiangDay(@PathVariable Integer id) {
        return ApiResponse.<PhanCongGiangDayResponse>builder()
                .result(phanCongGiangDayService.getPhanCongGiangDayById(id))
                .build();
    }

    @GetMapping
    ApiResponse<List<PhanCongGiangDayResponse>> getAllPhanCongGiangDay() {
        return ApiResponse.<List<PhanCongGiangDayResponse>>builder()
                .result(phanCongGiangDayService.getAllPhanCongGiangDay())
                .build();
    }

    @PutMapping("/{id}")
    ApiResponse<PhanCongGiangDayResponse> updatePhanCongGiangDay(@PathVariable Integer id, @RequestBody @Valid PhanCongGiangDayRequest request) {
        return ApiResponse.<PhanCongGiangDayResponse>builder()
                .result(phanCongGiangDayService.updatePhanCongGiangDay(id, request))
                .build();
    }

    @DeleteMapping("/{id}")
    ApiResponse<Void> deletePhanCongGiangDay(@PathVariable Integer id) {
        phanCongGiangDayService.deletePhanCongGiangDay(id);
        return ApiResponse.<Void>builder().build();
    }
}
