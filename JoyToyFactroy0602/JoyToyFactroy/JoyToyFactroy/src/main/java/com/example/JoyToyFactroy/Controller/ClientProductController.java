package com.example.JoyToyFactroy.Controller;

import com.example.JoyToyFactroy.Service.ProductService;
import com.example.JoyToyFactroy.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClientProductController {

    @Autowired
    private ProductService productService;

    // Existing /shop page (renders shop.html)
    @GetMapping("/shop")
    public String showProductsToClient(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "shop"; // shop.html in templates
    }

    // New /shop-wooden-products page (renders shop_1.html)
    @GetMapping("/shop-wooden-products")
    public String showWoodenProducts() {
        return "shop_1"; // shop_1.html in static or templates
    }
    @GetMapping("/shop-plastic-products")
    public String showPlasticProducts() {
        return "shop_2"; // shop_1.html in static or templates
    }
    @GetMapping("/shop-educational-products")
    public String showeducationalProducts() {
        return "shop_3"; // shop_1.html in static or templates
    }
    @GetMapping("/shop-softtoys-products")
    public String showsofttoysProducts() {
        return "shop_4"; // shop_1.html in static or templates
    }
    
    @GetMapping("/shop-age-1-2")
    public String showAgeOneToTwoProducts() {
        return "shop_5"; // shop_1.html in static or templates
    }
     @GetMapping("/shop-age-3-5")
    public String showAgeThreeToFiveProducts() {
        return "shop_6"; // shop_1.html in static or templates
    }
     @GetMapping("/shop-age-6-8")
    public String showAgeSixToEightProducts() {
        return "shop_7"; // shop_1.html in static or templates
    }
     @GetMapping("/shop-age-9-10")
    public String showAgeNineToTenProducts() {
        return "shop_8"; // shop_1.html in static or templates
    }
}
