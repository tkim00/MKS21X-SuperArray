public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }

  public int size(){
    return size;
  }
  public void clear(){
    size = 0;
  }
  public boolean isEmpty(){
    return size == 0;
  }

  public boolean add(String element){
    if(size == data.length){
      data.resize();
    }
    data[size] = element;
    return true;
  }
  public String toString(){
    String list = "[";
    for(int i = 0; i < size; i++){
      list += data[size] + ",";
    }
    return list + "]";
  }
}
