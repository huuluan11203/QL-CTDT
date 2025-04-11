package com.qlcldt.backend.mapper;

import com.qlcldt.backend.dto.request.HocPhanRequest;
import com.qlcldt.backend.dto.response.HocPhanResponse;
import com.qlcldt.backend.entity.HocPhan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface HocPhanMapper {
    @Mapping(target = "id", ignore = true)
    HocPhan toEntity(HocPhanRequest request);
    HocPhanResponse toResponse(HocPhan entity);
}
