package com.qlcldt.backend.service;

import com.qlcldt.backend.dto.request.PhanCongGiangDayRequest;
import com.qlcldt.backend.dto.response.PhanCongGiangDayResponse;
import com.qlcldt.backend.entity.PhanCongGiangDay;
import com.qlcldt.backend.exeption.AppException;
import com.qlcldt.backend.exeption.ErrorCode;
import com.qlcldt.backend.mapper.PhanCongGiangDayMapper;
import com.qlcldt.backend.repository.PhanCongGiangDayRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class PhanCongGiangDayService {
    PhanCongGiangDayRepository phanCongGiangDayRepository;
    PhanCongGiangDayMapper phanCongGiangDayMapper;

    public PhanCongGiangDayResponse createPhanCongGiangDay(PhanCongGiangDayRequest request) {
        PhanCongGiangDay phanCongGiangDay = phanCongGiangDayMapper.toEntity(request);
        phanCongGiangDay = phanCongGiangDayRepository.save(phanCongGiangDay);
        return phanCongGiangDayMapper.toResponse(phanCongGiangDay);
    }

    public PhanCongGiangDayResponse getPhanCongGiangDayById(Integer id) {
        PhanCongGiangDay phanCongGiangDay = phanCongGiangDayRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED));
        return phanCongGiangDayMapper.toResponse(phanCongGiangDay);
    }

    public List<PhanCongGiangDayResponse> getAllPhanCongGiangDay() {
        return phanCongGiangDayRepository.findAll()
                .stream()
                .map(phanCongGiangDayMapper::toResponse)
                .toList();
    }

    public PhanCongGiangDayResponse updatePhanCongGiangDay(Integer id, PhanCongGiangDayRequest request) {
        PhanCongGiangDay phanCongGiangDay = phanCongGiangDayRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED));
        phanCongGiangDayMapper.updatePhanCongGiangDay(phanCongGiangDay, request);
        phanCongGiangDay = phanCongGiangDayRepository.save(phanCongGiangDay);
        return phanCongGiangDayMapper.toResponse(phanCongGiangDay);
    }

    public void deletePhanCongGiangDay(Integer id) {
        if (!phanCongGiangDayRepository.existsById(id)) {
            throw new AppException(ErrorCode.USER_NOT_EXISTED);
        }
        phanCongGiangDayRepository.deleteById(id);
    }
}
