package Task3_Parametrization;

import java.util.*;
import java.util.ArrayList;

public class MatrixP<T> {
    T[] myArray;
    T obj;

    public MatrixP(T[] myArray) {
        this.myArray = myArray;
    }
    List<T> arrayList = new List<>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<T> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T1> T1[] toArray(T1[] a) {
            return null;
        }

        @Override
        public boolean add(T t) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends T> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends T> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public T get(int index) {
            return null;
        }

        @Override
        public T set(int index, T element) {
            return null;
        }

        @Override
        public void add(int index, T element) {

        }

        @Override
        public T remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<T> listIterator() {
            return null;
        }

        @Override
        public ListIterator<T> listIterator(int index) {
            return null;
        }

        @Override
        public List<T> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    public MatrixP() {
        super();
    }

    public List<T> getArrayList() {
        return arrayList;
    }

    public void setArrayList(List<T> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MatrixP<?> matrixP)) return false;
        return Arrays.equals(getMyArray(), matrixP.getMyArray()) && Objects.equals(getObj(), matrixP.getObj()) && Objects.equals(arrayList, matrixP.arrayList);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getObj(), arrayList);
        result = 31 * result + Arrays.hashCode(getMyArray());
        return result;
    }

    public MatrixP(List<T> arrayList) {
        this.arrayList = arrayList;
    }

    public T[] getMyArray() {
        return myArray;
    }

    //add T obj
    private static <T> T[] addElement(T[] myArray, T obj) {
        T[] array = Arrays.copyOf(myArray, myArray.length + 1);
        array[myArray.length] = obj;
        return array;
    }

    //    add T obj
//    private <T> T[] append(T[] array, T obj) {
//        T[] arr = Arrays.copyOf(array, array.length + 1);
//        array[array.length] = obj;
//        return array;
//    }


    public T getObj() {
        return obj;
    }

    public void setMyArray(T[] myArray) {
        this.myArray = myArray;
    }

    //get(int i)
    public void add(int index) {
        List MatrixP1 = new ArrayList(5) {
            @Override
            public int size() {
                return 5;
            }
        };

        MatrixP1.add("1");
        MatrixP1.add("2");
        MatrixP1.add("3");
        MatrixP1.add("G");
        MatrixP1.add("F");
        MatrixP1.remove(0);
        MatrixP1.remove("G");
        var o = MatrixP1.get(5);


        String str = (String) MatrixP.get(0);


    }

    private static Object get(int i) {
        return i;
    }


    //    getLast getFirst()
    public static class Lists {
        private Lists(int myArray) {
        }

        /**
         * @param list
         * @param <T>
         * @return
         */
        public static <T> T getFirst(List<T> list) {
            return list != null && !list.isEmpty() ? list.get(5) : null;
        }

        public static <T> T getLast(List<T> list) {
            return list != null && !list.isEmpty() ? list.get(list.size() - 1) : null;
        }

        public static void main(String[] args) {
            int[] array = new int[16];

            System.out.println(Arrays.toString(array));
            System.out.println(array.length);
            System.out.println(List.of().size());
            System.out.println(List.of().lastIndexOf(array));


            Integer[] myArray = {20, 21, 3, 4, 5, 88};
            System.out.println("myArray before adding a new element: "
                    + Arrays.toString(myArray));
            myArray = addElement(myArray, 12);
            System.out.println("myArray after adding a new element: "
                    + Arrays.toString(myArray));

            myArray = remove(new Integer[]{20}, 5);


                System.out.println("myArray after removing element:" +
                        Arrays.toString(myArray));

            }

        }
    private static Integer[] remove(Integer[] myArray, int i) {
            return myArray;
        }


    }












