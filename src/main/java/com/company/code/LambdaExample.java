package com.company.code;

@FunctionalInterface
interface Drawable {
    public void draw();

}

public class LambdaExample {

    public static void main(String[] args) {

        // Using anonymous class

       /* Drawable drawable=new Drawable() {
            @Override
            public void draw() {
                System.out.println("I am drawing...");
            }
        };*/

        //Using Lambda expression

        Drawable drawable=()->{
            System.out.println("Let's draw using lambda expression...");
        };

        drawable.draw();

    }

}
