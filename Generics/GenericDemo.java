package Practice;

class GenericDemo
{

    //Generic Method 
 public static <E> void display(E[] arr) 
 {
  for (E element : arr)
  {
   System.out.println(element);
  }
 }
 
 public static void main(String[] args)
 {
  String[] names= { "Luke", "Mia", "Mathew", "Jia" };
  display(names);

  System.out.println();

  Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
  display(numbers);

 }
   
}