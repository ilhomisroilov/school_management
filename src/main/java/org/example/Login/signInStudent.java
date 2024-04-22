package org.example;

import org.example.inf.Students;

import java.util.List;
import java.util.Scanner;

public class signIn {


    public static void main() {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Sign IN");
        System.out.println("Welcome to Student Login");
        System.out.println();
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        Students student=getStudentByUsername(username);
        if (student!=null && student.getStd_password().equals(password)){
            System.out.println("Congaratulation! You're our university's student");
        } else{
            System.out.println("Can't find username or wrong password");
        }

         /**
         List<Students> students=Load.loadStudents();
        for(Students student: students){
            if (student.getUsername().equals(username)){
                if (student.getStd_password().equals(password)){
                    System.out.println("Congaratulation! You're our university's student");
                }else {
                    System.out.println("Wrong password");
                }
            }else {
                System.out.println("Can't find username");
            }
        }
         **/






    }

    private static Students getStudentByUsername(String username){
        List<Students> students=Load.loadStudents();
        for(Students student: students){
            if (student.getUsername().equals(username)){
                return student;
            }
        }
        return null;
    }
}
