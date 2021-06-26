package pe.isil.controller;

import org.springframework.stereotype.Controller;
import pe.isil.service.ProductService;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //TODO add all methods
}
