package com.qlcldt.backend.mapper;

import com.qlcldt.backend.dto.request.KhungChuongTrinhNhomKienThucRequest;
import com.qlcldt.backend.dto.response.KhungChuongTrinhNhomKienThucResponse;
import com.qlcldt.backend.entity.KhungChuongTrinhNhomKienThuc;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface KhungChuongTrinhNhomKienThucMapper {
    @Mapping(target = "id", ignore = true)
    KhungChuongTrinhNhomKienThuc toEntity(KhungChuongTrinhNhomKienThucRequest request);

    KhungChuongTrinhNhomKienThucResponse toResponse(KhungChuongTrinhNhomKienThuc entity);

    void update(@MappingTarget KhungChuongTrinhNhomKienThuc entity, KhungChuongTrinhNhomKienThucRequest request);
}
