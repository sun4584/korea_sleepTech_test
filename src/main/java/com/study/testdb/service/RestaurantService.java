package com.study.testdb.service;

import com.study.testdb.dto.Request.PostRestaurantRequestDto;
import com.study.testdb.dto.Response.PostRestaurantResponseDto;
import com.study.testdb.entity.RestaurantEntity;
import com.study.testdb.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public PostRestaurantResponseDto createRestaurant(PostRestaurantRequestDto dto) {
        RestaurantEntity entity = RestaurantEntity.builder()
                .name(dto.getName())
                .address(dto.getAddress())
                .phoneNumber(dto.getPhoneNumber())
                .build();

        RestaurantEntity saved = (RestaurantEntity) restaurantRepository.save(entity);

        return new PostRestaurantResponseDto(
                saved.getId(),
                saved.getName(),
                saved.getAddress(),
                saved.getPhoneNumber()
        );
    }
}
