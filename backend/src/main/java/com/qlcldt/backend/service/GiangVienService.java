package com.qlcldt.backend.service;

import com.qlcldt.backend.dto.request.GiangVienRequest;
import com.qlcldt.backend.dto.response.GiangVienResponse;
import com.qlcldt.backend.entity.GiangVien;
import com.qlcldt.backend.exeption.AppException;
import com.qlcldt.backend.exeption.ErrorCode;
import com.qlcldt.backend.mapper.GiangVienMapper;
import com.qlcldt.backend.repository.GiangVienRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class GiangVienService {
    GiangVienRepository giangVienRepository;
    GiangVienMapper giangVienMapper;

    public GiangVienResponse createGiangVien(GiangVienRequest request) {
        GiangVien giangVien = giangVienMapper.toEntity(request);
        giangVien = giangVienRepository.save(giangVien);
        return giangVienMapper.toResponse(giangVien);
    }

    public GiangVienResponse getGiangVienById(Integer id) {
        GiangVien giangVien = giangVienRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED));
        return giangVienMapper.toResponse(giangVien);
    }

    public List<GiangVienResponse> getAllGiangVien() {
        return giangVienRepository.findAll()
                .stream()
                .map(giangVienMapper::toResponse)
                .toList();
    }

    public GiangVienResponse updateGiangVien(Integer id, GiangVienRequest request) {
        GiangVien giangVien = giangVienRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED));
        giangVienMapper.updateGiangVien(giangVien, request);
        giangVien = giangVienRepository.save(giangVien);
        return giangVienMapper.toResponse(giangVien);
    }

    public void deleteGiangVien(Integer id) {
        if (!giangVienRepository.existsById(id)) {
            throw new AppException(ErrorCode.USER_NOT_EXISTED);
        }
        giangVienRepository.deleteById(id);
    }
}
