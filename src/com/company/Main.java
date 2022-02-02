package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        System.out.println("What is your name?");
        name = input.nextLine();
        System.out.println("Hello, " + name);
    }
}
