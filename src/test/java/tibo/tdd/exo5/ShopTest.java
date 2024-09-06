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
    public void testShop_WhenUpdate_IfProductQuality_10_AndProductSellIn_0_ThenProductQuality_8() {
        int quality = 10;
        product.setQuality(quality);
        int sellIn = 0;
        product.setSellIn(sellIn);
        int expected = 8;

        shop.update(product);
        int actual = product.getQuality();

        assertEquals(expected, actual);
    }

    @Test
    public void testShop_WhenUpdate_IfProductQuality_0_ThenProductQuality_0() {
        int quality = 0;
        product.setQuality(quality);
        int expected = 0;

        shop.update(product);
        int actual = product.getQuality();

        assertEquals(expected, actual);
    }

    @Test
    public void testShop_WhenUpdate_IfProductQuality_55_ThenProductQuality_49() {
        int quality = 55;
        product.setQuality(quality);
        int expected = 49;

        shop.update(product);
        int actual = product.getQuality();

        assertEquals(expected, actual);
    }
}

/*
    Une fois la date de péremption est à zéro, la qualité se dégrade deux fois plus vite.
    La qualité d'un article n'est jamais négative.
La qualité d'un article n'est jamais supérieure à 50.
La qualité du « brie vieilli » augmente à mesure qu'il vieillit.
Les produits laitiers se dégradent en qualité deux fois plus vite que les produits normaux
 */