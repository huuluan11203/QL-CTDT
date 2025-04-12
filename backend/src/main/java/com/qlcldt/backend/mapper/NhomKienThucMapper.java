package com.qlcldt.backend.mapper;

import com.qlcldt.backend.dto.request.NhomKienThucRequest;
import com.qlcldt.backend.dto.response.NhomKienThucResponse;
import com.qlcldt.backend.entity.NhomKienThuc;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface NhomKienThucMapper {
    @Mapping(target = "id", ignore = true)
    NhomKienThuc toEntity(NhomKienThucRequest request);
    NhomKienThucResponse toResponse(NhomKienThuc entity);
    void updateNhomKienThuc(@MappingTarget NhomKienThuc nhomKienThuc, NhomKienThucRequest request);
}
