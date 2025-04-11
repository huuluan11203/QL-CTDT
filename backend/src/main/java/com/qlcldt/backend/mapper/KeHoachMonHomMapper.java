package com.qlcldt.backend.mapper;

import com.qlcldt.backend.dto.request.KeHoachMonHomRequest;
import com.qlcldt.backend.dto.response.KeHoachMonHomResponse;
import com.qlcldt.backend.entity.KeHoachMonHom;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface KeHoachMonHomMapper {
    @Mapping(target = "id", ignore = true)
    KeHoachMonHom toEntity(KeHoachMonHomRequest request);
    KeHoachMonHomResponse toResponse(KeHoachMonHom entity);
}
