package models;

public class Whiskey {
    private int id;
    private String brand;
    private float size;
    private int qty;
    private float price;
    private double abv;

    //constructors

    public Whiskey(){}

    public Whiskey(int id, String brand, float size, int qty, float price, double abv) {
        this.id = id;
        this.brand = brand;
        this.size = size;
        this.qty = qty;
        this.price = price;
        this.abv = abv;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getAbv() {
        return abv;
    }

    public void setAbv(double abv) {
        this.abv = abv;
    }
}
