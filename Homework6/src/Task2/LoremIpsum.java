package Task2;

import java.io.*;
import java.util.Date;

public class LoremIpsum {
    public static void main(String[] args) throws IOException {
        java.io.File dirs = new java.io.File
                ("src\\Task2\\io\\LoremIpsum.txt\\LoremIpsum.txt");

        if (!dirs.exists()) {
            dirs.mkdirs();
        }
        java.io.File file = new java.io.File(dirs,
                "LoremIpsum.txt");

        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        if (file.exists() && !file.canWrite()) {

            try (BufferedReader br = new BufferedReader
                    (new FileReader("c:\\Users\\Lenovo\\IdeaProjects\\IT Academy\\Homework6\\src\\Task2\\io\\LoremIpsum.txt\\LoremIpsum.txt"))) {

                String s;
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                    System.out.println(s.replaceAll("\\s", ""));
                    System.out.println(s.trim());

                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());

            }
        }

    }



}








