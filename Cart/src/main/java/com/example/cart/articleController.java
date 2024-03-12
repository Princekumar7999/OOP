package com.example.cart;

//import com.example.project.services.productsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import services.CartService;

@RestController
public class articleController {

    CartService ps;

    articleController() {
        this(null);
    }

    articleController(CartService ps) {

        this.ps = ps;
    }

    @GetMapping("/")
    public String getAllArticles() {
        return "All Articles";
    }

}
