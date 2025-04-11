package com.qlcldt.backend.mapper;

import com.qlcldt.backend.dto.request.KhungChuongTrinhRequest;
import com.qlcldt.backend.dto.response.KhungChuongTrinhResponse;
import com.qlcldt.backend.entity.KhungChuongTrinh;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface KhungChuongTrinhMapper {
    @Mapping(target = "id", ignore = true)
    KhungChuongTrinh toEntity(KhungChuongTrinhRequest request);
    KhungChuongTrinhResponse toResponse(KhungChuongTrinh entity);
}
