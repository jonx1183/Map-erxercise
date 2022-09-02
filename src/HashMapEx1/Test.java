package HashMapEx1;

import java.util.HashMap;

public class Test {

  public static void main(String[] args) {
    Test main = new Test();
    main.go();
  }

  public void go(){

    map();

  }

  public void map(){
    HashMap<String, Integer> personMap = new HashMap<String, Integer>();
    personMap.put("Jon", 20);
    personMap.put("Theo", 21);
    personMap.put("Martin", 19);
    personMap.put("Jonas",21);

    System.out.println(personMap.size());
  }


}
