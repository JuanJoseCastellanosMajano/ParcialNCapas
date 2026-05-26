package com.example.parcial2_00026223.domain.dto.response.provider;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MagicProviderResponse {
    private String name;
    private Enum type;
}
