package service;

import product.Product;

public class Service extends Product {

    private String title;

    public Service(long price, String title) {
        super(price);
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    @Override
    protected String getSubclassToString() {
        return " название услуги: " + title;
    }
}
