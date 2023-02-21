package Practice;

class Container<T>
{

	 private T t;

	 public void set(String string) 
	 {
	  this.t = (T) string;
	 }

	 public T get()
	 {
	  return t;
	 }
	}

	class Tester
	{

	 public static void main(String[] args)
	 {
	  
	  Container<Integer> integerContainer = new Container<>();
	 // integerContainer.set(1);
	        integerContainer.set("Leo"); //Uncomment the code and check if String can be passed to the set() method
	  System.out.println("Inside Integer Container : "+integerContainer.get());
	  
	  Container<String> stringContainer = new Container<>();
	        //stringContainer.set(1);    //Uncomment the code and check if Integer can be passed to the set() method
	  stringContainer.set("Mia");
	  System.out.println("Inside String Container : "+stringContainer.get());
	  
	 }
	 
	}