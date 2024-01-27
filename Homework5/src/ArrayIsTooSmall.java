//Task 6

public class ArrayIsTooSmall {
    static int[] array = new int[8];

    public static void main(String[] args) {
            try {
            var i = array[10];
        }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.err.println("Array is too small. Please, expand the array");
        }
    }








