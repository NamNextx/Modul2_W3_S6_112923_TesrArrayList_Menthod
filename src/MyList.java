import javax.management.ObjectName;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private E[] element = (E[]) (new Object[DEFAULT_CAPACITY]);


    public MyList() {

    }

    public MyList(E[] object) {
        for (int i = 0; i < object.length; i++) {
            add(object[i]);
        }

    }

    public void add(int index, E elementNew) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            element[i + 1] = element[i];
        }
        element[index] = elementNew;
        size++;

    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bound");
        }
    }

    public E remove(int index) {
        checkIndex(index);
        E e = element[index];
        for (int i = index; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        element[size - 1] = null;
        size--;
        return e;
    }

    public Boolean remove(E e) {
        for (int i = 0; i <= size; i++) {
            if (element[i].equals(e)) {
                remove(i);
                break;
            }
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public E clone() {
        return null;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(element[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        int index = 0;
        for (E element : element) {
            if (element.equals(e)) {
                return index;
            }
            index++;
        }
        return -1;
    }


    // Appends the specified element to the end of this list
    public boolean add(E e) {
        if (size < element.length) {
            element[size] = e;
            size++;
            return true;
        } else return false;
    }

    public void showElement() {
        for (int i=0; i < size; i++) {
            System.out.println(element[i]);
        }
    }

    public void ensureCapacity() {
        if (size > element.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(element, 0, newData, 0, size);
            element = newData;
        }

    }

    public E get(int index) {
        checkIndex(index);
        return element[index];
    }

    public void clear() {
        element = (E[]) new Object[0];
        size = 0;
    }
}
