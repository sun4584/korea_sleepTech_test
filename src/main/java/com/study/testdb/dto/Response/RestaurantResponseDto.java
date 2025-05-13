package com.study.testdb.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class RestaurantResponseDto {

    private Long id;
    private String name;
    private String address;
    private String phoneNumber;

}
