package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.ProductDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/ecommercee/product")
public class ProductController {

    @RequestMapping(method = RequestMethod.GET, value = "getProducts")
    public List<ProductDto> getProducts() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getProduct")
    public ProductDto getProduct(Long productId) {
        return new ProductDto(1L, "Sample product", 2L, "Test description",
                1, new BigDecimal(100));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteProduct")
    public boolean deleteProduct(Long productId) {
        System.out.println("Product has been deleted");
        return true;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateProduct")
    public ProductDto updateProduct(ProductDto productDto) {
        return new ProductDto(1L, "Product after update", 2L,
                "Updated description", 1, new BigDecimal(200));

    }

    @RequestMapping(method = RequestMethod.POST, value = "createProduct")
    public boolean createProduct(ProductDto productDto) {
        System.out.println("Product was created");
        return true;
    }
}