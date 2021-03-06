package org.example.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.data.ProductDto;
import org.example.data.ProductDto.ProductDtoBuilder;
import org.example.entity.Product;
import org.example.entity.Product.ProductBuilder;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-23T01:43:54+0700",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto productToProductDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDtoBuilder productDto = ProductDto.builder();

        productDto.id( product.getId() );
        productDto.name( product.getName() );
        productDto.description( product.getDescription() );
        productDto.price( product.getPrice() );

        return productDto.build();
    }

    @Override
    public Product productDtoToProduct(ProductDto productDto) {
        if ( productDto == null ) {
            return null;
        }

        ProductBuilder product = Product.builder();

        product.id( productDto.getId() );
        product.name( productDto.getName() );
        product.description( productDto.getDescription() );
        product.price( productDto.getPrice() );

        return product.build();
    }

    @Override
    public List<ProductDto> productListToProductDtoList(List<Product> productList) {
        if ( productList == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( productList.size() );
        for ( Product product : productList ) {
            list.add( productToProductDto( product ) );
        }

        return list;
    }

    @Override
    public List<Product> productDtoListToProductList(List<ProductDto> productDtoList) {
        if ( productDtoList == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( productDtoList.size() );
        for ( ProductDto productDto : productDtoList ) {
            list.add( productDtoToProduct( productDto ) );
        }

        return list;
    }
}
