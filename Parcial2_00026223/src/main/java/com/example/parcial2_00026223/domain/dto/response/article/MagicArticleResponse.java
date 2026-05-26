package com.example.parcial2_00026223.domain.dto.response.article;

import com.example.parcial2_00026223.domain.entities.MagicProvider;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MagicArticleResponse {
    private String name;
    private Enum type;
    private double price;
    private MagicProvider magicProvider;
}
