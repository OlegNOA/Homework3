package com.company;

public class Main11 {

    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0;i<array.length;i++){
            array[i] = (int)(Math.random() * 100);
            System.out.println(array[i] + " ");
        }

    }
}