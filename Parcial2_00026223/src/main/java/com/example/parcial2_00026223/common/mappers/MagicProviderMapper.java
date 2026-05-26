package com.example.parcial2_00026223.common.mappers;

import com.example.parcial2_00026223.domain.dto.response.article.MagicArticleResponse;
import com.example.parcial2_00026223.domain.dto.response.provider.MagicProviderResponse;
import com.example.parcial2_00026223.domain.entities.MagicProvider;

public class MagicProviderMapper {

    public MagicProviderResponse toDto(MagicProviderResponse magicProviderResponse){
        return MagicProviderResponse.builder()
                .name(magicProviderResponse.getName())
                .type(magicProviderResponse.getType())
                .build();
    }
}
