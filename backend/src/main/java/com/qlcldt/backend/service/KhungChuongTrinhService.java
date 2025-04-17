package com.qlcldt.backend.service;

import com.qlcldt.backend.dto.request.KhungChuongTrinhRequest;
import com.qlcldt.backend.dto.response.KhungChuongTrinhResponse;
import com.qlcldt.backend.entity.KhungChuongTrinh;
import com.qlcldt.backend.exeption.AppException;
import com.qlcldt.backend.exeption.ErrorCode;
import com.qlcldt.backend.mapper.KhungChuongTrinhMapper;
import com.qlcldt.backend.repository.KhungChuongTrinhRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class KhungChuongTrinhService {
    KhungChuongTrinhRepository khungChuongTrinhRepository;
    KhungChuongTrinhMapper khungChuongTrinhMapper;

    public KhungChuongTrinhResponse createKhungChuongTrinh(KhungChuongTrinhRequest request) {
        KhungChuongTrinh khungChuongTrinh = khungChuongTrinhMapper.toEntity(request);
        try {
            khungChuongTrinh = khungChuongTrinhRepository.save(khungChuongTrinh);
        } catch (DataIntegrityViolationException exception) {
            throw new AppException(ErrorCode.EXISTED);
        }
        return khungChuongTrinhMapper.toResponse(khungChuongTrinh);
    }

    public KhungChuongTrinhResponse getKhungChuongTrinhById(Integer id) {
        KhungChuongTrinh khungChuongTrinh = khungChuongTrinhRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
        return khungChuongTrinhMapper.toResponse(khungChuongTrinh);
    }

    public List<KhungChuongTrinhResponse> getAllKhungChuongTrinh() {
        return khungChuongTrinhRepository.findAll()
                .stream()
                .map(khungChuongTrinhMapper::toResponse)
                .toList();
    }

    public KhungChuongTrinhResponse updateKhungChuongTrinh(Integer id, KhungChuongTrinhRequest request) {
        KhungChuongTrinh khungChuongTrinh = khungChuongTrinhRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
        khungChuongTrinhMapper.updateKhungChuongTrinh(khungChuongTrinh, request);
        khungChuongTrinh = khungChuongTrinhRepository.save(khungChuongTrinh);
        return khungChuongTrinhMapper.toResponse(khungChuongTrinh);
    }

    public void deleteKhungChuongTrinh(Integer id) {
        if (!khungChuongTrinhRepository.existsById(id)) {
            throw new AppException(ErrorCode.NOT_EXISTED);
        }
        khungChuongTrinhRepository.deleteById(id);
    }
}
