package tibo.tdd.exo5;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    protected List<Product> products;

    public Shop() {
        products = new ArrayList<>();
    }

    public void update(Product product) {
        int steps = 1;

        if (product.getQuality() > 50) {
            product.setQuality(50);
        }

        if (product.getQuality() == 0) {
            steps *= 2;
        }

        if (product.getName().equals("Brie vieilli")) {
            product.setQuality(product.getQuality() + steps);
        } else {
            product.setQuality(product.getQuality() - steps);
        }

        if (product.getSellIn() > 0) {
            product.setSellIn(product.getSellIn() - 1);
        }

        if (product.getQuality() < 0) {
            product.setQuality(0);
        }
        if (product.getQuality() > 50) {
            product.setQuality(50);
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void clearProducts() {
        products.clear();
    }
}