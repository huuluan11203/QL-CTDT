package com.qlcldt.backend.mapper;

import com.qlcldt.backend.dto.request.DeCuongChiTietRequest;
import com.qlcldt.backend.dto.response.DeCuongChiTietResponse;
import com.qlcldt.backend.entity.DeCuongChiTiet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface DeCuongChiTietMapper {
    @Mapping(target = "id", ignore = true)
    DeCuongChiTiet toEntity(DeCuongChiTietRequest request);
    DeCuongChiTietResponse toResponse(DeCuongChiTiet entity);
    void updateDeCuongChiTiet(@MappingTarget DeCuongChiTiet deCuongChiTiet, DeCuongChiTietRequest request);
}
