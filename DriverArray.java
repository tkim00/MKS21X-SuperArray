public class DriverArray{
  public static void main(String[] args){
    SuperArray d1 = new SuperArray();

    System.out.println(d1.isEmpty());
    d1.clear();
    System.out.println("size: " + d1.size());

    for(int i = 0; i < 10; i++){
      d1.add("" + i+1);
    }
    System.out.println(d1);

    d1.clear();
    for(int i = 0; i < 12; i++){
      d1.add("" + i+1);
    }
    System.out.println(d1);

    System.out.println(d1.get(4));
    System.out.println(d1.get(10));
    System.out.println(d1.get(15));
    d1.set(10, "insertion");
    System.out.println(d1);
    System.out.println("size: " + d1.size());
    d1.contains("21");
    System.out.println(d1.lastIndexOf("insertion"));
    d1.add(5, "NEW");
    System.out.println(d1);
    System.out.println("size: " + d1.size());
    System.out.println(d1.remove(8));
    System.out.println(d1);
    d1.remove("insertion");
    System.out.println(d1);

    d1.clear();
    System.out.println("size: " + d1.size());
  }
}
