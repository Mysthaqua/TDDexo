package tibo.tdd.exo5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class ShopTest extends Assertions {
    private static Shop shop;
    private Product product;

    @BeforeAll
    public static void init() {
        shop = new Shop();
    }

    @BeforeEach
    public void setup() {
        product = new Product();
        product.setType("Produit laitier");
        product.setName("Raclette");
        product.setSellIn(10);
        product.setQuality(50);

        shop.clearProducts();
        shop.addProduct(product);
    }
}