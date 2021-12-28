package com.company.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class ProductName{

    int id;
    String name;
    double price;

    public ProductName(int id, String name, double price) {
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


public class FilterListExample {

    public static void main(String[] args) {

        //create products and add them in a list

        ProductName p1=new ProductName(1,"Samsung",100);
        ProductName p2=new ProductName(2,"Apple",50);
        ProductName p3=new ProductName(3,"Microsoft",300);
        ProductName p4=new ProductName(4,"Google",75);
        ProductName p5=new ProductName(5,"Nokia",90);
        ProductName p6=new ProductName(6,"Lenovo",150);

        List<ProductName> productList=new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.add(p6);

        System.out.println("All products....");
        productList.forEach((x)->{
            System.out.println(x);
        });

        System.out.println("=============================================");
        System.out.println("Filter products whose price is less than 100");

        List<ProductName> filtered_list;
        filtered_list= productList.stream().filter(x->x.price<100).collect(Collectors.toList());

        filtered_list.forEach(x-> System.out.println(x));


    }


}
