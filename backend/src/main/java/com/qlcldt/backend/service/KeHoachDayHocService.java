package com.qlcldt.backend.service;

import com.qlcldt.backend.dto.request.KeHoachDayHocRequest;
import com.qlcldt.backend.dto.response.KeHoachDayHocResponse;
import com.qlcldt.backend.entity.KeHoachDayHoc;
import com.qlcldt.backend.exeption.AppException;
import com.qlcldt.backend.exeption.ErrorCode;
import com.qlcldt.backend.mapper.KeHoachDayHocMapper;
import com.qlcldt.backend.repository.KeHoachDayHocRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class KeHoachDayHocService {
    KeHoachDayHocRepository keHoachDayHocRepository;
    KeHoachDayHocMapper keHoachDayHocMapper;

    public KeHoachDayHocResponse createKeHoachDayHoc(KeHoachDayHocRequest request) {
        KeHoachDayHoc keHoachDayHoc = keHoachDayHocMapper.toEntity(request);
        keHoachDayHoc = keHoachDayHocRepository.save(keHoachDayHoc);
        return keHoachDayHocMapper.toResponse(keHoachDayHoc);
    }

    public KeHoachDayHocResponse getKeHoachDayHocById(Integer id) {
        KeHoachDayHoc keHoachDayHoc = keHoachDayHocRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED));
        return keHoachDayHocMapper.toResponse(keHoachDayHoc);
    }

    public List<KeHoachDayHocResponse> getAllKeHoachDayHoc() {
        return keHoachDayHocRepository.findAll()
                .stream()
                .map(keHoachDayHocMapper::toResponse)
                .toList();
    }

    public KeHoachDayHocResponse updateKeHoachDayHoc(Integer id, KeHoachDayHocRequest request) {
        KeHoachDayHoc keHoachDayHoc = keHoachDayHocRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED));
        keHoachDayHocMapper.updateKeHoachDayHoc(keHoachDayHoc, request);
        keHoachDayHoc = keHoachDayHocRepository.save(keHoachDayHoc);
        return keHoachDayHocMapper.toResponse(keHoachDayHoc);
    }

    public void deleteKeHoachDayHoc(Integer id) {
        if (!keHoachDayHocRepository.existsById(id)) {
            throw new AppException(ErrorCode.USER_NOT_EXISTED);
        }
        keHoachDayHocRepository.deleteById(id);
    }
}
