package com.qlcldt.backend.controller;

import com.qlcldt.backend.dto.request.NhomKienThucRequest;
import com.qlcldt.backend.dto.response.ApiResponse;
import com.qlcldt.backend.dto.response.NhomKienThucResponse;
import com.qlcldt.backend.service.NhomKienThucService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nhom-kien-thuc")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class NhomKienThucController {
    NhomKienThucService nhomKienThucService;

    @PostMapping
    ApiResponse<NhomKienThucResponse> createNhomKienThuc(@RequestBody @Valid NhomKienThucRequest request) {
        return ApiResponse.<NhomKienThucResponse>builder()
                .result(nhomKienThucService.createNhomKienThuc(request))
                .build();
    }

    @GetMapping("/{id}")
    ApiResponse<NhomKienThucResponse> getNhomKienThuc(@PathVariable Integer id) {
        return ApiResponse.<NhomKienThucResponse>builder()
                .result(nhomKienThucService.getNhomKienThucById(id))
                .build();
    }

    @GetMapping
    ApiResponse<List<NhomKienThucResponse>> getAllNhomKienThuc() {
        return ApiResponse.<List<NhomKienThucResponse>>builder()
                .result(nhomKienThucService.getAllNhomKienThuc())
                .build();
    }

    @PutMapping("/{id}")
    ApiResponse<NhomKienThucResponse> updateNhomKienThuc(@PathVariable Integer id, @RequestBody @Valid NhomKienThucRequest request) {
        return ApiResponse.<NhomKienThucResponse>builder()
                .result(nhomKienThucService.updateNhomKienThuc(id, request))
                .build();
    }

    @DeleteMapping("/{id}")
    ApiResponse<Void> deleteNhomKienThuc(@PathVariable Integer id) {
        nhomKienThucService.deleteNhomKienThuc(id);
        return ApiResponse.<Void>builder().build();
    }
}
