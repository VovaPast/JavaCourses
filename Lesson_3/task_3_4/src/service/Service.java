package service;


import basis.Basis;

public class Service extends Basis {

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
