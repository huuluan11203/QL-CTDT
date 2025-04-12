package com.qlcldt.backend.controller;

import com.qlcldt.backend.dto.request.ThongTinChungRequest;
import com.qlcldt.backend.dto.response.ApiResponse;
import com.qlcldt.backend.dto.response.ThongTinChungResponse;
import com.qlcldt.backend.service.ThongTinChungService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/thong-tin-chung")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ThongTinChungController {
    ThongTinChungService thongTinChungService;

    @PostMapping
    ApiResponse<ThongTinChungResponse> createThongTinChung(@RequestBody @Valid ThongTinChungRequest request) {
        return ApiResponse.<ThongTinChungResponse>builder()
                .result(thongTinChungService.createThongTinChung(request))
                .build();
    }

    @GetMapping("/{id}")
    ApiResponse<ThongTinChungResponse> getThongTinChung(@PathVariable Integer id) {
        return ApiResponse.<ThongTinChungResponse>builder()
                .result(thongTinChungService.getThongTinChungById(id))
                .build();
    }

    @GetMapping
    ApiResponse<List<ThongTinChungResponse>> getAllThongTinChung() {
        return ApiResponse.<List<ThongTinChungResponse>>builder()
                .result(thongTinChungService.getAllThongTinChung())
                .build();
    }

    @PutMapping("/{id}")
    ApiResponse<ThongTinChungResponse> updateThongTinChung(@PathVariable Integer id, @RequestBody @Valid ThongTinChungRequest request) {
        return ApiResponse.<ThongTinChungResponse>builder()
                .result(thongTinChungService.updateThongTinChung(id, request))
                .build();
    }

    @DeleteMapping("/{id}")
    ApiResponse<Void> deleteThongTinChung(@PathVariable Integer id) {
        thongTinChungService.deleteThongTinChung(id);
        return ApiResponse.<Void>builder().build();
    }
}
