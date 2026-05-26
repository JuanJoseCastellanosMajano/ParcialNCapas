package com.example.parcial2_00026223.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateMagicArticleRequest {
}



/*public class CreateProductRequest {
    @NotBlank(message = "Product name cannot be empty.")
    private String name;
    private Category category;

    @NotNull(message = "Price cannot be empty.")
    @Positive(message = "Price cannot be negative.")
    private Double price;

    @NotNull(message = "It must be specified whether the product is available.")
    private Boolean available;
}*/