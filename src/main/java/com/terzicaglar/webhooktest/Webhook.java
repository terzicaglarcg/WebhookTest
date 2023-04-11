package com.terzicaglar.webhooktest;

public class Webhook {
    public static void main(String[] args) {
        //commit 3
        System.out.println("webhook test");
        System.out.println(divide(19, 2));

    }

    public static double divide(int a, int b) {
        //divided two integers and return double value
        return (double) a / b;
    }
}
