package dataStructure;

public interface List {
 void add(String item);


 boolean isEmpty();

 void add(int id,String item);

 int size();

 String get(int id);

  void set (int id,String item);

 void remove(String item);
 void remove(int id);
 void clear();
 boolean contains(String item);

}
