package com.qlcldt.backend.mapper;

import com.qlcldt.backend.dto.request.ThongTinChungRequest;
import com.qlcldt.backend.dto.response.ThongTinChungResponse;
import com.qlcldt.backend.entity.ThongTinChung;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ThongTinChungMapper {
    @Mapping(target = "id", ignore = true)
    ThongTinChung toEntity(ThongTinChungRequest request);
    ThongTinChungResponse toResponse(ThongTinChung entity);
}
