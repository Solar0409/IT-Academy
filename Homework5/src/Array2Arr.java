import java.util.Iterator;
import java.util.NoSuchElementException;

//Task3

public class Array2Arr <T> implements Iterable {
    public static void main(String[] args) {

    }
    private T[][] arr;

    public void
    Array2arr(T[][] arr) {
        this.arr = arr;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int i, j;

            @Override
            public boolean hasNext() {
                for (int i = this.i; i < arr.length; i++) {
                    for (int j = this.j; j < arr[i].length; j++) {
                        return true;
                    }
                }
                return false;

            }

            @Override
            public T next() {

                    if (!hasNext())
                        throw new NoSuchElementException();
                    T t = arr[i][j];
                    j++;
                    for (int i = this.i; i < arr.length; i++) {
                        for (int j = (i == this.i ? this.j : 0); j < arr[i].length; j++) {
                            this.i = i;
                            this.j = j;
                            return t;
                        }
                    }
                    return t;
                }
            }

            ;
        }
    }


