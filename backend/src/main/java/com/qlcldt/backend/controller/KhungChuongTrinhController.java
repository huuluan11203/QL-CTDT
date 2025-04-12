package com.qlcldt.backend.controller;

import com.qlcldt.backend.dto.request.KhungChuongTrinhRequest;
import com.qlcldt.backend.dto.response.ApiResponse;
import com.qlcldt.backend.dto.response.KhungChuongTrinhResponse;
import com.qlcldt.backend.service.KhungChuongTrinhService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/khung-chuong-trinh")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class KhungChuongTrinhController {
    KhungChuongTrinhService khungChuongTrinhService;

    @PostMapping
    ApiResponse<KhungChuongTrinhResponse> createKhungChuongTrinh(@RequestBody @Valid KhungChuongTrinhRequest request) {
        return ApiResponse.<KhungChuongTrinhResponse>builder()
                .result(khungChuongTrinhService.createKhungChuongTrinh(request))
                .build();
    }

    @GetMapping("/{id}")
    ApiResponse<KhungChuongTrinhResponse> getKhungChuongTrinh(@PathVariable Integer id) {
        return ApiResponse.<KhungChuongTrinhResponse>builder()
                .result(khungChuongTrinhService.getKhungChuongTrinhById(id))
                .build();
    }

    @GetMapping
    ApiResponse<List<KhungChuongTrinhResponse>> getAllKhungChuongTrinh() {
        return ApiResponse.<List<KhungChuongTrinhResponse>>builder()
                .result(khungChuongTrinhService.getAllKhungChuongTrinh())
                .build();
    }

    @PutMapping("/{id}")
    ApiResponse<KhungChuongTrinhResponse> updateKhungChuongTrinh(@PathVariable Integer id, @RequestBody @Valid KhungChuongTrinhRequest request) {
        return ApiResponse.<KhungChuongTrinhResponse>builder()
                .result(khungChuongTrinhService.updateKhungChuongTrinh(id, request))
                .build();
    }

    @DeleteMapping("/{id}")
    ApiResponse<Void> deleteKhungChuongTrinh(@PathVariable Integer id) {
        khungChuongTrinhService.deleteKhungChuongTrinh(id);
        return ApiResponse.<Void>builder().build();
    }
}
