package com.study.testdb.controller;

import com.study.testdb.dto.Request.PostRestaurantRequestDto;
import com.study.testdb.dto.Response.PostRestaurantResponseDto;
import com.study.testdb.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/restaurant")
@RequiredArgsConstructor
public class PostRestaurantController {

    private final RestaurantService restaurantService;

    @PostMapping
    public ResponseEntity<PostRestaurantResponseDto> create(
            @RequestBody PostRestaurantRequestDto dto
    ) {
        PostRestaurantResponseDto response = restaurantService.createRestaurant(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
