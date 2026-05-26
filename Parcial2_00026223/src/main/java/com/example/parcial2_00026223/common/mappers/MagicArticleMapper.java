package com.example.parcial2_00026223.common.mappers;
import com.example.parcial2_00026223.domain.dto.response.article.MagicArticleResponse;

import static org.springframework.data.util.TypeUtils.type;


public class MagicArticleMapper {
    public MagicArticleResponse toDto(MagicArticleResponse magicArticleResponse) {
        return MagicArticleResponse.builder()
                .name(magicArticleResponse.getName())
                .type(magicArticleResponse.getType())
                .price(magicArticleResponse.getPrice())
                .magicProvider(magicArticleResponse.getMagicProvider())
                .build();
    }



}


