package com.study.testdb.dto.Request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostMenuRequestDto {

    private String name;
    private Double price;
    private String description;
    private Long restaurantId;
}
