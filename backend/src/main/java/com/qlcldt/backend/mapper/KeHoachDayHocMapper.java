package com.qlcldt.backend.mapper;

import com.qlcldt.backend.dto.request.KeHoachDayHocRequest;
import com.qlcldt.backend.dto.response.KeHoachDayHocResponse;
import com.qlcldt.backend.entity.KeHoachDayHoc;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface KeHoachDayHocMapper {
    @Mapping(target = "id", ignore = true)
    KeHoachDayHoc toEntity(KeHoachDayHocRequest request);

    KeHoachDayHocResponse toResponse(KeHoachDayHoc entity);

    void updateKeHoachDayHoc(@MappingTarget KeHoachDayHoc keHoachDayHoc, KeHoachDayHocRequest request);
}
