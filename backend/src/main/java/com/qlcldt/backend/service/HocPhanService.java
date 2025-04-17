package com.qlcldt.backend.service;

import com.qlcldt.backend.dto.request.HocPhanRequest;
import com.qlcldt.backend.dto.response.HocPhanResponse;
import com.qlcldt.backend.entity.HocPhan;
import com.qlcldt.backend.exeption.AppException;
import com.qlcldt.backend.exeption.ErrorCode;
import com.qlcldt.backend.mapper.HocPhanMapper;
import com.qlcldt.backend.repository.HocPhanRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class HocPhanService {
    HocPhanRepository hocPhanRepository;
    HocPhanMapper hocPhanMapper;

    public HocPhanResponse createHocPhan(HocPhanRequest request) {
        HocPhan hocPhan = hocPhanMapper.toEntity(request);
        try {
            hocPhan = hocPhanRepository.save(hocPhan);
        } catch (DataIntegrityViolationException exception) {
            throw new AppException(ErrorCode.EXISTED);
        }

        return hocPhanMapper.toResponse(hocPhan);
    }

    public HocPhanResponse getHocPhanById(Integer id) {
        HocPhan hocPhan = hocPhanRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
        return hocPhanMapper.toResponse(hocPhan);
    }

    public List<HocPhanResponse> getAllHocPhan() {
        return hocPhanRepository.findAll()
                .stream()
                .map(hocPhanMapper::toResponse)
                .toList();
    }

    public HocPhanResponse updateHocPhan(Integer id, HocPhanRequest request) {
        HocPhan hocPhan = hocPhanRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
        hocPhanMapper.updateHocPhan(hocPhan, request);
        hocPhan = hocPhanRepository.save(hocPhan);
        return hocPhanMapper.toResponse(hocPhan);
    }

    public void deleteHocPhan(Integer id) {
        if (!hocPhanRepository.existsById(id)) {
            throw new AppException(ErrorCode.NOT_EXISTED);
        }
        hocPhanRepository.deleteById(id);
    }
}
