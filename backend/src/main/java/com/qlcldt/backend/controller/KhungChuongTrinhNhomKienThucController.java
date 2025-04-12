package com.qlcldt.backend.controller;

import com.qlcldt.backend.dto.request.KhungChuongTrinhNhomKienThucRequest;
import com.qlcldt.backend.dto.response.ApiResponse;
import com.qlcldt.backend.dto.response.KhungChuongTrinhNhomKienThucResponse;
import com.qlcldt.backend.service.KhungChuongTrinhNhomKienThucService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/khung-chuong-trinh-nhom-kien-thuc")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class KhungChuongTrinhNhomKienThucController {
    KhungChuongTrinhNhomKienThucService service;

    @PostMapping
    ApiResponse<KhungChuongTrinhNhomKienThucResponse> create(@RequestBody @Valid KhungChuongTrinhNhomKienThucRequest request) {
        return ApiResponse.<KhungChuongTrinhNhomKienThucResponse>builder()
                .result(service.create(request))
                .build();
    }

    @GetMapping("/{id}")
    ApiResponse<KhungChuongTrinhNhomKienThucResponse> getById(@PathVariable Integer id) {
        return ApiResponse.<KhungChuongTrinhNhomKienThucResponse>builder()
                .result(service.getById(id))
                .build();
    }

    @GetMapping
    ApiResponse<List<KhungChuongTrinhNhomKienThucResponse>> getAll() {
        return ApiResponse.<List<KhungChuongTrinhNhomKienThucResponse>>builder()
                .result(service.getAll())
                .build();
    }

    @PutMapping("/{id}")
    ApiResponse<KhungChuongTrinhNhomKienThucResponse> update(@PathVariable Integer id, @RequestBody @Valid KhungChuongTrinhNhomKienThucRequest request) {
        return ApiResponse.<KhungChuongTrinhNhomKienThucResponse>builder()
                .result(service.update(id, request))
                .build();
    }

    @DeleteMapping("/{id}")
    ApiResponse<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ApiResponse.<Void>builder().build();
    }
}
