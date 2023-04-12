package com.terzicaglar.webhooktest;

import java.util.Arrays;
import java.util.Random;

public class Webhook {
    public static void main(String[] args) {
        //commit 3
        System.out.println("webhook test");

    }

    /**
     * This method will generate a matrix of size n x n, filled with random
     * numbers between 0 and 100
     *
     * @param n
     *            The size of the matrix
     * @return an array of size n x n
     */
    public static int[][] generateMatrix(int n) {
        Random r = new Random();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = r.nextInt(100);
            }
        }
        return matrix;
    }
}
