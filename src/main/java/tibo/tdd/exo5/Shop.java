package tibo.tdd.exo5;

import tibo.tdd.exception.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    protected List<Product> products;

    public Shop() {
        products = new ArrayList<>();
    }

    public void update(Product product) {
        throw new NotImplementedException();
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