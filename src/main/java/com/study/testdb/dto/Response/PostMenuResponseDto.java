package com.study.testdb.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostMenuResponseDto {

    private Long id;
    private String name;
    private Double price;
    private String description;
    private Long restaurantId;

}

















