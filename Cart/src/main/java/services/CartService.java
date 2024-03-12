package services;

//import com.example.project.controller.fakeStoreProduct;
import com.example.cart.fakeStoreProduct;
import org.springframework.web.client.RestTemplate;

public class CartService {
    RestTemplate restTemplate = new RestTemplate();

    String url = "https://fakestoreapi.com/";
    public fakeStoreProduct[] GetAllCarts() {
        //return "Product from service with Id:" + id;
        fakeStoreProduct[] res = restTemplate.getForObject(url + "/carts/",fakeStoreProduct[].class);
        return res;

    }
    public fakeStoreProduct GetSingleCart(Long id)
    {
        fakeStoreProduct SingleCart = restTemplate.getForObject(url +"/carts/5" +id + "/",fakeStoreProduct.class);
        return SingleCart;
    }

    public fakeStoreProduct GetCartsInDataRange(Long id)
    {
        fakeStoreProduct DataRange = restTemplate.getForObject(url +"/carts?startdate=2019-12-10&enddate=2020-10-10" +id + "/",fakeStoreProduct.class);
        return DataRange;
    }

    public fakeStoreProduct GetUserCarts(Long id)
    {
        fakeStoreProduct UserCarts = restTemplate.getForObject(url +"/carts/user/2" +id + "/",fakeStoreProduct.class);
        return UserCarts;
    }

    public fakeStoreProduct AddNewCart(Long id)
    {
        fakeStoreProduct NewProduct = restTemplate.getForObject(url +"/carts" +id + "/",fakeStoreProduct.class);
        return NewProduct;
    }

    public fakeStoreProduct UpdateACart(Long id)
    {
        fakeStoreProduct UpdteCart = restTemplate.getForObject(url +"/carts/7" +id + "/",fakeStoreProduct.class);
        return UpdteCart;
    }

    public fakeStoreProduct DeleteACart(Long id)
    {
        fakeStoreProduct DelCart = restTemplate.getForObject(url +"/carts/6" +id + "/",fakeStoreProduct.class);
        return DelCart;
    }

}



