package com.qlcldt.backend.controller;

import com.qlcldt.backend.dto.request.CotDiemRequest;
import com.qlcldt.backend.dto.response.ApiResponse;
import com.qlcldt.backend.dto.response.CotDiemResponse;
import com.qlcldt.backend.service.CotDiemService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cot-diem")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CotDiemController {
    CotDiemService cotDiemService;

    @PostMapping
    ApiResponse<CotDiemResponse> createCotDiem(@RequestBody @Valid CotDiemRequest request) {
        return ApiResponse.<CotDiemResponse>builder()
                .result(cotDiemService.createCotDiem(request))
                .build();
    }

    @GetMapping("/{id}")
    ApiResponse<CotDiemResponse> getCotDiem(@PathVariable Integer id) {
        return ApiResponse.<CotDiemResponse>builder()
                .result(cotDiemService.getCotDiemById(id))
                .build();
    }

    @GetMapping
    ApiResponse<List<CotDiemResponse>> getAllCotDiem() {
        return ApiResponse.<List<CotDiemResponse>>builder()
                .result(cotDiemService.getAllCotDiem())
                .build();
    }

    @PutMapping("/{id}")
    ApiResponse<CotDiemResponse> updateCotDiem(@PathVariable Integer id, @RequestBody @Valid CotDiemRequest request) {
        return ApiResponse.<CotDiemResponse>builder()
                .result(cotDiemService.updateCotDiem(id, request))
                .build();
    }

    @DeleteMapping("/{id}")
    ApiResponse<Void> deleteCotDiem(@PathVariable Integer id) {
        cotDiemService.deleteCotDiem(id);
        return ApiResponse.<Void>builder().build();
    }
}
