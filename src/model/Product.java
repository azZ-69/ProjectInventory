package model;

public class Product {
    public Product(String name, int product_code, double price, String brand, String description) {
        this.name = name;
        this.product_code = product_code;
        this.price = price;
        this.brand = brand;
        this.description = description;
    }

    //name, product code, price, brand, description.
    String name;
    int product_code;
    double price;

    public String getName() {
        return name;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    String brand;
    String description;


    public void print_format() {
        System.out.println(this.product_code + this.brand + this.price + this.description);
    }
}

