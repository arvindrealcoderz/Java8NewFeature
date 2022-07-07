/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.squreroot;

import java.util.Scanner;

/**
 *
 * @author Arvind verma
 */
public class SqureRoot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        int num = sc.nextInt();
        sc.nextLine();

        if (num > 0) {
            double d;

            double sqrt = num / 2;
            do {
                d = sqrt;
                sqrt = (d + (num / sqrt)) / 2;

            } while ((d - sqrt) != 0);
            System.out.print("Squre root is ::  " + sqrt);
        } else {
            System.out.println("Please enter postive number ");
        }

    }

}
