package Task1;

import java.io.*;
import java.util.Scanner;

//Task1
public class ReadFile {
    public static void main(String[] args) {
        String line=" ";
        try (PrintWriter pw = new PrintWriter("myfile2.txt")) {
            pw.print(line);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String path = "c:\\Users\\Lenovo\\IdeaProjects\\IT Academy\\Homework6\\src\\Task_1\\io\\myfile2.txt\\myfile2.txt";
        try (Scanner read = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            String line1 = " ";
            do {
                System.out.print("Input text : ");
                line = read.nextLine();
                if (!line.toLowerCase().equals("stop")) {
                    writer.write(line);
                    writer.newLine();
                    writer.write(line1);
                    writer.flush();

                }
            } while (!line.toLowerCase().equals("stop"));

        } catch (IOException e) {
            e.printStackTrace();


        }




    }
}


