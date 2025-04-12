package com.qlcldt.backend.service;

import com.qlcldt.backend.dto.request.ThongTinChungRequest;
import com.qlcldt.backend.dto.response.ThongTinChungResponse;
import com.qlcldt.backend.entity.ThongTinChung;
import com.qlcldt.backend.exeption.AppException;
import com.qlcldt.backend.exeption.ErrorCode;
import com.qlcldt.backend.mapper.ThongTinChungMapper;
import com.qlcldt.backend.repository.ThongTinChungRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class ThongTinChungService {
    ThongTinChungRepository thongTinChungRepository;
    ThongTinChungMapper thongTinChungMapper;

    public ThongTinChungResponse createThongTinChung(ThongTinChungRequest request) {
        ThongTinChung thongTinChung = thongTinChungMapper.toEntity(request);
        thongTinChung = thongTinChungRepository.save(thongTinChung);
        return thongTinChungMapper.toResponse(thongTinChung);
    }

    public ThongTinChungResponse getThongTinChungById(Integer id) {
        ThongTinChung thongTinChung = thongTinChungRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED));
        return thongTinChungMapper.toResponse(thongTinChung);
    }

    public List<ThongTinChungResponse> getAllThongTinChung() {
        return thongTinChungRepository.findAll()
                .stream()
                .map(thongTinChungMapper::toResponse)
                .toList();
    }

    public ThongTinChungResponse updateThongTinChung(Integer id, ThongTinChungRequest request) {
        ThongTinChung thongTinChung = thongTinChungRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED));
        thongTinChungMapper.updateThongTinChung(thongTinChung, request);
        thongTinChung = thongTinChungRepository.save(thongTinChung);
        return thongTinChungMapper.toResponse(thongTinChung);
    }

    public void deleteThongTinChung(Integer id) {
        if (!thongTinChungRepository.existsById(id)) {
            throw new AppException(ErrorCode.USER_NOT_EXISTED);
        }
        thongTinChungRepository.deleteById(id);
    }
}
