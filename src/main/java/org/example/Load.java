package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.example.inf.Students;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Load {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static List<Students> loadStudents() {
        List<Students> students = new ArrayList<>();
        File file = new File("src/main/java/org/example/jsons/student.json");
        if (file.exists()) {
            try (Reader reader = new FileReader("src/main/java/org/example/jsons/student.json")) {
                students = gson.fromJson(reader, new TypeToken<List<Students>>() {}.getType());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return students;
    }

}
