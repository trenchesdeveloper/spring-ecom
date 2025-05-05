package com.trenchesdeveloper.store.mappers;

import com.trenchesdeveloper.store.dtos.ProductDto;
import com.trenchesdeveloper.store.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(source = "category.id", target = "categoryId")
    ProductDto toDto(Product product);

}
