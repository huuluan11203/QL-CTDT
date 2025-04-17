package com.qlcldt.backend.service;

import com.qlcldt.backend.dto.request.KhungChuongTrinhNhomKienThucRequest;
import com.qlcldt.backend.dto.response.KhungChuongTrinhNhomKienThucResponse;
import com.qlcldt.backend.entity.KhungChuongTrinhNhomKienThuc;
import com.qlcldt.backend.exeption.AppException;
import com.qlcldt.backend.exeption.ErrorCode;
import com.qlcldt.backend.mapper.KhungChuongTrinhNhomKienThucMapper;
import com.qlcldt.backend.repository.KhungChuongTrinhNhomKienThucRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class KhungChuongTrinhNhomKienThucService {
    KhungChuongTrinhNhomKienThucRepository repository;
    KhungChuongTrinhNhomKienThucMapper mapper;

    public KhungChuongTrinhNhomKienThucResponse create(KhungChuongTrinhNhomKienThucRequest request) {
        KhungChuongTrinhNhomKienThuc entity = mapper.toEntity(request);
        try {
            entity = repository.save(entity);
        } catch (DataIntegrityViolationException exception) {
            throw new AppException(ErrorCode.EXISTED);
        }
        return mapper.toResponse(entity);
    }

    public KhungChuongTrinhNhomKienThucResponse getById(Integer id) {
        KhungChuongTrinhNhomKienThuc entity = repository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
        return mapper.toResponse(entity);
    }

    public List<KhungChuongTrinhNhomKienThucResponse> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    public KhungChuongTrinhNhomKienThucResponse update(Integer id, KhungChuongTrinhNhomKienThucRequest request) {
        KhungChuongTrinhNhomKienThuc entity = repository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.NOT_EXISTED));
        mapper.update(entity, request);
        entity = repository.save(entity);
        return mapper.toResponse(entity);
    }

    public void delete(Integer id) {
        if (!repository.existsById(id)) {
            throw new AppException(ErrorCode.NOT_EXISTED);
        }
        repository.deleteById(id);
    }
}
