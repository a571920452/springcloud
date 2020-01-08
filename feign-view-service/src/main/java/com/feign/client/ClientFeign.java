package com.feign.client;

import com.feign.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "product-data-service")
public interface ClientFeign {

    @GetMapping("/products")
    public List<Product> listProdcuts();
}
