package Task1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class File {
    public static void main(String[] args) throws IOException {
        java.io.File dirs = new java.io.File
                ("c:/Users/Lenovo/IdeaProjects/IT Academy/Homework6/src/Task_1/io/myfile2.txt");

        if (!dirs.exists()) {
            dirs.mkdirs();
        }
        java.io.File file = new java.io.File(dirs,
                "myfile2.txt");

        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        if(file.exists() && !file.canWrite()){

            try (BufferedReader br = new BufferedReader
                    (new FileReader("c:/Users/Lenovo/IdeaProjects/IT Academy/Homework6/src/Task_1/io/myfile2.txt"))) {

                String s;
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
        for (java.io.File f : dirs.listFiles()) {
            System.out.println("Имя файла: " + f.getName());
            System.out.println("Путь: " + f.getPath());
            System.out.println("Абсолютный путь: " + f.getAbsolutePath());
            System.out.println("Родительский каталог: " + f.getParent());
            System.out.println(f.exists() ? "Файл/каталог существует." : "Файл/каталог не существует.");
            System.out.println(f.canWrite() ? "Файл/каталог доступен для редактирования."
                    : "Файл/каталог не доступен для редактирования.");
            System.out.println(
                    f.canRead() ? "Файл/каталог доступен для чтения." : "Файл/каталог не доступен для чтения.");
            System.out.println((f.isDirectory() ? "Каталог." : "Не каталог."));
            System.out.println(f.isFile() ? "Файл." : "Не файл.");
            System.out.println(f.isAbsolute() ? "Абсолютный путь." : "Не абсолютный путь.");
            System.out.println("Дата последнего редактирования: " + new Date(f.lastModified()));
            System.out.println("Размер: " + f.length() + " байт.");

            System.out.println("----------------------------------------------------------");
        }





    }

}




