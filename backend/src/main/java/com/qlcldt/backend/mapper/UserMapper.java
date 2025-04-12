package com.qlcldt.backend.mapper;

import com.qlcldt.backend.dto.request.UserCreationRequest;
import com.qlcldt.backend.dto.request.UserUpdateRequest;
import com.qlcldt.backend.dto.response.UserResponse;
import com.qlcldt.backend.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    User toEntity(UserCreationRequest request);

    UserResponse toResponse(User entity);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}

