import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> inter;
  
  public RandomStringChooser(String [] arr) {
    inter = = new ArrayList <String>();
    for(int i = 0; i < arr.length; i++)
      inter.add(arr[i]);
  }

  public String getNext() {
    if(inter.size() > 0){
      int var = (int)(Math.random()*inter.size());
      String temp = inter.get(var);
      inter.remove(var);
      return temp;
    } else {
      return "NONE";
}
