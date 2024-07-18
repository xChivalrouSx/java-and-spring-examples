package com.chivalrous.map.struct.example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.chivalrous.map.struct.example.dto.CustomEchoRequest;
import com.chivalrous.map.struct.example.dto.CustomEchoResponse;

@Mapper(componentModel = "spring")
public interface CustomEchoMapper {

    @Mapping(target = "innerId", source = "innerObject.id")
    CustomEchoResponse requestToResponse(CustomEchoRequest request);

}
