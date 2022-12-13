package com.example.demomapstruct.mapper;

import com.example.demomapstruct.dto.StudentDto;
import com.example.demomapstruct.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper()
public interface StudentMapper extends AbstractMapper<Student, StudentDto> {
//    @Mapping(source = ".", target = "fullName" , qualifiedByName="toFullName")
//    StudentDto toDto(Student entity);
//
//    @Named("toFullName")
//    default String translateToFullName(Student student) {
//        return student.getFirstName() +" "+ student.getLastName();
//    }
    @Mapping(target = "fullName", expression = "java(entity.getFirstName() + \" \" + entity.getLastName())")
    @Mapping(target = "address",source = "address.address")
    StudentDto toDto(Student entity);

    @Mapping(target = "firstName", expression = "java(dto.getFirstName())")
    @Mapping(target = "lastName", expression = "java(dto.getLastName())")
    @Mapping(target = "address.address",source = "address")
    Student toEntity(StudentDto dto);
}
