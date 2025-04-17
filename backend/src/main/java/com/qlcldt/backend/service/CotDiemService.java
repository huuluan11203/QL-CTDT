package com.qlcldt.backend.service;

import com.qlcldt.backend.dto.request.CotDiemRequest;
import com.qlcldt.backend.dto.response.CotDiemResponse;
import com.qlcldt.backend.entity.CotDiem;
import com.qlcldt.backend.exeption.AppException;
import com.qlcldt.backend.exeption.ErrorCode;
import com.qlcldt.backend.mapper.CotDiemMapper;
import com.qlcldt.backend.repository.CotDiemRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class CotDiemService {
    CotDiemRepository cotDiemRepository;
    CotDiemMapper cotDiemMapper;

    public CotDiemResponse createCotDiem(CotDiemRequest request) {
        CotDiem cotDiem = cotDiemMapper.toEntity(request);
        try {
            cotDiem = cotDiemRepository.save(cotDiem);
        } catch (DataIntegrityViolationException exception) {
            throw new AppException(ErrorCode.EXISTED);
        }

        return cotDiemMapper.toResponse(cotDiem);
    }

    public CotDiemResponse getCotDiemById(Integer id) {
        CotDiem cotDiem = cotDiemRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
        return cotDiemMapper.toResponse(cotDiem);
    }

    public List<CotDiemResponse> getAllCotDiem() {
        return cotDiemRepository.findAll()
                .stream()
                .map(cotDiemMapper::toResponse)
                .toList();
    }

    public CotDiemResponse updateCotDiem(Integer id, CotDiemRequest request) {
        CotDiem cotDiem = cotDiemRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
        cotDiemMapper.updateCotDiem(cotDiem, request);
        cotDiem = cotDiemRepository.save(cotDiem);
        return cotDiemMapper.toResponse(cotDiem);
    }

    public void deleteCotDiem(Integer id) {
        if (!cotDiemRepository.existsById(id)) {
            throw new AppException(ErrorCode.NOT_EXISTED);
        }
        cotDiemRepository.deleteById(id);
    }
}
