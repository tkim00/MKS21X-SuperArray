public class DriverArray{
  public static void main(String[] args){
    SuperArray d1 = new SuperArray();

    System.out.println(d1.isEmpty());

    for(int i = 0; i < 10; i++){
      d1.set(i, "" + i+1);
    }
    System.out.println(d1);

    System.out.println(d1.get(4));
    System.out.println(d1.get(10));
    d1.set(10, "11");

    d1.clear();
    System.out.println(d1.size());
  }
}
