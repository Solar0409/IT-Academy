package Task4;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        String text = "\"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\"";
        Random random = new Random();
        try {
            Files.createDirectories(Paths.get("Task4")); 
            try (BufferedWriter resultWriter = new BufferedWriter(new FileWriter("Task4/result.txt"))) {
                for (int i = 1; i <= 100; i++) {
                    String fileName = "Task4/" + i + ".txt";
                    int length = random.nextInt(text.length() + 1);
                    String content = text.substring(0, length);
                    Files.write(Paths.get(fileName), content.getBytes());
                    resultWriter.write(fileName + " размер: " + content.getBytes().length + " байт\n");
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

