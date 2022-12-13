package com.example.demomapstruct.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private String fullName;
    private int age;
    private String address;

    public String getFirstName(){
        return fullName.split(" ")[0];
    }

    public String getLastName(){
        return fullName.split(" ")[1];
    }

}
