package com.qlcldt.backend.mapper;

import com.qlcldt.backend.dto.request.PhanCongGiangDayRequest;
import com.qlcldt.backend.dto.response.PhanCongGiangDayResponse;
import com.qlcldt.backend.entity.PhanCongGiangDay;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PhanCongGiangDayMapper {
    @Mapping(target = "id", ignore = true)
    PhanCongGiangDay toEntity(PhanCongGiangDayRequest request);
    PhanCongGiangDayResponse toResponse(PhanCongGiangDay entity);
}
