package com.company;

import java.util.Scanner;

public class minus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = 0;
        int x=0;
        do{
            a = in.nextInt();
            x++;
        }while (a>=0);
        System.out.println(x);
    }
}
