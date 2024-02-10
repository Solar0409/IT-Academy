import Task3.User;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//Task3
public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("John", "Weak", 20));
        users.add(new User("Mike", "Omer", 44));
        users.add(new User("Tom", "Kruise", 61));
        users.add(new User("Smith", "Jonson", 25));
        users.add(new User("Whetney", "Houston", 48));
        users.add(new User("Bill", "Gates", 68));
        users.add(new User("Bob", "Marley", 78));
        users.add(new User("Bjarne", "Stroustrup", 73));
        users.add(new User("Ada ", "Byron", 209));
        users.add(new User("Lady", "Gaga", 37));

        Path directoryPath = Paths.get("Task3");
        try {
            Files.createDirectories(directoryPath); // Создание папки Task4, если она не существует
            Path namesFilePath = directoryPath.resolve("names.txt");
            for (User user : users) {
                String fileName = user.getFirstName() + "_" + user.getLastName() + ".txt";
                Path filePath = directoryPath.resolve(fileName);
                try (FileOutputStream fileOut = new FileOutputStream(filePath.toString());
                     ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                    out.writeObject(user);
                }
                // Запись имени и фамилии пользователя в файл names.txt с указанием кодировки
                try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(namesFilePath.toString(), true), StandardCharsets.UTF_8)) {
                    writer.write(user.getFirstName() + " " + user.getLastName() + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}



//        File path = new File(" C:\\Users\\Lenovo\\IdeaProjects\\IT Academy\\" +
//                "Homework6\\src\\Task3\\Users\\Name_Surname.txt ");
//        File f1 = new File("C:\\Users\\Lenovo\\IdeaProjects\\IT Academy\\" +
//                "Homework6\\src\\Task3\\Users\\Name_Surname.txt");
//        System.out.println(f1.createNewFile());
//        System.out.println(f1.exists());
//        System.out.println(f1.getAbsolutePath());



















