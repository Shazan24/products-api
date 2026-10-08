package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product(){

    }
    /*The tutorial explains that the no-argument constructor becomes important
        when JSON is later sent into your application in a POST request.*/

    public Product(Long id, String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
