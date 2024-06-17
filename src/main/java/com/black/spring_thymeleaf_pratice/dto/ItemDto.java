package com.black.spring_thymeleaf_pratice.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class ItemDto {
    private Long id;
    private String itemNm; //상품명
    private Integer price; //가격
    private String itemDetail; //상품설명
    private String sellStatCd;
    private LocalDateTime regTime; //상품등록일
    private LocalDateTime updateTime;
}