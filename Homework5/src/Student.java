import java.util.*;
import java.util.Iterator;


//Task4
/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными
 * оценками. Найти самую высокую оценку с использованием итератора.
 */
public class Student {

    private String name;
    private int nGroup;
    private int[] points;
    private float av_p;

    public String getName() {
        return name;
    }

    public int getnGroup() {
        return nGroup;
    }


    public int[] getPoints() {

        if (this.points == null) {
            return null;
        }
        return this.points.clone();
    }

    public  void av_p() {
        float sum = 0;
        for (int e : points) {
            sum += e;
        }
        av_p = sum / points.length;
    }

    Student() {};

    public Student(String s, int n) {
        this.name = s;
        this.nGroup = n;
        this.points = new int[4];
        Random random = new Random();
        for (int i = 0; i < 4; ++i) {
            this.points[i] = random.nextInt(10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Task4
        System.out.println("Введите количество студентов:");

        int quanStudents = sc.nextInt();

        ArrayList<Student> univ = new ArrayList<Student>();

        Student Andrej = new Student("Andrej", 345);
        univ.add(Andrej);

        System.out.println("All points: ");
        for (int i = 0; i < 4; ++i) {
            System.out.print(Andrej.getPoints()[i] + "\t");
        }

        System.out.println("Max point: ");

        for (int i = 0; i < 4; ++i) {
            System.out.print(Andrej.getPoints()[i] + "\t");
        }


        sc.close();

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(78);
        marks.add(82);
        marks.add(91);
        marks.add(65);
        marks.add(88);

        Iterator<Integer> iterator = marks.iterator();
        int maxMark = Integer.MIN_VALUE;

        while (iterator.hasNext()) {
            int mark = iterator.next();
            if (mark > maxMark) {
                maxMark = mark;
            }
        }

        System.out.println("Самая высокая оценка: " + maxMark);

    }


    public class Task4 {
        public static void main(String[] args) {

            ArrayList<Integer> grades = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                int grade = (int) (Math.random() * 10 + 1);
                grades.add(grade);
            }

            Iterator<Integer> iterator = grades.iterator();
            int maxGrade = 0;
            while (iterator.hasNext()) {
                int grade = iterator.next();
                if (grade > maxGrade) {
                    maxGrade = grade;
                }
            }

            System.out.println("Журнал оценок: " + grades);
            System.out.println("Самая высокая оценка: " + maxGrade);
        }
    }



}


