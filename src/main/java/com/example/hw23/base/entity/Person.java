package com.example.hw23.base.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@MappedSuperclass
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person extends BaseEntity{
    String name;
    long NationalCode;
    LocalDate age ;
}
