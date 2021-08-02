package com.nisum.exercise5.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Employee {

    private int id;
    private int age;
    private String firstName;
    private String lastName;
    private String position;
}
