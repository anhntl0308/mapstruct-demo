package com.example.demomapstruct.mapper;

import org.mapstruct.Mapper;

public interface AbstractMapper<T,Y> {
     Y toDto(T entity);
     T toEntity(Y dto);
}
