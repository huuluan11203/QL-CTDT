package com.qlcldt.backend.controller;

import com.qlcldt.backend.dto.request.DeCuongChiTietRequest;
import com.qlcldt.backend.dto.response.ApiResponse;
import com.qlcldt.backend.dto.response.DeCuongChiTietResponse;
import com.qlcldt.backend.service.DeCuongChiTietService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/de-cuong-chi-tiet")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DeCuongChiTietController {
    DeCuongChiTietService deCuongChiTietService;

    @PostMapping
    ApiResponse<DeCuongChiTietResponse> createDeCuongChiTiet(@RequestBody @Valid DeCuongChiTietRequest request) {
        return ApiResponse.<DeCuongChiTietResponse>builder()
                .result(deCuongChiTietService.createDeCuongChiTiet(request))
                .build();
    }

    @GetMapping("/{id}")
    ApiResponse<DeCuongChiTietResponse> getDeCuongChiTiet(@PathVariable Integer id) {
        return ApiResponse.<DeCuongChiTietResponse>builder()
                .result(deCuongChiTietService.getDeCuongChiTietById(id))
                .build();
    }

    @GetMapping
    ApiResponse<List<DeCuongChiTietResponse>> getAllDeCuongChiTiet() {
        return ApiResponse.<List<DeCuongChiTietResponse>>builder()
                .result(deCuongChiTietService.getAllDeCuongChiTiet())
                .build();
    }

    @PutMapping("/{id}")
    ApiResponse<DeCuongChiTietResponse> updateDeCuongChiTiet(@PathVariable Integer id, @RequestBody @Valid DeCuongChiTietRequest request) {
        return ApiResponse.<DeCuongChiTietResponse>builder()
                .result(deCuongChiTietService.updateDeCuongChiTiet(id, request))
                .build();
    }

    @DeleteMapping("/{id}")
    ApiResponse<Void> deleteDeCuongChiTiet(@PathVariable Integer id) {
        deCuongChiTietService.deleteDeCuongChiTiet(id);
        return ApiResponse.<Void>builder().build();
    }
}
