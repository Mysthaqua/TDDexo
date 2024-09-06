package tibo.tdd.exo5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        product.setQuality(30);

        shop.clearProducts();
        shop.addProduct(product);
    }

    @Test
    public void testShop_WhenUpdate_IfProductQuality_50_AndProductSellIn_0_ThenProductQuality_25() {
        int quality = 50;
        product.setQuality(quality);
        int sellIn = 0;
        product.setSellIn(sellIn);
        int expected = 25;

        shop.update(product);
        int actual = product.getQuality();

        assertEquals(expected, actual);
    }
}