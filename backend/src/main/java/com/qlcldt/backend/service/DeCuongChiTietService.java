package com.qlcldt.backend.service;

import com.qlcldt.backend.dto.request.DeCuongChiTietRequest;
import com.qlcldt.backend.dto.response.DeCuongChiTietResponse;
import com.qlcldt.backend.entity.DeCuongChiTiet;
import com.qlcldt.backend.exeption.AppException;
import com.qlcldt.backend.exeption.ErrorCode;
import com.qlcldt.backend.mapper.DeCuongChiTietMapper;
import com.qlcldt.backend.repository.DeCuongChiTietRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class DeCuongChiTietService {
    DeCuongChiTietRepository deCuongChiTietRepository;
    DeCuongChiTietMapper deCuongChiTietMapper;

    public DeCuongChiTietResponse createDeCuongChiTiet(DeCuongChiTietRequest request) {
        DeCuongChiTiet deCuongChiTiet = deCuongChiTietMapper.toEntity(request);
        deCuongChiTiet = deCuongChiTietRepository.save(deCuongChiTiet);
        return deCuongChiTietMapper.toResponse(deCuongChiTiet);
    }

    public DeCuongChiTietResponse getDeCuongChiTietById(Integer id) {
        DeCuongChiTiet deCuongChiTiet = deCuongChiTietRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED));
        return deCuongChiTietMapper.toResponse(deCuongChiTiet);
    }

    public List<DeCuongChiTietResponse> getAllDeCuongChiTiet() {
        return deCuongChiTietRepository.findAll()
                .stream()
                .map(deCuongChiTietMapper::toResponse)
                .toList();
    }

    public DeCuongChiTietResponse updateDeCuongChiTiet(Integer id, DeCuongChiTietRequest request) {
        DeCuongChiTiet deCuongChiTiet = deCuongChiTietRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED));
        deCuongChiTietMapper.updateDeCuongChiTiet(deCuongChiTiet, request);
        deCuongChiTiet = deCuongChiTietRepository.save(deCuongChiTiet);
        return deCuongChiTietMapper.toResponse(deCuongChiTiet);
    }

    public void deleteDeCuongChiTiet(Integer id) {
        if (!deCuongChiTietRepository.existsById(id)) {
            throw new AppException(ErrorCode.USER_NOT_EXISTED);
        }
        deCuongChiTietRepository.deleteById(id);
    }
}
