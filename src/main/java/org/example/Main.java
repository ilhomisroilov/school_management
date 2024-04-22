package org.example;

import java.io.PrintStream;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Boolean isTrue=true;
        while (isTrue) {

            System.out.println("Welcome to Learning Center Management System");
            System.out.println("1.Sign In");
            System.out.println("2.Sign Up");
            int choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    signIn.main();
                    isTrue=false;
                    break;
                case 2:
                    signUp.main();
                    break;
            }

        }
    }
}