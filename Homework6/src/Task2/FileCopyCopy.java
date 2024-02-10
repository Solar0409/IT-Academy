package Task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyCopy {

    public static final String INPUT_FILE_PATH = "c:\\Users\\Lenovo\\IdeaProjects\\IT Academy\\Homework6\\src\\Task2\\io\\LoremIpsum.txt\\LoremIpsum.txt";
    public static final String OUTPUT_FILE_PATH = "c:\\Users\\Lenovo\\IdeaProjects\\IT Academy\\Homework6\\src\\Task2\\io\\LoremIpsum.txt\\result.txt";

    public static void main(String[] args) throws IOException {
        File dir = new File("c:\\Users\\Lenovo\\IdeaProjects\\IT Academy\\Homework6\\src\\Task2\\io\\LoremIpsum.txt\\LoremIpsum.txt");

        if (!dir.exists()) {
            dir.mkdirs();
        }

        File inputFile = new File(INPUT_FILE_PATH);
        if (!inputFile.exists()) {
            inputFile.createNewFile();
        }

        File outputFile = new File(OUTPUT_FILE_PATH);
        if (!outputFile.exists()) {
            outputFile.createNewFile();
        }

        try (FileInputStream fileIn = new FileInputStream(inputFile);
             FileOutputStream fileOut = new FileOutputStream(outputFile)) {
            int a;
            while ((a = fileIn.read()) != -1) {
                System.out.println((char) a);
                if ((char) a == ' ') {
                    fileOut.write('_');
                } else {
                    fileOut.write(a);
                }
            }
        }
    }
}