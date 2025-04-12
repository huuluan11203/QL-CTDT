package com.qlcldt.backend.controller;

import com.qlcldt.backend.dto.request.KeHoachDayHocRequest;
import com.qlcldt.backend.dto.response.ApiResponse;
import com.qlcldt.backend.dto.response.KeHoachDayHocResponse;
import com.qlcldt.backend.service.KeHoachDayHocService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ke-hoach-day-hoc")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class KeHoachDayHocController {
    KeHoachDayHocService keHoachDayHocService;

    @PostMapping
    ApiResponse<KeHoachDayHocResponse> createKeHoachDayHoc(@RequestBody @Valid KeHoachDayHocRequest request) {
        return ApiResponse.<KeHoachDayHocResponse>builder()
                .result(keHoachDayHocService.createKeHoachDayHoc(request))
                .build();
    }

    @GetMapping("/{id}")
    ApiResponse<KeHoachDayHocResponse> getKeHoachDayHoc(@PathVariable Integer id) {
        return ApiResponse.<KeHoachDayHocResponse>builder()
                .result(keHoachDayHocService.getKeHoachDayHocById(id))
                .build();
    }

    @GetMapping
    ApiResponse<List<KeHoachDayHocResponse>> getAllKeHoachDayHoc() {
        return ApiResponse.<List<KeHoachDayHocResponse>>builder()
                .result(keHoachDayHocService.getAllKeHoachDayHoc())
                .build();
    }

    @PutMapping("/{id}")
    ApiResponse<KeHoachDayHocResponse> updateKeHoachDayHoc(@PathVariable Integer id, @RequestBody @Valid KeHoachDayHocRequest request) {
        return ApiResponse.<KeHoachDayHocResponse>builder()
                .result(keHoachDayHocService.updateKeHoachDayHoc(id, request))
                .build();
    }

    @DeleteMapping("/{id}")
    ApiResponse<Void> deleteKeHoachDayHoc(@PathVariable Integer id) {
        keHoachDayHocService.deleteKeHoachDayHoc(id);
        return ApiResponse.<Void>builder().build();
    }
}
