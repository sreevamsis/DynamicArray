public interface ListADT<E> {
  void add(E object);
  void removeElement(E object);
  void remove(int a);
  void read(int a);
  void modifyIndex(int a, E object);
  void modifyElement(E object1, E object2);
}