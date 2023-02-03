package Assignment;

class Regex_Name
	{
	  public static boolean checkNameValidity(String name)
	  {
	    String pattern = "^[A-Z][a-zA-Z]{1,28}( [A-Z][a-zA-Z]{1,28}){0,2}$";
	    return name.matches(pattern);
	  }

	  public static void main(String[] args) 
	  {
	    String name = "Roger Federer ";
	    System.out.println("The name " + name + " is "+ (checkNameValidity(name.trim()) ? "valid!" : "invalid!"));
	    String name1 = "roger federer ";
	    System.out.println("The name  " + name1 + "is " + (checkNameValidity(name1.trim()) ? "valid!" : "invalid!"));
	  }
	}


 