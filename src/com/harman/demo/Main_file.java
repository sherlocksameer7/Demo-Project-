package com.harman.demo;

public class Main_file {
    public static void main(String[] args) {
        int x= 10, y=23;

        Adition obj = new Adition();
        int z = obj.add(x,y);
        System.out.println(z);

        Multiply mul_obj = new Multiply();
        int c = mul_obj.multiply(x,y);
        System.out.println(c);



    }
}
