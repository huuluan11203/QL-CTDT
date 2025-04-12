package com.qlcldt.backend.controller;

import com.qlcldt.backend.dto.request.GiangVienRequest;
import com.qlcldt.backend.dto.response.ApiResponse;
import com.qlcldt.backend.dto.response.GiangVienResponse;
import com.qlcldt.backend.service.GiangVienService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/giang-vien")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class GiangVienController {
    GiangVienService giangVienService;

    @PostMapping
    ApiResponse<GiangVienResponse> createGiangVien(@RequestBody @Valid GiangVienRequest request) {
        return ApiResponse.<GiangVienResponse>builder()
                .result(giangVienService.createGiangVien(request))
                .build();
    }

    @GetMapping("/{id}")
    ApiResponse<GiangVienResponse> getGiangVien(@PathVariable Integer id) {
        return ApiResponse.<GiangVienResponse>builder()
                .result(giangVienService.getGiangVienById(id))
                .build();
    }

    @GetMapping
    ApiResponse<List<GiangVienResponse>> getAllGiangVien() {
        return ApiResponse.<List<GiangVienResponse>>builder()
                .result(giangVienService.getAllGiangVien())
                .build();
    }

    @PutMapping("/{id}")
    ApiResponse<GiangVienResponse> updateGiangVien(@PathVariable Integer id, @RequestBody @Valid GiangVienRequest request) {
        return ApiResponse.<GiangVienResponse>builder()
                .result(giangVienService.updateGiangVien(id, request))
                .build();
    }

    @DeleteMapping("/{id}")
    ApiResponse<Void> deleteGiangVien(@PathVariable Integer id) {
        giangVienService.deleteGiangVien(id);
        return ApiResponse.<Void>builder().build();
    }
}
