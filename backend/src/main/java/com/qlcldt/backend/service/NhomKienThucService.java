package com.qlcldt.backend.service;

import com.qlcldt.backend.dto.request.NhomKienThucRequest;
import com.qlcldt.backend.dto.response.NhomKienThucResponse;
import com.qlcldt.backend.entity.NhomKienThuc;
import com.qlcldt.backend.exeption.AppException;
import com.qlcldt.backend.exeption.ErrorCode;
import com.qlcldt.backend.mapper.NhomKienThucMapper;
import com.qlcldt.backend.repository.NhomKienThucRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class NhomKienThucService {
    NhomKienThucRepository nhomKienThucRepository;
    NhomKienThucMapper nhomKienThucMapper;

    public NhomKienThucResponse createNhomKienThuc(NhomKienThucRequest request) {
        NhomKienThuc nhomKienThuc = nhomKienThucMapper.toEntity(request);
        nhomKienThuc = nhomKienThucRepository.save(nhomKienThuc);
        return nhomKienThucMapper.toResponse(nhomKienThuc);
    }

    public NhomKienThucResponse getNhomKienThucById(Integer id) {
        NhomKienThuc nhomKienThuc = nhomKienThucRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED));
        return nhomKienThucMapper.toResponse(nhomKienThuc);
    }

    public List<NhomKienThucResponse> getAllNhomKienThuc() {
        return nhomKienThucRepository.findAll()
                .stream()
                .map(nhomKienThucMapper::toResponse)
                .toList();
    }

    public NhomKienThucResponse updateNhomKienThuc(Integer id, NhomKienThucRequest request) {
        NhomKienThuc nhomKienThuc = nhomKienThucRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED));
        nhomKienThucMapper.updateNhomKienThuc(nhomKienThuc, request);
        nhomKienThuc = nhomKienThucRepository.save(nhomKienThuc);
        return nhomKienThucMapper.toResponse(nhomKienThuc);
    }

    public void deleteNhomKienThuc(Integer id) {
        if (!nhomKienThucRepository.existsById(id)) {
            throw new AppException(ErrorCode.USER_NOT_EXISTED);
        }
        nhomKienThucRepository.deleteById(id);
    }
}
