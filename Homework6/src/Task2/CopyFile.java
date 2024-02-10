package Task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Task2
public class CopyFile {
    public static void main(String[] args) {
        try(FileInputStream fileIn = new FileInputStream
                ("c:\\Users\\Lenovo\\IdeaProjects\\IT Academy\\Homework6\\src\\Task2\\io\\LoremIpsum.txt\\LoremIpsum.txt");
            FileOutputStream fileOut = new FileOutputStream
                    ("c:\\Users\\Lenovo\\IdeaProjects\\IT Academy\\Homework6\\src\\Task2\\io\\LoremIpsum.txt\\result.txt")){
    int a;
    while ((a=fileIn.read())!=-1) {
        fileOut.write(a);
    }
    }catch(IOException e){
                System.out.println(e.getMessage());
            }




    }
}
