package Task1;

import java.io.*;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s = cs.nextLine();

        try (BufferedWriter bw = new BufferedWriter
                (new FileWriter("myfile.txt"))) {
            String text = " ";
            bw.write(text);
            bw.newLine();
            bw.write(text);
        }catch (IOException ex){
            System.out.println(ex.getMessage());

        }


    }
}










































