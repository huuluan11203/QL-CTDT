package com.qlcldt.backend.service;

import com.qlcldt.backend.dto.request.KeHoachMonHomRequest;
import com.qlcldt.backend.dto.response.KeHoachMonHomResponse;
import com.qlcldt.backend.entity.KeHoachMonHom;
import com.qlcldt.backend.exeption.AppException;
import com.qlcldt.backend.exeption.ErrorCode;
import com.qlcldt.backend.mapper.KeHoachMonHomMapper;
import com.qlcldt.backend.repository.KeHoachMonHomRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class KeHoachMonHomService {
    KeHoachMonHomRepository keHoachMonHomRepository;
    KeHoachMonHomMapper keHoachMonHomMapper;

    public KeHoachMonHomResponse createKeHoachMonHom(KeHoachMonHomRequest request) {
        KeHoachMonHom keHoachMonHom = keHoachMonHomMapper.toEntity(request);
        try {
            keHoachMonHom = keHoachMonHomRepository.save(keHoachMonHom);
        } catch (DataIntegrityViolationException exception) {
            throw new AppException(ErrorCode.EXISTED);
        }
        return keHoachMonHomMapper.toResponse(keHoachMonHom);
    }

    public KeHoachMonHomResponse getKeHoachMonHomById(Integer id) {
        KeHoachMonHom keHoachMonHom = keHoachMonHomRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
        return keHoachMonHomMapper.toResponse(keHoachMonHom);
    }

    public List<KeHoachMonHomResponse> getAllKeHoachMonHom() {
        return keHoachMonHomRepository.findAll()
                .stream()
                .map(keHoachMonHomMapper::toResponse)
                .toList();
    }

    public KeHoachMonHomResponse updateKeHoachMonHom(Integer id, KeHoachMonHomRequest request) {
        KeHoachMonHom keHoachMonHom = keHoachMonHomRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
        keHoachMonHomMapper.updateKeHoachMonHom(keHoachMonHom, request);
        keHoachMonHom = keHoachMonHomRepository.save(keHoachMonHom);
        return keHoachMonHomMapper.toResponse(keHoachMonHom);
    }

    public void deleteKeHoachMonHom(Integer id) {
        if (!keHoachMonHomRepository.existsById(id)) {
            throw new AppException(ErrorCode.NOT_EXISTED);
        }
        keHoachMonHomRepository.deleteById(id);
    }
}
