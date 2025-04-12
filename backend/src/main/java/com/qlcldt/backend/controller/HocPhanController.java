package com.qlcldt.backend.controller;

import com.qlcldt.backend.dto.request.HocPhanRequest;
import com.qlcldt.backend.dto.response.ApiResponse;
import com.qlcldt.backend.dto.response.HocPhanResponse;
import com.qlcldt.backend.service.HocPhanService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hoc-phan")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class HocPhanController {
    HocPhanService hocPhanService;

    @PostMapping
    ApiResponse<HocPhanResponse> createHocPhan(@RequestBody @Valid HocPhanRequest request) {
        return ApiResponse.<HocPhanResponse>builder()
                .result(hocPhanService.createHocPhan(request))
                .build();
    }

    @GetMapping("/{id}")
    ApiResponse<HocPhanResponse> getHocPhan(@PathVariable Integer id) {
        return ApiResponse.<HocPhanResponse>builder()
                .result(hocPhanService.getHocPhanById(id))
                .build();
    }

    @GetMapping
    ApiResponse<List<HocPhanResponse>> getAllHocPhan() {
        return ApiResponse.<List<HocPhanResponse>>builder()
                .result(hocPhanService.getAllHocPhan())
                .build();
    }

    @PutMapping("/{id}")
    ApiResponse<HocPhanResponse> updateHocPhan(@PathVariable Integer id, @RequestBody @Valid HocPhanRequest request) {
        return ApiResponse.<HocPhanResponse>builder()
                .result(hocPhanService.updateHocPhan(id, request))
                .build();
    }

    @DeleteMapping("/{id}")
    ApiResponse<Void> deleteHocPhan(@PathVariable Integer id) {
        hocPhanService.deleteHocPhan(id);
        return ApiResponse.<Void>builder().build();
    }
}
