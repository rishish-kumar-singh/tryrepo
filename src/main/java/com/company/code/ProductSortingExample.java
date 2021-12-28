package com.company.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{

     int id;
     String name;
     double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


public class ProductSortingExample {

    public static void main(String[] args) {

        //create products and add them in a list

        Product p1=new Product(1,"Samsung",100);
        Product p2=new Product(2,"Apple",50);
        Product p3=new Product(3,"Microsoft",200);

        List<Product> productList=new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        System.out.println("Products BEFORE sorting...");
        productList.forEach((x)-> System.out.println(x.toString()));

        System.out.println("========================================");
        System.out.println("Products AFTER sorting by name...");

        Collections.sort(productList,(x,y)->{
            return  x.name.compareTo(y.name);
        });

        productList.forEach((x)-> System.out.println(x.toString()));


    }


}
