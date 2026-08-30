public class Main2 {
  public static void main(String[] args) {
  List<Integer> a2 = new ArrayList<>();
       a2.add(10);
       a2.add(11);
       for(Integer i : a2){
           if(i==10) a2.remove(i); // Line 7
           if(i==11) a2.remove(i); // line 8
           System.out.println(i);
       }
  }
  }
// Predict O/P
// Q1 : Which line will throw Error ?
// Q2 : Suppose I comment Line 7 , Now What will Happen ?