package com.qlcldt.backend.mapper;

import com.qlcldt.backend.dto.request.CotDiemRequest;
import com.qlcldt.backend.dto.response.CotDiemResponse;
import com.qlcldt.backend.entity.CotDiem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CotDiemMapper {
    @Mapping(target = "id", ignore = true)
    CotDiem toEntity(CotDiemRequest request);
    CotDiemResponse toResponse(CotDiem entity);
}
