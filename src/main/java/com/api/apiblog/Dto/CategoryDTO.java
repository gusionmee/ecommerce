package com.api.apiblog.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class CategoryDTO {
    private Long categoryId;
    private String categoryName;
    CategoryDTO() {
    }


}
