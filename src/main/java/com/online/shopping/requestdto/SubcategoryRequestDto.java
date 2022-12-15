package com.online.shopping.requestdto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Setter
@Getter
@NoArgsConstructor
public class SubcategoryRequestDto {

    private int id;

    @NotNull(message = "Enter Product subcategory name")
    private String subcategoryName;

    @NotNull(message = "Enter category id")
    @Positive(message = "Enter valid product category id")
    private Integer categoryId;

}
