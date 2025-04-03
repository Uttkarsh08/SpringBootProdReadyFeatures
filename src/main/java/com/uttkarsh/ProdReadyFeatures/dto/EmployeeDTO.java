package com.uttkarsh.ProdReadyFeatures.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

//DTO(data Transfer Object) is a design pattern to transfer data b/w controller(presentation layer) and service layer
//it enables encapsulation and security
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDTO {

    private Long id;

    private String name;

    private String email;

    private Integer age;

    private String role; //ADMIN or USER

    private Integer salary;

    private LocalDate joiningDate;

    private boolean isActive;
}