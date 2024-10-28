package com.gjy.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class StudentRequest {

    private String name;

    private String stuNo;

    private Integer age;

}
