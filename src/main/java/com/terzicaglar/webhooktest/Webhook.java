package com.terzicaglar.webhooktest;

public class Webhook {
    public static void main(String[] args) {
        System.out.println("webhook test");
        System.out.println(divide(19, 2));
        //commit 1
    }

    public static double divide(int a, int b) {
        //divided two integers and return double value
        return (double) a / b;
    }
}
