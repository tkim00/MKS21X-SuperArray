public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }
  public SuperArray(int startingCapacity){
    if(startingCapacity < 0){
      throw new IllegalArgumentException("startingCapacity cannot be " + startingCapacity);
    }
    data = new String[startingCapacity];
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
  public int length(){
    return data.length;
  }

  public boolean add(String element){
    if(size == data.length){
      resize();
    }
    data[size] = element;
    size++;
    return true;
  }
  public String toString(){
    String list = "[";
    for(int i = 0; i < size(); i++){
      list += data[i] + ",";
    }
    return list.substring(0, list.length()-1) + "]";
  }
  public String toStringDebug(){
    String list = "[";
    for(int i = 0; i < data.length ; i++){
      list += data[i] + ",";
    }
    return list.substring(0, list.length()-1) + "]";
  }
  public String get(int index){
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("index cannot be " + index);
    }
    return data[index];
  }
  public String set(int index, String element){
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("index cannot be " + index);
    }
    String x = data[index];
    data[index] = element;
    return x;
  }


  private void resize(){
    String[] old = data;
    data = new String[old.length * 2 + 1];
    for(int i = 0; i < old.length; i++){
      data[i] = old[i];
    }
    //System.out.println("new length: " + data.length);
  }

  //phase3
   public boolean contains(String target){
     for(int i = 0; i < size; i++){
       //System.out.println("success");
       if(data[i].equals(target)){
         return true;
       }
     }
     return false;
   }
   public int indexOf(String target){
     for(int i = 0; i < size; i++){
       if(data[i].equals(target)){
         return i;
       }
     }
     return -1;
   }
   public int lastIndexOf(String target){
     for(int i = size-1; i >= 0; i--){
       if(data[i].equals(target)){
         return i;
       }
     }
     return -1;
   }
   public void add(int index, String element){
     if(index < 0 || index > size()){
       throw new IndexOutOfBoundsException("index cannot be " + index);
     }
     size++;
     if(size == data.length){
       resize();
     }
     for(int i = size-2; i >= index; i--){
       data[i+1] = data[i];
     }
     data[index] = element;
   }
   public String remove(int index){
     if(index < 0 || index >= size()){
       throw new IndexOutOfBoundsException("index cannot be " + index);
     }
     String element = data[index];
     for(int i = index; i < size-1; i++){
       data[i] = data[i+1];
     }
     String[] old = data;
     data = new String[old.length];
     for(int i = 0; i < size-1; i++){
       data[i] = old[i];
     }
     size--;
     return element;
   }
   public boolean remove(String target){
     if (indexOf(target) == -1){
       return false;
     }
     for(int i = indexOf(target); i < size-1; i++){
       data[i] = data[i+1];
     }
     String[] old = data;
     data = new String[old.length];
     for(int i = 0; i < size-1; i++){
       data[i] = old[i];
     }
     size--;
     return true;
   }
}
