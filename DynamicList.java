import java.util.*;
@SuppressWarnings("unchecked")

class DynamicList<E> implements ListADT<E> {
  private E[] array;
  private E[] newarray;
  private int newsize;
  private int end = -1;
  private int MAXSIZE;
  DynamicList(int MAXSIZE) {
    end = -1;
    this.MAXSIZE = MAXSIZE;
    array = (E[])new Object[MAXSIZE];
  }
  public void add(E element) {
    if (end + 1 >= MAXSIZE) {
      newsize = 2 * MAXSIZE;
      MAXSIZE = newsize;
      newarray = (E[])new Object[newsize];
      for (int i = 0; i <= end; i++) {
        newarray[i] = array[i];
      }
      array = newarray;
    }
    array[++end] = element;
  }
  public void removeElement(E element) {
    int flag = 0;
    for (int i = 0; i <= end; i++) {
      if ((array[i].equals(element)) || (array[i] == element)) {
        flag = 1;
        for (int j = i; j < end; j++) {
          array[j] = array[j + 1];
        }
        i--;
        end--;
      }
    }
    if (flag == 0) {
      System.out.println("Element is not found");
    }
  }
  public void remove(int index) {
    if (end == -1) {
      System.out.println("List is empty");
    }
    for (int i = index; i < end; i++) {
      array[i] = array[i + 1];
    }
    end--;
  }
  public void read(int index) {
    if (index <= end) {
      System.out.println(array[index]);
    } else {
      System.out.println("null");
    }
  }
  public void modifyIndex(int index, E element) {
    if (index <= end) {
      array[index] = element;
    }
  }
  public void modifyElement(E element1, E element2) {
    int flag = 0;
    for (int i = 0; i <= end; i++) {
      flag = 1;
      if ((array[i] == element1) || (array[i].equals(element1))) {
        array[i] = element2;
      }
    }
    if (flag == 0) {
      System.out.println("Element is not found");
    }
  }
  public void print() {
    if (end == -1) {
      System.out.println("List is empty");
    }
    for (int i = 0; i <= end; i++) {
      System.out.print(array[i]);
      if (i < end) {
        System.out.print(",");
      }
    }
  }
}