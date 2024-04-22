package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.example.inf.Students;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class signUp {
      private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void main() {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Sign Up");
        System.out.println("Welcome to Student Registration");
        System.out.println();
        System.out.print("Enter your fullname: ");
        String fullname = scanner.nextLine();

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner=new Scanner(System.in);

        System.out.print("Enter your contact: ");
        String contact = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        int id=generateStudentId();
        Students student =new Students(id, fullname, username, age, contact, email, password);
        saveStudent(student);
    }

    private static int generateStudentId() {
        List<Students> students =Load.loadStudents();
        return students.size() + 1;
    }

    private static void saveStudent(Students student) {
        List<Students> students=Load.loadStudents();
        students.add(student);
        saveStudents(students);
    }

    private static void saveStudents(List<Students> students) {

        try (Writer writer = new FileWriter("src/main/java/org/example/jsons/student.json")) {
            gson.toJson(students, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
