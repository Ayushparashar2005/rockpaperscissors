package com.company;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.*;


public class rockpaperscissors {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String m="rock";
        String n="paper";
        String o="scissors";
        String b="l";
        Random random = new Random();
        int z = 1 + random.nextInt(3); // Generates a number between 1 and 3

        switch (z) {
            case 1:
                b = m;
                break;
            case 2:
                b = n;
                break;
            case 3:
                b = o;
                break;
            default:
                System.out.println("fuck");}

        System.out.println("enter your choice baawe");
        String a = sc.next();
            if (Objects.equals(a, m) && Objects.equals(b, m)) {
                System.out.println("it is a tie you both choose rock try again");
            } else if (Objects.equals(a, n) && Objects.equals(b, n)) {
                System.out.println("it is a tie you both choose paper try again");
            } else if (Objects.equals(a, o) && Objects.equals(b, o)) {
                System.out.println("it is a tie you both choose scissors try again");
            } else if (Objects.equals(a, m) && Objects.equals(b, n)) {
                System.out.println("you choose rock and pc chose paper ... so pc won :(");
            } else if (Objects.equals(a, m) && Objects.equals(b, o)) {
                System.out.println("you choose rock and pc chose scissors ... so you won :)");
            } else if (Objects.equals(a, n) && Objects.equals(b, m)) {
                System.out.println("you choose paper and pc chose rock ... so you won :(");
            } else if (Objects.equals(a, n) && Objects.equals(b, o)) {
                System.out.println("you choose paper and pc chose scissors ... so you won :)");
            } else if (Objects.equals(a, o) && Objects.equals(b, m)) {
                System.out.println("you choose scissors and pc chose rock ... so pc won :(");
            } else if (Objects.equals(a, o) && Objects.equals(b, n)) {
                System.out.println("you choose scissors and pc chose paper ... so you won :)");
            } else {
                System.out.println("invalid choice check spelling");
            }
        }
    }

