package Collections;

public class ArrayListAdder<T> {
    private Object[] data = new Object[0];
    private int length = 0;

    public void myAdd(T element) {
        if (length == data.length) {
            Object[] newData = new Object[data.length * 2 + 1];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[length] = element;
        length++;

    }

}
