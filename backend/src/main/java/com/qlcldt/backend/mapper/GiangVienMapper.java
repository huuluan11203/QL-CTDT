package com.qlcldt.backend.mapper;

import com.qlcldt.backend.dto.request.GiangVienRequest;
import com.qlcldt.backend.dto.response.GiangVienResponse;
import com.qlcldt.backend.entity.GiangVien;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GiangVienMapper {
    @Mapping(target = "id", ignore = true)
    GiangVien toEntity(GiangVienRequest request);
    GiangVienResponse toResponse(GiangVien entity);
}
