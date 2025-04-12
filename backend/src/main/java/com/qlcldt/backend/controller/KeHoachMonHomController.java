package com.qlcldt.backend.controller;

import com.qlcldt.backend.dto.request.KeHoachMonHomRequest;
import com.qlcldt.backend.dto.response.ApiResponse;
import com.qlcldt.backend.dto.response.KeHoachMonHomResponse;
import com.qlcldt.backend.service.KeHoachMonHomService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ke-hoach-mon-hom")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class KeHoachMonHomController {
    KeHoachMonHomService keHoachMonHomService;

    @PostMapping
    ApiResponse<KeHoachMonHomResponse> createKeHoachMonHom(@RequestBody @Valid KeHoachMonHomRequest request) {
        return ApiResponse.<KeHoachMonHomResponse>builder()
                .result(keHoachMonHomService.createKeHoachMonHom(request))
                .build();
    }

    @GetMapping("/{id}")
    ApiResponse<KeHoachMonHomResponse> getKeHoachMonHom(@PathVariable Integer id) {
        return ApiResponse.<KeHoachMonHomResponse>builder()
                .result(keHoachMonHomService.getKeHoachMonHomById(id))
                .build();
    }

    @GetMapping
    ApiResponse<List<KeHoachMonHomResponse>> getAllKeHoachMonHom() {
        return ApiResponse.<List<KeHoachMonHomResponse>>builder()
                .result(keHoachMonHomService.getAllKeHoachMonHom())
                .build();
    }

    @PutMapping("/{id}")
    ApiResponse<KeHoachMonHomResponse> updateKeHoachMonHom(@PathVariable Integer id, @RequestBody @Valid KeHoachMonHomRequest request) {
        return ApiResponse.<KeHoachMonHomResponse>builder()
                .result(keHoachMonHomService.updateKeHoachMonHom(id, request))
                .build();
    }

    @DeleteMapping("/{id}")
    ApiResponse<Void> deleteKeHoachMonHom(@PathVariable Integer id) {
        keHoachMonHomService.deleteKeHoachMonHom(id);
        return ApiResponse.<Void>builder().build();
    }
}
