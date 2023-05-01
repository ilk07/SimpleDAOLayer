package homework.simpledaolayer.controller;

import homework.simpledaolayer.repository.DefaultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    DefaultRepository repository;

    @GetMapping("/fetch-product")
    public List<String> fetchProduct(@RequestParam(required = true) String name) {
        return repository.getProductName(name);
    }

}
