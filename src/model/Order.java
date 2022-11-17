package model;

public class Order {
    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order(int product_code, int userid, int price, int quantity) {
        this.product_code = product_code;
        this.userid = userid;
        this.price = price;
        this.quantity = quantity;
    }

    int product_code;
    int userid;
    int price;
    int quantity;


    public void total_amt(int discount) {

        double total=(this.quantity*this.price)-discount;
        System.out.println("Your total price is"+ total);


    }
}



