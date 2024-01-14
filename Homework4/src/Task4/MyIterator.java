package Task4;

import java.util.Iterator;


public class MyIterator<T> implements Iterator <T>{
    private T[]array;
    private int index;

    public MyIterator() {
        super();
    }
    public MyIterator(T[]array){
        this.array = array;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }


    @Override
    public boolean hasNext() {
        if (array == null || array.length <= index) {
            return false;
        }
        return array[index] != null;
    }



    @Override
    public T next() {
        return array[index++];
    }


    public static void main(String[] args) {
        Integer[]arr = {7,8,9};

        MyIterator<Integer> iterator = new MyIterator<>(arr);

        while(iterator.hasNext()){
            System.out.println(iterator.next());


        }


    }
}