package com.polarbookshop.catalog_service.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

public record Book(
        @NotBlank(message = "isbn must be defined")
        @Pattern(regexp = "^([0-9]{10}|[0-9]{13})" , message = "isbn format must be valid")
        String isbn,
        @NotBlank(message = "title must be defined")
        String title,

        @NotBlank(message = "author must be defined")
        String author,

        @NotNull(message = "price must be defined")
        @Positive(message = "price must be positive")
        Double price) {

}
