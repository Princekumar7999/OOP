package com.example.cart;

//import com.example.project.services.productsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import services.CartService;

import java.lang.annotation.Target;

@RestController
public class CartController {
    CartService ps;

    CartController() {
        this(null);
    }

    CartController(CartService ps) {
        this.ps = ps;
    }

    @GetMapping("/carts")
    public fakeStoreProduct[] GetAllCarts() {

        CartService obj2 = new CartService();
        return obj2.GetAllCarts();

    }

    @GetMapping("/carts/5/{id}/")
    public fakeStoreProduct GetSingleCart(@PathVariable long id) {
        CartService obj1 = new CartService();
        return obj1.GetSingleCart(id);
    }

    @GetMapping("/carts?startdate=2019-12-10&enddate=2020-10-10/{id}/")
    public fakeStoreProduct GetCartsInDataRange(@PathVariable long id) {
        CartService obj3 = new CartService();
        return obj3.GetCartsInDataRange(id);
    }

    @GetMapping("/carts/user/2/{id}/")
    public fakeStoreProduct GetUserCarts(@PathVariable long id) {
        CartService obj4 = new CartService();
        return obj4.GetUserCarts(id);
    }

    @GetMapping("/carts/7/{id}/")
    public fakeStoreProduct UpdateACart(@PathVariable long id) {
        CartService obj4 = new CartService();
        return obj4.UpdateACart(id);
    }

    @GetMapping("/carts/6/{id}/")
    public fakeStoreProduct DeleteACart(@PathVariable long id) {
        CartService obj4 = new CartService();
        return obj4.DeleteACart(id);
    }

}