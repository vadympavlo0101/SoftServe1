package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введіть радіус");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int radius = Integer.parseInt(br.readLine());
        System.out.println("Перемиметр"+(2*Math.PI*radius)/1);
        System.out.println("Введіть розмір для площі");
        int radius1 = Integer.parseInt(br.readLine());
        System.out.println("Площа"+(Math.PI*radius1*radius1)/1);









    }
}
