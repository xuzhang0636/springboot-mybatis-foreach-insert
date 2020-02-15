package com.xuzhang.springbootmybatisforeachinsert.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Long personId;
    private String name;
    private Integer age;
}
